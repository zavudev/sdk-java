// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.agents

import com.zavudev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentListVoicesParamsTest {

    @Test
    fun create() {
        AgentListVoicesParams.builder().language("es").build()
    }

    @Test
    fun queryParams() {
        val params = AgentListVoicesParams.builder().language("es").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("language", "es").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AgentListVoicesParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
