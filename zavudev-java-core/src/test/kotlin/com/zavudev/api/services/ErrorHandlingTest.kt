// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.zavudev.api.client.ZavudevClient
import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.http.Headers
import com.zavudev.api.core.jsonMapper
import com.zavudev.api.errors.BadRequestException
import com.zavudev.api.errors.InternalServerException
import com.zavudev.api.errors.NotFoundException
import com.zavudev.api.errors.PermissionDeniedException
import com.zavudev.api.errors.RateLimitException
import com.zavudev.api.errors.UnauthorizedException
import com.zavudev.api.errors.UnexpectedStatusCodeException
import com.zavudev.api.errors.UnprocessableEntityException
import com.zavudev.api.errors.ZavudevException
import com.zavudev.api.models.messages.Channel
import com.zavudev.api.models.messages.MessageContent
import com.zavudev.api.models.messages.MessageSendParams
import com.zavudev.api.models.messages.MessageType
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: ZavudevClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            ZavudevOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun messagesSend400() {
        val messageService = client.messages()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                messageService.send(
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
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun messagesSend400WithRawResponse() {
        val messageService = client.messages().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                messageService.send(
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
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun messagesSend401() {
        val messageService = client.messages()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                messageService.send(
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
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun messagesSend401WithRawResponse() {
        val messageService = client.messages().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                messageService.send(
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
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun messagesSend403() {
        val messageService = client.messages()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                messageService.send(
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
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun messagesSend403WithRawResponse() {
        val messageService = client.messages().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                messageService.send(
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
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun messagesSend404() {
        val messageService = client.messages()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                messageService.send(
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
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun messagesSend404WithRawResponse() {
        val messageService = client.messages().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                messageService.send(
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
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun messagesSend422() {
        val messageService = client.messages()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                messageService.send(
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
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun messagesSend422WithRawResponse() {
        val messageService = client.messages().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                messageService.send(
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
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun messagesSend429() {
        val messageService = client.messages()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                messageService.send(
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
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun messagesSend429WithRawResponse() {
        val messageService = client.messages().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                messageService.send(
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
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun messagesSend500() {
        val messageService = client.messages()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                messageService.send(
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
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun messagesSend500WithRawResponse() {
        val messageService = client.messages().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                messageService.send(
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
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun messagesSend999() {
        val messageService = client.messages()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                messageService.send(
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
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun messagesSend999WithRawResponse() {
        val messageService = client.messages().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                messageService.send(
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
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun messagesSendInvalidJsonBody() {
        val messageService = client.messages()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<ZavudevException> {
                messageService.send(
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
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
