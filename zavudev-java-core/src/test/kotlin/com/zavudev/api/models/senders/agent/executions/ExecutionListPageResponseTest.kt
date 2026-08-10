// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.executions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import com.zavudev.api.models.senders.agent.AgentExecution
import com.zavudev.api.models.senders.agent.AgentExecutionStatus
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExecutionListPageResponseTest {

    @Test
    fun create() {
        val executionListPageResponse =
            ExecutionListPageResponse.builder()
                .addItem(
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
                )
                .nextCursor("nextCursor")
                .build()

        assertThat(executionListPageResponse.items())
            .containsExactly(
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
            )
        assertThat(executionListPageResponse.nextCursor()).contains("nextCursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val executionListPageResponse =
            ExecutionListPageResponse.builder()
                .addItem(
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
                )
                .nextCursor("nextCursor")
                .build()

        val roundtrippedExecutionListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(executionListPageResponse),
                jacksonTypeRef<ExecutionListPageResponse>(),
            )

        assertThat(roundtrippedExecutionListPageResponse).isEqualTo(executionListPageResponse)
    }
}
