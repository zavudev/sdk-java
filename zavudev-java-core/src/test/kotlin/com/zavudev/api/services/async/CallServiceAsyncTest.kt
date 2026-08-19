// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import com.zavudev.api.core.JsonValue
import com.zavudev.api.models.calls.CallCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CallServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val callServiceAsync = client.calls()

        val callFuture =
            callServiceAsync.create(
                CallCreateParams.builder()
                    .to("+56912345678")
                    .greeting("greeting")
                    .language("es-ES")
                    .maxDurationMinutes(1L)
                    .metadata(
                        CallCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .senderId("sender_12345")
                    .build()
            )

        val call = callFuture.get()
        call.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val callServiceAsync = client.calls()

        val callFuture = callServiceAsync.retrieve("callId")

        val call = callFuture.get()
        call.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val callServiceAsync = client.calls()

        val pageFuture = callServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun hangup() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val callServiceAsync = client.calls()

        val responseFuture = callServiceAsync.hangup("callId")

        val response = responseFuture.get()
        response.validate()
    }
}
