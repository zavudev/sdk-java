// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.knowledgebases.documents

import com.zavudev.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentListParamsTest {

    @Test
    fun create() {
        DocumentListParams.builder()
            .senderId("senderId")
            .kbId("kbId")
            .cursor("cursor")
            .limit(100L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = DocumentListParams.builder().senderId("senderId").kbId("kbId").build()

        assertThat(params._pathParam(0)).isEqualTo("senderId")
        assertThat(params._pathParam(1)).isEqualTo("kbId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            DocumentListParams.builder()
                .senderId("senderId")
                .kbId("kbId")
                .cursor("cursor")
                .limit(100L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("cursor", "cursor").put("limit", "100").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DocumentListParams.builder().senderId("senderId").kbId("kbId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
