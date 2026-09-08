// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.introspect

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntrospectValidateEmailResponseTest {

    @Test
    fun create() {
        val introspectValidateEmailResponse =
            IntrospectValidateEmailResponse.builder()
                .addResult(
                    IntrospectValidateEmailResponse.Result.builder()
                        .domain("domain")
                        .email("email")
                        .normalized("normalized")
                        .addReason(IntrospectValidateEmailResponse.Result.Reason.INVALID_SYNTAX)
                        .verdict(IntrospectValidateEmailResponse.Result.Verdict.DELIVERABLE)
                        .build()
                )
                .summary(
                    IntrospectValidateEmailResponse.Summary.builder()
                        .deliverable(0L)
                        .risky(0L)
                        .total(0L)
                        .undeliverable(0L)
                        .build()
                )
                .build()

        assertThat(introspectValidateEmailResponse.results())
            .containsExactly(
                IntrospectValidateEmailResponse.Result.builder()
                    .domain("domain")
                    .email("email")
                    .normalized("normalized")
                    .addReason(IntrospectValidateEmailResponse.Result.Reason.INVALID_SYNTAX)
                    .verdict(IntrospectValidateEmailResponse.Result.Verdict.DELIVERABLE)
                    .build()
            )
        assertThat(introspectValidateEmailResponse.summary())
            .isEqualTo(
                IntrospectValidateEmailResponse.Summary.builder()
                    .deliverable(0L)
                    .risky(0L)
                    .total(0L)
                    .undeliverable(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val introspectValidateEmailResponse =
            IntrospectValidateEmailResponse.builder()
                .addResult(
                    IntrospectValidateEmailResponse.Result.builder()
                        .domain("domain")
                        .email("email")
                        .normalized("normalized")
                        .addReason(IntrospectValidateEmailResponse.Result.Reason.INVALID_SYNTAX)
                        .verdict(IntrospectValidateEmailResponse.Result.Verdict.DELIVERABLE)
                        .build()
                )
                .summary(
                    IntrospectValidateEmailResponse.Summary.builder()
                        .deliverable(0L)
                        .risky(0L)
                        .total(0L)
                        .undeliverable(0L)
                        .build()
                )
                .build()

        val roundtrippedIntrospectValidateEmailResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(introspectValidateEmailResponse),
                jacksonTypeRef<IntrospectValidateEmailResponse>(),
            )

        assertThat(roundtrippedIntrospectValidateEmailResponse)
            .isEqualTo(introspectValidateEmailResponse)
    }
}
