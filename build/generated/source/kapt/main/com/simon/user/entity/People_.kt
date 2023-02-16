package com.simon.user.entity

import java.time.LocalDateTime
import kotlin.String
import kotlin.Suppress
import kotlin.collections.Collection
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.reflect.KProperty1
import org.litote.kmongo.property.KCollectionPropertyPath
import org.litote.kmongo.property.KCollectionSimplePropertyPath
import org.litote.kmongo.property.KMapPropertyPath
import org.litote.kmongo.property.KPropertyPath

private val __Id: KProperty1<People, String?>
    get() = People::id
private val __StartDate: KProperty1<People, LocalDateTime?>
    get() = People::startDate
private val __EndDate: KProperty1<People, LocalDateTime?>
    get() = People::endDate
private val __FirstName: KProperty1<People, String?>
    get() = People::firstName
private val __LastName: KProperty1<People, String?>
    get() = People::lastName
private val __Company: KProperty1<People, String?>
    get() = People::company
private val __EmployeeKind: KProperty1<People, EmployKind?>
    get() = People::employeeKind
private val __MatriculeAccount: KProperty1<People, String?>
    get() = People::matriculeAccount
private val __Teams: KProperty1<People, List<String>?>
    get() = People::teams
private val __Projects: KProperty1<People, List<String>?>
    get() = People::projects
class People_<T>(previous: KPropertyPath<T, *>?, property: KProperty1<*, People?>) :
        KPropertyPath<T, People?>(previous,property) {
    val id: KPropertyPath<T, String?>
        get() = KPropertyPath(this,__Id)

    val startDate: KPropertyPath<T, LocalDateTime?>
        get() = KPropertyPath(this,__StartDate)

    val endDate: KPropertyPath<T, LocalDateTime?>
        get() = KPropertyPath(this,__EndDate)

    val firstName: KPropertyPath<T, String?>
        get() = KPropertyPath(this,__FirstName)

    val lastName: KPropertyPath<T, String?>
        get() = KPropertyPath(this,__LastName)

    val company: KPropertyPath<T, String?>
        get() = KPropertyPath(this,__Company)

    val employeeKind: KPropertyPath<T, EmployKind?>
        get() = KPropertyPath(this,__EmployeeKind)

    val matriculeAccount: KPropertyPath<T, String?>
        get() = KPropertyPath(this,__MatriculeAccount)

    val teams: KCollectionSimplePropertyPath<T, String?>
        get() = KCollectionSimplePropertyPath(this,People::teams)

    val projects: KCollectionSimplePropertyPath<T, String?>
        get() = KCollectionSimplePropertyPath(this,People::projects)

    companion object {
        val Id: KProperty1<People, String?>
            get() = __Id
        val StartDate: KProperty1<People, LocalDateTime?>
            get() = __StartDate
        val EndDate: KProperty1<People, LocalDateTime?>
            get() = __EndDate
        val FirstName: KProperty1<People, String?>
            get() = __FirstName
        val LastName: KProperty1<People, String?>
            get() = __LastName
        val Company: KProperty1<People, String?>
            get() = __Company
        val EmployeeKind: KProperty1<People, EmployKind?>
            get() = __EmployeeKind
        val MatriculeAccount: KProperty1<People, String?>
            get() = __MatriculeAccount
        val Teams: KCollectionSimplePropertyPath<People, String?>
            get() = KCollectionSimplePropertyPath(null, __Teams)
        val Projects: KCollectionSimplePropertyPath<People, String?>
            get() = KCollectionSimplePropertyPath(null, __Projects)}
}

class People_Col<T>(previous: KPropertyPath<T, *>?, property: KProperty1<*, Collection<People>?>) :
        KCollectionPropertyPath<T, People?, People_<T>>(previous,property) {
    val id: KPropertyPath<T, String?>
        get() = KPropertyPath(this,__Id)

    val startDate: KPropertyPath<T, LocalDateTime?>
        get() = KPropertyPath(this,__StartDate)

    val endDate: KPropertyPath<T, LocalDateTime?>
        get() = KPropertyPath(this,__EndDate)

    val firstName: KPropertyPath<T, String?>
        get() = KPropertyPath(this,__FirstName)

    val lastName: KPropertyPath<T, String?>
        get() = KPropertyPath(this,__LastName)

    val company: KPropertyPath<T, String?>
        get() = KPropertyPath(this,__Company)

    val employeeKind: KPropertyPath<T, EmployKind?>
        get() = KPropertyPath(this,__EmployeeKind)

    val matriculeAccount: KPropertyPath<T, String?>
        get() = KPropertyPath(this,__MatriculeAccount)

    val teams: KCollectionSimplePropertyPath<T, String?>
        get() = KCollectionSimplePropertyPath(this,People::teams)

    val projects: KCollectionSimplePropertyPath<T, String?>
        get() = KCollectionSimplePropertyPath(this,People::projects)

    @Suppress("UNCHECKED_CAST")
    override fun memberWithAdditionalPath(additionalPath: String): People_<T> = People_(this,
            customProperty(this, additionalPath))}

class People_Map<T, K>(previous: KPropertyPath<T, *>?, property: KProperty1<*, Map<K, People>?>) :
        KMapPropertyPath<T, K, People?, People_<T>>(previous,property) {
    val id: KPropertyPath<T, String?>
        get() = KPropertyPath(this,__Id)

    val startDate: KPropertyPath<T, LocalDateTime?>
        get() = KPropertyPath(this,__StartDate)

    val endDate: KPropertyPath<T, LocalDateTime?>
        get() = KPropertyPath(this,__EndDate)

    val firstName: KPropertyPath<T, String?>
        get() = KPropertyPath(this,__FirstName)

    val lastName: KPropertyPath<T, String?>
        get() = KPropertyPath(this,__LastName)

    val company: KPropertyPath<T, String?>
        get() = KPropertyPath(this,__Company)

    val employeeKind: KPropertyPath<T, EmployKind?>
        get() = KPropertyPath(this,__EmployeeKind)

    val matriculeAccount: KPropertyPath<T, String?>
        get() = KPropertyPath(this,__MatriculeAccount)

    val teams: KCollectionSimplePropertyPath<T, String?>
        get() = KCollectionSimplePropertyPath(this,People::teams)

    val projects: KCollectionSimplePropertyPath<T, String?>
        get() = KCollectionSimplePropertyPath(this,People::projects)

    @Suppress("UNCHECKED_CAST")
    override fun memberWithAdditionalPath(additionalPath: String): People_<T> = People_(this,
            customProperty(this, additionalPath))}
