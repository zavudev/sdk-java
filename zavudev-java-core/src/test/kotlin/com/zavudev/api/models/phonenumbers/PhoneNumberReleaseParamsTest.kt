// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.phonenumbers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberReleaseParamsTest {

    @Test
    fun create() {
        PhoneNumberReleaseParams.builder().phoneNumberId("phoneNumberId").build()
    }

    @Test
    fun pathParams() {
        val params = PhoneNumberReleaseParams.builder().phoneNumberId("phoneNumberId").build()

        assertThat(params._pathParam(0)).isEqualTo("phoneNumberId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
