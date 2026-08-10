// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.number10dlc

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.models.number10dlc.brands.BrandCreateParams
import com.zavudev.api.models.number10dlc.brands.BrandUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BrandServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.number10dlc().brands()

        val brand =
            brandService.create(
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

        brand.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.number10dlc().brands()

        val brand = brandService.retrieve("brandId")

        brand.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.number10dlc().brands()

        val brand =
            brandService.update(
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

        brand.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.number10dlc().brands()

        val page = brandService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.number10dlc().brands()

        brandService.delete("brandId")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listUseCases() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.number10dlc().brands()

        val response = brandService.listUseCases()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun submit() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.number10dlc().brands()

        val response = brandService.submit("brandId")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun syncStatus() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.number10dlc().brands()

        val response = brandService.syncStatus("brandId")

        response.validate()
    }
}
