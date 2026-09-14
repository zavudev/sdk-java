// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.knowledgebases.documents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import com.zavudev.api.models.senders.agent.knowledgebases.AgentDocument
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentUpdateDocumentResponseTest {

    @Test
    fun create() {
        val documentUpdateDocumentResponse =
            DocumentUpdateDocumentResponse.builder()
                .document(
                    AgentDocument.builder()
                        .id("id")
                        .chunkCount(0L)
                        .contentLength(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isProcessed(true)
                        .knowledgeBaseId("knowledgeBaseId")
                        .title("title")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(documentUpdateDocumentResponse.document())
            .isEqualTo(
                AgentDocument.builder()
                    .id("id")
                    .chunkCount(0L)
                    .contentLength(0L)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .isProcessed(true)
                    .knowledgeBaseId("knowledgeBaseId")
                    .title("title")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentUpdateDocumentResponse =
            DocumentUpdateDocumentResponse.builder()
                .document(
                    AgentDocument.builder()
                        .id("id")
                        .chunkCount(0L)
                        .contentLength(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isProcessed(true)
                        .knowledgeBaseId("knowledgeBaseId")
                        .title("title")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedDocumentUpdateDocumentResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentUpdateDocumentResponse),
                jacksonTypeRef<DocumentUpdateDocumentResponse>(),
            )

        assertThat(roundtrippedDocumentUpdateDocumentResponse)
            .isEqualTo(documentUpdateDocumentResponse)
    }
}
