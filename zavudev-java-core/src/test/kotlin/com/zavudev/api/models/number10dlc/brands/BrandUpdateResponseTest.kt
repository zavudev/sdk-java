// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.number10dlc.brands

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandUpdateResponseTest {

    @Test
    fun create() {
        val brandUpdateResponse =
            BrandUpdateResponse.builder()
                .brand(
                    TenDlcBrand.builder()
                        .id("id")
                        .city("city")
                        .country("US")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("Acme Corp")
                        .email("dev@stainless.com")
                        .entityType(TenDlcBrand.EntityType.PRIVATE_PROFIT)
                        .phone("+14155551234")
                        .postalCode("postalCode")
                        .state("state")
                        .status(TenDlcBrand.Status.DRAFT)
                        .street("street")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .vertical("Technology")
                        .brandRelationship("brandRelationship")
                        .brandScore(0L)
                        .companyName("companyName")
                        .ein("12-3456789")
                        .failureReason("failureReason")
                        .firstName("firstName")
                        .lastName("lastName")
                        .stockExchange("stockExchange")
                        .stockSymbol("stockSymbol")
                        .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .verifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .website("https://example.com")
                        .build()
                )
                .build()

        assertThat(brandUpdateResponse.brand())
            .isEqualTo(
                TenDlcBrand.builder()
                    .id("id")
                    .city("city")
                    .country("US")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .displayName("Acme Corp")
                    .email("dev@stainless.com")
                    .entityType(TenDlcBrand.EntityType.PRIVATE_PROFIT)
                    .phone("+14155551234")
                    .postalCode("postalCode")
                    .state("state")
                    .status(TenDlcBrand.Status.DRAFT)
                    .street("street")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .vertical("Technology")
                    .brandRelationship("brandRelationship")
                    .brandScore(0L)
                    .companyName("companyName")
                    .ein("12-3456789")
                    .failureReason("failureReason")
                    .firstName("firstName")
                    .lastName("lastName")
                    .stockExchange("stockExchange")
                    .stockSymbol("stockSymbol")
                    .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .verifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .website("https://example.com")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandUpdateResponse =
            BrandUpdateResponse.builder()
                .brand(
                    TenDlcBrand.builder()
                        .id("id")
                        .city("city")
                        .country("US")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("Acme Corp")
                        .email("dev@stainless.com")
                        .entityType(TenDlcBrand.EntityType.PRIVATE_PROFIT)
                        .phone("+14155551234")
                        .postalCode("postalCode")
                        .state("state")
                        .status(TenDlcBrand.Status.DRAFT)
                        .street("street")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .vertical("Technology")
                        .brandRelationship("brandRelationship")
                        .brandScore(0L)
                        .companyName("companyName")
                        .ein("12-3456789")
                        .failureReason("failureReason")
                        .firstName("firstName")
                        .lastName("lastName")
                        .stockExchange("stockExchange")
                        .stockSymbol("stockSymbol")
                        .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .verifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .website("https://example.com")
                        .build()
                )
                .build()

        val roundtrippedBrandUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandUpdateResponse),
                jacksonTypeRef<BrandUpdateResponse>(),
            )

        assertThat(roundtrippedBrandUpdateResponse).isEqualTo(brandUpdateResponse)
    }
}
