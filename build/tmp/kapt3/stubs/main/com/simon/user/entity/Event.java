package com.simon.user.entity;

import java.lang.System;

@org.litote.kmongo.Data()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002:;Bk\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0002\u0010\u0013BG\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0014J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0007H\u00c6\u0003J\t\u0010(\u001a\u00020\u0007H\u00c6\u0003J\t\u0010)\u001a\u00020\nH\u00c6\u0003J\t\u0010*\u001a\u00020\fH\u00c6\u0003J\t\u0010+\u001a\u00020\u000eH\u00c6\u0003J\t\u0010,\u001a\u00020\u0010H\u00c6\u0003JW\u0010-\u001a\u00020\u00002\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u00c6\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00101\u001a\u00020\u0003H\u00d6\u0001J\t\u00102\u001a\u00020\u000eH\u00d6\u0001J!\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u00c7\u0001R\u001c\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%\u00a8\u0006<"}, d2 = {"Lcom/simon/user/entity/Event;", "", "seen1", "", "id", "Lorg/litote/kmongo/Id;", "startDate", "Ljava/time/LocalDateTime;", "endDate", "status", "Lcom/simon/user/entity/Status;", "kind", "Lcom/simon/user/entity/EventKind;", "note", "", "requester", "Lcom/simon/user/entity/People;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILorg/litote/kmongo/Id;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;Lcom/simon/user/entity/Status;Lcom/simon/user/entity/EventKind;Ljava/lang/String;Lcom/simon/user/entity/People;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lorg/litote/kmongo/Id;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;Lcom/simon/user/entity/Status;Lcom/simon/user/entity/EventKind;Ljava/lang/String;Lcom/simon/user/entity/People;)V", "getEndDate$annotations", "()V", "getEndDate", "()Ljava/time/LocalDateTime;", "getId$annotations", "getId", "()Lorg/litote/kmongo/Id;", "getKind", "()Lcom/simon/user/entity/EventKind;", "getNote", "()Ljava/lang/String;", "getRequester", "()Lcom/simon/user/entity/People;", "getStartDate$annotations", "getStartDate", "getStatus", "()Lcom/simon/user/entity/Status;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "events-lambda"})
@kotlinx.serialization.Serializable()
public final class Event {
    @org.jetbrains.annotations.NotNull()
    public static final com.simon.user.entity.Event.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private final org.litote.kmongo.Id<com.simon.user.entity.Event> id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalDateTime startDate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalDateTime endDate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.simon.user.entity.Status status = null;
    @org.jetbrains.annotations.NotNull()
    private final com.simon.user.entity.EventKind kind = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String note = null;
    @org.jetbrains.annotations.NotNull()
    private final com.simon.user.entity.People requester = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.simon.user.entity.Event copy(@org.jetbrains.annotations.Nullable()
    @org.bson.codecs.pojo.annotations.BsonId()
    org.litote.kmongo.Id<com.simon.user.entity.Event> id, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime startDate, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime endDate, @org.jetbrains.annotations.NotNull()
    com.simon.user.entity.Status status, @org.jetbrains.annotations.NotNull()
    com.simon.user.entity.EventKind kind, @org.jetbrains.annotations.NotNull()
    java.lang.String note, @org.jetbrains.annotations.NotNull()
    com.simon.user.entity.People requester) {
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
    
    @kotlin.jvm.JvmStatic()
    public static final void write$Self(@org.jetbrains.annotations.NotNull()
    com.simon.user.entity.Event self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    public Event(@org.jetbrains.annotations.Nullable()
    @org.bson.codecs.pojo.annotations.BsonId()
    org.litote.kmongo.Id<com.simon.user.entity.Event> id, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime startDate, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime endDate, @org.jetbrains.annotations.NotNull()
    com.simon.user.entity.Status status, @org.jetbrains.annotations.NotNull()
    com.simon.user.entity.EventKind kind, @org.jetbrains.annotations.NotNull()
    java.lang.String note, @org.jetbrains.annotations.NotNull()
    com.simon.user.entity.People requester) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.litote.kmongo.Id<com.simon.user.entity.Event> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.litote.kmongo.Id<com.simon.user.entity.Event> getId() {
        return null;
    }
    
    @kotlinx.serialization.Contextual()
    @java.lang.Deprecated()
    public static void getId$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime getStartDate() {
        return null;
    }
    
    @kotlinx.serialization.Contextual()
    @java.lang.Deprecated()
    public static void getStartDate$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime getEndDate() {
        return null;
    }
    
    @kotlinx.serialization.Contextual()
    @java.lang.Deprecated()
    public static void getEndDate$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.simon.user.entity.Status component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.simon.user.entity.Status getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.simon.user.entity.EventKind component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.simon.user.entity.EventKind getKind() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNote() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.simon.user.entity.People component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.simon.user.entity.People getRequester() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/simon/user/entity/Event$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/simon/user/entity/Event;", "events-lambda"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<com.simon.user.entity.Event> serializer() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"com/simon/user/entity/Event.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/simon/user/entity/Event;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "events-lambda"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.simon.user.entity.Event> {
        @org.jetbrains.annotations.NotNull()
        public static final com.simon.user.entity.Event.$serializer INSTANCE = null;
        
        private $serializer() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.simon.user.entity.Event deserialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        @java.lang.Override()
        public void serialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
        com.simon.user.entity.Event value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}