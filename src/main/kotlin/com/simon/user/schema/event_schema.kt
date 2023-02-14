package com.simon.user.schema

import com.apurebase.kgraphql.Context
import com.apurebase.kgraphql.KGraphQL
import com.apurebase.kgraphql.schema.Schema
import com.simon.service.EventService
import com.simon.settings.Settings
import com.simon.user.dto.EventDto
import com.simon.user.dto.EventKindDto
import com.simon.user.dto.PeopleDto
import com.simon.user.dto.StatusDto
import io.cloudevents.CloudEvent
import io.cloudevents.CloudEventData
import io.cloudevents.core.v1.CloudEventBuilder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import org.http4k.client.ApacheClient
import org.http4k.core.*
import org.http4k.format.Jackson
import org.http4k.format.cloudEventDataLens
import org.http4k.graphql.GraphQLRequest
import org.http4k.lens.BiDiBodyLens
import org.http4k.lens.cloudEvent
import org.http4k.routing.RoutingHttpHandler
import org.http4k.routing.bind
import org.http4k.routing.routes
import org.koin.core.annotation.Module
import org.koin.core.annotation.Named
import org.koin.core.annotation.Single
import simon.com.user.dto.EmployKindDto
import java.net.URI
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.*
import java.util.logging.Logger

val localDateTimeformatter: DateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME

val localFormatter: DateTimeFormatter = DateTimeFormatter.ISO_DATE

val dataLens = Jackson.cloudEventDataLens<GraphQLRequest>()


class EventPublisher(private val settings: Settings, private val httpHandler: HttpHandler, private val requestLens: BiDiBodyLens<CloudEvent>) {

    operator fun invoke(ce: CloudEvent) = httpHandler(Request(Method.POST, settings.brokerUrl).with(requestLens.of(ce)))
}



@Module
class GraphQlModule {
    @Single
    fun getEventPublisher(settings: Settings,
                          @Named(value = "client") httpHandler: HttpHandler,
                          requestLens: BiDiBodyLens<CloudEvent>
    ) : EventPublisher = EventPublisher(settings = settings, httpHandler = httpHandler, requestLens = requestLens)

    @Single
    fun provideScope(): CoroutineScope = CoroutineScope(Dispatchers.IO)
    @Single
    fun provideSchema(eventService: EventService): Schema = KGraphQL.schema {
        configure {
            useDefaultPrettyPrinter = true
        }

        mutation("createEvent") {
//        accessRule { ctx -> ctx.checkRole(ROLES.ADMIN, ROLES.USER)}
            resolver { eventDto: EventDto ->
                eventService.create(eventDto)
            }
        }
        mutation("updateEvent") {
//        accessRule { ctx -> ctx.checkRole(ROLES.ADMIN, ROLES.USER)}
            resolver { eventDto: EventDto ->
                eventService.update(eventDto)
            }
        }
        mutation("deleteEvent") {
//        accessRule { ctx -> ctx.checkRole(ROLES.ADMIN)}
            resolver { id: String ->
                eventService.deleteById(id)
            }
        }
        query("searchEvents") {
//        accessRule { ctx -> ctx.checkRole(ROLES.ADMIN, ROLES.USER, ROLES.READ_ONLY)}
            resolver { params: EventRequestParam ->
                eventService.findByAny(params)
            }
        }
        type<EventDto>() {
            description = "Event response schema"
            name = "EventDtoResponse"
        }
        inputType<EventDto>() {
            description = "Event request schema"
            name = "EventDtoRequest"
        }
        type<PeopleDto>() {
            description = "User response schema"
            name = "UserDtoResponse"
        }
        inputType<PeopleDto>() {
            description = "User request schema"
            name = "UserDtoRequest"
        }
        enum<EmployKindDto>()
        enum<StatusDto>()
        enum<EventKindDto>()
        stringScalar<LocalDateTime> {
            deserialize = { uuid: String -> LocalDateTime.parse(uuid, localDateTimeformatter) }
            serialize = localDateTimeformatter::format
            name = "DateTime"

        }
        stringScalar<LocalDate> {
            deserialize = { uuid: String -> LocalDate.parse(uuid, localFormatter) }
            serialize = localFormatter::format
            name = "Date"
        }
        inputType<UserRequestParam>()
    }
    @Single @Named(value = "client")
    fun provideClient(): HttpHandler = ApacheClient()
    @Single
    fun provideGraphqlApp(dbHandler: (Request) -> Response): RoutingHttpHandler = routes("/" bind Method.POST to dbHandler)

    @Single
    fun getCloudEventBodyLens(): BiDiBodyLens<CloudEvent> = Body.cloudEvent().toLens()

    @Single
    fun getGraphQlCloudEventProcessor(eventPublisher: EventPublisher, graphqlSchema: Schema, scope: CoroutineScope, settings: Settings, requestLens: BiDiBodyLens<CloudEvent>) =
        { req: Request ->

            Logger.getLogger("handler").info("K_SINK is : ${settings.brokerUrl}")
            Logger.getLogger("handler").info("$req")
            val statusResp: Status = Status.OK

            val requestLens: BiDiBodyLens<CloudEvent> = Body.cloudEvent().toLens()
            val ce = requestLens(req)
            val contentData = dataLens(ce)
//            scope.launch {
            Logger.getLogger("handler").info(contentData.query)
            val resp = getGraphQlResponse(graphqlSchema, contentData)
            Logger.getLogger("events").info(resp)
//                eventPublisher(buildCloudEventFromResponse(ce, settings, resp))
//            }
            Response(statusResp).with(requestLens of buildCloudEventFromResponse(ce, settings, resp))
        }

    @Single
    fun provideHttpGraphqlRequestHandler(graphqlProcessor: (Request) -> Response) = graphqlProcessor::invoke

}



fun buildCloudEventFromResponse(
    incomingEvent: CloudEvent,
    settings: Settings,
    resp: String
): CloudEvent {
    val cloudEventBuilder = CloudEventBuilder()

    incomingEvent.attributeNames.forEach {
        val extensionValue = incomingEvent.getExtension(it)
        if (setOf("requestnb", "totalnbofrequests").contains(it)) {
            cloudEventBuilder.withExtension(it, extensionValue as Number)
        } else if (it == "parentmessageid") {
            cloudEventBuilder.withExtension(it, extensionValue as String)
        }
    }
    val cloudEvent = cloudEventBuilder.withId(UUID.randomUUID().toString())
        .withSource(URI("events-graphql"))
        .withTime(OffsetDateTime.now())
        .withType(settings.outputType)
        .withExtension("connectionid", incomingEvent.getExtension("connectionid") as String)

        // this is a custom extension function from Jackson (needs to be imported)
        .withData("application/json", EventGraphResponse(resp))
        .build()

    Logger.getLogger("response").info(resp)
    Logger.getLogger("response").info("$cloudEvent")
    return cloudEvent
}

fun getGraphQlResponse(graphqlSchema: Schema, contentData: GraphQLRequest): String  =
    graphqlSchema.runCatching {
        executeBlocking(
            request = contentData.query,
        )
    }
        .fold(
            onSuccess = {
                it
            }
        ) {
            """
                        {
                          "errors": ${it.message}
                        }
                        """.trimIndent()
        }


data class UserRequestParam(
    val id: String? = null,
    val firstName: String? = null,
    val lastName: String? = null,
    val company: String? = null,
    val employeeKind: EmployKindDto? = null,
    val matriculeAccount: String? = null,
    val teams: List<String>? = null,
    val projects: List<String>? = null,
)

data class EventRequestParam(val id: String? = null,
                             val startDate: LocalDateTime,
                             val endDate: LocalDateTime,
                             val status: StatusDto? = null,
                             val kind: EventKindDto? = null,
                             val note: String? = null,
                             val requester: UserRequestParam? = null
)


data class EventGraphResponse(val resp: String): CloudEventData {
    override fun toBytes(): ByteArray = resp.toByteArray()
}
enum class ROLES {
    USER,
    ADMIN,
    READ_ONLY

}

class RoleNotAuthrorizedException(roles: ROLES): IllegalAccessException("Current role : ${roles.name} is not allowed to access")

fun Context.checkRole(vararg roles: ROLES): RoleNotAuthrorizedException? {
    return roles.find { get<ROLES>() == it }.let { if (it != null) throw RoleNotAuthrorizedException(it) else null }
}
