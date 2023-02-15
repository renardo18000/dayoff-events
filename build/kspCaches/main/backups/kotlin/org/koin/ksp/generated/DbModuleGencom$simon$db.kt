package org.koin.ksp.generated

import org.koin.dsl.*


public val com_simon_db_DbModule = module {
	val moduleInstance = com.simon.db.DbModule()
	single(qualifier=null) { moduleInstance.getMongoClient(get()) } 
	single(qualifier=null) { moduleInstance.getEventCollection(get()) } 
}
public val com.simon.db.DbModule.module : org.koin.core.module.Module get() = com_simon_db_DbModule