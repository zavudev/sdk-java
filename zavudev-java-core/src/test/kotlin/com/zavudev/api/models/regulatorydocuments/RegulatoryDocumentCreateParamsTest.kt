// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.regulatorydocuments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RegulatoryDocumentCreateParamsTest {

    @Test
    fun create() {
        RegulatoryDocumentCreateParams.builder()
            .documentType(RegulatoryDocumentCreateParams.DocumentType.PASSPORT)
            .fileSize(102400L)
            .mimeType("image/jpeg")
            .name("Passport Scan")
            .storageId("kg2abc123...")
            .build()
    }

    @Test
    fun body() {
        val params =
            RegulatoryDocumentCreateParams.builder()
                .documentType(RegulatoryDocumentCreateParams.DocumentType.PASSPORT)
                .fileSize(102400L)
                .mimeType("image/jpeg")
                .name("Passport Scan")
                .storageId("kg2abc123...")
                .build()

        val body = params._body()

        assertThat(body.documentType())
            .isEqualTo(RegulatoryDocumentCreateParams.DocumentType.PASSPORT)
        assertThat(body.fileSize()).isEqualTo(102400L)
        assertThat(body.mimeType()).isEqualTo("image/jpeg")
        assertThat(body.name()).isEqualTo("Passport Scan")
        assertThat(body.storageId()).isEqualTo("kg2abc123...")
    }
}
