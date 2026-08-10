// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.messages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageShowTypingResponseTest {

    @Test
    fun create() {
        val messageShowTypingResponse = MessageShowTypingResponse.builder().success(true).build()

        assertThat(messageShowTypingResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageShowTypingResponse = MessageShowTypingResponse.builder().success(true).build()

        val roundtrippedMessageShowTypingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageShowTypingResponse),
                jacksonTypeRef<MessageShowTypingResponse>(),
            )

        assertThat(roundtrippedMessageShowTypingResponse).isEqualTo(messageShowTypingResponse)
    }
}
