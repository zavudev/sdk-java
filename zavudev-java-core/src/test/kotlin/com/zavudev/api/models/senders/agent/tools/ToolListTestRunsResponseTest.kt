// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolListTestRunsResponseTest {

    @Test
    fun create() {
        val toolListTestRunsResponse =
            ToolListTestRunsResponse.builder()
                .addItem(
                    ToolListTestRunsResponse.Item.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .durationMs(0L)
                        .success(true)
                        .toolId("toolId")
                        .error("error")
                        .params(
                            ToolListTestRunsResponse.Item.Params.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .response("response")
                        .statusCode(0L)
                        .build()
                )
                .build()

        assertThat(toolListTestRunsResponse.items())
            .containsExactly(
                ToolListTestRunsResponse.Item.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .durationMs(0L)
                    .success(true)
                    .toolId("toolId")
                    .error("error")
                    .params(
                        ToolListTestRunsResponse.Item.Params.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .response("response")
                    .statusCode(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolListTestRunsResponse =
            ToolListTestRunsResponse.builder()
                .addItem(
                    ToolListTestRunsResponse.Item.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .durationMs(0L)
                        .success(true)
                        .toolId("toolId")
                        .error("error")
                        .params(
                            ToolListTestRunsResponse.Item.Params.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .response("response")
                        .statusCode(0L)
                        .build()
                )
                .build()

        val roundtrippedToolListTestRunsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolListTestRunsResponse),
                jacksonTypeRef<ToolListTestRunsResponse>(),
            )

        assertThat(roundtrippedToolListTestRunsResponse).isEqualTo(toolListTestRunsResponse)
    }
}
