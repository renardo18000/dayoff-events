package com.simon

import com.simon.db.DbModule
import com.simon.env.EnvModule
import com.simon.settings.Settings
import com.simon.settings.SettingsModule
import com.simon.user.schema.GraphQlModule
import io.cloudevents.core.provider.EventFormatProvider
import io.cloudevents.http4k.cloudEventsFormat
import org.http4k.format.Jackson
import org.http4k.routing.RoutingHttpHandler
import org.http4k.server.Jetty
import org.http4k.server.asServer
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.GlobalContext.startKoin
import org.koin.ksp.generated.module
import java.util.logging.Logger

class EventsApplication : KoinComponent {

    private val graphqlHandler : RoutingHttpHandler by inject()
    val settings: Settings by inject()
    fun getFunctionHandler(): RoutingHttpHandler {
        EventFormatProvider.getInstance().registerFormat(Jackson.cloudEventsFormat())
        Logger.getLogger("main").info("Has started")
        return graphqlHandler
    }
}

fun main() {
    // this starts the apps with DI made with koin
    startKoin {
        modules(GraphQlModule().module)
        modules(SettingsModule().module)
        modules(DbModule().module)
        modules(EnvModule().module)
    }
    val eventsApplication = EventsApplication()
    val functionHandler = eventsApplication.getFunctionHandler()
    functionHandler.asServer(Jetty(port = eventsApplication.settings.serverPort)).start()
}





