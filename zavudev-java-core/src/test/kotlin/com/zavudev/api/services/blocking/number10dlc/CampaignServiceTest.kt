// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.number10dlc

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.models.number10dlc.campaigns.CampaignCreateParams
import com.zavudev.api.models.number10dlc.campaigns.CampaignUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CampaignServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.number10dlc().campaigns()

        val campaign =
            campaignService.create(
                CampaignCreateParams.builder()
                    .affiliateMarketing(false)
                    .ageGated(false)
                    .brandId("brand_abc123")
                    .description(
                        "Send order status updates and shipping notifications to customers who opted in."
                    )
                    .directLending(false)
                    .embeddedLink(true)
                    .embeddedPhone(false)
                    .name("Order Notifications")
                    .numberPooling(false)
                    .addSampleMessage(
                        "Hi {{name}}, your order #{{order_id}} has shipped! Track it at {{url}}"
                    )
                    .addSampleMessage(
                        "Your order #{{order_id}} has been delivered. Thank you for your purchase!"
                    )
                    .subscriberHelp(true)
                    .subscriberOptIn(true)
                    .subscriberOptOut(true)
                    .useCase("ACCOUNT_NOTIFICATION")
                    .helpMessage("helpMessage")
                    .messageFlow("messageFlow")
                    .addOptInKeyword("string")
                    .addOptOutKeyword("string")
                    .addSubUseCase("string")
                    .build()
            )

        campaign.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.number10dlc().campaigns()

        val campaign = campaignService.retrieve("campaignId")

        campaign.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.number10dlc().campaigns()

        val campaign =
            campaignService.update(
                CampaignUpdateParams.builder()
                    .campaignId("campaignId")
                    .description("description")
                    .helpMessage("helpMessage")
                    .messageFlow("messageFlow")
                    .name("name")
                    .addOptInKeyword("string")
                    .addOptOutKeyword("string")
                    .addSampleMessage("string")
                    .build()
            )

        campaign.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.number10dlc().campaigns()

        val page = campaignService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.number10dlc().campaigns()

        campaignService.delete("campaignId")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun submit() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.number10dlc().campaigns()

        val response = campaignService.submit("campaignId")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun syncStatus() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.number10dlc().campaigns()

        val response = campaignService.syncStatus("campaignId")

        response.validate()
    }
}
