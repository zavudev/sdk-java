// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.executions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import com.zavudev.api.models.senders.agent.AgentExecution
import com.zavudev.api.models.senders.agent.AgentExecutionStatus
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExecutionRetrieveResponseTest {

    @Test
    fun create() {
        val executionRetrieveResponse =
            ExecutionRetrieveResponse.builder()
                .execution(
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
                .build()

        assertThat(executionRetrieveResponse.execution())
            .isEqualTo(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val executionRetrieveResponse =
            ExecutionRetrieveResponse.builder()
                .execution(
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
                .build()

        val roundtrippedExecutionRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(executionRetrieveResponse),
                jacksonTypeRef<ExecutionRetrieveResponse>(),
            )

        assertThat(roundtrippedExecutionRetrieveResponse).isEqualTo(executionRetrieveResponse)
    }
}
