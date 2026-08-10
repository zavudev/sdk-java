// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.urls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UrlListVerifiedPageResponseTest {

    @Test
    fun create() {
        val urlListVerifiedPageResponse =
            UrlListVerifiedPageResponse.builder()
                .addItem(
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
                .nextCursor("nextCursor")
                .build()

        assertThat(urlListVerifiedPageResponse.items())
            .containsExactly(
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
        assertThat(urlListVerifiedPageResponse.nextCursor()).contains("nextCursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val urlListVerifiedPageResponse =
            UrlListVerifiedPageResponse.builder()
                .addItem(
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
                .nextCursor("nextCursor")
                .build()

        val roundtrippedUrlListVerifiedPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(urlListVerifiedPageResponse),
                jacksonTypeRef<UrlListVerifiedPageResponse>(),
            )

        assertThat(roundtrippedUrlListVerifiedPageResponse).isEqualTo(urlListVerifiedPageResponse)
    }
}
