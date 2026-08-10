// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FunctionDeployResponseTest {

    @Test
    fun create() {
        val functionDeployResponse =
            FunctionDeployResponse.builder()
                .deployment(
                    FunctionDeployResponse.Deployment.builder()
                        .id("fnd_abc123")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .functionId("functionId")
                        .status(FunctionDeployResponse.Deployment.Status.PENDING)
                        .version(0L)
                        .bundleBytes(0L)
                        .deployedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .errorMessage("errorMessage")
                        .sourceCodeBytes(0L)
                        .build()
                )
                .build()

        assertThat(functionDeployResponse.deployment())
            .isEqualTo(
                FunctionDeployResponse.Deployment.builder()
                    .id("fnd_abc123")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .functionId("functionId")
                    .status(FunctionDeployResponse.Deployment.Status.PENDING)
                    .version(0L)
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
        val functionDeployResponse =
            FunctionDeployResponse.builder()
                .deployment(
                    FunctionDeployResponse.Deployment.builder()
                        .id("fnd_abc123")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .functionId("functionId")
                        .status(FunctionDeployResponse.Deployment.Status.PENDING)
                        .version(0L)
                        .bundleBytes(0L)
                        .deployedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .errorMessage("errorMessage")
                        .sourceCodeBytes(0L)
                        .build()
                )
                .build()

        val roundtrippedFunctionDeployResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(functionDeployResponse),
                jacksonTypeRef<FunctionDeployResponse>(),
            )

        assertThat(roundtrippedFunctionDeployResponse).isEqualTo(functionDeployResponse)
    }
}
