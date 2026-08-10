// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.number10dlc.campaigns

import com.zavudev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignListParamsTest {

    @Test
    fun create() {
        CampaignListParams.builder().brandId("brandId").cursor("cursor").limit(100L).build()
    }

    @Test
    fun queryParams() {
        val params =
            CampaignListParams.builder().brandId("brandId").cursor("cursor").limit(100L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("brandId", "brandId")
                    .put("cursor", "cursor")
                    .put("limit", "100")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CampaignListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
