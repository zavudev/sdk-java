// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SenderWebhookTest {

    @Test
    fun create() {
        val senderWebhook =
            SenderWebhook.builder()
                .active(true)
                .addEvent(WebhookEvent.MESSAGE_QUEUED)
                .signatureVersion(SenderWebhook.SignatureVersion.V2)
                .url("https://api.example.com/webhooks/zavu")
                .secret("whsec_abc123...")
                .build()

        assertThat(senderWebhook.active()).isEqualTo(true)
        assertThat(senderWebhook.events()).containsExactly(WebhookEvent.MESSAGE_QUEUED)
        assertThat(senderWebhook.signatureVersion()).isEqualTo(SenderWebhook.SignatureVersion.V2)
        assertThat(senderWebhook.url()).isEqualTo("https://api.example.com/webhooks/zavu")
        assertThat(senderWebhook.secret()).contains("whsec_abc123...")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val senderWebhook =
            SenderWebhook.builder()
                .active(true)
                .addEvent(WebhookEvent.MESSAGE_QUEUED)
                .signatureVersion(SenderWebhook.SignatureVersion.V2)
                .url("https://api.example.com/webhooks/zavu")
                .secret("whsec_abc123...")
                .build()

        val roundtrippedSenderWebhook =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(senderWebhook),
                jacksonTypeRef<SenderWebhook>(),
            )

        assertThat(roundtrippedSenderWebhook).isEqualTo(senderWebhook)
    }
}
