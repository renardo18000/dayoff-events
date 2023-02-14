package com.simon.user.schema

import com.apurebase.kgraphql.schema.model.FunctionWrapper.Companion.on
import com.mongodb.client.FindIterable
import com.mongodb.client.MongoClient
import com.mongodb.client.MongoCollection
import com.mongodb.client.MongoDatabase
import com.mongodb.client.MongoIterable
import com.simon.service.EventService
import com.simon.settings.CONNECTION_MONGO
import com.simon.settings.Settings
import com.simon.user.entity.Event
import io.cloudevents.CloudEvent
import io.cloudevents.core.v1.CloudEventBuilder
import okhttp3.internal.toImmutableList
import org.bson.conversions.Bson
import org.http4k.client.ApacheClient
import org.http4k.cloudnative.env.Environment
import org.http4k.cloudnative.env.EnvironmentKey
import org.http4k.core.*
import org.http4k.lens.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.koin.test.mock.MockProvider
import org.litote.kmongo.ensureIndex
import org.litote.kmongo.getCollection
import org.mockito.ArgumentCaptor
import org.mockito.Mockito
import org.mockito.Mockito.*
import org.mockito.kotlin.verify
import java.net.URI
import java.time.OffsetDateTime
import java.util.*

internal class GraphQlModuleTest {

    val test = "query { searchEvents(params: { startDate: \"2000-10-28T13:05:54.625219\" endDate: \"3000-12-28T13:05:54.625219\" }) { kind status } }"


    private val moduleUnderTest: GraphQlModule = GraphQlModule()

    @Test
    fun getEventPublisher() {
        val ksinkUri = "localhost:123456"
        val ceToSend = CloudEventBuilder()
            .withId(UUID.randomUUID().toString())
            .withSource(URI("events-graphql"))
            .withTime(OffsetDateTime.now())
            .withType("toto")
            .withExtension("connectionid", "tutu")
            .withData("application/json", EventGraphResponse(""))
            .build()

        val settings = Settings(Environment.from("CONNECTION_MONGO" to "", "PORT" to "8080", "K_SINK" to ksinkUri, "OUTPUT_TYPE" to "testouput"))
        val eventPub = moduleUnderTest.getEventPublisher(settings = settings, httpHandler = {
            assertEquals(it.uri, Uri.of(ksinkUri))
            assertEquals(it.method, Method.POST)
            Response(Status.OK)
        }, Body.cloudEvent().toLens())
        eventPub(ceToSend)
    }

    @Test
    fun provideScope() {
    }

    @Test
    fun provideSchema() {
        val client = mock(MongoClient::class.java)
        val mongoCollection = mock(MongoCollection::class.java)
        val schema  = moduleUnderTest.provideSchema(EventService(mongoCollection as MongoCollection<Event>))
        val filterCaptor: ArgumentCaptor<Bson> = ArgumentCaptor.forClass(Bson::class.java)
        assertNotNull(schema)
//        println(filterCaptor.value.toBsonDocument().toString())
//        assertEquals(filterCaptor.value.toBsonDocument().getDocument("startDate"), filterCaptor.value)

//        val queryResult = mock(FindIterable::class.java) as FindIterable<Event>
//        `when`(queryResult.limit(anyInt())).thenReturn(queryResult)
//        `when`(queryResult.toList()).thenReturn(emptyList())
//        mockStatic(MongoIterable::class.java)
//        `when`(mongoCollection.find(any(Bson::class.java))).thenReturn(queryResult)
//        val resFind = schema.executeBlocking(request = test)
//        verify(mongoCollection).find(filterCaptor.capture())
//        assertEquals("", filterCaptor.value.toString())

    }

    @Test
    fun provideClient() {
    }

    @Test
    fun provideGraphqlApp() {
    }

    @Test
    fun getGraphQlCloudEventProcessor() {
    }

    @Test
    fun provideHttpGraphqlRequestHandler() {
    }
}
