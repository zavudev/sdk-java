// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.regulatorydocuments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RegulatoryDocumentRetrieveResponseTest {

    @Test
    fun create() {
        val regulatoryDocumentRetrieveResponse =
            RegulatoryDocumentRetrieveResponse.builder()
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

        assertThat(regulatoryDocumentRetrieveResponse.document())
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
        val regulatoryDocumentRetrieveResponse =
            RegulatoryDocumentRetrieveResponse.builder()
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

        val roundtrippedRegulatoryDocumentRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(regulatoryDocumentRetrieveResponse),
                jacksonTypeRef<RegulatoryDocumentRetrieveResponse>(),
            )

        assertThat(roundtrippedRegulatoryDocumentRetrieveResponse)
            .isEqualTo(regulatoryDocumentRetrieveResponse)
    }
}
