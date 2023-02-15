package com.simon.user.schema;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rH\u00c6\u0003JY\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\'H\u00d6\u0001J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006)"}, d2 = {"Lcom/simon/user/schema/EventRequestParam;", "", "id", "", "startDate", "Ljava/time/LocalDateTime;", "endDate", "status", "Lcom/simon/user/dto/StatusDto;", "kind", "Lcom/simon/user/dto/EventKindDto;", "note", "requester", "Lcom/simon/user/schema/UserRequestParam;", "(Ljava/lang/String;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;Lcom/simon/user/dto/StatusDto;Lcom/simon/user/dto/EventKindDto;Ljava/lang/String;Lcom/simon/user/schema/UserRequestParam;)V", "getEndDate", "()Ljava/time/LocalDateTime;", "getId", "()Ljava/lang/String;", "getKind", "()Lcom/simon/user/dto/EventKindDto;", "getNote", "getRequester", "()Lcom/simon/user/schema/UserRequestParam;", "getStartDate", "getStatus", "()Lcom/simon/user/dto/StatusDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "events-lambda"})
public final class EventRequestParam {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalDateTime startDate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalDateTime endDate = null;
    @org.jetbrains.annotations.Nullable()
    private final com.simon.user.dto.StatusDto status = null;
    @org.jetbrains.annotations.Nullable()
    private final com.simon.user.dto.EventKindDto kind = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String note = null;
    @org.jetbrains.annotations.Nullable()
    private final com.simon.user.schema.UserRequestParam requester = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.simon.user.schema.EventRequestParam copy(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime startDate, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime endDate, @org.jetbrains.annotations.Nullable()
    com.simon.user.dto.StatusDto status, @org.jetbrains.annotations.Nullable()
    com.simon.user.dto.EventKindDto kind, @org.jetbrains.annotations.Nullable()
    java.lang.String note, @org.jetbrains.annotations.Nullable()
    com.simon.user.schema.UserRequestParam requester) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public EventRequestParam(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime startDate, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime endDate, @org.jetbrains.annotations.Nullable()
    com.simon.user.dto.StatusDto status, @org.jetbrains.annotations.Nullable()
    com.simon.user.dto.EventKindDto kind, @org.jetbrains.annotations.Nullable()
    java.lang.String note, @org.jetbrains.annotations.Nullable()
    com.simon.user.schema.UserRequestParam requester) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime getStartDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime getEndDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.simon.user.dto.StatusDto component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.simon.user.dto.StatusDto getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.simon.user.dto.EventKindDto component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.simon.user.dto.EventKindDto getKind() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNote() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.simon.user.schema.UserRequestParam component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.simon.user.schema.UserRequestParam getRequester() {
        return null;
    }
}