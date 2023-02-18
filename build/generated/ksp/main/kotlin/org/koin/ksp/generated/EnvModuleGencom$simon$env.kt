package org.koin.ksp.generated

import org.koin.dsl.*


public val com_simon_env_EnvModule = module {
	val moduleInstance = com.simon.env.EnvModule()
	single(qualifier=null) { moduleInstance.getEnv() } 
}
public val com.simon.env.EnvModule.module : org.koin.core.module.Module get() = com_simon_env_EnvModule