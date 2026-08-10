// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.core.JsonValue
import com.zavudev.api.models.subaccounts.SubAccountCreateParams
import com.zavudev.api.models.subaccounts.SubAccountUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SubAccountServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val subAccountService = client.subAccounts()

        val subAccount =
            subAccountService.create(
                SubAccountCreateParams.builder()
                    .name("Client ABC")
                    .creditLimit(0L)
                    .externalId("externalId")
                    .metadata(
                        SubAccountCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        subAccount.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val subAccountService = client.subAccounts()

        val subAccount = subAccountService.retrieve("id")

        subAccount.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val subAccountService = client.subAccounts()

        val subAccount =
            subAccountService.update(
                SubAccountUpdateParams.builder()
                    .id("id")
                    .creditLimit(0L)
                    .externalId("externalId")
                    .metadata(
                        SubAccountUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .name("name")
                    .status(SubAccountUpdateParams.Status.ACTIVE)
                    .build()
            )

        subAccount.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val subAccountService = client.subAccounts()

        val page = subAccountService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deactivate() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val subAccountService = client.subAccounts()

        val response = subAccountService.deactivate("id")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getBalance() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val subAccountService = client.subAccounts()

        val response = subAccountService.getBalance("id")

        response.validate()
    }
}
