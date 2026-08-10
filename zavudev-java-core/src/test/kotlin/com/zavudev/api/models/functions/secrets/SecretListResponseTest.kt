// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions.secrets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecretListResponseTest {

    @Test
    fun create() {
        val secretListResponse =
            SecretListResponse.builder()
                .addSecret(
                    SecretListResponse.Secret.builder()
                        .id("id")
                        .key("key")
                        .valueLast4("valueLast4")
                        .createdAt(0.0)
                        .syncedToAws(true)
                        .updatedAt(0.0)
                        .build()
                )
                .build()

        assertThat(secretListResponse.secrets())
            .containsExactly(
                SecretListResponse.Secret.builder()
                    .id("id")
                    .key("key")
                    .valueLast4("valueLast4")
                    .createdAt(0.0)
                    .syncedToAws(true)
                    .updatedAt(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val secretListResponse =
            SecretListResponse.builder()
                .addSecret(
                    SecretListResponse.Secret.builder()
                        .id("id")
                        .key("key")
                        .valueLast4("valueLast4")
                        .createdAt(0.0)
                        .syncedToAws(true)
                        .updatedAt(0.0)
                        .build()
                )
                .build()

        val roundtrippedSecretListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(secretListResponse),
                jacksonTypeRef<SecretListResponse>(),
            )

        assertThat(roundtrippedSecretListResponse).isEqualTo(secretListResponse)
    }
}
