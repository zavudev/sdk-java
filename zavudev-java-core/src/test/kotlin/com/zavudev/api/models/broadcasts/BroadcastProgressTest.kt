// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.broadcasts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BroadcastProgressTest {

    @Test
    fun create() {
        val broadcastProgress =
            BroadcastProgress.builder()
                .broadcastId("broadcastId")
                .delivered(0L)
                .failed(0L)
                .pending(0L)
                .percentComplete(0.0)
                .sending(0L)
                .skipped(0L)
                .status(BroadcastStatus.DRAFT)
                .total(0L)
                .actualCost(0.0)
                .estimatedCompletionAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .estimatedCost(0.0)
                .reservedAmount(0.0)
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(broadcastProgress.broadcastId()).isEqualTo("broadcastId")
        assertThat(broadcastProgress.delivered()).isEqualTo(0L)
        assertThat(broadcastProgress.failed()).isEqualTo(0L)
        assertThat(broadcastProgress.pending()).isEqualTo(0L)
        assertThat(broadcastProgress.percentComplete()).isEqualTo(0.0)
        assertThat(broadcastProgress.sending()).isEqualTo(0L)
        assertThat(broadcastProgress.skipped()).isEqualTo(0L)
        assertThat(broadcastProgress.status()).isEqualTo(BroadcastStatus.DRAFT)
        assertThat(broadcastProgress.total()).isEqualTo(0L)
        assertThat(broadcastProgress.actualCost()).contains(0.0)
        assertThat(broadcastProgress.estimatedCompletionAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(broadcastProgress.estimatedCost()).contains(0.0)
        assertThat(broadcastProgress.reservedAmount()).contains(0.0)
        assertThat(broadcastProgress.startedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val broadcastProgress =
            BroadcastProgress.builder()
                .broadcastId("broadcastId")
                .delivered(0L)
                .failed(0L)
                .pending(0L)
                .percentComplete(0.0)
                .sending(0L)
                .skipped(0L)
                .status(BroadcastStatus.DRAFT)
                .total(0L)
                .actualCost(0.0)
                .estimatedCompletionAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .estimatedCost(0.0)
                .reservedAmount(0.0)
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBroadcastProgress =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(broadcastProgress),
                jacksonTypeRef<BroadcastProgress>(),
            )

        assertThat(roundtrippedBroadcastProgress).isEqualTo(broadcastProgress)
    }
}
