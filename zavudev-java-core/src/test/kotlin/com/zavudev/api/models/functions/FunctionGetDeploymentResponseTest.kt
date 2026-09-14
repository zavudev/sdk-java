// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FunctionGetDeploymentResponseTest {

    @Test
    fun create() {
        val functionGetDeploymentResponse =
            FunctionGetDeploymentResponse.builder()
                .deployment(
                    FunctionGetDeploymentResponse.Deployment.builder()
                        .id("fnd_abc123")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .functionId("functionId")
                        .status(FunctionGetDeploymentResponse.Deployment.Status.PENDING)
                        .version(0L)
                        .buildLogs("buildLogs")
                        .bundleBytes(0L)
                        .deployedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .errorMessage("errorMessage")
                        .sourceCodeBytes(0L)
                        .build()
                )
                .build()

        assertThat(functionGetDeploymentResponse.deployment())
            .isEqualTo(
                FunctionGetDeploymentResponse.Deployment.builder()
                    .id("fnd_abc123")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .functionId("functionId")
                    .status(FunctionGetDeploymentResponse.Deployment.Status.PENDING)
                    .version(0L)
                    .buildLogs("buildLogs")
                    .bundleBytes(0L)
                    .deployedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .errorMessage("errorMessage")
                    .sourceCodeBytes(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val functionGetDeploymentResponse =
            FunctionGetDeploymentResponse.builder()
                .deployment(
                    FunctionGetDeploymentResponse.Deployment.builder()
                        .id("fnd_abc123")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .functionId("functionId")
                        .status(FunctionGetDeploymentResponse.Deployment.Status.PENDING)
                        .version(0L)
                        .buildLogs("buildLogs")
                        .bundleBytes(0L)
                        .deployedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .errorMessage("errorMessage")
                        .sourceCodeBytes(0L)
                        .build()
                )
                .build()

        val roundtrippedFunctionGetDeploymentResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(functionGetDeploymentResponse),
                jacksonTypeRef<FunctionGetDeploymentResponse>(),
            )

        assertThat(roundtrippedFunctionGetDeploymentResponse)
            .isEqualTo(functionGetDeploymentResponse)
    }
}
