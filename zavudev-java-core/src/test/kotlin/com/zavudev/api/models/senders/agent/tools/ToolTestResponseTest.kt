// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolTestResponseTest {

    @Test
    fun create() {
        val toolTestResponse =
            ToolTestResponse.builder()
                .run(
                    ToolTestResponse.Run.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .durationMs(0L)
                        .success(true)
                        .toolId("toolId")
                        .error("error")
                        .params(
                            ToolTestResponse.Run.Params.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .response("response")
                        .statusCode(0L)
                        .build()
                )
                .build()

        assertThat(toolTestResponse.run())
            .isEqualTo(
                ToolTestResponse.Run.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .durationMs(0L)
                    .success(true)
                    .toolId("toolId")
                    .error("error")
                    .params(
                        ToolTestResponse.Run.Params.builder()
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
        val toolTestResponse =
            ToolTestResponse.builder()
                .run(
                    ToolTestResponse.Run.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .durationMs(0L)
                        .success(true)
                        .toolId("toolId")
                        .error("error")
                        .params(
                            ToolTestResponse.Run.Params.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .response("response")
                        .statusCode(0L)
                        .build()
                )
                .build()

        val roundtrippedToolTestResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolTestResponse),
                jacksonTypeRef<ToolTestResponse>(),
            )

        assertThat(roundtrippedToolTestResponse).isEqualTo(toolTestResponse)
    }
}
