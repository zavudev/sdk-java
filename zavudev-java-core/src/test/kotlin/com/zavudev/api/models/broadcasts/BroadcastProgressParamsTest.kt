// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.broadcasts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BroadcastProgressParamsTest {

    @Test
    fun create() {
        BroadcastProgressParams.builder().broadcastId("broadcastId").build()
    }

    @Test
    fun pathParams() {
        val params = BroadcastProgressParams.builder().broadcastId("broadcastId").build()

        assertThat(params._pathParam(0)).isEqualTo("broadcastId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
