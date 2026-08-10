// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import com.zavudev.api.core.JsonValue
import com.zavudev.api.models.broadcasts.BroadcastChannel
import com.zavudev.api.models.broadcasts.BroadcastContent
import com.zavudev.api.models.broadcasts.BroadcastCreateParams
import com.zavudev.api.models.broadcasts.BroadcastMessageType
import com.zavudev.api.models.broadcasts.BroadcastRescheduleParams
import com.zavudev.api.models.broadcasts.BroadcastSendParams
import com.zavudev.api.models.broadcasts.BroadcastUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BroadcastServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val broadcastServiceAsync = client.broadcasts()

        val broadcastFuture =
            broadcastServiceAsync.create(
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
            )

        val broadcast = broadcastFuture.get()
        broadcast.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val broadcastServiceAsync = client.broadcasts()

        val broadcastFuture = broadcastServiceAsync.retrieve("broadcastId")

        val broadcast = broadcastFuture.get()
        broadcast.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val broadcastServiceAsync = client.broadcasts()

        val broadcastFuture =
            broadcastServiceAsync.update(
                BroadcastUpdateParams.builder()
                    .broadcastId("broadcastId")
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
                    .metadata(
                        BroadcastUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .text("text")
                    .build()
            )

        val broadcast = broadcastFuture.get()
        broadcast.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val broadcastServiceAsync = client.broadcasts()

        val pageFuture = broadcastServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val broadcastServiceAsync = client.broadcasts()

        val future = broadcastServiceAsync.delete("broadcastId")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancel() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val broadcastServiceAsync = client.broadcasts()

        val responseFuture = broadcastServiceAsync.cancel("broadcastId")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun escalateReview() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val broadcastServiceAsync = client.broadcasts()

        val responseFuture = broadcastServiceAsync.escalateReview("broadcastId")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun progress() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val broadcastServiceAsync = client.broadcasts()

        val broadcastProgressFuture = broadcastServiceAsync.progress("broadcastId")

        val broadcastProgress = broadcastProgressFuture.get()
        broadcastProgress.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun reschedule() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val broadcastServiceAsync = client.broadcasts()

        val responseFuture =
            broadcastServiceAsync.reschedule(
                BroadcastRescheduleParams.builder()
                    .broadcastId("broadcastId")
                    .scheduledAt(OffsetDateTime.parse("2024-01-15T14:00:00Z"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retryReview() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val broadcastServiceAsync = client.broadcasts()

        val responseFuture = broadcastServiceAsync.retryReview("broadcastId")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun send() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val broadcastServiceAsync = client.broadcasts()

        val responseFuture =
            broadcastServiceAsync.send(
                BroadcastSendParams.builder()
                    .broadcastId("broadcastId")
                    .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
