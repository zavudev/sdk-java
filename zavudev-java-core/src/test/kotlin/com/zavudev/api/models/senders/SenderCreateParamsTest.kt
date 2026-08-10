// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SenderCreateParamsTest {

    @Test
    fun create() {
        SenderCreateParams.builder()
            .name("name")
            .emailAddress("noreply@yourdomain.com")
            .emailDomainId("emailDomainId")
            .emailFromName("emailFromName")
            .emailReceivingEnabled(true)
            .enableSmsOneway(true)
            .enableVoice(true)
            .phoneNumber("phoneNumber")
            .setAsDefault(true)
            .addWebhookEvent(WebhookEvent.MESSAGE_QUEUED)
            .webhookSignatureVersion(SenderCreateParams.WebhookSignatureVersion.V2)
            .webhookUrl("https://example.com")
            .build()
    }

    @Test
    fun body() {
        val params =
            SenderCreateParams.builder()
                .name("name")
                .emailAddress("noreply@yourdomain.com")
                .emailDomainId("emailDomainId")
                .emailFromName("emailFromName")
                .emailReceivingEnabled(true)
                .enableSmsOneway(true)
                .enableVoice(true)
                .phoneNumber("phoneNumber")
                .setAsDefault(true)
                .addWebhookEvent(WebhookEvent.MESSAGE_QUEUED)
                .webhookSignatureVersion(SenderCreateParams.WebhookSignatureVersion.V2)
                .webhookUrl("https://example.com")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.emailAddress()).contains("noreply@yourdomain.com")
        assertThat(body.emailDomainId()).contains("emailDomainId")
        assertThat(body.emailFromName()).contains("emailFromName")
        assertThat(body.emailReceivingEnabled()).contains(true)
        assertThat(body.enableSmsOneway()).contains(true)
        assertThat(body.enableVoice()).contains(true)
        assertThat(body.phoneNumber()).contains("phoneNumber")
        assertThat(body.setAsDefault()).contains(true)
        assertThat(body.webhookEvents().getOrNull()).containsExactly(WebhookEvent.MESSAGE_QUEUED)
        assertThat(body.webhookSignatureVersion())
            .contains(SenderCreateParams.WebhookSignatureVersion.V2)
        assertThat(body.webhookUrl()).contains("https://example.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SenderCreateParams.builder().name("name").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
    }
}
