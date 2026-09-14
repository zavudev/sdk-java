// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.senders.agent.tools

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.models.senders.agent.tools.webhook.WebhookRotateSecretParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WebhookServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun rotateSecret() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val webhookService = client.senders().agent().tools().webhook()

        val webhookSecretResponse =
            webhookService.rotateSecret(
                WebhookRotateSecretParams.builder().senderId("senderId").toolId("toolId").build()
            )

        webhookSecretResponse.validate()
    }
}
