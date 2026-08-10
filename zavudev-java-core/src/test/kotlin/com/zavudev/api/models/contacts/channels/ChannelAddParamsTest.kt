// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.contacts.channels

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelAddParamsTest {

    @Test
    fun create() {
        ChannelAddParams.builder()
            .contactId("contactId")
            .channel(ChannelAddParams.Channel.EMAIL)
            .identifier("john.work@company.com")
            .countryCode("US")
            .isPrimary(true)
            .label("work")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ChannelAddParams.builder()
                .contactId("contactId")
                .channel(ChannelAddParams.Channel.EMAIL)
                .identifier("john.work@company.com")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("contactId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ChannelAddParams.builder()
                .contactId("contactId")
                .channel(ChannelAddParams.Channel.EMAIL)
                .identifier("john.work@company.com")
                .countryCode("US")
                .isPrimary(true)
                .label("work")
                .build()

        val body = params._body()

        assertThat(body.channel()).isEqualTo(ChannelAddParams.Channel.EMAIL)
        assertThat(body.identifier()).isEqualTo("john.work@company.com")
        assertThat(body.countryCode()).contains("US")
        assertThat(body.isPrimary()).contains(true)
        assertThat(body.label()).contains("work")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ChannelAddParams.builder()
                .contactId("contactId")
                .channel(ChannelAddParams.Channel.EMAIL)
                .identifier("john.work@company.com")
                .build()

        val body = params._body()

        assertThat(body.channel()).isEqualTo(ChannelAddParams.Channel.EMAIL)
        assertThat(body.identifier()).isEqualTo("john.work@company.com")
    }
}
