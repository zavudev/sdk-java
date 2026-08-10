// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.executions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExecutionRetrieveParamsTest {

    @Test
    fun create() {
        ExecutionRetrieveParams.builder().senderId("senderId").executionId("executionId").build()
    }

    @Test
    fun pathParams() {
        val params =
            ExecutionRetrieveParams.builder()
                .senderId("senderId")
                .executionId("executionId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("senderId")
        assertThat(params._pathParam(1)).isEqualTo("executionId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
