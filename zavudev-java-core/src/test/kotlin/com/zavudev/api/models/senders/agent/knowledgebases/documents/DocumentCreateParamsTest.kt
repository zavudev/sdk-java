// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.knowledgebases.documents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentCreateParamsTest {

    @Test
    fun create() {
        DocumentCreateParams.builder()
            .senderId("senderId")
            .kbId("kbId")
            .content("Our return policy allows returns within 30 days of purchase...")
            .title("Return Policy")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DocumentCreateParams.builder()
                .senderId("senderId")
                .kbId("kbId")
                .content("Our return policy allows returns within 30 days of purchase...")
                .title("Return Policy")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("senderId")
        assertThat(params._pathParam(1)).isEqualTo("kbId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DocumentCreateParams.builder()
                .senderId("senderId")
                .kbId("kbId")
                .content("Our return policy allows returns within 30 days of purchase...")
                .title("Return Policy")
                .build()

        val body = params._body()

        assertThat(body.content())
            .isEqualTo("Our return policy allows returns within 30 days of purchase...")
        assertThat(body.title()).isEqualTo("Return Policy")
    }
}
