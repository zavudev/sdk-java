// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.subaccounts.apikeys

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyRevokeParamsTest {

    @Test
    fun create() {
        ApiKeyRevokeParams.builder().id("id").keyId("keyId").build()
    }

    @Test
    fun pathParams() {
        val params = ApiKeyRevokeParams.builder().id("id").keyId("keyId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("keyId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
