// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallListPageResponseTest {

    @Test
    fun create() {
        val callListPageResponse =
            CallListPageResponse.builder()
                .addItem(
                    CallListResponse.builder()
                        .id("call_abc123")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .direction(CallListResponse.Direction.INBOUND)
                        .from("+13125551212")
                        .status(CallListResponse.Status.QUEUED)
                        .to("+56912345678")
                        .answeredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cost(0.0)
                        .durationSeconds(0L)
                        .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endReason("endReason")
                        .metadata(
                            CallListResponse.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addTranscript(
                            CallListResponse.Transcript.builder()
                                .role(CallListResponse.Transcript.Role.USER)
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
                .nextCursor("nextCursor")
                .build()

        assertThat(callListPageResponse.items())
            .containsExactly(
                CallListResponse.builder()
                    .id("call_abc123")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .direction(CallListResponse.Direction.INBOUND)
                    .from("+13125551212")
                    .status(CallListResponse.Status.QUEUED)
                    .to("+56912345678")
                    .answeredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .cost(0.0)
                    .durationSeconds(0L)
                    .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .endReason("endReason")
                    .metadata(
                        CallListResponse.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addTranscript(
                        CallListResponse.Transcript.builder()
                            .role(CallListResponse.Transcript.Role.USER)
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
        assertThat(callListPageResponse.nextCursor()).contains("nextCursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callListPageResponse =
            CallListPageResponse.builder()
                .addItem(
                    CallListResponse.builder()
                        .id("call_abc123")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .direction(CallListResponse.Direction.INBOUND)
                        .from("+13125551212")
                        .status(CallListResponse.Status.QUEUED)
                        .to("+56912345678")
                        .answeredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cost(0.0)
                        .durationSeconds(0L)
                        .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endReason("endReason")
                        .metadata(
                            CallListResponse.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addTranscript(
                            CallListResponse.Transcript.builder()
                                .role(CallListResponse.Transcript.Role.USER)
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
                .nextCursor("nextCursor")
                .build()

        val roundtrippedCallListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callListPageResponse),
                jacksonTypeRef<CallListPageResponse>(),
            )

        assertThat(roundtrippedCallListPageResponse).isEqualTo(callListPageResponse)
    }
}
