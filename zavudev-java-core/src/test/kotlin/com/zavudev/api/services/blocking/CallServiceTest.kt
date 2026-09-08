// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.core.JsonValue
import com.zavudev.api.models.calls.CallCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CallServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val callService = client.calls()

        val call =
            callService.create(
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

        call.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val callService = client.calls()

        val call = callService.retrieve("callId")

        call.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val callService = client.calls()

        val page = callService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun hangup() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val callService = client.calls()

        val response = callService.hangup("callId")

        response.validate()
    }
}
