// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.number10dlc.campaigns.phonenumbers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberUnassignParamsTest {

    @Test
    fun create() {
        PhoneNumberUnassignParams.builder()
            .campaignId("campaignId")
            .assignmentId("assignmentId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PhoneNumberUnassignParams.builder()
                .campaignId("campaignId")
                .assignmentId("assignmentId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("campaignId")
        assertThat(params._pathParam(1)).isEqualTo("assignmentId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
