package com.simon.user.dto

import java.time.LocalDateTime


class EventDto(val id: String? = null,
               val startDate: LocalDateTime,
               val endDate: LocalDateTime,
               val status: StatusDto,
               val kind: EventKindDto,
               val note: String,
               val requester: PeopleDto
)
