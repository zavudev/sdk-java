// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SenderTest {

    @Test
    fun create() {
        val sender =
            Sender.builder()
                .id("sender_12345")
                .name("Primary sender")
                .phoneNumber("+13125551212")
                .addChannel("sms")
                .addChannel("voice")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .emailAddress("noreply@yourdomain.com")
                .emailCatchAllEnabled(true)
                .emailReceivingEnabled(true)
                .isDefault(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .webhook(
                    SenderWebhook.builder()
                        .active(true)
                        .addEvent(WebhookEvent.MESSAGE_QUEUED)
                        .signatureVersion(SenderWebhook.SignatureVersion.V2)
                        .url("https://api.example.com/webhooks/zavu")
                        .secret("whsec_abc123...")
                        .build()
                )
                .whatsapp(
                    Sender.Whatsapp.builder()
                        .displayPhoneNumber("+14155551234")
                        .paymentStatus(
                            Sender.Whatsapp.PaymentStatus.builder()
                                .canSendTemplates(true)
                                .methodStatus("VALID")
                                .setupStatus("COMPLETE")
                                .build()
                        )
                        .phoneNumberId("phoneNumberId")
                        .build()
                )
                .build()

        assertThat(sender.id()).isEqualTo("sender_12345")
        assertThat(sender.name()).isEqualTo("Primary sender")
        assertThat(sender.phoneNumber()).isEqualTo("+13125551212")
        assertThat(sender.channels().getOrNull()).containsExactly("sms", "voice")
        assertThat(sender.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(sender.emailAddress()).contains("noreply@yourdomain.com")
        assertThat(sender.emailCatchAllEnabled()).contains(true)
        assertThat(sender.emailReceivingEnabled()).contains(true)
        assertThat(sender.isDefault()).contains(true)
        assertThat(sender.updatedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(sender.webhook())
            .contains(
                SenderWebhook.builder()
                    .active(true)
                    .addEvent(WebhookEvent.MESSAGE_QUEUED)
                    .signatureVersion(SenderWebhook.SignatureVersion.V2)
                    .url("https://api.example.com/webhooks/zavu")
                    .secret("whsec_abc123...")
                    .build()
            )
        assertThat(sender.whatsapp())
            .contains(
                Sender.Whatsapp.builder()
                    .displayPhoneNumber("+14155551234")
                    .paymentStatus(
                        Sender.Whatsapp.PaymentStatus.builder()
                            .canSendTemplates(true)
                            .methodStatus("VALID")
                            .setupStatus("COMPLETE")
                            .build()
                    )
                    .phoneNumberId("phoneNumberId")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sender =
            Sender.builder()
                .id("sender_12345")
                .name("Primary sender")
                .phoneNumber("+13125551212")
                .addChannel("sms")
                .addChannel("voice")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .emailAddress("noreply@yourdomain.com")
                .emailCatchAllEnabled(true)
                .emailReceivingEnabled(true)
                .isDefault(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .webhook(
                    SenderWebhook.builder()
                        .active(true)
                        .addEvent(WebhookEvent.MESSAGE_QUEUED)
                        .signatureVersion(SenderWebhook.SignatureVersion.V2)
                        .url("https://api.example.com/webhooks/zavu")
                        .secret("whsec_abc123...")
                        .build()
                )
                .whatsapp(
                    Sender.Whatsapp.builder()
                        .displayPhoneNumber("+14155551234")
                        .paymentStatus(
                            Sender.Whatsapp.PaymentStatus.builder()
                                .canSendTemplates(true)
                                .methodStatus("VALID")
                                .setupStatus("COMPLETE")
                                .build()
                        )
                        .phoneNumberId("phoneNumberId")
                        .build()
                )
                .build()

        val roundtrippedSender =
            jsonMapper.readValue(jsonMapper.writeValueAsString(sender), jacksonTypeRef<Sender>())

        assertThat(roundtrippedSender).isEqualTo(sender)
    }
}
