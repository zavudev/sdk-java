// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.urls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifiedUrlTest {

    @Test
    fun create() {
        val verifiedUrl =
            VerifiedUrl.builder()
                .id("url_abc123")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .domain("example.com")
                .status(VerifiedUrl.Status.PENDING)
                .url("https://example.com/page")
                .approvalType(VerifiedUrl.ApprovalType.MANUAL)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(verifiedUrl.id()).isEqualTo("url_abc123")
        assertThat(verifiedUrl.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(verifiedUrl.domain()).isEqualTo("example.com")
        assertThat(verifiedUrl.status()).isEqualTo(VerifiedUrl.Status.PENDING)
        assertThat(verifiedUrl.url()).isEqualTo("https://example.com/page")
        assertThat(verifiedUrl.approvalType()).contains(VerifiedUrl.ApprovalType.MANUAL)
        assertThat(verifiedUrl.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verifiedUrl =
            VerifiedUrl.builder()
                .id("url_abc123")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .domain("example.com")
                .status(VerifiedUrl.Status.PENDING)
                .url("https://example.com/page")
                .approvalType(VerifiedUrl.ApprovalType.MANUAL)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedVerifiedUrl =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verifiedUrl),
                jacksonTypeRef<VerifiedUrl>(),
            )

        assertThat(roundtrippedVerifiedUrl).isEqualTo(verifiedUrl)
    }
}
