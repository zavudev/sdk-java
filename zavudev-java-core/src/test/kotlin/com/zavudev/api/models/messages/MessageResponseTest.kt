// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.messages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageResponseTest {

    @Test
    fun create() {
        val messageResponse =
            MessageResponse.builder()
                .message(
                    Message.builder()
                        .id("jd7x2k3m4n5p6q7r8s9t0")
                        .channel(Channel.AUTO)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .messageType(MessageType.TEXT)
                        .status(MessageStatus.QUEUED)
                        .to("+56912345678")
                        .content(
                            MessageContent.builder()
                                .addButton(
                                    MessageContent.Button.builder().id("id").title("title").build()
                                )
                                .addContact(
                                    MessageContent.Contact.builder()
                                        .name("name")
                                        .addPhone("string")
                                        .build()
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
                                        .putAdditionalProperty(
                                            "0",
                                            JsonValue.from("abc-report-token"),
                                        )
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
                        )
                        .conversationId("js723987cyghwqxxaxcf590qd18axd95")
                        .cost(0.0)
                        .costProvider(0.0)
                        .costTotal(0.0)
                        .errorCode("errorCode")
                        .errorMessage("errorMessage")
                        .from("+13125551212")
                        .metadata(
                            Message.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .providerMessageId("providerMessageId")
                        .senderId("sender_12345")
                        .text("text")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(messageResponse.message())
            .isEqualTo(
                Message.builder()
                    .id("jd7x2k3m4n5p6q7r8s9t0")
                    .channel(Channel.AUTO)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .messageType(MessageType.TEXT)
                    .status(MessageStatus.QUEUED)
                    .to("+56912345678")
                    .content(
                        MessageContent.builder()
                            .addButton(
                                MessageContent.Button.builder().id("id").title("title").build()
                            )
                            .addContact(
                                MessageContent.Contact.builder()
                                    .name("name")
                                    .addPhone("string")
                                    .build()
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
                    )
                    .conversationId("js723987cyghwqxxaxcf590qd18axd95")
                    .cost(0.0)
                    .costProvider(0.0)
                    .costTotal(0.0)
                    .errorCode("errorCode")
                    .errorMessage("errorMessage")
                    .from("+13125551212")
                    .metadata(
                        Message.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .providerMessageId("providerMessageId")
                    .senderId("sender_12345")
                    .text("text")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageResponse =
            MessageResponse.builder()
                .message(
                    Message.builder()
                        .id("jd7x2k3m4n5p6q7r8s9t0")
                        .channel(Channel.AUTO)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .messageType(MessageType.TEXT)
                        .status(MessageStatus.QUEUED)
                        .to("+56912345678")
                        .content(
                            MessageContent.builder()
                                .addButton(
                                    MessageContent.Button.builder().id("id").title("title").build()
                                )
                                .addContact(
                                    MessageContent.Contact.builder()
                                        .name("name")
                                        .addPhone("string")
                                        .build()
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
                                        .putAdditionalProperty(
                                            "0",
                                            JsonValue.from("abc-report-token"),
                                        )
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
                        )
                        .conversationId("js723987cyghwqxxaxcf590qd18axd95")
                        .cost(0.0)
                        .costProvider(0.0)
                        .costTotal(0.0)
                        .errorCode("errorCode")
                        .errorMessage("errorMessage")
                        .from("+13125551212")
                        .metadata(
                            Message.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .providerMessageId("providerMessageId")
                        .senderId("sender_12345")
                        .text("text")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedMessageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageResponse),
                jacksonTypeRef<MessageResponse>(),
            )

        assertThat(roundtrippedMessageResponse).isEqualTo(messageResponse)
    }
}
