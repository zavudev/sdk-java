// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookSecretResponseTest {

    @Test
    fun create() {
        val webhookSecretResponse =
            WebhookSecretResponse.builder().secret("whsec_abc123...").build()

        assertThat(webhookSecretResponse.secret()).isEqualTo("whsec_abc123...")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookSecretResponse =
            WebhookSecretResponse.builder().secret("whsec_abc123...").build()

        val roundtrippedWebhookSecretResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookSecretResponse),
                jacksonTypeRef<WebhookSecretResponse>(),
            )

        assertThat(roundtrippedWebhookSecretResponse).isEqualTo(webhookSecretResponse)
    }
}
