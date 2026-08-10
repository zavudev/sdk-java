// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.number10dlc.campaigns.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberAssignResponseTest {

    @Test
    fun create() {
        val phoneNumberAssignResponse =
            PhoneNumberAssignResponse.builder()
                .assignment(
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
                .build()

        assertThat(phoneNumberAssignResponse.assignment())
            .isEqualTo(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberAssignResponse =
            PhoneNumberAssignResponse.builder()
                .assignment(
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
                .build()

        val roundtrippedPhoneNumberAssignResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberAssignResponse),
                jacksonTypeRef<PhoneNumberAssignResponse>(),
            )

        assertThat(roundtrippedPhoneNumberAssignResponse).isEqualTo(phoneNumberAssignResponse)
    }
}
