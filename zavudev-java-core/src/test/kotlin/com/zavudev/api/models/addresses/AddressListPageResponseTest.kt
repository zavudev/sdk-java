// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.addresses

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddressListPageResponseTest {

    @Test
    fun create() {
        val addressListPageResponse =
            AddressListPageResponse.builder()
                .addItem(
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
                .nextCursor("nextCursor")
                .build()

        assertThat(addressListPageResponse.items())
            .containsExactly(
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
        assertThat(addressListPageResponse.nextCursor()).contains("nextCursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addressListPageResponse =
            AddressListPageResponse.builder()
                .addItem(
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
                .nextCursor("nextCursor")
                .build()

        val roundtrippedAddressListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addressListPageResponse),
                jacksonTypeRef<AddressListPageResponse>(),
            )

        assertThat(roundtrippedAddressListPageResponse).isEqualTo(addressListPageResponse)
    }
}
