// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions

import com.zavudev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FunctionListDeploymentsParamsTest {

    @Test
    fun create() {
        FunctionListDeploymentsParams.builder().functionId("functionId").limit(100L).build()
    }

    @Test
    fun pathParams() {
        val params = FunctionListDeploymentsParams.builder().functionId("functionId").build()

        assertThat(params._pathParam(0)).isEqualTo("functionId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            FunctionListDeploymentsParams.builder().functionId("functionId").limit(100L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("limit", "100").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FunctionListDeploymentsParams.builder().functionId("functionId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
