// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.phonenumbers

import com.zavudev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberSearchAvailableParamsTest {

    @Test
    fun create() {
        PhoneNumberSearchAvailableParams.builder()
            .countryCode("xx")
            .capabilities("voice,sms")
            .contains("contains")
            .limit(50L)
            .type(PhoneNumberType.LOCAL)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PhoneNumberSearchAvailableParams.builder()
                .countryCode("xx")
                .capabilities("voice,sms")
                .contains("contains")
                .limit(50L)
                .type(PhoneNumberType.LOCAL)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("countryCode", "xx")
                    .put("capabilities", "voice,sms")
                    .put("contains", "contains")
                    .put("limit", "50")
                    .put("type", "local")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PhoneNumberSearchAvailableParams.builder().countryCode("xx").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("countryCode", "xx").build())
    }
}
