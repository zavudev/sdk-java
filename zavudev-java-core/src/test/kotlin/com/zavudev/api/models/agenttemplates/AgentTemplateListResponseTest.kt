// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.agenttemplates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentTemplateListResponseTest {

    @Test
    fun create() {
        val agentTemplateListResponse =
            AgentTemplateListResponse.builder()
                .addItem(
                    AgentTemplateListResponse.Item.builder()
                        .id("fermi")
                        .category(AgentTemplateListResponse.Item.Category.SALES)
                        .name("name")
                        .summary("summary")
                        .toolCount(0L)
                        .voice(true)
                        .build()
                )
                .build()

        assertThat(agentTemplateListResponse.items())
            .containsExactly(
                AgentTemplateListResponse.Item.builder()
                    .id("fermi")
                    .category(AgentTemplateListResponse.Item.Category.SALES)
                    .name("name")
                    .summary("summary")
                    .toolCount(0L)
                    .voice(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentTemplateListResponse =
            AgentTemplateListResponse.builder()
                .addItem(
                    AgentTemplateListResponse.Item.builder()
                        .id("fermi")
                        .category(AgentTemplateListResponse.Item.Category.SALES)
                        .name("name")
                        .summary("summary")
                        .toolCount(0L)
                        .voice(true)
                        .build()
                )
                .build()

        val roundtrippedAgentTemplateListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentTemplateListResponse),
                jacksonTypeRef<AgentTemplateListResponse>(),
            )

        assertThat(roundtrippedAgentTemplateListResponse).isEqualTo(agentTemplateListResponse)
    }
}
