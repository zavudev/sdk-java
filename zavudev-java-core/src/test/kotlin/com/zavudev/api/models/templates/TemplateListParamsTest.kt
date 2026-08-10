// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.templates

import com.zavudev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateListParamsTest {

    @Test
    fun create() {
        TemplateListParams.builder().cursor("cursor").limit(100L).build()
    }

    @Test
    fun queryParams() {
        val params = TemplateListParams.builder().cursor("cursor").limit(100L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("cursor", "cursor").put("limit", "100").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TemplateListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
