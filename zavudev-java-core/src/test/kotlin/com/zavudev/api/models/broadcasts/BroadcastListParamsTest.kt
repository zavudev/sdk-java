// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.broadcasts

import com.zavudev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BroadcastListParamsTest {

    @Test
    fun create() {
        BroadcastListParams.builder()
            .cursor("cursor")
            .limit(100L)
            .status(BroadcastStatus.DRAFT)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BroadcastListParams.builder()
                .cursor("cursor")
                .limit(100L)
                .status(BroadcastStatus.DRAFT)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("limit", "100")
                    .put("status", "draft")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BroadcastListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
