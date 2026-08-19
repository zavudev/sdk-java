// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.calls

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallHangupParamsTest {

    @Test
    fun create() {
        CallHangupParams.builder().callId("callId").build()
    }

    @Test
    fun pathParams() {
        val params = CallHangupParams.builder().callId("callId").build()

        assertThat(params._pathParam(0)).isEqualTo("callId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
