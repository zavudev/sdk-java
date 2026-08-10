// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SenderUpdateParamsTest {

    @Test
    fun create() {
        SenderUpdateParams.builder()
            .senderId("senderId")
            .emailAddress("noreply@yourdomain.com")
            .emailCatchAllEnabled(true)
            .emailDomainId("emailDomainId")
            .emailFromName("emailFromName")
            .emailReceivingEnabled(true)
            .enableSmsOneway(true)
            .enableVoice(true)
            .name("name")
            .setAsDefault(true)
            .webhookActive(true)
            .addWebhookEvent(WebhookEvent.MESSAGE_QUEUED)
            .webhookSignatureVersion(SenderUpdateParams.WebhookSignatureVersion.V2)
            .webhookUrl("https://example.com")
            .build()
    }

    @Test
    fun pathParams() {
        val params = SenderUpdateParams.builder().senderId("senderId").build()

        assertThat(params._pathParam(0)).isEqualTo("senderId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SenderUpdateParams.builder()
                .senderId("senderId")
                .emailAddress("noreply@yourdomain.com")
                .emailCatchAllEnabled(true)
                .emailDomainId("emailDomainId")
                .emailFromName("emailFromName")
                .emailReceivingEnabled(true)
                .enableSmsOneway(true)
                .enableVoice(true)
                .name("name")
                .setAsDefault(true)
                .webhookActive(true)
                .addWebhookEvent(WebhookEvent.MESSAGE_QUEUED)
                .webhookSignatureVersion(SenderUpdateParams.WebhookSignatureVersion.V2)
                .webhookUrl("https://example.com")
                .build()

        val body = params._body()

        assertThat(body.emailAddress()).contains("noreply@yourdomain.com")
        assertThat(body.emailCatchAllEnabled()).contains(true)
        assertThat(body.emailDomainId()).contains("emailDomainId")
        assertThat(body.emailFromName()).contains("emailFromName")
        assertThat(body.emailReceivingEnabled()).contains(true)
        assertThat(body.enableSmsOneway()).contains(true)
        assertThat(body.enableVoice()).contains(true)
        assertThat(body.name()).contains("name")
        assertThat(body.setAsDefault()).contains(true)
        assertThat(body.webhookActive()).contains(true)
        assertThat(body.webhookEvents().getOrNull()).containsExactly(WebhookEvent.MESSAGE_QUEUED)
        assertThat(body.webhookSignatureVersion())
            .contains(SenderUpdateParams.WebhookSignatureVersion.V2)
        assertThat(body.webhookUrl()).contains("https://example.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SenderUpdateParams.builder().senderId("senderId").build()

        val body = params._body()
    }
}
