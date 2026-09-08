// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FunctionListEventTypesResponseTest {

    @Test
    fun create() {
        val functionListEventTypesResponse =
            FunctionListEventTypesResponse.builder()
                .events(listOf("message.inbound", "message.delivered", "cron"))
                .build()

        assertThat(functionListEventTypesResponse.events())
            .containsExactly("message.inbound", "message.delivered", "cron")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val functionListEventTypesResponse =
            FunctionListEventTypesResponse.builder()
                .events(listOf("message.inbound", "message.delivered", "cron"))
                .build()

        val roundtrippedFunctionListEventTypesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(functionListEventTypesResponse),
                jacksonTypeRef<FunctionListEventTypesResponse>(),
            )

        assertThat(roundtrippedFunctionListEventTypesResponse)
            .isEqualTo(functionListEventTypesResponse)
    }
}
