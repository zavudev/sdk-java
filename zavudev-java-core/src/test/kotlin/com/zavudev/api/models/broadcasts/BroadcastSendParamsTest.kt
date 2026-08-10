// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.broadcasts

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BroadcastSendParamsTest {

    @Test
    fun create() {
        BroadcastSendParams.builder()
            .broadcastId("broadcastId")
            .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun pathParams() {
        val params = BroadcastSendParams.builder().broadcastId("broadcastId").build()

        assertThat(params._pathParam(0)).isEqualTo("broadcastId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BroadcastSendParams.builder()
                .broadcastId("broadcastId")
                .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertThat(body.scheduledAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BroadcastSendParams.builder().broadcastId("broadcastId").build()

        val body = params._body()
    }
}
