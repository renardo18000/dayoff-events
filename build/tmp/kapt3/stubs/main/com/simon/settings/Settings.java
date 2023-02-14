package com.simon.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/simon/settings/Settings;", "", "environment", "Lorg/http4k/cloudnative/env/Environment;", "(Lorg/http4k/cloudnative/env/Environment;)V", "brokerUrl", "Lorg/http4k/core/Uri;", "getBrokerUrl", "()Lorg/http4k/core/Uri;", "mongoConnectionUrl", "", "getMongoConnectionUrl", "()Ljava/lang/String;", "outputType", "getOutputType", "serverPort", "", "getServerPort", "()I", "events-lambda"})
@org.koin.core.annotation.Single()
public final class Settings {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String mongoConnectionUrl = null;
    private final int serverPort = 0;
    @org.jetbrains.annotations.NotNull()
    private final org.http4k.core.Uri brokerUrl = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String outputType = null;
    
    public Settings(@org.jetbrains.annotations.NotNull()
    org.http4k.cloudnative.env.Environment environment) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMongoConnectionUrl() {
        return null;
    }
    
    public final int getServerPort() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.http4k.core.Uri getBrokerUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOutputType() {
        return null;
    }
}