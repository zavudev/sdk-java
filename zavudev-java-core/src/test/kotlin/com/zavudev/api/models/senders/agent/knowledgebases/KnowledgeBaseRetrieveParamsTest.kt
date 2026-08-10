// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.knowledgebases

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KnowledgeBaseRetrieveParamsTest {

    @Test
    fun create() {
        KnowledgeBaseRetrieveParams.builder().senderId("senderId").kbId("kbId").build()
    }

    @Test
    fun pathParams() {
        val params = KnowledgeBaseRetrieveParams.builder().senderId("senderId").kbId("kbId").build()

        assertThat(params._pathParam(0)).isEqualTo("senderId")
        assertThat(params._pathParam(1)).isEqualTo("kbId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
