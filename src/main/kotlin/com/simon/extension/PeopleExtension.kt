package com.simon.extension

import com.simon.user.dto.PeopleDto
import com.simon.user.entity.EmployKind
import com.simon.user.entity.People
import simon.com.user.dto.EmployKindDto
import java.time.format.DateTimeFormatter

val formatter: DateTimeFormatter = DateTimeFormatter.ISO_DATE

fun People.toDto(): PeopleDto =
    PeopleDto(
        id = this.id,
        firstName = this.firstName,
        lastName = this.lastName,
        endDate = this.endDate.toLocalDate(),
        startDate = this.startDate.toLocalDate(),
        company = this.company,
        matriculeAccount = this.matriculeAccount,
        employeeKind = EmployKindDto.valueOf(this.employeeKind.name),
        teams = this.teams?.toMutableList(),
        projects = this.projects?.toMutableList()
    )

fun PeopleDto.fromDto(): People =
    People(
        id = this.id,
        firstName = this.firstName,
        lastName = this.lastName,
        endDate = this.endDate.atStartOfDay(),
        startDate = this.startDate.atStartOfDay(),
        company = this.company,
        matriculeAccount = this.matriculeAccount,
        employeeKind = EmployKind.valueOf(this.employeeKind.name),
        teams = this.teams?.toMutableList(),
        projects = this.projects?.toMutableList()
    )

