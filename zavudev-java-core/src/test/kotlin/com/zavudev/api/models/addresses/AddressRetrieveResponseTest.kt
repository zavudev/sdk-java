// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.addresses

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddressRetrieveResponseTest {

    @Test
    fun create() {
        val addressRetrieveResponse =
            AddressRetrieveResponse.builder()
                .address(
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
                )
                .build()

        assertThat(addressRetrieveResponse.address())
            .isEqualTo(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addressRetrieveResponse =
            AddressRetrieveResponse.builder()
                .address(
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
                )
                .build()

        val roundtrippedAddressRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addressRetrieveResponse),
                jacksonTypeRef<AddressRetrieveResponse>(),
            )

        assertThat(roundtrippedAddressRetrieveResponse).isEqualTo(addressRetrieveResponse)
    }
}
