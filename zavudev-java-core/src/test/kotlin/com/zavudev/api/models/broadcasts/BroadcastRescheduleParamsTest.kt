// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.broadcasts

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BroadcastRescheduleParamsTest {

    @Test
    fun create() {
        BroadcastRescheduleParams.builder()
            .broadcastId("broadcastId")
            .scheduledAt(OffsetDateTime.parse("2024-01-15T14:00:00Z"))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BroadcastRescheduleParams.builder()
                .broadcastId("broadcastId")
                .scheduledAt(OffsetDateTime.parse("2024-01-15T14:00:00Z"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("broadcastId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BroadcastRescheduleParams.builder()
                .broadcastId("broadcastId")
                .scheduledAt(OffsetDateTime.parse("2024-01-15T14:00:00Z"))
                .build()

        val body = params._body()

        assertThat(body.scheduledAt()).isEqualTo(OffsetDateTime.parse("2024-01-15T14:00:00Z"))
    }
}
