// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.contacts.channels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import com.zavudev.api.models.contacts.ContactChannel
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelAddResponseTest {

    @Test
    fun create() {
        val channelAddResponse =
            ChannelAddResponse.builder()
                .channel(
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
                .build()

        assertThat(channelAddResponse.channel())
            .isEqualTo(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val channelAddResponse =
            ChannelAddResponse.builder()
                .channel(
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
                .build()

        val roundtrippedChannelAddResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(channelAddResponse),
                jacksonTypeRef<ChannelAddResponse>(),
            )

        assertThat(roundtrippedChannelAddResponse).isEqualTo(channelAddResponse)
    }
}
