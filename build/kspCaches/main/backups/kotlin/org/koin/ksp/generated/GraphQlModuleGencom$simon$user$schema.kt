package org.koin.ksp.generated

import org.koin.dsl.*


public val com_simon_user_schema_GraphQlModule = module {
	val moduleInstance = com.simon.user.schema.GraphQlModule()
	single(qualifier=null) { moduleInstance.getEventPublisher(get(),get(qualifier=org.koin.core.qualifier.StringQualifier("client")),get()) } 
	single(qualifier=null) { moduleInstance.provideScope() } 
	single(qualifier=null) { moduleInstance.provideSchema(get()) } 
	single(qualifier=org.koin.core.qualifier.StringQualifier("client")) { moduleInstance.provideClient() } 
	single(qualifier=null) { moduleInstance.provideGraphqlApp(get()) } 
	single(qualifier=null) { moduleInstance.getCloudEventBodyLens() } 
	single(qualifier=null) { moduleInstance.getGraphQlCloudEventProcessor(get(),get(),get(),get(),get()) } 
	single(qualifier=null) { moduleInstance.provideHttpGraphqlRequestHandler(get()) } 
}
public val com.simon.user.schema.GraphQlModule.module : org.koin.core.module.Module get() = com_simon_user_schema_GraphQlModule