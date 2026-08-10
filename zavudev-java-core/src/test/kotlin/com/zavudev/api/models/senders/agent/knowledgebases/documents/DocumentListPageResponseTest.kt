// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.knowledgebases.documents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import com.zavudev.api.models.senders.agent.knowledgebases.AgentDocument
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentListPageResponseTest {

    @Test
    fun create() {
        val documentListPageResponse =
            DocumentListPageResponse.builder()
                .addItem(
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
                .nextCursor("nextCursor")
                .build()

        assertThat(documentListPageResponse.items())
            .containsExactly(
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
        assertThat(documentListPageResponse.nextCursor()).contains("nextCursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentListPageResponse =
            DocumentListPageResponse.builder()
                .addItem(
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
                .nextCursor("nextCursor")
                .build()

        val roundtrippedDocumentListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentListPageResponse),
                jacksonTypeRef<DocumentListPageResponse>(),
            )

        assertThat(roundtrippedDocumentListPageResponse).isEqualTo(documentListPageResponse)
    }
}
