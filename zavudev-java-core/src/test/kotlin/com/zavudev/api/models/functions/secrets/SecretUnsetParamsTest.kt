// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions.secrets

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecretUnsetParamsTest {

    @Test
    fun create() {
        SecretUnsetParams.builder().functionId("functionId").key("key").build()
    }

    @Test
    fun pathParams() {
        val params = SecretUnsetParams.builder().functionId("functionId").key("key").build()

        assertThat(params._pathParam(0)).isEqualTo("functionId")
        assertThat(params._pathParam(1)).isEqualTo("key")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
