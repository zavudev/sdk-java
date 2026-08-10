// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberPricingTest {

    @Test
    fun create() {
        val phoneNumberPricing =
            PhoneNumberPricing.builder()
                .isFreeEligible(true)
                .monthlyPrice(0.0)
                .upfrontPrice(0.0)
                .build()

        assertThat(phoneNumberPricing.isFreeEligible()).contains(true)
        assertThat(phoneNumberPricing.monthlyPrice()).contains(0.0)
        assertThat(phoneNumberPricing.upfrontPrice()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberPricing =
            PhoneNumberPricing.builder()
                .isFreeEligible(true)
                .monthlyPrice(0.0)
                .upfrontPrice(0.0)
                .build()

        val roundtrippedPhoneNumberPricing =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberPricing),
                jacksonTypeRef<PhoneNumberPricing>(),
            )

        assertThat(roundtrippedPhoneNumberPricing).isEqualTo(phoneNumberPricing)
    }
}
