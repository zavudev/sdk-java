// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
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

internal class BroadcastServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val broadcastService = client.broadcasts()

        val broadcast =
            broadcastService.create(
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

        broadcast.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val broadcastService = client.broadcasts()

        val broadcast = broadcastService.retrieve("broadcastId")

        broadcast.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val broadcastService = client.broadcasts()

        val broadcast =
            broadcastService.update(
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

        broadcast.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val broadcastService = client.broadcasts()

        val page = broadcastService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val broadcastService = client.broadcasts()

        broadcastService.delete("broadcastId")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancel() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val broadcastService = client.broadcasts()

        val response = broadcastService.cancel("broadcastId")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun escalateReview() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val broadcastService = client.broadcasts()

        val response = broadcastService.escalateReview("broadcastId")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun progress() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val broadcastService = client.broadcasts()

        val broadcastProgress = broadcastService.progress("broadcastId")

        broadcastProgress.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun reschedule() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val broadcastService = client.broadcasts()

        val response =
            broadcastService.reschedule(
                BroadcastRescheduleParams.builder()
                    .broadcastId("broadcastId")
                    .scheduledAt(OffsetDateTime.parse("2024-01-15T14:00:00Z"))
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retryReview() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val broadcastService = client.broadcasts()

        val response = broadcastService.retryReview("broadcastId")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun send() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val broadcastService = client.broadcasts()

        val response =
            broadcastService.send(
                BroadcastSendParams.builder()
                    .broadcastId("broadcastId")
                    .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        response.validate()
    }
}
