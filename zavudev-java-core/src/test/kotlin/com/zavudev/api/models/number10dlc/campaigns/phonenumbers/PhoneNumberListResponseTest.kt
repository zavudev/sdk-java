// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.number10dlc.campaigns.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberListResponseTest {

    @Test
    fun create() {
        val phoneNumberListResponse =
            PhoneNumberListResponse.builder()
                .addItem(
                    TenDlcPhoneNumberAssignment.builder()
                        .id("id")
                        .campaignId("campaignId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .phoneNumberId("phoneNumberId")
                        .status(TenDlcPhoneNumberAssignment.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .assignedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .failureReason("failureReason")
                        .build()
                )
                .nextCursor("nextCursor")
                .build()

        assertThat(phoneNumberListResponse.items())
            .containsExactly(
                TenDlcPhoneNumberAssignment.builder()
                    .id("id")
                    .campaignId("campaignId")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .phoneNumberId("phoneNumberId")
                    .status(TenDlcPhoneNumberAssignment.Status.PENDING)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .assignedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .failureReason("failureReason")
                    .build()
            )
        assertThat(phoneNumberListResponse.nextCursor()).contains("nextCursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberListResponse =
            PhoneNumberListResponse.builder()
                .addItem(
                    TenDlcPhoneNumberAssignment.builder()
                        .id("id")
                        .campaignId("campaignId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .phoneNumberId("phoneNumberId")
                        .status(TenDlcPhoneNumberAssignment.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .assignedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .failureReason("failureReason")
                        .build()
                )
                .nextCursor("nextCursor")
                .build()

        val roundtrippedPhoneNumberListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberListResponse),
                jacksonTypeRef<PhoneNumberListResponse>(),
            )

        assertThat(roundtrippedPhoneNumberListResponse).isEqualTo(phoneNumberListResponse)
    }
}
