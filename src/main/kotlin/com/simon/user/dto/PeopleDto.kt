package com.simon.user.dto

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import simon.com.user.dto.EmployKindDto
import java.time.LocalDate

@Serializable
data class PeopleDto(
    val id: String,
    @Contextual
    val startDate: LocalDate,
    @Contextual
    val endDate: LocalDate,
    val firstName: String,
    val lastName: String,
    val company: String,
    val employeeKind: EmployKindDto,
    val matriculeAccount: String? = null,
    var teams: List<String>? = null,
    var projects: List<String>? = null
)
