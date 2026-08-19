// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions.triggers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TriggerDeleteParamsTest {

    @Test
    fun create() {
        TriggerDeleteParams.builder().triggerId("triggerId").build()
    }

    @Test
    fun pathParams() {
        val params = TriggerDeleteParams.builder().triggerId("triggerId").build()

        assertThat(params._pathParam(0)).isEqualTo("triggerId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
