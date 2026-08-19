// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import com.zavudev.api.models.messages.Channel
import com.zavudev.api.models.messages.Message
import com.zavudev.api.models.messages.MessageContent
import com.zavudev.api.models.messages.MessageStatus
import com.zavudev.api.models.messages.MessageType
import java.time.OffsetDateTime
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/zavudev-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.messages()).isNotNull()
        assertThat(client.templates()).isNotNull()
        assertThat(client.senders()).isNotNull()
        assertThat(client.contacts()).isNotNull()
        assertThat(client.broadcasts()).isNotNull()
        assertThat(client.introspect()).isNotNull()
        assertThat(client.phoneNumbers()).isNotNull()
        assertThat(client.addresses()).isNotNull()
        assertThat(client.regulatoryDocuments()).isNotNull()
        assertThat(client.invitations()).isNotNull()
        assertThat(client.urls()).isNotNull()
        assertThat(client.balance()).isNotNull()
        assertThat(client.subAccounts()).isNotNull()
        assertThat(client.number10dlc()).isNotNull()
        assertThat(client.me()).isNotNull()
        assertThat(client.functions()).isNotNull()
        assertThat(client.conversations()).isNotNull()
        assertThat(client.calls()).isNotNull()
        assertThat(client.agentTemplates()).isNotNull()
        assertThat(client.emailDomains()).isNotNull()
        assertThat(client.agents()).isNotNull()
    }

    @Test
    fun messageRoundtrip() {
        val jsonMapper = jsonMapper()
        val message =
            Message.builder()
                .id("jd7x2k3m4n5p6q7r8s9t0")
                .channel(Channel.AUTO)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .messageType(MessageType.TEXT)
                .status(MessageStatus.QUEUED)
                .to("+56912345678")
                .content(
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

        val roundtrippedMessage =
            jsonMapper.readValue(jsonMapper.writeValueAsString(message), jacksonTypeRef<Message>())

        assertThat(roundtrippedMessage).isEqualTo(message)
    }

    @Test
    fun channelRoundtrip() {
        val jsonMapper = jsonMapper()
        val channel = Channel.AUTO

        val roundtrippedChannel =
            jsonMapper.readValue(jsonMapper.writeValueAsString(channel), jacksonTypeRef<Channel>())

        assertThat(roundtrippedChannel).isEqualTo(channel)
    }
}
