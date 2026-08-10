// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.number10dlc.brands

import com.zavudev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandListParamsTest {

    @Test
    fun create() {
        BrandListParams.builder().cursor("cursor").limit(100L).build()
    }

    @Test
    fun queryParams() {
        val params = BrandListParams.builder().cursor("cursor").limit(100L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("cursor", "cursor").put("limit", "100").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BrandListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
