package com.simon.service

import com.mongodb.client.MongoCollection
import com.simon.extension.fromDto
import com.simon.extension.toDto
import com.simon.user.dto.EventDto
import com.simon.user.entity.*
import com.simon.user.schema.EventRequestParam
import org.bson.types.ObjectId
import org.koin.core.annotation.Single
import org.litote.kmongo.*
import org.litote.kmongo.id.toId


typealias EventType<T> = Event_<T>

@Single
class EventService(private val eventCollection: MongoCollection<Event>) {


    fun create(people: EventDto): String =
        eventCollection.insertOne(people.fromDto()).insertedId?.asObjectId()?.value?.toHexString()?:throw IllegalArgumentException()


    fun update(people: EventDto): String {
        val peopleEntity = people.fromDto()
        return eventCollection.updateOne(Event::id eq peopleEntity.id, peopleEntity).upsertedId?.asObjectId()?.value?.toHexString()?:throw IllegalArgumentException()
    }

    fun findAll(): List<EventDto> =
        eventCollection.find()
            .toList().map{it.toDto()}

    fun findById(id: String): EventDto? {
        val bsonId: Id<Event> = ObjectId(id).toId()
        return eventCollection
            .findOneById(bsonId)?.toDto()
    }



    fun findByAny(event: EventRequestParam) : List<EventDto> {
        val filters = mapOf(
            event.id to (EventType.Id eq if(event.id == null) null else ObjectId(event.id).toId()),
            event.startDate to (EventType.StartDate gte event.startDate),
            event.endDate to (EventType.EndDate lte event.endDate),
            event.note to (EventType.Note regex (event.note?:"")),
            event.kind to (EventType.Kind eq if(event.kind == null) null else EventKind.valueOf(event.kind.name)),
            event.status to (EventType.Status eq if(event.status == null) null else Status.valueOf(event.status.name)),

            event.requester?.lastName to (EventType.Requester.lastName eq (event.requester?.lastName)),
            event.requester?.firstName to (EventType.Requester.firstName eq (event.requester?.firstName)),
            event.requester?.matriculeAccount to (EventType.Requester.matriculeAccount eq (event.requester?.matriculeAccount)),
            event.requester?.company to (EventType.Requester.company eq (event.requester?.company)),
            event.requester?.teams to (EventType.Requester.teams all (if(event.requester?.teams == null) emptyList<String>() else event.requester.teams)),
            event.requester?.projects to (EventType.Requester.projects `in` (if(event.requester?.projects == null) emptyList<String>() else event.requester.projects)),
            event.requester?.employeeKind to (EventType.Requester.employeeKind eq (if(event.requester?.employeeKind == null) null else EmployKind.valueOf(event.requester.employeeKind.name)))

        ).filter { it.key != null }.values
        val query = and(
            filters
        )
        return eventCollection.find(query ).limit(50).map { it.toDto() }.toList()
    }


    fun deleteById(id: String): Boolean {
        val deleteResult = eventCollection.deleteOneById(ObjectId(id))
        return deleteResult.deletedCount == 1L
    }

}


