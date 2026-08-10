// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberListPageResponseTest {

    @Test
    fun create() {
        val phoneNumberListPageResponse =
            PhoneNumberListPageResponse.builder()
                .addItem(
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
                .nextCursor("nextCursor")
                .build()

        assertThat(phoneNumberListPageResponse.items())
            .containsExactly(
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
        assertThat(phoneNumberListPageResponse.nextCursor()).contains("nextCursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberListPageResponse =
            PhoneNumberListPageResponse.builder()
                .addItem(
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
                .nextCursor("nextCursor")
                .build()

        val roundtrippedPhoneNumberListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberListPageResponse),
                jacksonTypeRef<PhoneNumberListPageResponse>(),
            )

        assertThat(roundtrippedPhoneNumberListPageResponse).isEqualTo(phoneNumberListPageResponse)
    }
}
