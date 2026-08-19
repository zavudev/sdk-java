// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FunctionRollbackDeploymentResponseTest {

    @Test
    fun create() {
        val functionRollbackDeploymentResponse =
            FunctionRollbackDeploymentResponse.builder()
                .deployment(
                    FunctionRollbackDeploymentResponse.Deployment.builder()
                        .id("fnd_abc123")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .functionId("functionId")
                        .status(FunctionRollbackDeploymentResponse.Deployment.Status.PENDING)
                        .version(0L)
                        .buildLogs("buildLogs")
                        .bundleBytes(0L)
                        .deployedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .errorMessage("errorMessage")
                        .sourceCodeBytes(0L)
                        .build()
                )
                .previousDraft(JsonValue.from(mapOf<String, Any>()))
                .rolledBackToVersion(0L)
                .build()

        assertThat(functionRollbackDeploymentResponse.deployment())
            .isEqualTo(
                FunctionRollbackDeploymentResponse.Deployment.builder()
                    .id("fnd_abc123")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .functionId("functionId")
                    .status(FunctionRollbackDeploymentResponse.Deployment.Status.PENDING)
                    .version(0L)
                    .buildLogs("buildLogs")
                    .bundleBytes(0L)
                    .deployedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .errorMessage("errorMessage")
                    .sourceCodeBytes(0L)
                    .build()
            )
        assertThat(functionRollbackDeploymentResponse._previousDraft())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(functionRollbackDeploymentResponse.rolledBackToVersion()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val functionRollbackDeploymentResponse =
            FunctionRollbackDeploymentResponse.builder()
                .deployment(
                    FunctionRollbackDeploymentResponse.Deployment.builder()
                        .id("fnd_abc123")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .functionId("functionId")
                        .status(FunctionRollbackDeploymentResponse.Deployment.Status.PENDING)
                        .version(0L)
                        .buildLogs("buildLogs")
                        .bundleBytes(0L)
                        .deployedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .errorMessage("errorMessage")
                        .sourceCodeBytes(0L)
                        .build()
                )
                .previousDraft(JsonValue.from(mapOf<String, Any>()))
                .rolledBackToVersion(0L)
                .build()

        val roundtrippedFunctionRollbackDeploymentResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(functionRollbackDeploymentResponse),
                jacksonTypeRef<FunctionRollbackDeploymentResponse>(),
            )

        assertThat(roundtrippedFunctionRollbackDeploymentResponse)
            .isEqualTo(functionRollbackDeploymentResponse)
    }
}
