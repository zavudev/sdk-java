// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.models.urls.UrlEscalateParams
import com.zavudev.api.models.urls.UrlSubmitForVerificationParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UrlServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun escalate() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val urlService = client.urls()

        val response =
            urlService.escalate(
                UrlEscalateParams.builder()
                    .urlId("urlId")
                    .reason("This is our official landing page and was rejected in error.")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listVerified() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val urlService = client.urls()

        val page = urlService.listVerified()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveDetails() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val urlService = client.urls()

        val response = urlService.retrieveDetails("urlId")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun submitForVerification() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val urlService = client.urls()

        val response =
            urlService.submitForVerification(
                UrlSubmitForVerificationParams.builder().url("https://example.com/page").build()
            )

        response.validate()
    }
}
