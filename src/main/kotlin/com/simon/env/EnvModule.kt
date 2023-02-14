package com.simon.env

import org.http4k.cloudnative.env.Environment
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single


@Module
@ComponentScan("com.simon.env")
class EnvModule {
    @Single
    fun getEnv() = Environment.ENV




}
