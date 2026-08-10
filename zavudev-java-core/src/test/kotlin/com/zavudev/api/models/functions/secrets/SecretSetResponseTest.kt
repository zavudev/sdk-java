// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions.secrets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecretSetResponseTest {

    @Test
    fun create() {
        val secretSetResponse = SecretSetResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val secretSetResponse = SecretSetResponse.builder().build()

        val roundtrippedSecretSetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(secretSetResponse),
                jacksonTypeRef<SecretSetResponse>(),
            )

        assertThat(roundtrippedSecretSetResponse).isEqualTo(secretSetResponse)
    }
}
