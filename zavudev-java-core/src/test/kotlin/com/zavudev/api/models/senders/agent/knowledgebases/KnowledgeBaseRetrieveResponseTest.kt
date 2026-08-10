// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.knowledgebases

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KnowledgeBaseRetrieveResponseTest {

    @Test
    fun create() {
        val knowledgeBaseRetrieveResponse =
            KnowledgeBaseRetrieveResponse.builder()
                .knowledgeBase(
                    AgentKnowledgeBase.builder()
                        .id("id")
                        .agentId("agentId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .documentCount(0L)
                        .name("name")
                        .totalChunks(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .build()
                )
                .build()

        assertThat(knowledgeBaseRetrieveResponse.knowledgeBase())
            .isEqualTo(
                AgentKnowledgeBase.builder()
                    .id("id")
                    .agentId("agentId")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .documentCount(0L)
                    .name("name")
                    .totalChunks(0L)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val knowledgeBaseRetrieveResponse =
            KnowledgeBaseRetrieveResponse.builder()
                .knowledgeBase(
                    AgentKnowledgeBase.builder()
                        .id("id")
                        .agentId("agentId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .documentCount(0L)
                        .name("name")
                        .totalChunks(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .build()
                )
                .build()

        val roundtrippedKnowledgeBaseRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(knowledgeBaseRetrieveResponse),
                jacksonTypeRef<KnowledgeBaseRetrieveResponse>(),
            )

        assertThat(roundtrippedKnowledgeBaseRetrieveResponse)
            .isEqualTo(knowledgeBaseRetrieveResponse)
    }
}
