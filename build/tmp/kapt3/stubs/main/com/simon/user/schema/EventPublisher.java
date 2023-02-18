package com.simon.user.schema;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000bH\u0086\u0002R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/simon/user/schema/EventPublisher;", "", "settings", "Lcom/simon/settings/Settings;", "httpHandler", "Lkotlin/Function1;", "Lorg/http4k/core/Request;", "Lorg/http4k/core/Response;", "Lorg/http4k/core/HttpHandler;", "requestLens", "Lorg/http4k/lens/BiDiBodyLens;", "Lio/cloudevents/CloudEvent;", "(Lcom/simon/settings/Settings;Lkotlin/jvm/functions/Function1;Lorg/http4k/lens/BiDiBodyLens;)V", "invoke", "ce", "events-lambda"})
public final class EventPublisher {
    private final com.simon.settings.Settings settings = null;
    private final kotlin.jvm.functions.Function1<org.http4k.core.Request, org.http4k.core.Response> httpHandler = null;
    private final org.http4k.lens.BiDiBodyLens<io.cloudevents.CloudEvent> requestLens = null;
    
    public EventPublisher(@org.jetbrains.annotations.NotNull()
    com.simon.settings.Settings settings, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.http4k.core.Request, ? extends org.http4k.core.Response> httpHandler, @org.jetbrains.annotations.NotNull()
    org.http4k.lens.BiDiBodyLens<io.cloudevents.CloudEvent> requestLens) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.http4k.core.Response invoke(@org.jetbrains.annotations.NotNull()
    io.cloudevents.CloudEvent ce) {
        return null;
    }
}