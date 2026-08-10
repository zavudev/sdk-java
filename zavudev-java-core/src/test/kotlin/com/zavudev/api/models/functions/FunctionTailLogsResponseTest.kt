// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FunctionTailLogsResponseTest {

    @Test
    fun create() {
        val functionTailLogsResponse =
            FunctionTailLogsResponse.builder()
                .addEvent(
                    FunctionTailLogsResponse.Event.builder()
                        .message("message")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextToken("nextToken")
                .build()

        assertThat(functionTailLogsResponse.events())
            .containsExactly(
                FunctionTailLogsResponse.Event.builder()
                    .message("message")
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(functionTailLogsResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val functionTailLogsResponse =
            FunctionTailLogsResponse.builder()
                .addEvent(
                    FunctionTailLogsResponse.Event.builder()
                        .message("message")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedFunctionTailLogsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(functionTailLogsResponse),
                jacksonTypeRef<FunctionTailLogsResponse>(),
            )

        assertThat(roundtrippedFunctionTailLogsResponse).isEqualTo(functionTailLogsResponse)
    }
}
