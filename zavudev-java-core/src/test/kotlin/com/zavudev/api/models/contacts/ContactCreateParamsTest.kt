// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.contacts

import com.zavudev.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactCreateParamsTest {

    @Test
    fun create() {
        ContactCreateParams.builder()
            .addChannel(
                ContactCreateParams.Channel.builder()
                    .channel(ContactCreateParams.Channel.InnerChannel.SMS)
                    .identifier("+14155551234")
                    .countryCode("US")
                    .isPrimary(true)
                    .label("work")
                    .build()
            )
            .displayName("John Doe")
            .metadata(
                ContactCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ContactCreateParams.builder()
                .addChannel(
                    ContactCreateParams.Channel.builder()
                        .channel(ContactCreateParams.Channel.InnerChannel.SMS)
                        .identifier("+14155551234")
                        .countryCode("US")
                        .isPrimary(true)
                        .label("work")
                        .build()
                )
                .displayName("John Doe")
                .metadata(
                    ContactCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.channels())
            .containsExactly(
                ContactCreateParams.Channel.builder()
                    .channel(ContactCreateParams.Channel.InnerChannel.SMS)
                    .identifier("+14155551234")
                    .countryCode("US")
                    .isPrimary(true)
                    .label("work")
                    .build()
            )
        assertThat(body.displayName()).contains("John Doe")
        assertThat(body.metadata())
            .contains(
                ContactCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ContactCreateParams.builder()
                .addChannel(
                    ContactCreateParams.Channel.builder()
                        .channel(ContactCreateParams.Channel.InnerChannel.SMS)
                        .identifier("+14155551234")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.channels())
            .containsExactly(
                ContactCreateParams.Channel.builder()
                    .channel(ContactCreateParams.Channel.InnerChannel.SMS)
                    .identifier("+14155551234")
                    .build()
            )
    }
}
