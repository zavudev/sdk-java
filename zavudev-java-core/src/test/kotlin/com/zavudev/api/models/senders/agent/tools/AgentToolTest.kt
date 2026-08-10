// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentToolTest {

    @Test
    fun create() {
        val agentTool =
            AgentTool.builder()
                .id("id")
                .agentId("agentId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .enabled(true)
                .name("get_order_status")
                .parameters(
                    ToolParameters.builder()
                        .properties(
                            ToolParameters.Properties.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf("description" to "description", "type" to "type")
                                    ),
                                )
                                .build()
                        )
                        .addRequired("string")
                        .type(ToolParameters.Type.OBJECT)
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .webhookUrl("https://example.com")
                .webhookSecret("whsec_abc123...")
                .build()

        assertThat(agentTool.id()).isEqualTo("id")
        assertThat(agentTool.agentId()).isEqualTo("agentId")
        assertThat(agentTool.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agentTool.description()).isEqualTo("description")
        assertThat(agentTool.enabled()).isEqualTo(true)
        assertThat(agentTool.name()).isEqualTo("get_order_status")
        assertThat(agentTool.parameters())
            .isEqualTo(
                ToolParameters.builder()
                    .properties(
                        ToolParameters.Properties.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf("description" to "description", "type" to "type")
                                ),
                            )
                            .build()
                    )
                    .addRequired("string")
                    .type(ToolParameters.Type.OBJECT)
                    .build()
            )
        assertThat(agentTool.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agentTool.webhookUrl()).isEqualTo("https://example.com")
        assertThat(agentTool.webhookSecret()).contains("whsec_abc123...")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentTool =
            AgentTool.builder()
                .id("id")
                .agentId("agentId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .enabled(true)
                .name("get_order_status")
                .parameters(
                    ToolParameters.builder()
                        .properties(
                            ToolParameters.Properties.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf("description" to "description", "type" to "type")
                                    ),
                                )
                                .build()
                        )
                        .addRequired("string")
                        .type(ToolParameters.Type.OBJECT)
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .webhookUrl("https://example.com")
                .webhookSecret("whsec_abc123...")
                .build()

        val roundtrippedAgentTool =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentTool),
                jacksonTypeRef<AgentTool>(),
            )

        assertThat(roundtrippedAgentTool).isEqualTo(agentTool)
    }
}
