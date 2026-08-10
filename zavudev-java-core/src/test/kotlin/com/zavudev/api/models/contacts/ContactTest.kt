// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.contacts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactTest {

    @Test
    fun create() {
        val contact =
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

        assertThat(contact.id()).isEqualTo("id")
        assertThat(contact.availableChannels()).containsExactly("string")
        assertThat(contact.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(contact.metadata())
            .isEqualTo(
                Contact.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(contact.verified()).isEqualTo(true)
        assertThat(contact.channels().getOrNull())
            .containsExactly(
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
        assertThat(contact.countryCode()).contains("CL")
        assertThat(contact.defaultChannel()).contains(Contact.DefaultChannel.SMS)
        assertThat(contact.displayName()).contains("John Doe")
        assertThat(contact.phoneNumber()).contains("+56912345678")
        assertThat(contact.primaryEmail()).contains("john@example.com")
        assertThat(contact.primaryPhone()).contains("+56912345678")
        assertThat(contact.profileName()).contains("John Doe")
        assertThat(contact.suggestedMergeWith()).contains("suggestedMergeWith")
        assertThat(contact.updatedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contact =
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

        val roundtrippedContact =
            jsonMapper.readValue(jsonMapper.writeValueAsString(contact), jacksonTypeRef<Contact>())

        assertThat(roundtrippedContact).isEqualTo(contact)
    }
}
