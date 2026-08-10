// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.tools

import com.zavudev.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolCreateParamsTest {

    @Test
    fun create() {
        ToolCreateParams.builder()
            .senderId("senderId")
            .description("Get the status of a customer order")
            .name("get_order_status")
            .parameters(
                ToolParameters.builder()
                    .properties(
                        ToolParameters.Properties.builder()
                            .putAdditionalProperty(
                                "order_id",
                                JsonValue.from(
                                    mapOf(
                                        "description" to "The order ID to look up",
                                        "type" to "string",
                                    )
                                ),
                            )
                            .build()
                    )
                    .addRequired("order_id")
                    .type(ToolParameters.Type.OBJECT)
                    .build()
            )
            .webhookUrl("https://api.example.com/webhooks/order-status")
            .enabled(true)
            .webhookSecret("whsec_...")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ToolCreateParams.builder()
                .senderId("senderId")
                .description("Get the status of a customer order")
                .name("get_order_status")
                .parameters(
                    ToolParameters.builder()
                        .properties(
                            ToolParameters.Properties.builder()
                                .putAdditionalProperty(
                                    "order_id",
                                    JsonValue.from(mapOf<String, Any>()),
                                )
                                .build()
                        )
                        .addRequired("order_id")
                        .type(ToolParameters.Type.OBJECT)
                        .build()
                )
                .webhookUrl("https://api.example.com/webhooks/order-status")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("senderId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ToolCreateParams.builder()
                .senderId("senderId")
                .description("Get the status of a customer order")
                .name("get_order_status")
                .parameters(
                    ToolParameters.builder()
                        .properties(
                            ToolParameters.Properties.builder()
                                .putAdditionalProperty(
                                    "order_id",
                                    JsonValue.from(
                                        mapOf(
                                            "description" to "The order ID to look up",
                                            "type" to "string",
                                        )
                                    ),
                                )
                                .build()
                        )
                        .addRequired("order_id")
                        .type(ToolParameters.Type.OBJECT)
                        .build()
                )
                .webhookUrl("https://api.example.com/webhooks/order-status")
                .enabled(true)
                .webhookSecret("whsec_...")
                .build()

        val body = params._body()

        assertThat(body.description()).isEqualTo("Get the status of a customer order")
        assertThat(body.name()).isEqualTo("get_order_status")
        assertThat(body.parameters())
            .isEqualTo(
                ToolParameters.builder()
                    .properties(
                        ToolParameters.Properties.builder()
                            .putAdditionalProperty(
                                "order_id",
                                JsonValue.from(
                                    mapOf(
                                        "description" to "The order ID to look up",
                                        "type" to "string",
                                    )
                                ),
                            )
                            .build()
                    )
                    .addRequired("order_id")
                    .type(ToolParameters.Type.OBJECT)
                    .build()
            )
        assertThat(body.webhookUrl()).isEqualTo("https://api.example.com/webhooks/order-status")
        assertThat(body.enabled()).contains(true)
        assertThat(body.webhookSecret()).contains("whsec_...")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ToolCreateParams.builder()
                .senderId("senderId")
                .description("Get the status of a customer order")
                .name("get_order_status")
                .parameters(
                    ToolParameters.builder()
                        .properties(
                            ToolParameters.Properties.builder()
                                .putAdditionalProperty(
                                    "order_id",
                                    JsonValue.from(mapOf<String, Any>()),
                                )
                                .build()
                        )
                        .addRequired("order_id")
                        .type(ToolParameters.Type.OBJECT)
                        .build()
                )
                .webhookUrl("https://api.example.com/webhooks/order-status")
                .build()

        val body = params._body()

        assertThat(body.description()).isEqualTo("Get the status of a customer order")
        assertThat(body.name()).isEqualTo("get_order_status")
        assertThat(body.parameters())
            .isEqualTo(
                ToolParameters.builder()
                    .properties(
                        ToolParameters.Properties.builder()
                            .putAdditionalProperty("order_id", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .addRequired("order_id")
                    .type(ToolParameters.Type.OBJECT)
                    .build()
            )
        assertThat(body.webhookUrl()).isEqualTo("https://api.example.com/webhooks/order-status")
    }
}
