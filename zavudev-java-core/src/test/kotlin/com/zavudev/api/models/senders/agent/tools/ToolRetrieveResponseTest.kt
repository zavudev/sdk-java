// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolRetrieveResponseTest {

    @Test
    fun create() {
        val toolRetrieveResponse =
            ToolRetrieveResponse.builder()
                .tool(
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
                                                mapOf(
                                                    "description" to "description",
                                                    "type" to "type",
                                                )
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
                )
                .build()

        assertThat(toolRetrieveResponse.tool())
            .isEqualTo(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolRetrieveResponse =
            ToolRetrieveResponse.builder()
                .tool(
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
                                                mapOf(
                                                    "description" to "description",
                                                    "type" to "type",
                                                )
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
                )
                .build()

        val roundtrippedToolRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolRetrieveResponse),
                jacksonTypeRef<ToolRetrieveResponse>(),
            )

        assertThat(roundtrippedToolRetrieveResponse).isEqualTo(toolRetrieveResponse)
    }
}
