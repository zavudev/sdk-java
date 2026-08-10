// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.knowledgebases

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KnowledgeBaseUpdateParamsTest {

    @Test
    fun create() {
        KnowledgeBaseUpdateParams.builder()
            .senderId("senderId")
            .kbId("kbId")
            .description("description")
            .name("name")
            .build()
    }

    @Test
    fun pathParams() {
        val params = KnowledgeBaseUpdateParams.builder().senderId("senderId").kbId("kbId").build()

        assertThat(params._pathParam(0)).isEqualTo("senderId")
        assertThat(params._pathParam(1)).isEqualTo("kbId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            KnowledgeBaseUpdateParams.builder()
                .senderId("senderId")
                .kbId("kbId")
                .description("description")
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.name()).contains("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = KnowledgeBaseUpdateParams.builder().senderId("senderId").kbId("kbId").build()

        val body = params._body()
    }
}
