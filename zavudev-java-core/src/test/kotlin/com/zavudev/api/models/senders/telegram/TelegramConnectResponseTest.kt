// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.telegram

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelegramConnectResponseTest {

    @Test
    fun create() {
        val telegramConnectResponse =
            TelegramConnectResponse.builder()
                .telegram(
                    TelegramConnectResponse.Telegram.builder()
                        .connected(true)
                        .botId("botId")
                        .botUsername("botUsername")
                        .build()
                )
                .build()

        assertThat(telegramConnectResponse.telegram())
            .isEqualTo(
                TelegramConnectResponse.Telegram.builder()
                    .connected(true)
                    .botId("botId")
                    .botUsername("botUsername")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val telegramConnectResponse =
            TelegramConnectResponse.builder()
                .telegram(
                    TelegramConnectResponse.Telegram.builder()
                        .connected(true)
                        .botId("botId")
                        .botUsername("botUsername")
                        .build()
                )
                .build()

        val roundtrippedTelegramConnectResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(telegramConnectResponse),
                jacksonTypeRef<TelegramConnectResponse>(),
            )

        assertThat(roundtrippedTelegramConnectResponse).isEqualTo(telegramConnectResponse)
    }
}
