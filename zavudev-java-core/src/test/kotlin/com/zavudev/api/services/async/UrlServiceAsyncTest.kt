// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import com.zavudev.api.models.urls.UrlSubmitForVerificationParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UrlServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listVerified() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val urlServiceAsync = client.urls()

        val pageFuture = urlServiceAsync.listVerified()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveDetails() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val urlServiceAsync = client.urls()

        val responseFuture = urlServiceAsync.retrieveDetails("urlId")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun submitForVerification() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val urlServiceAsync = client.urls()

        val responseFuture =
            urlServiceAsync.submitForVerification(
                UrlSubmitForVerificationParams.builder().url("https://example.com/page").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
