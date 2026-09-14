// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.agents.senders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SenderConnectParamsTest {

    @Test
    fun create() {
        SenderConnectParams.builder().agentId("agentId").senderId("senderId").build()
    }

    @Test
    fun pathParams() {
        val params = SenderConnectParams.builder().agentId("agentId").senderId("senderId").build()

        assertThat(params._pathParam(0)).isEqualTo("agentId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params = SenderConnectParams.builder().agentId("agentId").senderId("senderId").build()

        val body = params._body()

        assertThat(body.senderId()).isEqualTo("senderId")
    }
}
