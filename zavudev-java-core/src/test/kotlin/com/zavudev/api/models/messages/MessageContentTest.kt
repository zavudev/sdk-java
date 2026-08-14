// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.messages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageContentTest {

    @Test
    fun create() {
        val messageContent =
            MessageContent.builder()
                .addButton(MessageContent.Button.builder().id("id").title("title").build())
                .addContact(
                    MessageContent.Contact.builder().name("name").addPhone("string").build()
                )
                .ctaDisplayText("See Dates")
                .ctaHeaderMediaUrl("https://example.com")
                .ctaHeaderText("ctaHeaderText")
                .ctaHeaderType(MessageContent.CtaHeaderType.TEXT)
                .ctaUrl("https://example.com/schedule")
                .emoji("emoji")
                .filename("invoice.pdf")
                .footerText("Dates subject to change.")
                .latitude(0.0)
                .listButton("listButton")
                .locationAddress("locationAddress")
                .locationName("locationName")
                .longitude(0.0)
                .mediaId("mediaId")
                .mediaUrl("https://example.com/image.jpg")
                .mimeType("image/jpeg")
                .reactToMessageId("reactToMessageId")
                .referral(
                    MessageContent.Referral.builder()
                        .body("body")
                        .ctwaClid("ARIzZm9vYmFyY3R3YWNsaWQ")
                        .headline("headline")
                        .imageUrl("https://example.com")
                        .mediaType(MessageContent.Referral.MediaType.IMAGE)
                        .sourceId("120210000000000000")
                        .sourceType(MessageContent.Referral.SourceType.AD)
                        .sourceUrl("https://example.com")
                        .thumbnailUrl("https://example.com")
                        .videoUrl("https://example.com")
                        .build()
                )
                .replyToFrom("replyToFrom")
                .replyToMessageId("replyToMessageId")
                .replyToMessageType("replyToMessageType")
                .replyToProviderMessageId("replyToProviderMessageId")
                .replyToText("replyToText")
                .addSection(
                    MessageContent.Section.builder()
                        .addRow(
                            MessageContent.Section.Row.builder()
                                .id("id")
                                .title("title")
                                .description("description")
                                .build()
                        )
                        .title("title")
                        .build()
                )
                .templateButtonVariables(
                    MessageContent.TemplateButtonVariables.builder()
                        .putAdditionalProperty("0", JsonValue.from("abc-report-token"))
                        .build()
                )
                .templateHeaderVariables(
                    MessageContent.TemplateHeaderVariables.builder()
                        .putAdditionalProperty("1", JsonValue.from("Jorge y Laura"))
                        .build()
                )
                .templateId("templateId")
                .templateVariables(
                    MessageContent.TemplateVariables.builder()
                        .putAdditionalProperty("1", JsonValue.from("John"))
                        .putAdditionalProperty("2", JsonValue.from("ORD-12345"))
                        .build()
                )
                .build()

        assertThat(messageContent.buttons().getOrNull())
            .containsExactly(MessageContent.Button.builder().id("id").title("title").build())
        assertThat(messageContent.contacts().getOrNull())
            .containsExactly(
                MessageContent.Contact.builder().name("name").addPhone("string").build()
            )
        assertThat(messageContent.ctaDisplayText()).contains("See Dates")
        assertThat(messageContent.ctaHeaderMediaUrl()).contains("https://example.com")
        assertThat(messageContent.ctaHeaderText()).contains("ctaHeaderText")
        assertThat(messageContent.ctaHeaderType()).contains(MessageContent.CtaHeaderType.TEXT)
        assertThat(messageContent.ctaUrl()).contains("https://example.com/schedule")
        assertThat(messageContent.emoji()).contains("emoji")
        assertThat(messageContent.filename()).contains("invoice.pdf")
        assertThat(messageContent.footerText()).contains("Dates subject to change.")
        assertThat(messageContent.latitude()).contains(0.0)
        assertThat(messageContent.listButton()).contains("listButton")
        assertThat(messageContent.locationAddress()).contains("locationAddress")
        assertThat(messageContent.locationName()).contains("locationName")
        assertThat(messageContent.longitude()).contains(0.0)
        assertThat(messageContent.mediaId()).contains("mediaId")
        assertThat(messageContent.mediaUrl()).contains("https://example.com/image.jpg")
        assertThat(messageContent.mimeType()).contains("image/jpeg")
        assertThat(messageContent.reactToMessageId()).contains("reactToMessageId")
        assertThat(messageContent.referral())
            .contains(
                MessageContent.Referral.builder()
                    .body("body")
                    .ctwaClid("ARIzZm9vYmFyY3R3YWNsaWQ")
                    .headline("headline")
                    .imageUrl("https://example.com")
                    .mediaType(MessageContent.Referral.MediaType.IMAGE)
                    .sourceId("120210000000000000")
                    .sourceType(MessageContent.Referral.SourceType.AD)
                    .sourceUrl("https://example.com")
                    .thumbnailUrl("https://example.com")
                    .videoUrl("https://example.com")
                    .build()
            )
        assertThat(messageContent.replyToFrom()).contains("replyToFrom")
        assertThat(messageContent.replyToMessageId()).contains("replyToMessageId")
        assertThat(messageContent.replyToMessageType()).contains("replyToMessageType")
        assertThat(messageContent.replyToProviderMessageId()).contains("replyToProviderMessageId")
        assertThat(messageContent.replyToText()).contains("replyToText")
        assertThat(messageContent.sections().getOrNull())
            .containsExactly(
                MessageContent.Section.builder()
                    .addRow(
                        MessageContent.Section.Row.builder()
                            .id("id")
                            .title("title")
                            .description("description")
                            .build()
                    )
                    .title("title")
                    .build()
            )
        assertThat(messageContent.templateButtonVariables())
            .contains(
                MessageContent.TemplateButtonVariables.builder()
                    .putAdditionalProperty("0", JsonValue.from("abc-report-token"))
                    .build()
            )
        assertThat(messageContent.templateHeaderVariables())
            .contains(
                MessageContent.TemplateHeaderVariables.builder()
                    .putAdditionalProperty("1", JsonValue.from("Jorge y Laura"))
                    .build()
            )
        assertThat(messageContent.templateId()).contains("templateId")
        assertThat(messageContent.templateVariables())
            .contains(
                MessageContent.TemplateVariables.builder()
                    .putAdditionalProperty("1", JsonValue.from("John"))
                    .putAdditionalProperty("2", JsonValue.from("ORD-12345"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageContent =
            MessageContent.builder()
                .addButton(MessageContent.Button.builder().id("id").title("title").build())
                .addContact(
                    MessageContent.Contact.builder().name("name").addPhone("string").build()
                )
                .ctaDisplayText("See Dates")
                .ctaHeaderMediaUrl("https://example.com")
                .ctaHeaderText("ctaHeaderText")
                .ctaHeaderType(MessageContent.CtaHeaderType.TEXT)
                .ctaUrl("https://example.com/schedule")
                .emoji("emoji")
                .filename("invoice.pdf")
                .footerText("Dates subject to change.")
                .latitude(0.0)
                .listButton("listButton")
                .locationAddress("locationAddress")
                .locationName("locationName")
                .longitude(0.0)
                .mediaId("mediaId")
                .mediaUrl("https://example.com/image.jpg")
                .mimeType("image/jpeg")
                .reactToMessageId("reactToMessageId")
                .referral(
                    MessageContent.Referral.builder()
                        .body("body")
                        .ctwaClid("ARIzZm9vYmFyY3R3YWNsaWQ")
                        .headline("headline")
                        .imageUrl("https://example.com")
                        .mediaType(MessageContent.Referral.MediaType.IMAGE)
                        .sourceId("120210000000000000")
                        .sourceType(MessageContent.Referral.SourceType.AD)
                        .sourceUrl("https://example.com")
                        .thumbnailUrl("https://example.com")
                        .videoUrl("https://example.com")
                        .build()
                )
                .replyToFrom("replyToFrom")
                .replyToMessageId("replyToMessageId")
                .replyToMessageType("replyToMessageType")
                .replyToProviderMessageId("replyToProviderMessageId")
                .replyToText("replyToText")
                .addSection(
                    MessageContent.Section.builder()
                        .addRow(
                            MessageContent.Section.Row.builder()
                                .id("id")
                                .title("title")
                                .description("description")
                                .build()
                        )
                        .title("title")
                        .build()
                )
                .templateButtonVariables(
                    MessageContent.TemplateButtonVariables.builder()
                        .putAdditionalProperty("0", JsonValue.from("abc-report-token"))
                        .build()
                )
                .templateHeaderVariables(
                    MessageContent.TemplateHeaderVariables.builder()
                        .putAdditionalProperty("1", JsonValue.from("Jorge y Laura"))
                        .build()
                )
                .templateId("templateId")
                .templateVariables(
                    MessageContent.TemplateVariables.builder()
                        .putAdditionalProperty("1", JsonValue.from("John"))
                        .putAdditionalProperty("2", JsonValue.from("ORD-12345"))
                        .build()
                )
                .build()

        val roundtrippedMessageContent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageContent),
                jacksonTypeRef<MessageContent>(),
            )

        assertThat(roundtrippedMessageContent).isEqualTo(messageContent)
    }
}
