// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.number10dlc.campaigns

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.affiliateMarketing()).isEqualTo(false)
        assertThat(body.ageGated()).isEqualTo(false)
        assertThat(body.brandId()).isEqualTo("brand_abc123")
        assertThat(body.description())
            .isEqualTo(
                "Send order status updates and shipping notifications to customers who opted in."
            )
        assertThat(body.directLending()).isEqualTo(false)
        assertThat(body.embeddedLink()).isEqualTo(true)
        assertThat(body.embeddedPhone()).isEqualTo(false)
        assertThat(body.name()).isEqualTo("Order Notifications")
        assertThat(body.numberPooling()).isEqualTo(false)
        assertThat(body.sampleMessages())
            .containsExactly(
                "Hi {{name}}, your order #{{order_id}} has shipped! Track it at {{url}}",
                "Your order #{{order_id}} has been delivered. Thank you for your purchase!",
            )
        assertThat(body.subscriberHelp()).isEqualTo(true)
        assertThat(body.subscriberOptIn()).isEqualTo(true)
        assertThat(body.subscriberOptOut()).isEqualTo(true)
        assertThat(body.useCase()).isEqualTo("ACCOUNT_NOTIFICATION")
        assertThat(body.helpMessage()).contains("helpMessage")
        assertThat(body.messageFlow()).contains("messageFlow")
        assertThat(body.optInKeywords().getOrNull()).containsExactly("string")
        assertThat(body.optOutKeywords().getOrNull()).containsExactly("string")
        assertThat(body.subUseCases().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
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
                .build()

        val body = params._body()

        assertThat(body.affiliateMarketing()).isEqualTo(false)
        assertThat(body.ageGated()).isEqualTo(false)
        assertThat(body.brandId()).isEqualTo("brand_abc123")
        assertThat(body.description())
            .isEqualTo(
                "Send order status updates and shipping notifications to customers who opted in."
            )
        assertThat(body.directLending()).isEqualTo(false)
        assertThat(body.embeddedLink()).isEqualTo(true)
        assertThat(body.embeddedPhone()).isEqualTo(false)
        assertThat(body.name()).isEqualTo("Order Notifications")
        assertThat(body.numberPooling()).isEqualTo(false)
        assertThat(body.sampleMessages())
            .containsExactly(
                "Hi {{name}}, your order #{{order_id}} has shipped! Track it at {{url}}",
                "Your order #{{order_id}} has been delivered. Thank you for your purchase!",
            )
        assertThat(body.subscriberHelp()).isEqualTo(true)
        assertThat(body.subscriberOptIn()).isEqualTo(true)
        assertThat(body.subscriberOptOut()).isEqualTo(true)
        assertThat(body.useCase()).isEqualTo("ACCOUNT_NOTIFICATION")
    }
}
