// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.calls

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallRetrieveParamsTest {

    @Test
    fun create() {
        CallRetrieveParams.builder().callId("callId").build()
    }

    @Test
    fun pathParams() {
        val params = CallRetrieveParams.builder().callId("callId").build()

        assertThat(params._pathParam(0)).isEqualTo("callId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
