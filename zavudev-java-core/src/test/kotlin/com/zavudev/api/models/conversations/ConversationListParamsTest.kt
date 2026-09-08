// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.conversations

import com.zavudev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConversationListParamsTest {

    @Test
    fun create() {
        ConversationListParams.builder()
            .channel(ConversationListParams.Channel.SMS)
            .cursor("cursor")
            .limit(100L)
            .search("+56912345678")
            .senderId("senderId")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ConversationListParams.builder()
                .channel(ConversationListParams.Channel.SMS)
                .cursor("cursor")
                .limit(100L)
                .search("+56912345678")
                .senderId("senderId")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("channel", "sms")
                    .put("cursor", "cursor")
                    .put("limit", "100")
                    .put("search", "+56912345678")
                    .put("senderId", "senderId")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ConversationListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
