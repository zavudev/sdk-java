// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.phonenumbers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberPurchaseParamsTest {

    @Test
    fun create() {
        PhoneNumberPurchaseParams.builder().phoneNumber("+15551234567").name("Primary Line").build()
    }

    @Test
    fun body() {
        val params =
            PhoneNumberPurchaseParams.builder()
                .phoneNumber("+15551234567")
                .name("Primary Line")
                .build()

        val body = params._body()

        assertThat(body.phoneNumber()).isEqualTo("+15551234567")
        assertThat(body.name()).contains("Primary Line")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PhoneNumberPurchaseParams.builder().phoneNumber("+15551234567").build()

        val body = params._body()

        assertThat(body.phoneNumber()).isEqualTo("+15551234567")
    }
}
