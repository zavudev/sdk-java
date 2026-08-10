// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.senders.agent.knowledgebases

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.models.senders.agent.knowledgebases.documents.DocumentCreateParams
import com.zavudev.api.models.senders.agent.knowledgebases.documents.DocumentDeleteParams
import com.zavudev.api.models.senders.agent.knowledgebases.documents.DocumentListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DocumentServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val documentService = client.senders().agent().knowledgeBases().documents()

        val document =
            documentService.create(
                DocumentCreateParams.builder()
                    .senderId("senderId")
                    .kbId("kbId")
                    .content("Our return policy allows returns within 30 days of purchase...")
                    .title("Return Policy")
                    .build()
            )

        document.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val documentService = client.senders().agent().knowledgeBases().documents()

        val page =
            documentService.list(
                DocumentListParams.builder().senderId("senderId").kbId("kbId").build()
            )

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val documentService = client.senders().agent().knowledgeBases().documents()

        documentService.delete(
            DocumentDeleteParams.builder().senderId("senderId").kbId("kbId").docId("docId").build()
        )
    }
}
