// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.number10dlc.campaigns.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TenDlcPhoneNumberAssignmentTest {

    @Test
    fun create() {
        val tenDlcPhoneNumberAssignment =
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

        assertThat(tenDlcPhoneNumberAssignment.id()).isEqualTo("id")
        assertThat(tenDlcPhoneNumberAssignment.campaignId()).isEqualTo("campaignId")
        assertThat(tenDlcPhoneNumberAssignment.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tenDlcPhoneNumberAssignment.phoneNumberId()).isEqualTo("phoneNumberId")
        assertThat(tenDlcPhoneNumberAssignment.status())
            .isEqualTo(TenDlcPhoneNumberAssignment.Status.PENDING)
        assertThat(tenDlcPhoneNumberAssignment.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tenDlcPhoneNumberAssignment.assignedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tenDlcPhoneNumberAssignment.failureReason()).contains("failureReason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tenDlcPhoneNumberAssignment =
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

        val roundtrippedTenDlcPhoneNumberAssignment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tenDlcPhoneNumberAssignment),
                jacksonTypeRef<TenDlcPhoneNumberAssignment>(),
            )

        assertThat(roundtrippedTenDlcPhoneNumberAssignment).isEqualTo(tenDlcPhoneNumberAssignment)
    }
}
