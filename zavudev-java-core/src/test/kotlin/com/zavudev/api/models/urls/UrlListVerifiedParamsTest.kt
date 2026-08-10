// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.urls

import com.zavudev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UrlListVerifiedParamsTest {

    @Test
    fun create() {
        UrlListVerifiedParams.builder()
            .cursor("cursor")
            .limit(100L)
            .status(UrlListVerifiedParams.Status.PENDING)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            UrlListVerifiedParams.builder()
                .cursor("cursor")
                .limit(100L)
                .status(UrlListVerifiedParams.Status.PENDING)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("limit", "100")
                    .put("status", "pending")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = UrlListVerifiedParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
