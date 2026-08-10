// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.subaccounts

import com.zavudev.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubAccountUpdateParamsTest {

    @Test
    fun create() {
        SubAccountUpdateParams.builder()
            .id("id")
            .creditLimit(0L)
            .externalId("externalId")
            .metadata(
                SubAccountUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .name("name")
            .status(SubAccountUpdateParams.Status.ACTIVE)
            .build()
    }

    @Test
    fun pathParams() {
        val params = SubAccountUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubAccountUpdateParams.builder()
                .id("id")
                .creditLimit(0L)
                .externalId("externalId")
                .metadata(
                    SubAccountUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .name("name")
                .status(SubAccountUpdateParams.Status.ACTIVE)
                .build()

        val body = params._body()

        assertThat(body.creditLimit()).contains(0L)
        assertThat(body.externalId()).contains("externalId")
        assertThat(body.metadata())
            .contains(
                SubAccountUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.name()).contains("name")
        assertThat(body.status()).contains(SubAccountUpdateParams.Status.ACTIVE)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SubAccountUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
