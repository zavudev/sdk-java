// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.tools

import com.zavudev.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolUpdateParamsTest {

    @Test
    fun create() {
        ToolUpdateParams.builder()
            .senderId("senderId")
            .toolId("toolId")
            .description("description")
            .enabled(true)
            .name("name")
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
            .webhookSecret("webhookSecret")
            .webhookUrl("https://example.com")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ToolUpdateParams.builder().senderId("senderId").toolId("toolId").build()

        assertThat(params._pathParam(0)).isEqualTo("senderId")
        assertThat(params._pathParam(1)).isEqualTo("toolId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ToolUpdateParams.builder()
                .senderId("senderId")
                .toolId("toolId")
                .description("description")
                .enabled(true)
                .name("name")
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
                .webhookSecret("webhookSecret")
                .webhookUrl("https://example.com")
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.enabled()).contains(true)
        assertThat(body.name()).contains("name")
        assertThat(body.parameters())
            .contains(
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
        assertThat(body.webhookSecret()).contains("webhookSecret")
        assertThat(body.webhookUrl()).contains("https://example.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ToolUpdateParams.builder().senderId("senderId").toolId("toolId").build()

        val body = params._body()
    }
}
