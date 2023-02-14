package com.simon.user.schema;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J8\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0018\b\u0001\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u0002`\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007JB\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\u0018\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u0002`\u000eH\u0007J\u001c\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0007J7\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\r0\u001b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0007J\u0010\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"H\u0007J\b\u0010#\u001a\u00020\u0015H\u0007\u00a8\u0006$"}, d2 = {"Lcom/simon/user/schema/GraphQlModule;", "", "()V", "getCloudEventBodyLens", "Lorg/http4k/lens/BiDiBodyLens;", "Lio/cloudevents/CloudEvent;", "getEventPublisher", "Lcom/simon/user/schema/EventPublisher;", "settings", "Lcom/simon/settings/Settings;", "httpHandler", "Lkotlin/Function1;", "Lorg/http4k/core/Request;", "Lorg/http4k/core/Response;", "Lorg/http4k/core/HttpHandler;", "requestLens", "getGraphQlCloudEventProcessor", "eventPublisher", "graphqlSchema", "Lcom/apurebase/kgraphql/schema/Schema;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "provideClient", "provideGraphqlApp", "Lorg/http4k/routing/RoutingHttpHandler;", "dbHandler", "provideHttpGraphqlRequestHandler", "Lkotlin/reflect/KFunction1;", "Lkotlin/ParameterName;", "name", "p1", "graphqlProcessor", "provideSchema", "eventService", "Lcom/simon/service/EventService;", "provideScope", "events-lambda"})
@org.koin.core.annotation.Module()
public final class GraphQlModule {
    
    public GraphQlModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.koin.core.annotation.Single()
    public final com.simon.user.schema.EventPublisher getEventPublisher(@org.jetbrains.annotations.NotNull()
    com.simon.settings.Settings settings, @org.jetbrains.annotations.NotNull()
    @org.koin.core.annotation.Named(value = "client")
    kotlin.jvm.functions.Function1<? super org.http4k.core.Request, ? extends org.http4k.core.Response> httpHandler, @org.jetbrains.annotations.NotNull()
    org.http4k.lens.BiDiBodyLens<io.cloudevents.CloudEvent> requestLens) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.koin.core.annotation.Single()
    public final kotlinx.coroutines.CoroutineScope provideScope() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.koin.core.annotation.Single()
    public final com.apurebase.kgraphql.schema.Schema provideSchema(@org.jetbrains.annotations.NotNull()
    com.simon.service.EventService eventService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.koin.core.annotation.Named(value = "client")
    @org.koin.core.annotation.Single()
    public final kotlin.jvm.functions.Function1<org.http4k.core.Request, org.http4k.core.Response> provideClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.koin.core.annotation.Single()
    public final org.http4k.routing.RoutingHttpHandler provideGraphqlApp(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.http4k.core.Request, ? extends org.http4k.core.Response> dbHandler) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.koin.core.annotation.Single()
    public final org.http4k.lens.BiDiBodyLens<io.cloudevents.CloudEvent> getCloudEventBodyLens() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.koin.core.annotation.Single()
    public final kotlin.jvm.functions.Function1<org.http4k.core.Request, org.http4k.core.Response> getGraphQlCloudEventProcessor(@org.jetbrains.annotations.NotNull()
    com.simon.user.schema.EventPublisher eventPublisher, @org.jetbrains.annotations.NotNull()
    com.apurebase.kgraphql.schema.Schema graphqlSchema, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope, @org.jetbrains.annotations.NotNull()
    com.simon.settings.Settings settings, @org.jetbrains.annotations.NotNull()
    org.http4k.lens.BiDiBodyLens<io.cloudevents.CloudEvent> requestLens) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.koin.core.annotation.Single()
    public final kotlin.reflect.KFunction<org.http4k.core.Response> provideHttpGraphqlRequestHandler(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.http4k.core.Request, ? extends org.http4k.core.Response> graphqlProcessor) {
        return null;
    }
}