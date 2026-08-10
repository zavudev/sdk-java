// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.number10dlc

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import com.zavudev.api.models.number10dlc.brands.BrandCreateParams
import com.zavudev.api.models.number10dlc.brands.BrandUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BrandServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val brandServiceAsync = client.number10dlc().brands()

        val brandFuture =
            brandServiceAsync.create(
                BrandCreateParams.builder()
                    .city("San Francisco")
                    .country("US")
                    .displayName("Acme Corp")
                    .email("compliance@acme.com")
                    .entityType(BrandCreateParams.EntityType.PRIVATE_PROFIT)
                    .phone("+14155551234")
                    .postalCode("94102")
                    .state("CA")
                    .street("123 Main St")
                    .vertical("Technology")
                    .companyName("Acme Corporation")
                    .ein("12-3456789")
                    .firstName("firstName")
                    .lastName("lastName")
                    .stockExchange("stockExchange")
                    .stockSymbol("stockSymbol")
                    .website("https://acme.com")
                    .build()
            )

        val brand = brandFuture.get()
        brand.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val brandServiceAsync = client.number10dlc().brands()

        val brandFuture = brandServiceAsync.retrieve("brandId")

        val brand = brandFuture.get()
        brand.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val brandServiceAsync = client.number10dlc().brands()

        val brandFuture =
            brandServiceAsync.update(
                BrandUpdateParams.builder()
                    .brandId("brandId")
                    .city("city")
                    .companyName("companyName")
                    .country("xx")
                    .displayName("displayName")
                    .ein("ein")
                    .email("dev@stainless.com")
                    .entityType(BrandUpdateParams.EntityType.PRIVATE_PROFIT)
                    .firstName("firstName")
                    .lastName("lastName")
                    .phone("phone")
                    .postalCode("postalCode")
                    .state("state")
                    .stockExchange("stockExchange")
                    .stockSymbol("stockSymbol")
                    .street("street")
                    .vertical("vertical")
                    .website("https://example.com")
                    .build()
            )

        val brand = brandFuture.get()
        brand.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val brandServiceAsync = client.number10dlc().brands()

        val pageFuture = brandServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val brandServiceAsync = client.number10dlc().brands()

        val future = brandServiceAsync.delete("brandId")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listUseCases() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val brandServiceAsync = client.number10dlc().brands()

        val responseFuture = brandServiceAsync.listUseCases()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun submit() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val brandServiceAsync = client.number10dlc().brands()

        val responseFuture = brandServiceAsync.submit("brandId")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun syncStatus() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val brandServiceAsync = client.number10dlc().brands()

        val responseFuture = brandServiceAsync.syncStatus("brandId")

        val response = responseFuture.get()
        response.validate()
    }
}
