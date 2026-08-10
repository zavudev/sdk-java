// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.messages

import com.zavudev.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageReactParamsTest {

    @Test
    fun create() {
        MessageReactParams.builder()
            .messageId("messageId")
            .zavuSender("sender_12345")
            .emoji("👍")
            .build()
    }

    @Test
    fun pathParams() {
        val params = MessageReactParams.builder().messageId("messageId").emoji("👍").build()

        assertThat(params._pathParam(0)).isEqualTo("messageId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            MessageReactParams.builder()
                .messageId("messageId")
                .zavuSender("sender_12345")
                .emoji("👍")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("Zavu-Sender", "sender_12345").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = MessageReactParams.builder().messageId("messageId").emoji("👍").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            MessageReactParams.builder()
                .messageId("messageId")
                .zavuSender("sender_12345")
                .emoji("👍")
                .build()

        val body = params._body()

        assertThat(body.emoji()).isEqualTo("👍")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = MessageReactParams.builder().messageId("messageId").emoji("👍").build()

        val body = params._body()

        assertThat(body.emoji()).isEqualTo("👍")
    }
}
