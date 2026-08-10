// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.regulatorydocuments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RegulatoryDocumentCreateResponseTest {

    @Test
    fun create() {
        val regulatoryDocumentCreateResponse =
            RegulatoryDocumentCreateResponse.builder()
                .document(
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
                )
                .build()

        assertThat(regulatoryDocumentCreateResponse.document())
            .isEqualTo(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val regulatoryDocumentCreateResponse =
            RegulatoryDocumentCreateResponse.builder()
                .document(
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
                )
                .build()

        val roundtrippedRegulatoryDocumentCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(regulatoryDocumentCreateResponse),
                jacksonTypeRef<RegulatoryDocumentCreateResponse>(),
            )

        assertThat(roundtrippedRegulatoryDocumentCreateResponse)
            .isEqualTo(regulatoryDocumentCreateResponse)
    }
}
