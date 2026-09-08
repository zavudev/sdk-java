// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.messages

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageListAttachmentsParamsTest {

    @Test
    fun create() {
        MessageListAttachmentsParams.builder().messageId("messageId").build()
    }

    @Test
    fun pathParams() {
        val params = MessageListAttachmentsParams.builder().messageId("messageId").build()

        assertThat(params._pathParam(0)).isEqualTo("messageId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
