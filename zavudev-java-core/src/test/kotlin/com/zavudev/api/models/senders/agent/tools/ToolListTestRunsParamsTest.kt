// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.tools

import com.zavudev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolListTestRunsParamsTest {

    @Test
    fun create() {
        ToolListTestRunsParams.builder().senderId("senderId").toolId("toolId").limit(100L).build()
    }

    @Test
    fun pathParams() {
        val params = ToolListTestRunsParams.builder().senderId("senderId").toolId("toolId").build()

        assertThat(params._pathParam(0)).isEqualTo("senderId")
        assertThat(params._pathParam(1)).isEqualTo("toolId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ToolListTestRunsParams.builder()
                .senderId("senderId")
                .toolId("toolId")
                .limit(100L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("limit", "100").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ToolListTestRunsParams.builder().senderId("senderId").toolId("toolId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
