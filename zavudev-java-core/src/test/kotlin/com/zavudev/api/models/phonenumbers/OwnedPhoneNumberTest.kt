// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OwnedPhoneNumberTest {

    @Test
    fun create() {
        val ownedPhoneNumber =
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

        assertThat(ownedPhoneNumber.id()).isEqualTo("id")
        assertThat(ownedPhoneNumber.capabilities()).containsExactly("sms", "voice")
        assertThat(ownedPhoneNumber.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ownedPhoneNumber.phoneNumber()).isEqualTo("+15551234567")
        assertThat(ownedPhoneNumber.pricing())
            .isEqualTo(
                OwnedPhoneNumberPricing.builder()
                    .isFreeNumber(true)
                    .monthlyCost(0.0)
                    .monthlyPrice(0.0)
                    .upfrontCost(0.0)
                    .build()
            )
        assertThat(ownedPhoneNumber.status()).isEqualTo(PhoneNumberStatus.ACTIVE)
        assertThat(ownedPhoneNumber.name()).contains("name")
        assertThat(ownedPhoneNumber.nextRenewalDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ownedPhoneNumber.senderId()).contains("senderId")
        assertThat(ownedPhoneNumber.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ownedPhoneNumber =
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

        val roundtrippedOwnedPhoneNumber =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ownedPhoneNumber),
                jacksonTypeRef<OwnedPhoneNumber>(),
            )

        assertThat(roundtrippedOwnedPhoneNumber).isEqualTo(ownedPhoneNumber)
    }
}
