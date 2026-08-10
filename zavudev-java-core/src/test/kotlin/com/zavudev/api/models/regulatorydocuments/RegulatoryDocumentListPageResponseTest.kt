// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.regulatorydocuments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RegulatoryDocumentListPageResponseTest {

    @Test
    fun create() {
        val regulatoryDocumentListPageResponse =
            RegulatoryDocumentListPageResponse.builder()
                .addItem(
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
                .nextCursor("nextCursor")
                .build()

        assertThat(regulatoryDocumentListPageResponse.items())
            .containsExactly(
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
        assertThat(regulatoryDocumentListPageResponse.nextCursor()).contains("nextCursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val regulatoryDocumentListPageResponse =
            RegulatoryDocumentListPageResponse.builder()
                .addItem(
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
                .nextCursor("nextCursor")
                .build()

        val roundtrippedRegulatoryDocumentListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(regulatoryDocumentListPageResponse),
                jacksonTypeRef<RegulatoryDocumentListPageResponse>(),
            )

        assertThat(roundtrippedRegulatoryDocumentListPageResponse)
            .isEqualTo(regulatoryDocumentListPageResponse)
    }
}
