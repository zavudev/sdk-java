// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentTestResponseTest {

    @Test
    fun create() {
        val agentTestResponse =
            AgentTestResponse.builder()
                .error("error")
                .inputTokens(0L)
                .knowledgeChunksUsed(0L)
                .latencyMs(0L)
                .outputTokens(0L)
                .success(true)
                .text("text")
                .addWarning("string")
                .addExecutedToolCall(
                    AgentTestResponse.ExecutedToolCall.builder()
                        .name("name")
                        .ok(true)
                        .error("error")
                        .build()
                )
                .build()

        assertThat(agentTestResponse.error()).contains("error")
        assertThat(agentTestResponse.inputTokens()).isEqualTo(0L)
        assertThat(agentTestResponse.knowledgeChunksUsed()).isEqualTo(0L)
        assertThat(agentTestResponse.latencyMs()).isEqualTo(0L)
        assertThat(agentTestResponse.outputTokens()).isEqualTo(0L)
        assertThat(agentTestResponse.success()).isEqualTo(true)
        assertThat(agentTestResponse.text()).contains("text")
        assertThat(agentTestResponse.warnings()).containsExactly("string")
        assertThat(agentTestResponse.executedToolCalls().getOrNull())
            .containsExactly(
                AgentTestResponse.ExecutedToolCall.builder()
                    .name("name")
                    .ok(true)
                    .error("error")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentTestResponse =
            AgentTestResponse.builder()
                .error("error")
                .inputTokens(0L)
                .knowledgeChunksUsed(0L)
                .latencyMs(0L)
                .outputTokens(0L)
                .success(true)
                .text("text")
                .addWarning("string")
                .addExecutedToolCall(
                    AgentTestResponse.ExecutedToolCall.builder()
                        .name("name")
                        .ok(true)
                        .error("error")
                        .build()
                )
                .build()

        val roundtrippedAgentTestResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentTestResponse),
                jacksonTypeRef<AgentTestResponse>(),
            )

        assertThat(roundtrippedAgentTestResponse).isEqualTo(agentTestResponse)
    }
}
