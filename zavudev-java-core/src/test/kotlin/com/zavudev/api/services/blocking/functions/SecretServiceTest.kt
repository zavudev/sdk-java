// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.functions

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.models.functions.secrets.SecretSetParams
import com.zavudev.api.models.functions.secrets.SecretUnsetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SecretServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val secretService = client.functions().secrets()

        val secrets = secretService.list("functionId")

        secrets.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun set() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val secretService = client.functions().secrets()

        val response =
            secretService.set(
                SecretSetParams.builder().functionId("functionId").key("key").value("value").build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun unset() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val secretService = client.functions().secrets()

        secretService.unset(SecretUnsetParams.builder().functionId("functionId").key("key").build())
    }
}
