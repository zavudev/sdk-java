// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.subaccounts.apikeys

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyListParamsTest {

    @Test
    fun create() {
        ApiKeyListParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = ApiKeyListParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
