// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.addresses

import com.zavudev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddressListParamsTest {

    @Test
    fun create() {
        AddressListParams.builder().cursor("cursor").limit(100L).build()
    }

    @Test
    fun queryParams() {
        val params = AddressListParams.builder().cursor("cursor").limit(100L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("cursor", "cursor").put("limit", "100").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AddressListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
