// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.knowledgebases

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KnowledgeBaseCreateParamsTest {

    @Test
    fun create() {
        KnowledgeBaseCreateParams.builder()
            .senderId("senderId")
            .name("Product FAQ")
            .description("Frequently asked questions about our products")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            KnowledgeBaseCreateParams.builder().senderId("senderId").name("Product FAQ").build()

        assertThat(params._pathParam(0)).isEqualTo("senderId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            KnowledgeBaseCreateParams.builder()
                .senderId("senderId")
                .name("Product FAQ")
                .description("Frequently asked questions about our products")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Product FAQ")
        assertThat(body.description()).contains("Frequently asked questions about our products")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            KnowledgeBaseCreateParams.builder().senderId("senderId").name("Product FAQ").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Product FAQ")
    }
}
