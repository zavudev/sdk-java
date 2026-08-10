// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.broadcasts

import com.zavudev.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BroadcastCreateParamsTest {

    @Test
    fun create() {
        BroadcastCreateParams.builder()
            .channel(BroadcastChannel.SMS)
            .name("Black Friday Sale")
            .content(
                BroadcastContent.builder()
                    .filename("filename")
                    .mediaId("mediaId")
                    .mediaUrl("mediaUrl")
                    .mimeType("mimeType")
                    .templateButtonVariables(
                        BroadcastContent.TemplateButtonVariables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .templateHeaderVariables(
                        BroadcastContent.TemplateHeaderVariables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .templateId("templateId")
                    .templateVariables(
                        BroadcastContent.TemplateVariables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
            .emailHtmlBody("emailHtmlBody")
            .emailSubject("emailSubject")
            .idempotencyKey("idempotencyKey")
            .messageType(BroadcastMessageType.TEXT)
            .metadata(
                BroadcastCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .senderId("senderId")
            .text("Hi {{name}}, check out our Black Friday deals! Use code FRIDAY20 for 20% off.")
            .build()
    }

    @Test
    fun body() {
        val params =
            BroadcastCreateParams.builder()
                .channel(BroadcastChannel.SMS)
                .name("Black Friday Sale")
                .content(
                    BroadcastContent.builder()
                        .filename("filename")
                        .mediaId("mediaId")
                        .mediaUrl("mediaUrl")
                        .mimeType("mimeType")
                        .templateButtonVariables(
                            BroadcastContent.TemplateButtonVariables.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .templateHeaderVariables(
                            BroadcastContent.TemplateHeaderVariables.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .templateId("templateId")
                        .templateVariables(
                            BroadcastContent.TemplateVariables.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .emailHtmlBody("emailHtmlBody")
                .emailSubject("emailSubject")
                .idempotencyKey("idempotencyKey")
                .messageType(BroadcastMessageType.TEXT)
                .metadata(
                    BroadcastCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .senderId("senderId")
                .text(
                    "Hi {{name}}, check out our Black Friday deals! Use code FRIDAY20 for 20% off."
                )
                .build()

        val body = params._body()

        assertThat(body.channel()).isEqualTo(BroadcastChannel.SMS)
        assertThat(body.name()).isEqualTo("Black Friday Sale")
        assertThat(body.content())
            .contains(
                BroadcastContent.builder()
                    .filename("filename")
                    .mediaId("mediaId")
                    .mediaUrl("mediaUrl")
                    .mimeType("mimeType")
                    .templateButtonVariables(
                        BroadcastContent.TemplateButtonVariables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .templateHeaderVariables(
                        BroadcastContent.TemplateHeaderVariables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .templateId("templateId")
                    .templateVariables(
                        BroadcastContent.TemplateVariables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.emailHtmlBody()).contains("emailHtmlBody")
        assertThat(body.emailSubject()).contains("emailSubject")
        assertThat(body.idempotencyKey()).contains("idempotencyKey")
        assertThat(body.messageType()).contains(BroadcastMessageType.TEXT)
        assertThat(body.metadata())
            .contains(
                BroadcastCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.scheduledAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.senderId()).contains("senderId")
        assertThat(body.text())
            .contains(
                "Hi {{name}}, check out our Black Friday deals! Use code FRIDAY20 for 20% off."
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BroadcastCreateParams.builder()
                .channel(BroadcastChannel.SMS)
                .name("Black Friday Sale")
                .build()

        val body = params._body()

        assertThat(body.channel()).isEqualTo(BroadcastChannel.SMS)
        assertThat(body.name()).isEqualTo("Black Friday Sale")
    }
}
