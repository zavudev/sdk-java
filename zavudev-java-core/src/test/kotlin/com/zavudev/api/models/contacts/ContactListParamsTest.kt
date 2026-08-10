// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.contacts

import com.zavudev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactListParamsTest {

    @Test
    fun create() {
        ContactListParams.builder().cursor("cursor").limit(100L).phoneNumber("phoneNumber").build()
    }

    @Test
    fun queryParams() {
        val params =
            ContactListParams.builder()
                .cursor("cursor")
                .limit(100L)
                .phoneNumber("phoneNumber")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("limit", "100")
                    .put("phoneNumber", "phoneNumber")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ContactListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
