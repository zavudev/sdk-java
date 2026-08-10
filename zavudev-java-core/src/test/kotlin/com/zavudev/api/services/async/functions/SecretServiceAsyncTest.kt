// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.functions

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import com.zavudev.api.models.functions.secrets.SecretSetParams
import com.zavudev.api.models.functions.secrets.SecretUnsetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SecretServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val secretServiceAsync = client.functions().secrets()

        val secretsFuture = secretServiceAsync.list("functionId")

        val secrets = secretsFuture.get()
        secrets.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun set() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val secretServiceAsync = client.functions().secrets()

        val responseFuture =
            secretServiceAsync.set(
                SecretSetParams.builder().functionId("functionId").key("key").value("value").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun unset() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val secretServiceAsync = client.functions().secrets()

        val future =
            secretServiceAsync.unset(
                SecretUnsetParams.builder().functionId("functionId").key("key").build()
            )

        val response = future.get()
    }
}
