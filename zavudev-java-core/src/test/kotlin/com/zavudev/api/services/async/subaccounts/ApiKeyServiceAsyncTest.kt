// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.subaccounts

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import com.zavudev.api.models.subaccounts.apikeys.ApiKeyCreateParams
import com.zavudev.api.models.subaccounts.apikeys.ApiKeyRevokeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ApiKeyServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val apiKeyServiceAsync = client.subAccounts().apiKeys()

        val apiKeyFuture =
            apiKeyServiceAsync.create(
                ApiKeyCreateParams.builder()
                    .id("id")
                    .name("Production Key")
                    .environment(ApiKeyCreateParams.Environment.LIVE)
                    .addPermission("string")
                    .build()
            )

        val apiKey = apiKeyFuture.get()
        apiKey.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val apiKeyServiceAsync = client.subAccounts().apiKeys()

        val apiKeysFuture = apiKeyServiceAsync.list("id")

        val apiKeys = apiKeysFuture.get()
        apiKeys.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun revoke() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val apiKeyServiceAsync = client.subAccounts().apiKeys()

        val future =
            apiKeyServiceAsync.revoke(ApiKeyRevokeParams.builder().id("id").keyId("keyId").build())

        val response = future.get()
    }
}
