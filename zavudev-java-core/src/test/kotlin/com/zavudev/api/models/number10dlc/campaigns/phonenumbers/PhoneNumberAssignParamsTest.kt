// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.number10dlc.campaigns.phonenumbers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberAssignParamsTest {

    @Test
    fun create() {
        PhoneNumberAssignParams.builder()
            .campaignId("campaignId")
            .phoneNumberId("pn_abc123")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PhoneNumberAssignParams.builder()
                .campaignId("campaignId")
                .phoneNumberId("pn_abc123")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("campaignId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PhoneNumberAssignParams.builder()
                .campaignId("campaignId")
                .phoneNumberId("pn_abc123")
                .build()

        val body = params._body()

        assertThat(body.phoneNumberId()).isEqualTo("pn_abc123")
    }
}
