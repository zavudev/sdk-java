// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.addresses

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddressCreateResponseTest {

    @Test
    fun create() {
        val addressCreateResponse =
            AddressCreateResponse.builder()
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

        assertThat(addressCreateResponse.address())
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
        val addressCreateResponse =
            AddressCreateResponse.builder()
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

        val roundtrippedAddressCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addressCreateResponse),
                jacksonTypeRef<AddressCreateResponse>(),
            )

        assertThat(roundtrippedAddressCreateResponse).isEqualTo(addressCreateResponse)
    }
}
