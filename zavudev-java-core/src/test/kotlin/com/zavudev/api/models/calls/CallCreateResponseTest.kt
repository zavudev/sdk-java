// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallCreateResponseTest {

    @Test
    fun create() {
        val callCreateResponse =
            CallCreateResponse.builder()
                .call(
                    CallCreateResponse.Call.builder()
                        .id("call_abc123")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .direction(CallCreateResponse.Call.Direction.INBOUND)
                        .from("+13125551212")
                        .status(CallCreateResponse.Call.Status.QUEUED)
                        .to("+56912345678")
                        .answeredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cost(0.0)
                        .durationSeconds(0L)
                        .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endReason("endReason")
                        .metadata(
                            CallCreateResponse.Call.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addTranscript(
                            CallCreateResponse.Call.Transcript.builder()
                                .role(CallCreateResponse.Call.Transcript.Role.USER)
                                .seq(0L)
                                .text("text")
                                .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .turnCount(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(callCreateResponse.call())
            .isEqualTo(
                CallCreateResponse.Call.builder()
                    .id("call_abc123")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .direction(CallCreateResponse.Call.Direction.INBOUND)
                    .from("+13125551212")
                    .status(CallCreateResponse.Call.Status.QUEUED)
                    .to("+56912345678")
                    .answeredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .cost(0.0)
                    .durationSeconds(0L)
                    .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .endReason("endReason")
                    .metadata(
                        CallCreateResponse.Call.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addTranscript(
                        CallCreateResponse.Call.Transcript.builder()
                            .role(CallCreateResponse.Call.Transcript.Role.USER)
                            .seq(0L)
                            .text("text")
                            .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .turnCount(0L)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callCreateResponse =
            CallCreateResponse.builder()
                .call(
                    CallCreateResponse.Call.builder()
                        .id("call_abc123")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .direction(CallCreateResponse.Call.Direction.INBOUND)
                        .from("+13125551212")
                        .status(CallCreateResponse.Call.Status.QUEUED)
                        .to("+56912345678")
                        .answeredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cost(0.0)
                        .durationSeconds(0L)
                        .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endReason("endReason")
                        .metadata(
                            CallCreateResponse.Call.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addTranscript(
                            CallCreateResponse.Call.Transcript.builder()
                                .role(CallCreateResponse.Call.Transcript.Role.USER)
                                .seq(0L)
                                .text("text")
                                .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .turnCount(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedCallCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callCreateResponse),
                jacksonTypeRef<CallCreateResponse>(),
            )

        assertThat(roundtrippedCallCreateResponse).isEqualTo(callCreateResponse)
    }
}
