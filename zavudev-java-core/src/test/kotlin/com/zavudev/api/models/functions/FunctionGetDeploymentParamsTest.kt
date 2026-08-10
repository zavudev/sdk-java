// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FunctionGetDeploymentParamsTest {

    @Test
    fun create() {
        FunctionGetDeploymentParams.builder().deploymentId("deploymentId").build()
    }

    @Test
    fun pathParams() {
        val params = FunctionGetDeploymentParams.builder().deploymentId("deploymentId").build()

        assertThat(params._pathParam(0)).isEqualTo("deploymentId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
