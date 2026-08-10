// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FunctionUpdateResponseTest {

    @Test
    fun create() {
        val functionUpdateResponse =
            FunctionUpdateResponse.builder()
                .function(
                    FunctionUpdateResponse.Function.builder()
                        .id("fn_abc123")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dependencies(
                            FunctionUpdateResponse.Function.Dependencies.builder()
                                .putAdditionalProperty("openai", JsonValue.from("^4.20.0"))
                                .build()
                        )
                        .httpEnabled(true)
                        .memoryMb(256L)
                        .name("Order Bot")
                        .runtime(FunctionUpdateResponse.Function.Runtime.NODEJS24)
                        .slug("order-bot")
                        .status(FunctionUpdateResponse.Function.Status.DRAFT)
                        .timeoutSec(10L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .activeDeploymentId("activeDeploymentId")
                        .description("description")
                        .publicUrl("https://example.com")
                        .build()
                )
                .build()

        assertThat(functionUpdateResponse.function())
            .isEqualTo(
                FunctionUpdateResponse.Function.builder()
                    .id("fn_abc123")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dependencies(
                        FunctionUpdateResponse.Function.Dependencies.builder()
                            .putAdditionalProperty("openai", JsonValue.from("^4.20.0"))
                            .build()
                    )
                    .httpEnabled(true)
                    .memoryMb(256L)
                    .name("Order Bot")
                    .runtime(FunctionUpdateResponse.Function.Runtime.NODEJS24)
                    .slug("order-bot")
                    .status(FunctionUpdateResponse.Function.Status.DRAFT)
                    .timeoutSec(10L)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .activeDeploymentId("activeDeploymentId")
                    .description("description")
                    .publicUrl("https://example.com")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val functionUpdateResponse =
            FunctionUpdateResponse.builder()
                .function(
                    FunctionUpdateResponse.Function.builder()
                        .id("fn_abc123")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dependencies(
                            FunctionUpdateResponse.Function.Dependencies.builder()
                                .putAdditionalProperty("openai", JsonValue.from("^4.20.0"))
                                .build()
                        )
                        .httpEnabled(true)
                        .memoryMb(256L)
                        .name("Order Bot")
                        .runtime(FunctionUpdateResponse.Function.Runtime.NODEJS24)
                        .slug("order-bot")
                        .status(FunctionUpdateResponse.Function.Status.DRAFT)
                        .timeoutSec(10L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .activeDeploymentId("activeDeploymentId")
                        .description("description")
                        .publicUrl("https://example.com")
                        .build()
                )
                .build()

        val roundtrippedFunctionUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(functionUpdateResponse),
                jacksonTypeRef<FunctionUpdateResponse>(),
            )

        assertThat(roundtrippedFunctionUpdateResponse).isEqualTo(functionUpdateResponse)
    }
}
