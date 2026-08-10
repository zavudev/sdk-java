// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.flows

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FlowRetrieveParamsTest {

    @Test
    fun create() {
        FlowRetrieveParams.builder().senderId("senderId").flowId("flowId").build()
    }

    @Test
    fun pathParams() {
        val params = FlowRetrieveParams.builder().senderId("senderId").flowId("flowId").build()

        assertThat(params._pathParam(0)).isEqualTo("senderId")
        assertThat(params._pathParam(1)).isEqualTo("flowId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
