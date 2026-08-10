// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.regulatorydocuments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RegulatoryDocumentUploadUrlResponseTest {

    @Test
    fun create() {
        val regulatoryDocumentUploadUrlResponse =
            RegulatoryDocumentUploadUrlResponse.builder().uploadUrl("https://example.com").build()

        assertThat(regulatoryDocumentUploadUrlResponse.uploadUrl()).isEqualTo("https://example.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val regulatoryDocumentUploadUrlResponse =
            RegulatoryDocumentUploadUrlResponse.builder().uploadUrl("https://example.com").build()

        val roundtrippedRegulatoryDocumentUploadUrlResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(regulatoryDocumentUploadUrlResponse),
                jacksonTypeRef<RegulatoryDocumentUploadUrlResponse>(),
            )

        assertThat(roundtrippedRegulatoryDocumentUploadUrlResponse)
            .isEqualTo(regulatoryDocumentUploadUrlResponse)
    }
}
