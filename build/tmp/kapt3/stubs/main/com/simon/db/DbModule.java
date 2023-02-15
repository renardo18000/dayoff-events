package com.simon.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/simon/db/DbModule;", "", "()V", "getEventCollection", "Lcom/mongodb/client/MongoCollection;", "Lcom/simon/user/entity/Event;", "mongoClient", "Lcom/mongodb/client/MongoClient;", "getMongoClient", "settings", "Lcom/simon/settings/Settings;", "events-lambda"})
@org.koin.core.annotation.ComponentScan()
@org.koin.core.annotation.Module()
public final class DbModule {
    
    public DbModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.koin.core.annotation.Single()
    public final com.mongodb.client.MongoClient getMongoClient(@org.jetbrains.annotations.NotNull()
    com.simon.settings.Settings settings) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.koin.core.annotation.Single()
    public final com.mongodb.client.MongoCollection<com.simon.user.entity.Event> getEventCollection(@org.jetbrains.annotations.NotNull()
    com.mongodb.client.MongoClient mongoClient) {
        return null;
    }
}