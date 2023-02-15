package com.simon.settings

import org.http4k.cloudnative.env.Environment
import org.http4k.cloudnative.env.EnvironmentKey
import org.http4k.core.Uri
import org.http4k.lens.int
import org.http4k.lens.string
import org.http4k.lens.uri
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single

const val CONNECTION_MONGO = "mongodb+srv://dayoff:dayoff@cluster0.ouf48wa.mongodb.net/retryWrites=true&w=majority"


@Module
@ComponentScan("com.simon.settings")
class SettingsModule

@Single
class Settings(environment: Environment) {
    val mongoConnectionUrl = EnvironmentKey.string().defaulted(name = "CONNECTION_MONGO", CONNECTION_MONGO)(environment)
    val serverPort: Int = EnvironmentKey.int().defaulted(name = "PORT", 8080)(environment)
//    val brokerUrl: Uri = EnvironmentKey.uri().required(name = "K_SINK")(environment)
    val outputType: String = EnvironmentKey.string().required(name = "OUTPUT_TYPE")(environment)

}
