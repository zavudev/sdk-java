// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.number10dlc.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignCreateResponseTest {

    @Test
    fun create() {
        val campaignCreateResponse =
            CampaignCreateResponse.builder()
                .campaign(
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
                )
                .build()

        assertThat(campaignCreateResponse.campaign())
            .isEqualTo(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val campaignCreateResponse =
            CampaignCreateResponse.builder()
                .campaign(
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
                )
                .build()

        val roundtrippedCampaignCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(campaignCreateResponse),
                jacksonTypeRef<CampaignCreateResponse>(),
            )

        assertThat(roundtrippedCampaignCreateResponse).isEqualTo(campaignCreateResponse)
    }
}
