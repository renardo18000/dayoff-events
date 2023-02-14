package com.simon.routing

//class PeoplePrintRequest(private val eventService: EventService,
//                         private val peopleBody: BodyLens<PeopleDto> = Body.auto<PeopleDto>().toLens(),
//                         private val peopleListReponseHandler: BiDiBodyLens<List<PeopleDto>> =
//                             Body.auto<List<PeopleDto>>().toLens(),
//                         private val peopleRoute: RoutingHttpHandler =
//                             routes(
//                                 "/people" bind Method.GET to {
//                                     Response(OK).with(peopleListReponseHandler of eventService.findAll())
//                                 },
//                                 "/people" bind Method.POST to {
//                                     Logger.getLogger("people route").info("called made")
//                                     Response(OK).body(eventService.create(peopleBody.extract(it)))
//                                 },
//
//                                 "/people/search" bind Method.GET to {
//                                     val nameLens = Query.string().required("name")
//                                     Response(OK).with(peopleListReponseHandler of eventService.findBylastNameOrMatOrFirstName(nameLens(it)))
//                                 },
//
//
//                                 )): RoutingHttpHandler by peopleRoute {


//}

data class Pageable(val number: Int = 0, val size: Int = 0, val offset: Int = 0, val sorted: Boolean = false, val unpaged: Boolean = false)
