// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.templates

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateSubmitParamsTest {

    @Test
    fun create() {
        TemplateSubmitParams.builder()
            .templateId("templateId")
            .senderId("sender_abc123")
            .category(WhatsappCategory.UTILITY)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TemplateSubmitParams.builder()
                .templateId("templateId")
                .senderId("sender_abc123")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("templateId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TemplateSubmitParams.builder()
                .templateId("templateId")
                .senderId("sender_abc123")
                .category(WhatsappCategory.UTILITY)
                .build()

        val body = params._body()

        assertThat(body.senderId()).isEqualTo("sender_abc123")
        assertThat(body.category()).contains(WhatsappCategory.UTILITY)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TemplateSubmitParams.builder()
                .templateId("templateId")
                .senderId("sender_abc123")
                .build()

        val body = params._body()

        assertThat(body.senderId()).isEqualTo("sender_abc123")
    }
}
