package com.simon.user.entity

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import org.bson.codecs.pojo.annotations.BsonId
import org.litote.kmongo.Data
import org.litote.kmongo.Id
import java.time.LocalDateTime

@Data @Serializable
data class Event(
    @BsonId @Contextual
    val id: Id<Event>?,
    @Contextual
    val startDate: LocalDateTime,
    @Contextual
    val endDate: LocalDateTime,
    val status: Status,
    val kind: EventKind,
    val note: String,
    val requester: People
)
