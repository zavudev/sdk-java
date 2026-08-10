// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.flows

import com.zavudev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FlowListParamsTest {

    @Test
    fun create() {
        FlowListParams.builder()
            .senderId("senderId")
            .cursor("cursor")
            .enabled(true)
            .limit(100L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = FlowListParams.builder().senderId("senderId").build()

        assertThat(params._pathParam(0)).isEqualTo("senderId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            FlowListParams.builder()
                .senderId("senderId")
                .cursor("cursor")
                .enabled(true)
                .limit(100L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("enabled", "true")
                    .put("limit", "100")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FlowListParams.builder().senderId("senderId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
