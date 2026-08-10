// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import com.zavudev.api.models.introspect.IntrospectValidatePhoneParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IntrospectServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun validatePhone() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val introspectServiceAsync = client.introspect()

        val responseFuture =
            introspectServiceAsync.validatePhone(
                IntrospectValidatePhoneParams.builder().phoneNumber("+56912345678").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
