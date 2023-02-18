package com.simon.user.entity

import java.time.LocalDateTime
import kotlin.String
import kotlin.Suppress
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.reflect.KProperty1
import org.litote.kmongo.Id
import org.litote.kmongo.property.KCollectionPropertyPath
import org.litote.kmongo.property.KMapPropertyPath
import org.litote.kmongo.property.KPropertyPath

private val __Id: KProperty1<Event, Id<Event>?>
    get() = Event::id
private val __StartDate: KProperty1<Event, LocalDateTime?>
    get() = Event::startDate
private val __EndDate: KProperty1<Event, LocalDateTime?>
    get() = Event::endDate
private val __Status: KProperty1<Event, Status?>
    get() = Event::status
private val __Kind: KProperty1<Event, EventKind?>
    get() = Event::kind
private val __Note: KProperty1<Event, String?>
    get() = Event::note
private val __Requester: KProperty1<Event, People?>
    get() = Event::requester
class Event_<T>(previous: KPropertyPath<T, *>?, property: KProperty1<*, Event?>) : KPropertyPath<T,
        Event?>(previous,property) {
    val id: KPropertyPath<T, Id<Event>?>
        get() = KPropertyPath(this,__Id)

    val startDate: KPropertyPath<T, LocalDateTime?>
        get() = KPropertyPath(this,__StartDate)

    val endDate: KPropertyPath<T, LocalDateTime?>
        get() = KPropertyPath(this,__EndDate)

    val status: KPropertyPath<T, Status?>
        get() = KPropertyPath(this,__Status)

    val kind: KPropertyPath<T, EventKind?>
        get() = KPropertyPath(this,__Kind)

    val note: KPropertyPath<T, String?>
        get() = KPropertyPath(this,__Note)

    val requester: People_<T>
        get() = People_(this,Event::requester)

    companion object {
        val Id: KProperty1<Event, Id<Event>?>
            get() = __Id
        val StartDate: KProperty1<Event, LocalDateTime?>
            get() = __StartDate
        val EndDate: KProperty1<Event, LocalDateTime?>
            get() = __EndDate
        val Status: KProperty1<Event, Status?>
            get() = __Status
        val Kind: KProperty1<Event, EventKind?>
            get() = __Kind
        val Note: KProperty1<Event, String?>
            get() = __Note
        val Requester: People_<Event>
            get() = People_(null,__Requester)}
}

class Event_Col<T>(previous: KPropertyPath<T, *>?, property: KProperty1<*, Collection<Event>?>) :
        KCollectionPropertyPath<T, Event?, Event_<T>>(previous,property) {
    val id: KPropertyPath<T, Id<Event>?>
        get() = KPropertyPath(this,__Id)

    val startDate: KPropertyPath<T, LocalDateTime?>
        get() = KPropertyPath(this,__StartDate)

    val endDate: KPropertyPath<T, LocalDateTime?>
        get() = KPropertyPath(this,__EndDate)

    val status: KPropertyPath<T, Status?>
        get() = KPropertyPath(this,__Status)

    val kind: KPropertyPath<T, EventKind?>
        get() = KPropertyPath(this,__Kind)

    val note: KPropertyPath<T, String?>
        get() = KPropertyPath(this,__Note)

    val requester: People_<T>
        get() = People_(this,Event::requester)

    @Suppress("UNCHECKED_CAST")
    override fun memberWithAdditionalPath(additionalPath: String): Event_<T> = Event_(this,
            customProperty(this, additionalPath))}

class Event_Map<T, K>(previous: KPropertyPath<T, *>?, property: KProperty1<*, Map<K, Event>?>) :
        KMapPropertyPath<T, K, Event?, Event_<T>>(previous,property) {
    val id: KPropertyPath<T, Id<Event>?>
        get() = KPropertyPath(this,__Id)

    val startDate: KPropertyPath<T, LocalDateTime?>
        get() = KPropertyPath(this,__StartDate)

    val endDate: KPropertyPath<T, LocalDateTime?>
        get() = KPropertyPath(this,__EndDate)

    val status: KPropertyPath<T, Status?>
        get() = KPropertyPath(this,__Status)

    val kind: KPropertyPath<T, EventKind?>
        get() = KPropertyPath(this,__Kind)

    val note: KPropertyPath<T, String?>
        get() = KPropertyPath(this,__Note)

    val requester: People_<T>
        get() = People_(this,Event::requester)

    @Suppress("UNCHECKED_CAST")
    override fun memberWithAdditionalPath(additionalPath: String): Event_<T> = Event_(this,
            customProperty(this, additionalPath))}
