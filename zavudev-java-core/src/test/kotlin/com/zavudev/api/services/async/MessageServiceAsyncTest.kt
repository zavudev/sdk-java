// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import com.zavudev.api.core.JsonValue
import com.zavudev.api.models.messages.Channel
import com.zavudev.api.models.messages.MessageContent
import com.zavudev.api.models.messages.MessageReactParams
import com.zavudev.api.models.messages.MessageSendParams
import com.zavudev.api.models.messages.MessageShowTypingParams
import com.zavudev.api.models.messages.MessageType
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessageServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.messages()

        val messageResponseFuture = messageServiceAsync.retrieve("messageId")

        val messageResponse = messageResponseFuture.get()
        messageResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.messages()

        val pageFuture = messageServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun react() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.messages()

        val messageResponseFuture =
            messageServiceAsync.react(
                MessageReactParams.builder()
                    .messageId("messageId")
                    .zavuSender("sender_12345")
                    .emoji("👍")
                    .build()
            )

        val messageResponse = messageResponseFuture.get()
        messageResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun send() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.messages()

        val messageResponseFuture =
            messageServiceAsync.send(
                MessageSendParams.builder()
                    .zavuSender("sender_12345")
                    .to("+56912345678")
                    .addAttachment(
                        MessageSendParams.Attachment.builder()
                            .filename("invoice.pdf")
                            .content("content")
                            .contentId("logo")
                            .contentType("application/pdf")
                            .path("https://example.com")
                            .build()
                    )
                    .channel(Channel.AUTO)
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
                    )
                    .fallbackEnabled(true)
                    .htmlBody("htmlBody")
                    .idempotencyKey("msg_01HZY4ZP7VQY2J3BRW7Z6G0QGE")
                    .messageType(MessageType.TEXT)
                    .metadata(
                        MessageSendParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .replyTo("support@example.com")
                    .subject("Your order confirmation")
                    .text("Your verification code is 123456")
                    .voiceLanguage("es-ES")
                    .build()
            )

        val messageResponse = messageResponseFuture.get()
        messageResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun showTyping() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.messages()

        val responseFuture =
            messageServiceAsync.showTyping(
                MessageShowTypingParams.builder()
                    .messageId("messageId")
                    .zavuSender("sender_12345")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
