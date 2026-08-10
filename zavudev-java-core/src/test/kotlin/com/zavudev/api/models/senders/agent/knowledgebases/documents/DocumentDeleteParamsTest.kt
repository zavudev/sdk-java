// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.knowledgebases.documents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentDeleteParamsTest {

    @Test
    fun create() {
        DocumentDeleteParams.builder().senderId("senderId").kbId("kbId").docId("docId").build()
    }

    @Test
    fun pathParams() {
        val params =
            DocumentDeleteParams.builder().senderId("senderId").kbId("kbId").docId("docId").build()

        assertThat(params._pathParam(0)).isEqualTo("senderId")
        assertThat(params._pathParam(1)).isEqualTo("kbId")
        assertThat(params._pathParam(2)).isEqualTo("docId")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }
}
