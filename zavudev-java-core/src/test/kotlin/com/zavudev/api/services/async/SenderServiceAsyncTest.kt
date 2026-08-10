// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import com.zavudev.api.models.senders.SenderCreateParams
import com.zavudev.api.models.senders.SenderUpdateParams
import com.zavudev.api.models.senders.SenderUpdateProfileParams
import com.zavudev.api.models.senders.SenderUploadProfilePictureParams
import com.zavudev.api.models.senders.WebhookEvent
import com.zavudev.api.models.senders.WhatsappBusinessProfileVertical
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SenderServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val senderServiceAsync = client.senders()

        val senderFuture =
            senderServiceAsync.create(
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

        val sender = senderFuture.get()
        sender.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val senderServiceAsync = client.senders()

        val senderFuture = senderServiceAsync.retrieve("senderId")

        val sender = senderFuture.get()
        sender.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val senderServiceAsync = client.senders()

        val senderFuture =
            senderServiceAsync.update(
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

        val sender = senderFuture.get()
        sender.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val senderServiceAsync = client.senders()

        val pageFuture = senderServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val senderServiceAsync = client.senders()

        val future = senderServiceAsync.delete("senderId")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getProfile() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val senderServiceAsync = client.senders()

        val whatsappBusinessProfileResponseFuture = senderServiceAsync.getProfile("senderId")

        val whatsappBusinessProfileResponse = whatsappBusinessProfileResponseFuture.get()
        whatsappBusinessProfileResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun regenerateWebhookSecret() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val senderServiceAsync = client.senders()

        val webhookSecretResponseFuture = senderServiceAsync.regenerateWebhookSecret("senderId")

        val webhookSecretResponse = webhookSecretResponseFuture.get()
        webhookSecretResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateProfile() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val senderServiceAsync = client.senders()

        val responseFuture =
            senderServiceAsync.updateProfile(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun uploadProfilePicture() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val senderServiceAsync = client.senders()

        val responseFuture =
            senderServiceAsync.uploadProfilePicture(
                SenderUploadProfilePictureParams.builder()
                    .senderId("senderId")
                    .imageUrl("https://example.com/profile.jpg")
                    .mimeType(SenderUploadProfilePictureParams.MimeType.IMAGE_JPEG)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
