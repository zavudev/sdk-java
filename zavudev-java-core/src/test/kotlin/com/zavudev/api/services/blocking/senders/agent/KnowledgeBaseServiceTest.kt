// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.senders.agent

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseCreateParams
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseDeleteParams
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseRetrieveParams
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class KnowledgeBaseServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val knowledgeBaseService = client.senders().agent().knowledgeBases()

        val knowledgeBase =
            knowledgeBaseService.create(
                KnowledgeBaseCreateParams.builder()
                    .senderId("senderId")
                    .name("Product FAQ")
                    .description("Frequently asked questions about our products")
                    .build()
            )

        knowledgeBase.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val knowledgeBaseService = client.senders().agent().knowledgeBases()

        val knowledgeBase =
            knowledgeBaseService.retrieve(
                KnowledgeBaseRetrieveParams.builder().senderId("senderId").kbId("kbId").build()
            )

        knowledgeBase.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val knowledgeBaseService = client.senders().agent().knowledgeBases()

        val knowledgeBase =
            knowledgeBaseService.update(
                KnowledgeBaseUpdateParams.builder()
                    .senderId("senderId")
                    .kbId("kbId")
                    .description("description")
                    .name("name")
                    .build()
            )

        knowledgeBase.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val knowledgeBaseService = client.senders().agent().knowledgeBases()

        val page = knowledgeBaseService.list("senderId")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val knowledgeBaseService = client.senders().agent().knowledgeBases()

        knowledgeBaseService.delete(
            KnowledgeBaseDeleteParams.builder().senderId("senderId").kbId("kbId").build()
        )
    }
}
