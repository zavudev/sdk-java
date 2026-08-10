// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import com.zavudev.api.core.JsonValue
import com.zavudev.api.models.subaccounts.SubAccountCreateParams
import com.zavudev.api.models.subaccounts.SubAccountUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SubAccountServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val subAccountServiceAsync = client.subAccounts()

        val subAccountFuture =
            subAccountServiceAsync.create(
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

        val subAccount = subAccountFuture.get()
        subAccount.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val subAccountServiceAsync = client.subAccounts()

        val subAccountFuture = subAccountServiceAsync.retrieve("id")

        val subAccount = subAccountFuture.get()
        subAccount.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val subAccountServiceAsync = client.subAccounts()

        val subAccountFuture =
            subAccountServiceAsync.update(
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

        val subAccount = subAccountFuture.get()
        subAccount.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val subAccountServiceAsync = client.subAccounts()

        val pageFuture = subAccountServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deactivate() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val subAccountServiceAsync = client.subAccounts()

        val responseFuture = subAccountServiceAsync.deactivate("id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getBalance() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val subAccountServiceAsync = client.subAccounts()

        val responseFuture = subAccountServiceAsync.getBalance("id")

        val response = responseFuture.get()
        response.validate()
    }
}
