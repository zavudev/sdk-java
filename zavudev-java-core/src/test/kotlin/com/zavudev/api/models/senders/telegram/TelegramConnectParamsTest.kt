// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.telegram

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelegramConnectParamsTest {

    @Test
    fun create() {
        TelegramConnectParams.builder().senderId("senderId").botToken("botToken").build()
    }

    @Test
    fun pathParams() {
        val params =
            TelegramConnectParams.builder().senderId("senderId").botToken("botToken").build()

        assertThat(params._pathParam(0)).isEqualTo("senderId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TelegramConnectParams.builder().senderId("senderId").botToken("botToken").build()

        val body = params._body()

        assertThat(body.botToken()).isEqualTo("botToken")
    }
}
