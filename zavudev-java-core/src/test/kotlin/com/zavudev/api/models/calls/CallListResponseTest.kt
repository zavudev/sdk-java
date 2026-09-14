// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallListResponseTest {

    @Test
    fun create() {
        val callListResponse =
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

        assertThat(callListResponse.id()).isEqualTo("call_abc123")
        assertThat(callListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(callListResponse.direction()).isEqualTo(CallListResponse.Direction.INBOUND)
        assertThat(callListResponse.from()).isEqualTo("+13125551212")
        assertThat(callListResponse.status()).isEqualTo(CallListResponse.Status.QUEUED)
        assertThat(callListResponse.to()).isEqualTo("+56912345678")
        assertThat(callListResponse.answeredAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(callListResponse.cost()).contains(0.0)
        assertThat(callListResponse.durationSeconds()).contains(0L)
        assertThat(callListResponse.endedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(callListResponse.endReason()).contains("endReason")
        assertThat(callListResponse.metadata())
            .contains(
                CallListResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(callListResponse.transcript().getOrNull())
            .containsExactly(
                CallListResponse.Transcript.builder()
                    .role(CallListResponse.Transcript.Role.USER)
                    .seq(0L)
                    .text("text")
                    .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(callListResponse.turnCount()).contains(0L)
        assertThat(callListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callListResponse =
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

        val roundtrippedCallListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callListResponse),
                jacksonTypeRef<CallListResponse>(),
            )

        assertThat(roundtrippedCallListResponse).isEqualTo(callListResponse)
    }
}
