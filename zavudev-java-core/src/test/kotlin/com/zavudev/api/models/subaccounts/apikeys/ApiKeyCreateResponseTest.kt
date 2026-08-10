// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.subaccounts.apikeys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyCreateResponseTest {

    @Test
    fun create() {
        val apiKeyCreateResponse =
            ApiKeyCreateResponse.builder()
                .apiKey(
                    ApiKeyCreateResponse.ApiKey.builder()
                        .id("id")
                        .environment(ApiKeyCreateResponse.ApiKey.Environment.LIVE)
                        .key("key")
                        .name("name")
                        .build()
                )
                .build()

        assertThat(apiKeyCreateResponse.apiKey())
            .isEqualTo(
                ApiKeyCreateResponse.ApiKey.builder()
                    .id("id")
                    .environment(ApiKeyCreateResponse.ApiKey.Environment.LIVE)
                    .key("key")
                    .name("name")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiKeyCreateResponse =
            ApiKeyCreateResponse.builder()
                .apiKey(
                    ApiKeyCreateResponse.ApiKey.builder()
                        .id("id")
                        .environment(ApiKeyCreateResponse.ApiKey.Environment.LIVE)
                        .key("key")
                        .name("name")
                        .build()
                )
                .build()

        val roundtrippedApiKeyCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiKeyCreateResponse),
                jacksonTypeRef<ApiKeyCreateResponse>(),
            )

        assertThat(roundtrippedApiKeyCreateResponse).isEqualTo(apiKeyCreateResponse)
    }
}
