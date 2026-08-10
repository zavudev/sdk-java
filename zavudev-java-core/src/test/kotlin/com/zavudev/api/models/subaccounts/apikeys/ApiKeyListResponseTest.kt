// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.subaccounts.apikeys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyListResponseTest {

    @Test
    fun create() {
        val apiKeyListResponse =
            ApiKeyListResponse.builder()
                .addItem(
                    ApiKeyListResponse.Item.builder()
                        .id("id")
                        .createdAt(0.0)
                        .environment(ApiKeyListResponse.Item.Environment.LIVE)
                        .keyPrefix("keyPrefix")
                        .name("name")
                        .key("key")
                        .lastUsedAt(0.0)
                        .addPermission("string")
                        .revokedAt(0.0)
                        .build()
                )
                .build()

        assertThat(apiKeyListResponse.items())
            .containsExactly(
                ApiKeyListResponse.Item.builder()
                    .id("id")
                    .createdAt(0.0)
                    .environment(ApiKeyListResponse.Item.Environment.LIVE)
                    .keyPrefix("keyPrefix")
                    .name("name")
                    .key("key")
                    .lastUsedAt(0.0)
                    .addPermission("string")
                    .revokedAt(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiKeyListResponse =
            ApiKeyListResponse.builder()
                .addItem(
                    ApiKeyListResponse.Item.builder()
                        .id("id")
                        .createdAt(0.0)
                        .environment(ApiKeyListResponse.Item.Environment.LIVE)
                        .keyPrefix("keyPrefix")
                        .name("name")
                        .key("key")
                        .lastUsedAt(0.0)
                        .addPermission("string")
                        .revokedAt(0.0)
                        .build()
                )
                .build()

        val roundtrippedApiKeyListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiKeyListResponse),
                jacksonTypeRef<ApiKeyListResponse>(),
            )

        assertThat(roundtrippedApiKeyListResponse).isEqualTo(apiKeyListResponse)
    }
}
