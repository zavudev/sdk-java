// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.calls

import com.zavudev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallListParamsTest {

    @Test
    fun create() {
        CallListParams.builder()
            .cursor("cursor")
            .direction(CallListParams.Direction.INBOUND)
            .limit(100L)
            .status(CallListParams.Status.QUEUED)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CallListParams.builder()
                .cursor("cursor")
                .direction(CallListParams.Direction.INBOUND)
                .limit(100L)
                .status(CallListParams.Status.QUEUED)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("direction", "inbound")
                    .put("limit", "100")
                    .put("status", "queued")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CallListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
