// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions.triggers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TriggerUpdateParamsTest {

    @Test
    fun create() {
        TriggerUpdateParams.builder().triggerId("triggerId").active(true).build()
    }

    @Test
    fun pathParams() {
        val params = TriggerUpdateParams.builder().triggerId("triggerId").active(true).build()

        assertThat(params._pathParam(0)).isEqualTo("triggerId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params = TriggerUpdateParams.builder().triggerId("triggerId").active(true).build()

        val body = params._body()

        assertThat(body.active()).isEqualTo(true)
    }
}
