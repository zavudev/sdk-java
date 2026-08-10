// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentStatsTest {

    @Test
    fun create() {
        val agentStats =
            AgentStats.builder()
                .errorCount(0L)
                .successCount(0L)
                .totalCost(0.0)
                .totalInvocations(0L)
                .totalTokensUsed(0L)
                .avgLatencyMs(0.0)
                .build()

        assertThat(agentStats.errorCount()).isEqualTo(0L)
        assertThat(agentStats.successCount()).isEqualTo(0L)
        assertThat(agentStats.totalCost()).isEqualTo(0.0)
        assertThat(agentStats.totalInvocations()).isEqualTo(0L)
        assertThat(agentStats.totalTokensUsed()).isEqualTo(0L)
        assertThat(agentStats.avgLatencyMs()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentStats =
            AgentStats.builder()
                .errorCount(0L)
                .successCount(0L)
                .totalCost(0.0)
                .totalInvocations(0L)
                .totalTokensUsed(0L)
                .avgLatencyMs(0.0)
                .build()

        val roundtrippedAgentStats =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentStats),
                jacksonTypeRef<AgentStats>(),
            )

        assertThat(roundtrippedAgentStats).isEqualTo(agentStats)
    }
}
