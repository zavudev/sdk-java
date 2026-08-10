// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.messages

import com.zavudev.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageShowTypingParamsTest {

    @Test
    fun create() {
        MessageShowTypingParams.builder().messageId("messageId").zavuSender("sender_12345").build()
    }

    @Test
    fun pathParams() {
        val params = MessageShowTypingParams.builder().messageId("messageId").build()

        assertThat(params._pathParam(0)).isEqualTo("messageId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            MessageShowTypingParams.builder()
                .messageId("messageId")
                .zavuSender("sender_12345")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("Zavu-Sender", "sender_12345").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = MessageShowTypingParams.builder().messageId("messageId").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }
}
