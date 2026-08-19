// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.conversations

import com.zavudev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConversationListMessagesParamsTest {

    @Test
    fun create() {
        ConversationListMessagesParams.builder()
            .conversationId("conversationId")
            .cursor("cursor")
            .limit(100L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ConversationListMessagesParams.builder().conversationId("conversationId").build()

        assertThat(params._pathParam(0)).isEqualTo("conversationId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ConversationListMessagesParams.builder()
                .conversationId("conversationId")
                .cursor("cursor")
                .limit(100L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("cursor", "cursor").put("limit", "100").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ConversationListMessagesParams.builder().conversationId("conversationId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
