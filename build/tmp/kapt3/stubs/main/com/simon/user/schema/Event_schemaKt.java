package com.simon.user.schema;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011\u001a\u0016\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003\u001a%\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u00020\u00182\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a\"\u00020\u001b\u00a2\u0006\u0002\u0010\u001c\"\u001d\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\"\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\u001d"}, d2 = {"dataLens", "Lorg/http4k/lens/Lens;", "Lio/cloudevents/CloudEvent;", "Lorg/http4k/graphql/GraphQLRequest;", "getDataLens", "()Lorg/http4k/lens/Lens;", "localDateTimeformatter", "Ljava/time/format/DateTimeFormatter;", "getLocalDateTimeformatter", "()Ljava/time/format/DateTimeFormatter;", "localFormatter", "getLocalFormatter", "buildCloudEventFromResponse", "incomingEvent", "settings", "Lcom/simon/settings/Settings;", "resp", "", "getGraphQlResponse", "graphqlSchema", "Lcom/apurebase/kgraphql/schema/Schema;", "contentData", "checkRole", "Lcom/simon/user/schema/RoleNotAuthrorizedException;", "Lcom/apurebase/kgraphql/Context;", "roles", "", "Lcom/simon/user/schema/ROLES;", "(Lcom/apurebase/kgraphql/Context;[Lcom/simon/user/schema/ROLES;)Lcom/simon/user/schema/RoleNotAuthrorizedException;", "events-lambda"})
public final class Event_schemaKt {
    @org.jetbrains.annotations.NotNull()
    private static final java.time.format.DateTimeFormatter localDateTimeformatter = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.time.format.DateTimeFormatter localFormatter = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.http4k.lens.Lens<io.cloudevents.CloudEvent, org.http4k.graphql.GraphQLRequest> dataLens = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final java.time.format.DateTimeFormatter getLocalDateTimeformatter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.time.format.DateTimeFormatter getLocalFormatter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.http4k.lens.Lens<io.cloudevents.CloudEvent, org.http4k.graphql.GraphQLRequest> getDataLens() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final io.cloudevents.CloudEvent buildCloudEventFromResponse(@org.jetbrains.annotations.NotNull()
    io.cloudevents.CloudEvent incomingEvent, @org.jetbrains.annotations.NotNull()
    com.simon.settings.Settings settings, @org.jetbrains.annotations.NotNull()
    java.lang.String resp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getGraphQlResponse(@org.jetbrains.annotations.NotNull()
    com.apurebase.kgraphql.schema.Schema graphqlSchema, @org.jetbrains.annotations.NotNull()
    org.http4k.graphql.GraphQLRequest contentData) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final com.simon.user.schema.RoleNotAuthrorizedException checkRole(@org.jetbrains.annotations.NotNull()
    com.apurebase.kgraphql.Context $this$checkRole, @org.jetbrains.annotations.NotNull()
    com.simon.user.schema.ROLES... roles) {
        return null;
    }
}