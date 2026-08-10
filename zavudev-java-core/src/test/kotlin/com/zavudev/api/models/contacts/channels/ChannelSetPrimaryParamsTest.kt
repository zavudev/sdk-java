// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.contacts.channels

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelSetPrimaryParamsTest {

    @Test
    fun create() {
        ChannelSetPrimaryParams.builder().contactId("contactId").channelId("channelId").build()
    }

    @Test
    fun pathParams() {
        val params =
            ChannelSetPrimaryParams.builder().contactId("contactId").channelId("channelId").build()

        assertThat(params._pathParam(0)).isEqualTo("contactId")
        assertThat(params._pathParam(1)).isEqualTo("channelId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
