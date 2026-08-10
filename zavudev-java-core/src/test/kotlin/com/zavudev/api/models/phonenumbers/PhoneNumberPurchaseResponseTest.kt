// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberPurchaseResponseTest {

    @Test
    fun create() {
        val phoneNumberPurchaseResponse =
            PhoneNumberPurchaseResponse.builder()
                .phoneNumber(
                    OwnedPhoneNumber.builder()
                        .id("id")
                        .addCapability("sms")
                        .addCapability("voice")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .phoneNumber("+15551234567")
                        .pricing(
                            OwnedPhoneNumberPricing.builder()
                                .isFreeNumber(true)
                                .monthlyCost(0.0)
                                .monthlyPrice(0.0)
                                .upfrontCost(0.0)
                                .build()
                        )
                        .status(PhoneNumberStatus.ACTIVE)
                        .name("name")
                        .nextRenewalDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .senderId("senderId")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(phoneNumberPurchaseResponse.phoneNumber())
            .isEqualTo(
                OwnedPhoneNumber.builder()
                    .id("id")
                    .addCapability("sms")
                    .addCapability("voice")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .phoneNumber("+15551234567")
                    .pricing(
                        OwnedPhoneNumberPricing.builder()
                            .isFreeNumber(true)
                            .monthlyCost(0.0)
                            .monthlyPrice(0.0)
                            .upfrontCost(0.0)
                            .build()
                    )
                    .status(PhoneNumberStatus.ACTIVE)
                    .name("name")
                    .nextRenewalDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .senderId("senderId")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberPurchaseResponse =
            PhoneNumberPurchaseResponse.builder()
                .phoneNumber(
                    OwnedPhoneNumber.builder()
                        .id("id")
                        .addCapability("sms")
                        .addCapability("voice")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .phoneNumber("+15551234567")
                        .pricing(
                            OwnedPhoneNumberPricing.builder()
                                .isFreeNumber(true)
                                .monthlyCost(0.0)
                                .monthlyPrice(0.0)
                                .upfrontCost(0.0)
                                .build()
                        )
                        .status(PhoneNumberStatus.ACTIVE)
                        .name("name")
                        .nextRenewalDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .senderId("senderId")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedPhoneNumberPurchaseResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberPurchaseResponse),
                jacksonTypeRef<PhoneNumberPurchaseResponse>(),
            )

        assertThat(roundtrippedPhoneNumberPurchaseResponse).isEqualTo(phoneNumberPurchaseResponse)
    }
}
