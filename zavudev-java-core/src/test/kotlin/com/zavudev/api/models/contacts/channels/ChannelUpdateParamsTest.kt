// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.contacts.channels

import com.zavudev.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelUpdateParamsTest {

    @Test
    fun create() {
        ChannelUpdateParams.builder()
            .contactId("contactId")
            .channelId("channelId")
            .label("label")
            .metadata(
                ChannelUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .verified(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ChannelUpdateParams.builder().contactId("contactId").channelId("channelId").build()

        assertThat(params._pathParam(0)).isEqualTo("contactId")
        assertThat(params._pathParam(1)).isEqualTo("channelId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ChannelUpdateParams.builder()
                .contactId("contactId")
                .channelId("channelId")
                .label("label")
                .metadata(
                    ChannelUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .verified(true)
                .build()

        val body = params._body()

        assertThat(body.label()).contains("label")
        assertThat(body.metadata())
            .contains(
                ChannelUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.verified()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ChannelUpdateParams.builder().contactId("contactId").channelId("channelId").build()

        val body = params._body()
    }
}
