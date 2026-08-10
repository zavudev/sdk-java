// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.addresses

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddressTest {

    @Test
    fun create() {
        val address =
            Address.builder()
                .id("id")
                .countryCode("DE")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .locality("locality")
                .postalCode("postalCode")
                .status(AddressStatus.PENDING)
                .streetAddress("streetAddress")
                .administrativeArea("administrativeArea")
                .businessName("businessName")
                .extendedAddress("extendedAddress")
                .firstName("firstName")
                .lastName("lastName")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(address.id()).isEqualTo("id")
        assertThat(address.countryCode()).isEqualTo("DE")
        assertThat(address.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(address.locality()).isEqualTo("locality")
        assertThat(address.postalCode()).isEqualTo("postalCode")
        assertThat(address.status()).isEqualTo(AddressStatus.PENDING)
        assertThat(address.streetAddress()).isEqualTo("streetAddress")
        assertThat(address.administrativeArea()).contains("administrativeArea")
        assertThat(address.businessName()).contains("businessName")
        assertThat(address.extendedAddress()).contains("extendedAddress")
        assertThat(address.firstName()).contains("firstName")
        assertThat(address.lastName()).contains("lastName")
        assertThat(address.updatedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val address =
            Address.builder()
                .id("id")
                .countryCode("DE")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .locality("locality")
                .postalCode("postalCode")
                .status(AddressStatus.PENDING)
                .streetAddress("streetAddress")
                .administrativeArea("administrativeArea")
                .businessName("businessName")
                .extendedAddress("extendedAddress")
                .firstName("firstName")
                .lastName("lastName")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedAddress =
            jsonMapper.readValue(jsonMapper.writeValueAsString(address), jacksonTypeRef<Address>())

        assertThat(roundtrippedAddress).isEqualTo(address)
    }
}
