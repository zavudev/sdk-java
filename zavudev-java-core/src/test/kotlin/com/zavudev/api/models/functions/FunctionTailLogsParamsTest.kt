// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions

import com.zavudev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FunctionTailLogsParamsTest {

    @Test
    fun create() {
        FunctionTailLogsParams.builder()
            .functionId("functionId")
            .endTime(0L)
            .filterPattern("filterPattern")
            .limit(1L)
            .nextToken("nextToken")
            .startTime(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = FunctionTailLogsParams.builder().functionId("functionId").build()

        assertThat(params._pathParam(0)).isEqualTo("functionId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            FunctionTailLogsParams.builder()
                .functionId("functionId")
                .endTime(0L)
                .filterPattern("filterPattern")
                .limit(1L)
                .nextToken("nextToken")
                .startTime(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("endTime", "0")
                    .put("filterPattern", "filterPattern")
                    .put("limit", "1")
                    .put("nextToken", "nextToken")
                    .put("startTime", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FunctionTailLogsParams.builder().functionId("functionId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
