// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.introspect

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntrospectValidatePhoneParamsTest {

    @Test
    fun create() {
        IntrospectValidatePhoneParams.builder().phoneNumber("+56912345678").build()
    }

    @Test
    fun body() {
        val params = IntrospectValidatePhoneParams.builder().phoneNumber("+56912345678").build()

        val body = params._body()

        assertThat(body.phoneNumber()).isEqualTo("+56912345678")
    }
}
