package com.simon.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/simon/service/EventService;", "", "eventCollection", "Lcom/mongodb/client/MongoCollection;", "Lcom/simon/user/entity/Event;", "(Lcom/mongodb/client/MongoCollection;)V", "create", "", "people", "Lcom/simon/user/dto/EventDto;", "deleteById", "", "id", "findAll", "", "findByAny", "event", "Lcom/simon/user/schema/EventRequestParam;", "findById", "update", "events-lambda"})
@org.koin.core.annotation.Single()
public final class EventService {
    private final com.mongodb.client.MongoCollection<com.simon.user.entity.Event> eventCollection = null;
    
    public EventService(@org.jetbrains.annotations.NotNull()
    com.mongodb.client.MongoCollection<com.simon.user.entity.Event> eventCollection) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String create(@org.jetbrains.annotations.NotNull()
    com.simon.user.dto.EventDto people) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String update(@org.jetbrains.annotations.NotNull()
    com.simon.user.dto.EventDto people) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.simon.user.dto.EventDto> findAll() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.simon.user.dto.EventDto findById(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.simon.user.dto.EventDto> findByAny(@org.jetbrains.annotations.NotNull()
    com.simon.user.schema.EventRequestParam event) {
        return null;
    }
    
    public final boolean deleteById(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return false;
    }
}