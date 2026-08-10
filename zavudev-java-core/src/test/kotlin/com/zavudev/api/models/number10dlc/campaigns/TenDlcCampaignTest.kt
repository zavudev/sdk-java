// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.number10dlc.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TenDlcCampaignTest {

    @Test
    fun create() {
        val tenDlcCampaign =
            TenDlcCampaign.builder()
                .id("id")
                .affiliateMarketing(true)
                .ageGated(true)
                .brandId("brandId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .directLending(true)
                .embeddedLink(true)
                .embeddedPhone(true)
                .name("Order Notifications")
                .numberPooling(true)
                .addSampleMessage("string")
                .status(TenDlcCampaign.Status.DRAFT)
                .subscriberHelp(true)
                .subscriberOptIn(true)
                .subscriberOptOut(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .useCase("ACCOUNT_NOTIFICATION")
                .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dailyLimit(0L)
                .failureReason("failureReason")
                .helpMessage("helpMessage")
                .messageFlow("messageFlow")
                .monthlyFeeCents(0L)
                .addOptInKeyword("string")
                .addOptOutKeyword("string")
                .registrationCostCents(0L)
                .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addSubUseCase("string")
                .build()

        assertThat(tenDlcCampaign.id()).isEqualTo("id")
        assertThat(tenDlcCampaign.affiliateMarketing()).isEqualTo(true)
        assertThat(tenDlcCampaign.ageGated()).isEqualTo(true)
        assertThat(tenDlcCampaign.brandId()).isEqualTo("brandId")
        assertThat(tenDlcCampaign.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tenDlcCampaign.description()).isEqualTo("description")
        assertThat(tenDlcCampaign.directLending()).isEqualTo(true)
        assertThat(tenDlcCampaign.embeddedLink()).isEqualTo(true)
        assertThat(tenDlcCampaign.embeddedPhone()).isEqualTo(true)
        assertThat(tenDlcCampaign.name()).isEqualTo("Order Notifications")
        assertThat(tenDlcCampaign.numberPooling()).isEqualTo(true)
        assertThat(tenDlcCampaign.sampleMessages()).containsExactly("string")
        assertThat(tenDlcCampaign.status()).isEqualTo(TenDlcCampaign.Status.DRAFT)
        assertThat(tenDlcCampaign.subscriberHelp()).isEqualTo(true)
        assertThat(tenDlcCampaign.subscriberOptIn()).isEqualTo(true)
        assertThat(tenDlcCampaign.subscriberOptOut()).isEqualTo(true)
        assertThat(tenDlcCampaign.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tenDlcCampaign.useCase()).isEqualTo("ACCOUNT_NOTIFICATION")
        assertThat(tenDlcCampaign.approvedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tenDlcCampaign.dailyLimit()).contains(0L)
        assertThat(tenDlcCampaign.failureReason()).contains("failureReason")
        assertThat(tenDlcCampaign.helpMessage()).contains("helpMessage")
        assertThat(tenDlcCampaign.messageFlow()).contains("messageFlow")
        assertThat(tenDlcCampaign.monthlyFeeCents()).contains(0L)
        assertThat(tenDlcCampaign.optInKeywords().getOrNull()).containsExactly("string")
        assertThat(tenDlcCampaign.optOutKeywords().getOrNull()).containsExactly("string")
        assertThat(tenDlcCampaign.registrationCostCents()).contains(0L)
        assertThat(tenDlcCampaign.submittedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tenDlcCampaign.subUseCases().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tenDlcCampaign =
            TenDlcCampaign.builder()
                .id("id")
                .affiliateMarketing(true)
                .ageGated(true)
                .brandId("brandId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .directLending(true)
                .embeddedLink(true)
                .embeddedPhone(true)
                .name("Order Notifications")
                .numberPooling(true)
                .addSampleMessage("string")
                .status(TenDlcCampaign.Status.DRAFT)
                .subscriberHelp(true)
                .subscriberOptIn(true)
                .subscriberOptOut(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .useCase("ACCOUNT_NOTIFICATION")
                .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dailyLimit(0L)
                .failureReason("failureReason")
                .helpMessage("helpMessage")
                .messageFlow("messageFlow")
                .monthlyFeeCents(0L)
                .addOptInKeyword("string")
                .addOptOutKeyword("string")
                .registrationCostCents(0L)
                .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addSubUseCase("string")
                .build()

        val roundtrippedTenDlcCampaign =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tenDlcCampaign),
                jacksonTypeRef<TenDlcCampaign>(),
            )

        assertThat(roundtrippedTenDlcCampaign).isEqualTo(tenDlcCampaign)
    }
}
