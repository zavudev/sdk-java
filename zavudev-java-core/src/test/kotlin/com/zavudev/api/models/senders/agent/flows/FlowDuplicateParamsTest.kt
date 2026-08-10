// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.flows

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FlowDuplicateParamsTest {

    @Test
    fun create() {
        FlowDuplicateParams.builder()
            .senderId("senderId")
            .flowId("flowId")
            .newName("Lead Capture (Copy)")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FlowDuplicateParams.builder()
                .senderId("senderId")
                .flowId("flowId")
                .newName("Lead Capture (Copy)")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("senderId")
        assertThat(params._pathParam(1)).isEqualTo("flowId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FlowDuplicateParams.builder()
                .senderId("senderId")
                .flowId("flowId")
                .newName("Lead Capture (Copy)")
                .build()

        val body = params._body()

        assertThat(body.newName()).isEqualTo("Lead Capture (Copy)")
    }
}
