// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.number10dlc.campaigns.phonenumbers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberListParamsTest {

    @Test
    fun create() {
        PhoneNumberListParams.builder().campaignId("campaignId").build()
    }

    @Test
    fun pathParams() {
        val params = PhoneNumberListParams.builder().campaignId("campaignId").build()

        assertThat(params._pathParam(0)).isEqualTo("campaignId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
