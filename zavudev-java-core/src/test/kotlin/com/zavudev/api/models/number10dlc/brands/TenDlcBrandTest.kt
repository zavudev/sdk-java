// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.number10dlc.brands

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TenDlcBrandTest {

    @Test
    fun create() {
        val tenDlcBrand =
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

        assertThat(tenDlcBrand.id()).isEqualTo("id")
        assertThat(tenDlcBrand.city()).isEqualTo("city")
        assertThat(tenDlcBrand.country()).isEqualTo("US")
        assertThat(tenDlcBrand.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tenDlcBrand.displayName()).isEqualTo("Acme Corp")
        assertThat(tenDlcBrand.email()).isEqualTo("dev@stainless.com")
        assertThat(tenDlcBrand.entityType()).isEqualTo(TenDlcBrand.EntityType.PRIVATE_PROFIT)
        assertThat(tenDlcBrand.phone()).isEqualTo("+14155551234")
        assertThat(tenDlcBrand.postalCode()).isEqualTo("postalCode")
        assertThat(tenDlcBrand.state()).isEqualTo("state")
        assertThat(tenDlcBrand.status()).isEqualTo(TenDlcBrand.Status.DRAFT)
        assertThat(tenDlcBrand.street()).isEqualTo("street")
        assertThat(tenDlcBrand.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tenDlcBrand.vertical()).isEqualTo("Technology")
        assertThat(tenDlcBrand.brandRelationship()).contains("brandRelationship")
        assertThat(tenDlcBrand.brandScore()).contains(0L)
        assertThat(tenDlcBrand.companyName()).contains("companyName")
        assertThat(tenDlcBrand.ein()).contains("12-3456789")
        assertThat(tenDlcBrand.failureReason()).contains("failureReason")
        assertThat(tenDlcBrand.firstName()).contains("firstName")
        assertThat(tenDlcBrand.lastName()).contains("lastName")
        assertThat(tenDlcBrand.stockExchange()).contains("stockExchange")
        assertThat(tenDlcBrand.stockSymbol()).contains("stockSymbol")
        assertThat(tenDlcBrand.submittedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tenDlcBrand.verifiedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tenDlcBrand.website()).contains("https://example.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tenDlcBrand =
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

        val roundtrippedTenDlcBrand =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tenDlcBrand),
                jacksonTypeRef<TenDlcBrand>(),
            )

        assertThat(roundtrippedTenDlcBrand).isEqualTo(tenDlcBrand)
    }
}
