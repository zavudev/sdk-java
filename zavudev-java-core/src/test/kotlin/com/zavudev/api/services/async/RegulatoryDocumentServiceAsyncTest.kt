// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RegulatoryDocumentServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val regulatoryDocumentServiceAsync = client.regulatoryDocuments()

        val regulatoryDocumentFuture =
            regulatoryDocumentServiceAsync.create(
                RegulatoryDocumentCreateParams.builder()
                    .documentType(RegulatoryDocumentCreateParams.DocumentType.PASSPORT)
                    .fileSize(102400L)
                    .mimeType("image/jpeg")
                    .name("Passport Scan")
                    .storageId("kg2abc123...")
                    .build()
            )

        val regulatoryDocument = regulatoryDocumentFuture.get()
        regulatoryDocument.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val regulatoryDocumentServiceAsync = client.regulatoryDocuments()

        val regulatoryDocumentFuture = regulatoryDocumentServiceAsync.retrieve("documentId")

        val regulatoryDocument = regulatoryDocumentFuture.get()
        regulatoryDocument.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val regulatoryDocumentServiceAsync = client.regulatoryDocuments()

        val pageFuture = regulatoryDocumentServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val regulatoryDocumentServiceAsync = client.regulatoryDocuments()

        val future = regulatoryDocumentServiceAsync.delete("documentId")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun uploadUrl() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val regulatoryDocumentServiceAsync = client.regulatoryDocuments()

        val responseFuture = regulatoryDocumentServiceAsync.uploadUrl()

        val response = responseFuture.get()
        response.validate()
    }
}
