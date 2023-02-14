package com.simon.extension

import com.simon.user.dto.EventDto
import com.simon.user.dto.EventKindDto
import com.simon.user.dto.StatusDto
import com.simon.user.entity.Event
import com.simon.user.entity.EventKind
import com.simon.user.entity.Status
import org.bson.types.ObjectId
import org.litote.kmongo.id.toId

fun Event.toDto(): EventDto =
    EventDto(
        id = this.id.toString(),
        note = this.note,
        kind = EventKindDto.valueOf(this.kind.name),
        status = StatusDto.valueOf(this.status.name),
        endDate = this.endDate,
        startDate = this.startDate,
        requester = this.requester.toDto()
    )

fun EventDto.fromDto(): Event =
    Event(
        id = this.id?.let { ObjectId(it).toId() },
        note = this.note,
        kind = EventKind.valueOf(kind.name),
        status = Status.valueOf(this.status.name),
        endDate = this.endDate,
        startDate = this.startDate,
        requester = this.requester.fromDto()
    )


//fun People.toDto(): PeopleDto =
//    PeopleDto(
//        id = this.id,
//        firstName = this.firstName,
//        lastName = this.lastName,
//        endDate = this.endDate,
//        startDate = this.startDate,
//        company = this.company,
//        matriculeAccount = this.matriculeAccount,
//        employeeKind = EmployKindDto.valueOf(this.employeeKind.name),
//        projects = this.projects?.toList(),
//        teams = this.teams?.toList()
//
//    )
//
//fun PeopleDto.fromDto(): People =
//    People(
//        firstName = this.firstName,
//        lastName = this.lastName,
//        endDate = this.endDate,
//        startDate = this.startDate,
//        company = this.company,
//        matriculeAccount = this.matriculeAccount,
//        employeeKind = EmployKind.valueOf(this.employeeKind.name),
//        projects = this.projects?.toList(),
//        teams = this.teams?.toList()
//    )
