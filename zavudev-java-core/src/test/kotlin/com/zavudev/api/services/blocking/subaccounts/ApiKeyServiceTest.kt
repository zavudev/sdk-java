// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.subaccounts

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.models.subaccounts.apikeys.ApiKeyCreateParams
import com.zavudev.api.models.subaccounts.apikeys.ApiKeyRevokeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ApiKeyServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val apiKeyService = client.subAccounts().apiKeys()

        val apiKey =
            apiKeyService.create(
                ApiKeyCreateParams.builder()
                    .id("id")
                    .name("Production Key")
                    .environment(ApiKeyCreateParams.Environment.LIVE)
                    .addPermission("string")
                    .build()
            )

        apiKey.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val apiKeyService = client.subAccounts().apiKeys()

        val apiKeys = apiKeyService.list("id")

        apiKeys.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun revoke() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val apiKeyService = client.subAccounts().apiKeys()

        apiKeyService.revoke(ApiKeyRevokeParams.builder().id("id").keyId("keyId").build())
    }
}
