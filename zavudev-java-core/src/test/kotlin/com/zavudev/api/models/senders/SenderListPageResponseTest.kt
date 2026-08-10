// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SenderListPageResponseTest {

    @Test
    fun create() {
        val senderListPageResponse =
            SenderListPageResponse.builder()
                .addItem(
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
                )
                .nextCursor("nextCursor")
                .build()

        assertThat(senderListPageResponse.items())
            .containsExactly(
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
            )
        assertThat(senderListPageResponse.nextCursor()).contains("nextCursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val senderListPageResponse =
            SenderListPageResponse.builder()
                .addItem(
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
                )
                .nextCursor("nextCursor")
                .build()

        val roundtrippedSenderListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(senderListPageResponse),
                jacksonTypeRef<SenderListPageResponse>(),
            )

        assertThat(roundtrippedSenderListPageResponse).isEqualTo(senderListPageResponse)
    }
}
