// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FunctionRollbackDeploymentParamsTest {

    @Test
    fun create() {
        FunctionRollbackDeploymentParams.builder()
            .functionId("functionId")
            .deploymentId("fnd_abc123")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FunctionRollbackDeploymentParams.builder()
                .functionId("functionId")
                .deploymentId("fnd_abc123")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("functionId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FunctionRollbackDeploymentParams.builder()
                .functionId("functionId")
                .deploymentId("fnd_abc123")
                .build()

        val body = params._body()

        assertThat(body.deploymentId()).isEqualTo("fnd_abc123")
    }
}
