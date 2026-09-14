// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallHangupResponseTest {

    @Test
    fun create() {
        val callHangupResponse =
            CallHangupResponse.builder()
                .call(
                    CallHangupResponse.Call.builder()
                        .id("call_abc123")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .direction(CallHangupResponse.Call.Direction.INBOUND)
                        .from("+13125551212")
                        .status(CallHangupResponse.Call.Status.QUEUED)
                        .to("+56912345678")
                        .answeredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cost(0.0)
                        .durationSeconds(0L)
                        .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endReason("endReason")
                        .metadata(
                            CallHangupResponse.Call.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addTranscript(
                            CallHangupResponse.Call.Transcript.builder()
                                .role(CallHangupResponse.Call.Transcript.Role.USER)
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

        assertThat(callHangupResponse.call())
            .isEqualTo(
                CallHangupResponse.Call.builder()
                    .id("call_abc123")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .direction(CallHangupResponse.Call.Direction.INBOUND)
                    .from("+13125551212")
                    .status(CallHangupResponse.Call.Status.QUEUED)
                    .to("+56912345678")
                    .answeredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .cost(0.0)
                    .durationSeconds(0L)
                    .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .endReason("endReason")
                    .metadata(
                        CallHangupResponse.Call.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addTranscript(
                        CallHangupResponse.Call.Transcript.builder()
                            .role(CallHangupResponse.Call.Transcript.Role.USER)
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
        val callHangupResponse =
            CallHangupResponse.builder()
                .call(
                    CallHangupResponse.Call.builder()
                        .id("call_abc123")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .direction(CallHangupResponse.Call.Direction.INBOUND)
                        .from("+13125551212")
                        .status(CallHangupResponse.Call.Status.QUEUED)
                        .to("+56912345678")
                        .answeredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cost(0.0)
                        .durationSeconds(0L)
                        .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endReason("endReason")
                        .metadata(
                            CallHangupResponse.Call.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addTranscript(
                            CallHangupResponse.Call.Transcript.builder()
                                .role(CallHangupResponse.Call.Transcript.Role.USER)
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

        val roundtrippedCallHangupResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callHangupResponse),
                jacksonTypeRef<CallHangupResponse>(),
            )

        assertThat(roundtrippedCallHangupResponse).isEqualTo(callHangupResponse)
    }
}
