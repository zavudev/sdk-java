// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RegulatoryDocumentServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val regulatoryDocumentService = client.regulatoryDocuments()

        val regulatoryDocument =
            regulatoryDocumentService.create(
                RegulatoryDocumentCreateParams.builder()
                    .documentType(RegulatoryDocumentCreateParams.DocumentType.PASSPORT)
                    .fileSize(102400L)
                    .mimeType("image/jpeg")
                    .name("Passport Scan")
                    .storageId("kg2abc123...")
                    .build()
            )

        regulatoryDocument.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val regulatoryDocumentService = client.regulatoryDocuments()

        val regulatoryDocument = regulatoryDocumentService.retrieve("documentId")

        regulatoryDocument.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val regulatoryDocumentService = client.regulatoryDocuments()

        val page = regulatoryDocumentService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val regulatoryDocumentService = client.regulatoryDocuments()

        regulatoryDocumentService.delete("documentId")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun uploadUrl() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val regulatoryDocumentService = client.regulatoryDocuments()

        val response = regulatoryDocumentService.uploadUrl()

        response.validate()
    }
}
