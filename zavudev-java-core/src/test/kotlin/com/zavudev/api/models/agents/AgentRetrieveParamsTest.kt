// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.agents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentRetrieveParamsTest {

    @Test
    fun create() {
        AgentRetrieveParams.builder().agentId("agentId").build()
    }

    @Test
    fun pathParams() {
        val params = AgentRetrieveParams.builder().agentId("agentId").build()

        assertThat(params._pathParam(0)).isEqualTo("agentId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
