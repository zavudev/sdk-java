// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FunctionListDeploymentsResponseTest {

    @Test
    fun create() {
        val functionListDeploymentsResponse =
            FunctionListDeploymentsResponse.builder()
                .addDeployment(
                    FunctionListDeploymentsResponse.Deployment.builder()
                        .id("id")
                        .bundleSizeBytes(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deployedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .errorMessage("errorMessage")
                        .isActive(true)
                        .status(FunctionListDeploymentsResponse.Deployment.Status.PENDING)
                        .version(0L)
                        .build()
                )
                .build()

        assertThat(functionListDeploymentsResponse.deployments())
            .containsExactly(
                FunctionListDeploymentsResponse.Deployment.builder()
                    .id("id")
                    .bundleSizeBytes(0L)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .deployedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .errorMessage("errorMessage")
                    .isActive(true)
                    .status(FunctionListDeploymentsResponse.Deployment.Status.PENDING)
                    .version(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val functionListDeploymentsResponse =
            FunctionListDeploymentsResponse.builder()
                .addDeployment(
                    FunctionListDeploymentsResponse.Deployment.builder()
                        .id("id")
                        .bundleSizeBytes(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deployedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .errorMessage("errorMessage")
                        .isActive(true)
                        .status(FunctionListDeploymentsResponse.Deployment.Status.PENDING)
                        .version(0L)
                        .build()
                )
                .build()

        val roundtrippedFunctionListDeploymentsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(functionListDeploymentsResponse),
                jacksonTypeRef<FunctionListDeploymentsResponse>(),
            )

        assertThat(roundtrippedFunctionListDeploymentsResponse)
            .isEqualTo(functionListDeploymentsResponse)
    }
}
