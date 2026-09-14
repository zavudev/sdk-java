// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentListVoicesResponseTest {

    @Test
    fun create() {
        val agentListVoicesResponse =
            AgentListVoicesResponse.builder()
                .addItem(
                    AgentListVoicesResponse.Item.builder()
                        .id("aura-2-celeste-es")
                        .language("es")
                        .name("celeste")
                        .build()
                )
                .addLanguage("string")
                .total(0L)
                .build()

        assertThat(agentListVoicesResponse.items())
            .containsExactly(
                AgentListVoicesResponse.Item.builder()
                    .id("aura-2-celeste-es")
                    .language("es")
                    .name("celeste")
                    .build()
            )
        assertThat(agentListVoicesResponse.languages()).containsExactly("string")
        assertThat(agentListVoicesResponse.total()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentListVoicesResponse =
            AgentListVoicesResponse.builder()
                .addItem(
                    AgentListVoicesResponse.Item.builder()
                        .id("aura-2-celeste-es")
                        .language("es")
                        .name("celeste")
                        .build()
                )
                .addLanguage("string")
                .total(0L)
                .build()

        val roundtrippedAgentListVoicesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentListVoicesResponse),
                jacksonTypeRef<AgentListVoicesResponse>(),
            )

        assertThat(roundtrippedAgentListVoicesResponse).isEqualTo(agentListVoicesResponse)
    }
}
