// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.subaccounts

import com.zavudev.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubAccountCreateParamsTest {

    @Test
    fun create() {
        SubAccountCreateParams.builder()
            .name("Client ABC")
            .creditLimit(0L)
            .externalId("externalId")
            .metadata(
                SubAccountCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            SubAccountCreateParams.builder()
                .name("Client ABC")
                .creditLimit(0L)
                .externalId("externalId")
                .metadata(
                    SubAccountCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Client ABC")
        assertThat(body.creditLimit()).contains(0L)
        assertThat(body.externalId()).contains("externalId")
        assertThat(body.metadata())
            .contains(
                SubAccountCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SubAccountCreateParams.builder().name("Client ABC").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Client ABC")
    }
}
