package com.simon.user.entity

import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.litote.kmongo.Data
import java.time.LocalDateTime


@Serializable
@Data
data class People(
    @SerialName("_id") @Contextual
    val id: String,
    @Contextual
    val startDate: LocalDateTime,
    @Contextual
    val endDate: LocalDateTime,
    val firstName: String,
    val lastName: String,
    val company: String,
    val employeeKind: EmployKind,
    val matriculeAccount: String?,
    var teams: List<String>? = null,
    var projects: List<String>? = null
)

