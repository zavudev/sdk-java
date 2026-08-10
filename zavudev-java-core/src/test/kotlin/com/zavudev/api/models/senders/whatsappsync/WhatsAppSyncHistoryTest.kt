// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.whatsappsync

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsAppSyncHistoryTest {

    @Test
    fun create() {
        val whatsAppSyncHistory =
            WhatsAppSyncHistory.builder()
                .canSync(true)
                .status(WhatsAppSyncHistory.Status.NOT_REQUESTED)
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(whatsAppSyncHistory.canSync()).isEqualTo(true)
        assertThat(whatsAppSyncHistory.status()).isEqualTo(WhatsAppSyncHistory.Status.NOT_REQUESTED)
        assertThat(whatsAppSyncHistory.completedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(whatsAppSyncHistory.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsAppSyncHistory =
            WhatsAppSyncHistory.builder()
                .canSync(true)
                .status(WhatsAppSyncHistory.Status.NOT_REQUESTED)
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedWhatsAppSyncHistory =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsAppSyncHistory),
                jacksonTypeRef<WhatsAppSyncHistory>(),
            )

        assertThat(roundtrippedWhatsAppSyncHistory).isEqualTo(whatsAppSyncHistory)
    }
}
