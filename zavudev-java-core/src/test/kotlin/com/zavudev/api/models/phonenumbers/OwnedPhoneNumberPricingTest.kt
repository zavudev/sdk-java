// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OwnedPhoneNumberPricingTest {

    @Test
    fun create() {
        val ownedPhoneNumberPricing =
            OwnedPhoneNumberPricing.builder()
                .isFreeNumber(true)
                .monthlyCost(0.0)
                .monthlyPrice(0.0)
                .upfrontCost(0.0)
                .build()

        assertThat(ownedPhoneNumberPricing.isFreeNumber()).contains(true)
        assertThat(ownedPhoneNumberPricing.monthlyCost()).contains(0.0)
        assertThat(ownedPhoneNumberPricing.monthlyPrice()).contains(0.0)
        assertThat(ownedPhoneNumberPricing.upfrontCost()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ownedPhoneNumberPricing =
            OwnedPhoneNumberPricing.builder()
                .isFreeNumber(true)
                .monthlyCost(0.0)
                .monthlyPrice(0.0)
                .upfrontCost(0.0)
                .build()

        val roundtrippedOwnedPhoneNumberPricing =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ownedPhoneNumberPricing),
                jacksonTypeRef<OwnedPhoneNumberPricing>(),
            )

        assertThat(roundtrippedOwnedPhoneNumberPricing).isEqualTo(ownedPhoneNumberPricing)
    }
}
