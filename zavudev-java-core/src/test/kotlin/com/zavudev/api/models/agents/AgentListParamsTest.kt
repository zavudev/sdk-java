// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.agents

import com.zavudev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentListParamsTest {

    @Test
    fun create() {
        AgentListParams.builder().cursor("cursor").limit(100L).build()
    }

    @Test
    fun queryParams() {
        val params = AgentListParams.builder().cursor("cursor").limit(100L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("cursor", "cursor").put("limit", "100").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AgentListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
