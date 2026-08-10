// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.senders.agent

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseCreateParams
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseDeleteParams
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseRetrieveParams
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class KnowledgeBaseServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val knowledgeBaseServiceAsync = client.senders().agent().knowledgeBases()

        val knowledgeBaseFuture =
            knowledgeBaseServiceAsync.create(
                KnowledgeBaseCreateParams.builder()
                    .senderId("senderId")
                    .name("Product FAQ")
                    .description("Frequently asked questions about our products")
                    .build()
            )

        val knowledgeBase = knowledgeBaseFuture.get()
        knowledgeBase.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val knowledgeBaseServiceAsync = client.senders().agent().knowledgeBases()

        val knowledgeBaseFuture =
            knowledgeBaseServiceAsync.retrieve(
                KnowledgeBaseRetrieveParams.builder().senderId("senderId").kbId("kbId").build()
            )

        val knowledgeBase = knowledgeBaseFuture.get()
        knowledgeBase.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val knowledgeBaseServiceAsync = client.senders().agent().knowledgeBases()

        val knowledgeBaseFuture =
            knowledgeBaseServiceAsync.update(
                KnowledgeBaseUpdateParams.builder()
                    .senderId("senderId")
                    .kbId("kbId")
                    .description("description")
                    .name("name")
                    .build()
            )

        val knowledgeBase = knowledgeBaseFuture.get()
        knowledgeBase.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val knowledgeBaseServiceAsync = client.senders().agent().knowledgeBases()

        val pageFuture = knowledgeBaseServiceAsync.list("senderId")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val knowledgeBaseServiceAsync = client.senders().agent().knowledgeBases()

        val future =
            knowledgeBaseServiceAsync.delete(
                KnowledgeBaseDeleteParams.builder().senderId("senderId").kbId("kbId").build()
            )

        val response = future.get()
    }
}
