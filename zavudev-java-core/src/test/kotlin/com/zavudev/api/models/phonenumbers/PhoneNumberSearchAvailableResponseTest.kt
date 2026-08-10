// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberSearchAvailableResponseTest {

    @Test
    fun create() {
        val phoneNumberSearchAvailableResponse =
            PhoneNumberSearchAvailableResponse.builder()
                .addItem(
                    AvailablePhoneNumber.builder()
                        .capabilities(
                            PhoneNumberCapabilities.builder()
                                .mms(true)
                                .sms(true)
                                .voice(true)
                                .build()
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
                )
                .build()

        assertThat(phoneNumberSearchAvailableResponse.items())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberSearchAvailableResponse =
            PhoneNumberSearchAvailableResponse.builder()
                .addItem(
                    AvailablePhoneNumber.builder()
                        .capabilities(
                            PhoneNumberCapabilities.builder()
                                .mms(true)
                                .sms(true)
                                .voice(true)
                                .build()
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
                )
                .build()

        val roundtrippedPhoneNumberSearchAvailableResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberSearchAvailableResponse),
                jacksonTypeRef<PhoneNumberSearchAvailableResponse>(),
            )

        assertThat(roundtrippedPhoneNumberSearchAvailableResponse)
            .isEqualTo(phoneNumberSearchAvailableResponse)
    }
}
