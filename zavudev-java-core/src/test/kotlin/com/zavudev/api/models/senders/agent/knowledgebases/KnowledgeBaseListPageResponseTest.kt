// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.knowledgebases

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KnowledgeBaseListPageResponseTest {

    @Test
    fun create() {
        val knowledgeBaseListPageResponse =
            KnowledgeBaseListPageResponse.builder()
                .addItem(
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
                .nextCursor("nextCursor")
                .build()

        assertThat(knowledgeBaseListPageResponse.items())
            .containsExactly(
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
        assertThat(knowledgeBaseListPageResponse.nextCursor()).contains("nextCursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val knowledgeBaseListPageResponse =
            KnowledgeBaseListPageResponse.builder()
                .addItem(
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
                .nextCursor("nextCursor")
                .build()

        val roundtrippedKnowledgeBaseListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(knowledgeBaseListPageResponse),
                jacksonTypeRef<KnowledgeBaseListPageResponse>(),
            )

        assertThat(roundtrippedKnowledgeBaseListPageResponse)
            .isEqualTo(knowledgeBaseListPageResponse)
    }
}
