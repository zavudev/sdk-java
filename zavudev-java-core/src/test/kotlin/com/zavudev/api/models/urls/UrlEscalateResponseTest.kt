// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.urls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UrlEscalateResponseTest {

    @Test
    fun create() {
        val urlEscalateResponse =
            UrlEscalateResponse.builder()
                .message("message")
                .url(
                    VerifiedUrl.builder()
                        .id("url_abc123")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .domain("example.com")
                        .status(VerifiedUrl.Status.PENDING)
                        .url("https://example.com/page")
                        .approvalType(VerifiedUrl.ApprovalType.MANUAL)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(urlEscalateResponse.message()).isEqualTo("message")
        assertThat(urlEscalateResponse.url())
            .isEqualTo(
                VerifiedUrl.builder()
                    .id("url_abc123")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .domain("example.com")
                    .status(VerifiedUrl.Status.PENDING)
                    .url("https://example.com/page")
                    .approvalType(VerifiedUrl.ApprovalType.MANUAL)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val urlEscalateResponse =
            UrlEscalateResponse.builder()
                .message("message")
                .url(
                    VerifiedUrl.builder()
                        .id("url_abc123")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .domain("example.com")
                        .status(VerifiedUrl.Status.PENDING)
                        .url("https://example.com/page")
                        .approvalType(VerifiedUrl.ApprovalType.MANUAL)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedUrlEscalateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(urlEscalateResponse),
                jacksonTypeRef<UrlEscalateResponse>(),
            )

        assertThat(roundtrippedUrlEscalateResponse).isEqualTo(urlEscalateResponse)
    }
}
