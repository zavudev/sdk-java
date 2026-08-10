// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.templates

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateDeleteParamsTest {

    @Test
    fun create() {
        TemplateDeleteParams.builder().templateId("templateId").build()
    }

    @Test
    fun pathParams() {
        val params = TemplateDeleteParams.builder().templateId("templateId").build()

        assertThat(params._pathParam(0)).isEqualTo("templateId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
