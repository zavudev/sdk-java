// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.subaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubAccountDeactivateResponseTest {

    @Test
    fun create() {
        val subAccountDeactivateResponse =
            SubAccountDeactivateResponse.builder()
                .keysRevoked(0L)
                .message("Sub-account deactivated")
                .build()

        assertThat(subAccountDeactivateResponse.keysRevoked()).isEqualTo(0L)
        assertThat(subAccountDeactivateResponse.message()).isEqualTo("Sub-account deactivated")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subAccountDeactivateResponse =
            SubAccountDeactivateResponse.builder()
                .keysRevoked(0L)
                .message("Sub-account deactivated")
                .build()

        val roundtrippedSubAccountDeactivateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subAccountDeactivateResponse),
                jacksonTypeRef<SubAccountDeactivateResponse>(),
            )

        assertThat(roundtrippedSubAccountDeactivateResponse).isEqualTo(subAccountDeactivateResponse)
    }
}
