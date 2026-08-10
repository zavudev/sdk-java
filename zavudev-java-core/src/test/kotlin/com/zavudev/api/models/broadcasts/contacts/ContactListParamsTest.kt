// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.broadcasts.contacts

import com.zavudev.api.core.http.QueryParams
import com.zavudev.api.models.broadcasts.BroadcastContactStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactListParamsTest {

    @Test
    fun create() {
        ContactListParams.builder()
            .broadcastId("broadcastId")
            .cursor("cursor")
            .limit(100L)
            .status(BroadcastContactStatus.PENDING)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ContactListParams.builder().broadcastId("broadcastId").build()

        assertThat(params._pathParam(0)).isEqualTo("broadcastId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ContactListParams.builder()
                .broadcastId("broadcastId")
                .cursor("cursor")
                .limit(100L)
                .status(BroadcastContactStatus.PENDING)
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
        val params = ContactListParams.builder().broadcastId("broadcastId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
