// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.tools

import com.zavudev.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolTestParamsTest {

    @Test
    fun create() {
        ToolTestParams.builder()
            .senderId("senderId")
            .toolId("toolId")
            .testParams(
                ToolTestParams.TestParams.builder()
                    .putAdditionalProperty("order_id", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ToolTestParams.builder()
                .senderId("senderId")
                .toolId("toolId")
                .testParams(
                    ToolTestParams.TestParams.builder()
                        .putAdditionalProperty("order_id", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("senderId")
        assertThat(params._pathParam(1)).isEqualTo("toolId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ToolTestParams.builder()
                .senderId("senderId")
                .toolId("toolId")
                .testParams(
                    ToolTestParams.TestParams.builder()
                        .putAdditionalProperty("order_id", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.testParams())
            .isEqualTo(
                ToolTestParams.TestParams.builder()
                    .putAdditionalProperty("order_id", JsonValue.from("bar"))
                    .build()
            )
    }
}
