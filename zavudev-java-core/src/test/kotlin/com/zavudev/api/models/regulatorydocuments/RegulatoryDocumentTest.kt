// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.regulatorydocuments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RegulatoryDocumentTest {

    @Test
    fun create() {
        val regulatoryDocument =
            RegulatoryDocument.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .documentType(RegulatoryDocument.DocumentType.PASSPORT)
                .name("name")
                .status(RegulatoryDocument.Status.PENDING)
                .fileSize(0L)
                .mimeType("mimeType")
                .rejectionReason("rejectionReason")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(regulatoryDocument.id()).isEqualTo("id")
        assertThat(regulatoryDocument.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(regulatoryDocument.documentType())
            .isEqualTo(RegulatoryDocument.DocumentType.PASSPORT)
        assertThat(regulatoryDocument.name()).isEqualTo("name")
        assertThat(regulatoryDocument.status()).isEqualTo(RegulatoryDocument.Status.PENDING)
        assertThat(regulatoryDocument.fileSize()).contains(0L)
        assertThat(regulatoryDocument.mimeType()).contains("mimeType")
        assertThat(regulatoryDocument.rejectionReason()).contains("rejectionReason")
        assertThat(regulatoryDocument.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val regulatoryDocument =
            RegulatoryDocument.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .documentType(RegulatoryDocument.DocumentType.PASSPORT)
                .name("name")
                .status(RegulatoryDocument.Status.PENDING)
                .fileSize(0L)
                .mimeType("mimeType")
                .rejectionReason("rejectionReason")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedRegulatoryDocument =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(regulatoryDocument),
                jacksonTypeRef<RegulatoryDocument>(),
            )

        assertThat(roundtrippedRegulatoryDocument).isEqualTo(regulatoryDocument)
    }
}
