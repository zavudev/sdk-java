// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.knowledgebases

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentKnowledgeBaseTest {

    @Test
    fun create() {
        val agentKnowledgeBase =
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

        assertThat(agentKnowledgeBase.id()).isEqualTo("id")
        assertThat(agentKnowledgeBase.agentId()).isEqualTo("agentId")
        assertThat(agentKnowledgeBase.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agentKnowledgeBase.documentCount()).isEqualTo(0L)
        assertThat(agentKnowledgeBase.name()).isEqualTo("name")
        assertThat(agentKnowledgeBase.totalChunks()).isEqualTo(0L)
        assertThat(agentKnowledgeBase.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agentKnowledgeBase.description()).contains("description")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentKnowledgeBase =
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

        val roundtrippedAgentKnowledgeBase =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentKnowledgeBase),
                jacksonTypeRef<AgentKnowledgeBase>(),
            )

        assertThat(roundtrippedAgentKnowledgeBase).isEqualTo(agentKnowledgeBase)
    }
}
