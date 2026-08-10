// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AvailablePhoneNumberTest {

    @Test
    fun create() {
        val availablePhoneNumber =
            AvailablePhoneNumber.builder()
                .capabilities(
                    PhoneNumberCapabilities.builder().mms(true).sms(true).voice(true).build()
                )
                .phoneNumber("+15551234567")
                .pricing(
                    PhoneNumberPricing.builder()
                        .isFreeEligible(true)
                        .monthlyPrice(0.0)
                        .upfrontPrice(0.0)
                        .build()
                )
                .friendlyName("(555) 123-4567")
                .locality("San Francisco")
                .region("CA")
                .build()

        assertThat(availablePhoneNumber.capabilities())
            .isEqualTo(PhoneNumberCapabilities.builder().mms(true).sms(true).voice(true).build())
        assertThat(availablePhoneNumber.phoneNumber()).isEqualTo("+15551234567")
        assertThat(availablePhoneNumber.pricing())
            .isEqualTo(
                PhoneNumberPricing.builder()
                    .isFreeEligible(true)
                    .monthlyPrice(0.0)
                    .upfrontPrice(0.0)
                    .build()
            )
        assertThat(availablePhoneNumber.friendlyName()).contains("(555) 123-4567")
        assertThat(availablePhoneNumber.locality()).contains("San Francisco")
        assertThat(availablePhoneNumber.region()).contains("CA")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val availablePhoneNumber =
            AvailablePhoneNumber.builder()
                .capabilities(
                    PhoneNumberCapabilities.builder().mms(true).sms(true).voice(true).build()
                )
                .phoneNumber("+15551234567")
                .pricing(
                    PhoneNumberPricing.builder()
                        .isFreeEligible(true)
                        .monthlyPrice(0.0)
                        .upfrontPrice(0.0)
                        .build()
                )
                .friendlyName("(555) 123-4567")
                .locality("San Francisco")
                .region("CA")
                .build()

        val roundtrippedAvailablePhoneNumber =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(availablePhoneNumber),
                jacksonTypeRef<AvailablePhoneNumber>(),
            )

        assertThat(roundtrippedAvailablePhoneNumber).isEqualTo(availablePhoneNumber)
    }
}
