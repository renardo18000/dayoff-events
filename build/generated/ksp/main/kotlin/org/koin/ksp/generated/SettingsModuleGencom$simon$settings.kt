package org.koin.ksp.generated

import org.koin.dsl.*


public val com_simon_settings_SettingsModule = module {
	single(qualifier=null) { com.simon.settings.Settings(get()) } 
}
public val com.simon.settings.SettingsModule.module : org.koin.core.module.Module get() = com_simon_settings_SettingsModule