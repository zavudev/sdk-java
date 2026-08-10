// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.knowledgebases

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentDocumentTest {

    @Test
    fun create() {
        val agentDocument =
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

        assertThat(agentDocument.id()).isEqualTo("id")
        assertThat(agentDocument.chunkCount()).isEqualTo(0L)
        assertThat(agentDocument.contentLength()).isEqualTo(0L)
        assertThat(agentDocument.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agentDocument.isProcessed()).isEqualTo(true)
        assertThat(agentDocument.knowledgeBaseId()).isEqualTo("knowledgeBaseId")
        assertThat(agentDocument.title()).isEqualTo("title")
        assertThat(agentDocument.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentDocument =
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

        val roundtrippedAgentDocument =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentDocument),
                jacksonTypeRef<AgentDocument>(),
            )

        assertThat(roundtrippedAgentDocument).isEqualTo(agentDocument)
    }
}
