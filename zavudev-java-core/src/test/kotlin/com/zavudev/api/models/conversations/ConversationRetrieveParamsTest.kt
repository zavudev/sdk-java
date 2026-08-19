// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.conversations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConversationRetrieveParamsTest {

    @Test
    fun create() {
        ConversationRetrieveParams.builder().conversationId("conversationId").build()
    }

    @Test
    fun pathParams() {
        val params = ConversationRetrieveParams.builder().conversationId("conversationId").build()

        assertThat(params._pathParam(0)).isEqualTo("conversationId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
