// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.models.senders.SenderCreateParams
import com.zavudev.api.models.senders.SenderUpdateParams
import com.zavudev.api.models.senders.SenderUpdateProfileParams
import com.zavudev.api.models.senders.SenderUploadProfilePictureParams
import com.zavudev.api.models.senders.WebhookEvent
import com.zavudev.api.models.senders.WhatsappBusinessProfileVertical
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SenderServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val senderService = client.senders()

        val sender =
            senderService.create(
                SenderCreateParams.builder()
                    .name("name")
                    .emailAddress("noreply@yourdomain.com")
                    .emailDomainId("emailDomainId")
                    .emailFromName("emailFromName")
                    .emailReceivingEnabled(true)
                    .enableSmsOneway(true)
                    .enableVoice(true)
                    .phoneNumber("phoneNumber")
                    .setAsDefault(true)
                    .addWebhookEvent(WebhookEvent.MESSAGE_QUEUED)
                    .webhookSignatureVersion(SenderCreateParams.WebhookSignatureVersion.V2)
                    .webhookUrl("https://example.com")
                    .build()
            )

        sender.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val senderService = client.senders()

        val sender = senderService.retrieve("senderId")

        sender.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val senderService = client.senders()

        val sender =
            senderService.update(
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
            )

        sender.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val senderService = client.senders()

        val page = senderService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val senderService = client.senders()

        senderService.delete("senderId")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getProfile() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val senderService = client.senders()

        val whatsappBusinessProfileResponse = senderService.getProfile("senderId")

        whatsappBusinessProfileResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun regenerateWebhookSecret() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val senderService = client.senders()

        val webhookSecretResponse = senderService.regenerateWebhookSecret("senderId")

        webhookSecretResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateProfile() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val senderService = client.senders()

        val response =
            senderService.updateProfile(
                SenderUpdateProfileParams.builder()
                    .senderId("senderId")
                    .about("Succulent specialists!")
                    .address("address")
                    .description("We specialize in providing high-quality succulents.")
                    .email("contact@example.com")
                    .vertical(WhatsappBusinessProfileVertical.RETAIL)
                    .addWebsite("https://www.example.com")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun uploadProfilePicture() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val senderService = client.senders()

        val response =
            senderService.uploadProfilePicture(
                SenderUploadProfilePictureParams.builder()
                    .senderId("senderId")
                    .imageUrl("https://example.com/profile.jpg")
                    .mimeType(SenderUploadProfilePictureParams.MimeType.IMAGE_JPEG)
                    .build()
            )

        response.validate()
    }
}
