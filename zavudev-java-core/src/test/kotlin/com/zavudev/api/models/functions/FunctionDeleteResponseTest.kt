// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FunctionDeleteResponseTest {

    @Test
    fun create() {
        val functionDeleteResponse =
            FunctionDeleteResponse.builder().deleted(true).name("name").slug("slug").build()

        assertThat(functionDeleteResponse.deleted()).isEqualTo(true)
        assertThat(functionDeleteResponse.name()).contains("name")
        assertThat(functionDeleteResponse.slug()).contains("slug")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val functionDeleteResponse =
            FunctionDeleteResponse.builder().deleted(true).name("name").slug("slug").build()

        val roundtrippedFunctionDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(functionDeleteResponse),
                jacksonTypeRef<FunctionDeleteResponse>(),
            )

        assertThat(roundtrippedFunctionDeleteResponse).isEqualTo(functionDeleteResponse)
    }
}
