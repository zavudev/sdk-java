// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions.secrets

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecretSetParamsTest {

    @Test
    fun create() {
        SecretSetParams.builder().functionId("functionId").key("key").value("value").build()
    }

    @Test
    fun pathParams() {
        val params =
            SecretSetParams.builder().functionId("functionId").key("key").value("value").build()

        assertThat(params._pathParam(0)).isEqualTo("functionId")
        assertThat(params._pathParam(1)).isEqualTo("key")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SecretSetParams.builder().functionId("functionId").key("key").value("value").build()

        val body = params._body()

        assertThat(body.value()).isEqualTo("value")
    }
}
