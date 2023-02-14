package com.simon.db

import com.mongodb.ConnectionString
import com.mongodb.MongoClientSettings
import com.mongodb.client.MongoClient
import com.mongodb.client.MongoCollection
import com.simon.settings.Settings
import com.simon.user.entity.Event
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single
import org.litote.kmongo.KMongo
import org.litote.kmongo.ensureIndex
import org.litote.kmongo.getCollection

@Module @ComponentScan
class DbModule {

    @Single
    fun getMongoClient(settings: Settings): MongoClient =
        KMongo.createClient(MongoClientSettings.builder()
            .applyToSslSettings { it.enabled(false).invalidHostNameAllowed(true) }
            .applyConnectionString(ConnectionString(settings.mongoConnectionUrl))
            .build()
        )
    @Single
    fun getEventCollection(mongoClient: MongoClient): MongoCollection<Event> {
        val peopleMongoCollection: MongoCollection<Event> = mongoClient.getDatabase("events").getCollection<Event>("events")
        peopleMongoCollection.ensureIndex(Event::startDate, Event::endDate, Event::note, Event::requester, Event::kind, Event::status)
        return peopleMongoCollection
    }
}
