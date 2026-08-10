// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentRetrieveParamsTest {

    @Test
    fun create() {
        AgentRetrieveParams.builder().senderId("senderId").build()
    }

    @Test
    fun pathParams() {
        val params = AgentRetrieveParams.builder().senderId("senderId").build()

        assertThat(params._pathParam(0)).isEqualTo("senderId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
