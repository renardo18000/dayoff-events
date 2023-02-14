//package com.simon
//
//import com.fasterxml.jackson.databind.ObjectMapper
//import com.natpryce.hamkrest.assertion.assertThat
//import com.natpryce.hamkrest.equalTo
//import com.simon.db.DbModule
//import com.simon.settings.SettingsModule
//import com.simon.user.schema.GraphQlModule
//import io.cloudevents.CloudEvent
//import io.cloudevents.CloudEventData
//import io.cloudevents.core.v1.CloudEventBuilder
//import kotlinx.coroutines.CoroutineScope
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.launch
//import org.http4k.client.ApacheClient
//import org.http4k.cloudnative.env.Environment
//import org.http4k.cloudnative.env.EnvironmentKey
//import org.http4k.core.*
//import org.http4k.graphql.GraphQLRequest
//import org.http4k.lens.BiDiBodyLens
//import org.http4k.lens.cloudEvent
//import org.http4k.routing.bind
//import org.http4k.routing.routes
//import org.http4k.server.SunHttp
//import org.http4k.server.asServer
//import org.junit.jupiter.api.AfterEach
//import org.junit.jupiter.api.BeforeEach
//import org.junit.jupiter.api.Test
//import org.koin.core.context.GlobalContext.startKoin
//import org.koin.dsl.module
//import org.koin.ksp.generated.module
//import org.koin.test.KoinTest
//import java.net.URI
//import java.util.*
//
//class EndToEndTest: KoinTest {
//    private val client = ApacheClient()
//
//    fun defaultBrokerRoute(handler: HttpHandler) = routes(
//        "/" bind Method.GET to {
//            handler(it)
//        },
//    )
//
//
////    private val recorder = recorderHttp.asServer(Jetty(8001))
////    private val server = MyMathServer(8000, Uri.of("http://localhost:8001"))
//
//    @BeforeEach
//    fun setup() {
//
//
//        val sink = defaultBrokerRoute({
//            println(it)
//            Response(Status.OK) }
//        ).asServer(SunHttp(9876)).start()
//
////        recorder.start()
////        server.start()
//    }
//
//    @AfterEach
//    fun teardown() {
////        server.stop()
////        recorder.stop()
//    }
//
//    @Test
//    fun `handle event`() {
//        startKoin {
//
////            modules(EnvModule().module)
//            modules(module {
//                single {
//                    Environment.defaults(
////                        EnvironmentKey.required(name = "CONNECTION_MONGO").of("mongodb://localhost:27017"),
//                        EnvironmentKey.required(name = "K_SINK").of("http://localhost:9876"))
//                }
//            },GraphQlModule().module, SettingsModule().module, DbModule().module)
//        }
//        val app = EventsApplication().getFunctionHandler()
//        val ce = CloudEventBuilder().withData(ObjectMapper().writeValueAsString(GraphQLRequest(query = "query { searchEvents(params:{}) { kind status } }", operationName = null)).toByteArray()).withId(UUID.randomUUID().toString()).withSource(
//            URI(
//                "mysource")
//        ).withType("query-toto").build()
//        val requestLens : BiDiBodyLens<CloudEvent> = Body.cloudEvent().toLens()
//        val res = app(Request(Method.POST, "/").with(requestLens.of(ce))).status
//        CoroutineScope(Dispatchers.IO).launch {
//            assertThat(actual = "", equalTo(""))
//
//        }
//    }
//}
//
//data class EventGraphRequest(val resp: String): CloudEventData {
//    override fun toBytes(): ByteArray = resp.toByteArray()
//}
//
