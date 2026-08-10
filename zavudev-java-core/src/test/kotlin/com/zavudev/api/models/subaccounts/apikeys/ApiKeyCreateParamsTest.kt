// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.subaccounts.apikeys

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyCreateParamsTest {

    @Test
    fun create() {
        ApiKeyCreateParams.builder()
            .id("id")
            .name("Production Key")
            .environment(ApiKeyCreateParams.Environment.LIVE)
            .addPermission("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ApiKeyCreateParams.builder().id("id").name("Production Key").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ApiKeyCreateParams.builder()
                .id("id")
                .name("Production Key")
                .environment(ApiKeyCreateParams.Environment.LIVE)
                .addPermission("string")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Production Key")
        assertThat(body.environment()).contains(ApiKeyCreateParams.Environment.LIVE)
        assertThat(body.permissions().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ApiKeyCreateParams.builder().id("id").name("Production Key").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Production Key")
    }
}
