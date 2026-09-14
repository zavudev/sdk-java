// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.messages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageListAttachmentsResponseTest {

    @Test
    fun create() {
        val messageListAttachmentsResponse =
            MessageListAttachmentsResponse.builder()
                .addItem(
                    MessageListAttachmentsResponse.Item.builder()
                        .id("jd7x2k3m4n5p6q7r8s9t0")
                        .contentId("logo")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .downloadUrl("https://example.com")
                        .filename("invoice.pdf")
                        .isInline(true)
                        .mimeType("application/pdf")
                        .size(102400L)
                        .build()
                )
                .build()

        assertThat(messageListAttachmentsResponse.items())
            .containsExactly(
                MessageListAttachmentsResponse.Item.builder()
                    .id("jd7x2k3m4n5p6q7r8s9t0")
                    .contentId("logo")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .downloadUrl("https://example.com")
                    .filename("invoice.pdf")
                    .isInline(true)
                    .mimeType("application/pdf")
                    .size(102400L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageListAttachmentsResponse =
            MessageListAttachmentsResponse.builder()
                .addItem(
                    MessageListAttachmentsResponse.Item.builder()
                        .id("jd7x2k3m4n5p6q7r8s9t0")
                        .contentId("logo")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .downloadUrl("https://example.com")
                        .filename("invoice.pdf")
                        .isInline(true)
                        .mimeType("application/pdf")
                        .size(102400L)
                        .build()
                )
                .build()

        val roundtrippedMessageListAttachmentsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageListAttachmentsResponse),
                jacksonTypeRef<MessageListAttachmentsResponse>(),
            )

        assertThat(roundtrippedMessageListAttachmentsResponse)
            .isEqualTo(messageListAttachmentsResponse)
    }
}
