// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FunctionRetrieveResponseTest {

    @Test
    fun create() {
        val functionRetrieveResponse =
            FunctionRetrieveResponse.builder()
                .function(
                    FunctionRetrieveResponse.Function.builder()
                        .id("fn_abc123")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dependencies(
                            FunctionRetrieveResponse.Function.Dependencies.builder()
                                .putAdditionalProperty("openai", JsonValue.from("^4.20.0"))
                                .build()
                        )
                        .httpEnabled(true)
                        .memoryMb(256L)
                        .name("Order Bot")
                        .runtime(FunctionRetrieveResponse.Function.Runtime.NODEJS24)
                        .slug("order-bot")
                        .status(FunctionRetrieveResponse.Function.Status.DRAFT)
                        .timeoutSec(10L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .activeDeploymentId("activeDeploymentId")
                        .description("description")
                        .publicUrl("https://example.com")
                        .build()
                )
                .build()

        assertThat(functionRetrieveResponse.function())
            .isEqualTo(
                FunctionRetrieveResponse.Function.builder()
                    .id("fn_abc123")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dependencies(
                        FunctionRetrieveResponse.Function.Dependencies.builder()
                            .putAdditionalProperty("openai", JsonValue.from("^4.20.0"))
                            .build()
                    )
                    .httpEnabled(true)
                    .memoryMb(256L)
                    .name("Order Bot")
                    .runtime(FunctionRetrieveResponse.Function.Runtime.NODEJS24)
                    .slug("order-bot")
                    .status(FunctionRetrieveResponse.Function.Status.DRAFT)
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
        val functionRetrieveResponse =
            FunctionRetrieveResponse.builder()
                .function(
                    FunctionRetrieveResponse.Function.builder()
                        .id("fn_abc123")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dependencies(
                            FunctionRetrieveResponse.Function.Dependencies.builder()
                                .putAdditionalProperty("openai", JsonValue.from("^4.20.0"))
                                .build()
                        )
                        .httpEnabled(true)
                        .memoryMb(256L)
                        .name("Order Bot")
                        .runtime(FunctionRetrieveResponse.Function.Runtime.NODEJS24)
                        .slug("order-bot")
                        .status(FunctionRetrieveResponse.Function.Status.DRAFT)
                        .timeoutSec(10L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .activeDeploymentId("activeDeploymentId")
                        .description("description")
                        .publicUrl("https://example.com")
                        .build()
                )
                .build()

        val roundtrippedFunctionRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(functionRetrieveResponse),
                jacksonTypeRef<FunctionRetrieveResponse>(),
            )

        assertThat(roundtrippedFunctionRetrieveResponse).isEqualTo(functionRetrieveResponse)
    }
}
