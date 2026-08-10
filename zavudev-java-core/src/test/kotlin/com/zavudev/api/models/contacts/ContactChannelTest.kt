// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.contacts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactChannelTest {

    @Test
    fun create() {
        val contactChannel =
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

        assertThat(contactChannel.id()).isEqualTo("id")
        assertThat(contactChannel.channel()).isEqualTo(ContactChannel.Channel.SMS)
        assertThat(contactChannel.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(contactChannel.identifier()).isEqualTo("+14155551234")
        assertThat(contactChannel.isPrimary()).isEqualTo(true)
        assertThat(contactChannel.verified()).isEqualTo(true)
        assertThat(contactChannel.countryCode()).contains("US")
        assertThat(contactChannel.label()).contains("work")
        assertThat(contactChannel.lastInboundAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(contactChannel.metadata())
            .contains(
                ContactChannel.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(contactChannel.metrics())
            .contains(
                ContactChannel.Metrics.builder()
                    .avgDeliveryTimeMs(0.0)
                    .failureCount(0L)
                    .lastSuccessAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .successCount(0L)
                    .totalAttempts(0L)
                    .build()
            )
        assertThat(contactChannel.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactChannel =
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

        val roundtrippedContactChannel =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactChannel),
                jacksonTypeRef<ContactChannel>(),
            )

        assertThat(roundtrippedContactChannel).isEqualTo(contactChannel)
    }
}
