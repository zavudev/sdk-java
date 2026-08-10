// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import com.zavudev.api.models.addresses.AddressCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AddressServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val addressServiceAsync = client.addresses()

        val addressFuture =
            addressServiceAsync.create(
                AddressCreateParams.builder()
                    .countryCode("DE")
                    .locality("Berlin")
                    .postalCode("10115")
                    .streetAddress("123 Main St")
                    .administrativeArea("administrativeArea")
                    .businessName("businessName")
                    .extendedAddress("extendedAddress")
                    .firstName("John")
                    .lastName("Doe")
                    .build()
            )

        val address = addressFuture.get()
        address.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val addressServiceAsync = client.addresses()

        val addressFuture = addressServiceAsync.retrieve("addressId")

        val address = addressFuture.get()
        address.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val addressServiceAsync = client.addresses()

        val pageFuture = addressServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val addressServiceAsync = client.addresses()

        val future = addressServiceAsync.delete("addressId")

        val response = future.get()
    }
}
