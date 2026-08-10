// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.executions

import com.zavudev.api.core.http.QueryParams
import com.zavudev.api.models.senders.agent.AgentExecutionStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExecutionListParamsTest {

    @Test
    fun create() {
        ExecutionListParams.builder()
            .senderId("senderId")
            .cursor("cursor")
            .limit(100L)
            .status(AgentExecutionStatus.SUCCESS)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ExecutionListParams.builder().senderId("senderId").build()

        assertThat(params._pathParam(0)).isEqualTo("senderId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ExecutionListParams.builder()
                .senderId("senderId")
                .cursor("cursor")
                .limit(100L)
                .status(AgentExecutionStatus.SUCCESS)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("limit", "100")
                    .put("status", "success")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ExecutionListParams.builder().senderId("senderId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
