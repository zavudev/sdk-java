// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.contacts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactListPageResponseTest {

    @Test
    fun create() {
        val contactListPageResponse =
            ContactListPageResponse.builder()
                .addItem(
                    Contact.builder()
                        .id("id")
                        .addAvailableChannel("string")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(
                            Contact.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .verified(true)
                        .addChannel(
                            ContactChannel.builder()
                                .id("id")
                                .channel(ContactChannel.Channel.SMS)
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .identifier("+14155551234")
                                .isPrimary(true)
                                .verified(true)
                                .countryCode("US")
                                .label("work")
                                .lastInboundAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .metadata(
                                    ContactChannel.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .metrics(
                                    ContactChannel.Metrics.builder()
                                        .avgDeliveryTimeMs(0.0)
                                        .failureCount(0L)
                                        .lastSuccessAt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .successCount(0L)
                                        .totalAttempts(0L)
                                        .build()
                                )
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .countryCode("CL")
                        .defaultChannel(Contact.DefaultChannel.SMS)
                        .displayName("John Doe")
                        .phoneNumber("+56912345678")
                        .primaryEmail("john@example.com")
                        .primaryPhone("+56912345678")
                        .profileName("John Doe")
                        .suggestedMergeWith("suggestedMergeWith")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextCursor("nextCursor")
                .build()

        assertThat(contactListPageResponse.items())
            .containsExactly(
                Contact.builder()
                    .id("id")
                    .addAvailableChannel("string")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .metadata(
                        Contact.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .verified(true)
                    .addChannel(
                        ContactChannel.builder()
                            .id("id")
                            .channel(ContactChannel.Channel.SMS)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .identifier("+14155551234")
                            .isPrimary(true)
                            .verified(true)
                            .countryCode("US")
                            .label("work")
                            .lastInboundAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .metadata(
                                ContactChannel.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .metrics(
                                ContactChannel.Metrics.builder()
                                    .avgDeliveryTimeMs(0.0)
                                    .failureCount(0L)
                                    .lastSuccessAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .successCount(0L)
                                    .totalAttempts(0L)
                                    .build()
                            )
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .countryCode("CL")
                    .defaultChannel(Contact.DefaultChannel.SMS)
                    .displayName("John Doe")
                    .phoneNumber("+56912345678")
                    .primaryEmail("john@example.com")
                    .primaryPhone("+56912345678")
                    .profileName("John Doe")
                    .suggestedMergeWith("suggestedMergeWith")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(contactListPageResponse.nextCursor()).contains("nextCursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactListPageResponse =
            ContactListPageResponse.builder()
                .addItem(
                    Contact.builder()
                        .id("id")
                        .addAvailableChannel("string")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(
                            Contact.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .verified(true)
                        .addChannel(
                            ContactChannel.builder()
                                .id("id")
                                .channel(ContactChannel.Channel.SMS)
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .identifier("+14155551234")
                                .isPrimary(true)
                                .verified(true)
                                .countryCode("US")
                                .label("work")
                                .lastInboundAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .metadata(
                                    ContactChannel.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .metrics(
                                    ContactChannel.Metrics.builder()
                                        .avgDeliveryTimeMs(0.0)
                                        .failureCount(0L)
                                        .lastSuccessAt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .successCount(0L)
                                        .totalAttempts(0L)
                                        .build()
                                )
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .countryCode("CL")
                        .defaultChannel(Contact.DefaultChannel.SMS)
                        .displayName("John Doe")
                        .phoneNumber("+56912345678")
                        .primaryEmail("john@example.com")
                        .primaryPhone("+56912345678")
                        .profileName("John Doe")
                        .suggestedMergeWith("suggestedMergeWith")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextCursor("nextCursor")
                .build()

        val roundtrippedContactListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactListPageResponse),
                jacksonTypeRef<ContactListPageResponse>(),
            )

        assertThat(roundtrippedContactListPageResponse).isEqualTo(contactListPageResponse)
    }
}
