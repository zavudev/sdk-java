// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.tools.webhook

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookRotateSecretParamsTest {

    @Test
    fun create() {
        WebhookRotateSecretParams.builder().senderId("senderId").toolId("toolId").build()
    }

    @Test
    fun pathParams() {
        val params =
            WebhookRotateSecretParams.builder().senderId("senderId").toolId("toolId").build()

        assertThat(params._pathParam(0)).isEqualTo("senderId")
        assertThat(params._pathParam(1)).isEqualTo("toolId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
