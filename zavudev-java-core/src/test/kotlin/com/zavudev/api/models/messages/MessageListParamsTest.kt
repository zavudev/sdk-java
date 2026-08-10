// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.messages

import com.zavudev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageListParamsTest {

    @Test
    fun create() {
        MessageListParams.builder()
            .channel(MessageListParams.Channel.SMS)
            .cursor("cursor")
            .limit(100L)
            .status(MessageListParams.Status.QUEUED)
            .to("to")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            MessageListParams.builder()
                .channel(MessageListParams.Channel.SMS)
                .cursor("cursor")
                .limit(100L)
                .status(MessageListParams.Status.QUEUED)
                .to("to")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("channel", "sms")
                    .put("cursor", "cursor")
                    .put("limit", "100")
                    .put("status", "queued")
                    .put("to", "to")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MessageListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
