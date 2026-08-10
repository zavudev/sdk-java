// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentExecutionTest {

    @Test
    fun create() {
        val agentExecution =
            AgentExecution.builder()
                .id("id")
                .agentId("agentId")
                .cost(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .inputTokens(0L)
                .latencyMs(0L)
                .outputTokens(0L)
                .status(AgentExecutionStatus.SUCCESS)
                .errorMessage("errorMessage")
                .inboundMessageId("inboundMessageId")
                .knowledgeChunksUsed(0L)
                .responseMessageId("responseMessageId")
                .responseText("responseText")
                .toolCalls(0L)
                .build()

        assertThat(agentExecution.id()).isEqualTo("id")
        assertThat(agentExecution.agentId()).isEqualTo("agentId")
        assertThat(agentExecution.cost()).isEqualTo(0.0)
        assertThat(agentExecution.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agentExecution.inputTokens()).isEqualTo(0L)
        assertThat(agentExecution.latencyMs()).isEqualTo(0L)
        assertThat(agentExecution.outputTokens()).isEqualTo(0L)
        assertThat(agentExecution.status()).isEqualTo(AgentExecutionStatus.SUCCESS)
        assertThat(agentExecution.errorMessage()).contains("errorMessage")
        assertThat(agentExecution.inboundMessageId()).contains("inboundMessageId")
        assertThat(agentExecution.knowledgeChunksUsed()).contains(0L)
        assertThat(agentExecution.responseMessageId()).contains("responseMessageId")
        assertThat(agentExecution.responseText()).contains("responseText")
        assertThat(agentExecution.toolCalls()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentExecution =
            AgentExecution.builder()
                .id("id")
                .agentId("agentId")
                .cost(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .inputTokens(0L)
                .latencyMs(0L)
                .outputTokens(0L)
                .status(AgentExecutionStatus.SUCCESS)
                .errorMessage("errorMessage")
                .inboundMessageId("inboundMessageId")
                .knowledgeChunksUsed(0L)
                .responseMessageId("responseMessageId")
                .responseText("responseText")
                .toolCalls(0L)
                .build()

        val roundtrippedAgentExecution =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentExecution),
                jacksonTypeRef<AgentExecution>(),
            )

        assertThat(roundtrippedAgentExecution).isEqualTo(agentExecution)
    }
}
