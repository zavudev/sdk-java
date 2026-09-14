// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.senders

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.models.senders.telegram.TelegramConnectParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TelegramServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun connect() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val telegramService = client.senders().telegram()

        val response =
            telegramService.connect(
                TelegramConnectParams.builder().senderId("senderId").botToken("botToken").build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun disconnect() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val telegramService = client.senders().telegram()

        telegramService.disconnect("senderId")
    }
}
