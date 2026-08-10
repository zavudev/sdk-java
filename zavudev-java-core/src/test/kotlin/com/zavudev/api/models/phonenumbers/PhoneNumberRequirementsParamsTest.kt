// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.phonenumbers

import com.zavudev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberRequirementsParamsTest {

    @Test
    fun create() {
        PhoneNumberRequirementsParams.builder()
            .countryCode("xx")
            .type(PhoneNumberType.LOCAL)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PhoneNumberRequirementsParams.builder()
                .countryCode("xx")
                .type(PhoneNumberType.LOCAL)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("countryCode", "xx").put("type", "local").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PhoneNumberRequirementsParams.builder().countryCode("xx").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("countryCode", "xx").build())
    }
}
