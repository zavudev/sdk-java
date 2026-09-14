// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.agenttemplates

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentTemplateRetrieveParamsTest {

    @Test
    fun create() {
        AgentTemplateRetrieveParams.builder().templateId("fermi").build()
    }

    @Test
    fun pathParams() {
        val params = AgentTemplateRetrieveParams.builder().templateId("fermi").build()

        assertThat(params._pathParam(0)).isEqualTo("fermi")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
