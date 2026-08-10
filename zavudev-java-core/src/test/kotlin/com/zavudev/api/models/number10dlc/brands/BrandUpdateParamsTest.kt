// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.number10dlc.brands

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params = BrandUpdateParams.builder().brandId("brandId").build()

        assertThat(params._pathParam(0)).isEqualTo("brandId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.city()).contains("city")
        assertThat(body.companyName()).contains("companyName")
        assertThat(body.country()).contains("xx")
        assertThat(body.displayName()).contains("displayName")
        assertThat(body.ein()).contains("ein")
        assertThat(body.email()).contains("dev@stainless.com")
        assertThat(body.entityType()).contains(BrandUpdateParams.EntityType.PRIVATE_PROFIT)
        assertThat(body.firstName()).contains("firstName")
        assertThat(body.lastName()).contains("lastName")
        assertThat(body.phone()).contains("phone")
        assertThat(body.postalCode()).contains("postalCode")
        assertThat(body.state()).contains("state")
        assertThat(body.stockExchange()).contains("stockExchange")
        assertThat(body.stockSymbol()).contains("stockSymbol")
        assertThat(body.street()).contains("street")
        assertThat(body.vertical()).contains("vertical")
        assertThat(body.website()).contains("https://example.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BrandUpdateParams.builder().brandId("brandId").build()

        val body = params._body()
    }
}
