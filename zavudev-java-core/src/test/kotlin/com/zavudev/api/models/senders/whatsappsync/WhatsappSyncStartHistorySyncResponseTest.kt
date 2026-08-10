// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.whatsappsync

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappSyncStartHistorySyncResponseTest {

    @Test
    fun create() {
        val whatsappSyncStartHistorySyncResponse =
            WhatsappSyncStartHistorySyncResponse.builder()
                .message("History sync initiated")
                .sync(
                    WhatsAppSyncStatus.builder()
                        .contacts(
                            WhatsAppSyncContacts.builder()
                                .canSync(true)
                                .status(WhatsAppSyncContacts.Status.NOT_REQUESTED)
                                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .history(
                            WhatsAppSyncHistory.builder()
                                .canSync(true)
                                .status(WhatsAppSyncHistory.Status.NOT_REQUESTED)
                                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .isCoexistence(true)
                        .status(WhatsAppSyncStatus.Status.PENDING_VERIFICATION)
                        .build()
                )
                .build()

        assertThat(whatsappSyncStartHistorySyncResponse.message())
            .isEqualTo("History sync initiated")
        assertThat(whatsappSyncStartHistorySyncResponse.sync())
            .isEqualTo(
                WhatsAppSyncStatus.builder()
                    .contacts(
                        WhatsAppSyncContacts.builder()
                            .canSync(true)
                            .status(WhatsAppSyncContacts.Status.NOT_REQUESTED)
                            .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .history(
                        WhatsAppSyncHistory.builder()
                            .canSync(true)
                            .status(WhatsAppSyncHistory.Status.NOT_REQUESTED)
                            .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .isCoexistence(true)
                    .status(WhatsAppSyncStatus.Status.PENDING_VERIFICATION)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsappSyncStartHistorySyncResponse =
            WhatsappSyncStartHistorySyncResponse.builder()
                .message("History sync initiated")
                .sync(
                    WhatsAppSyncStatus.builder()
                        .contacts(
                            WhatsAppSyncContacts.builder()
                                .canSync(true)
                                .status(WhatsAppSyncContacts.Status.NOT_REQUESTED)
                                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .history(
                            WhatsAppSyncHistory.builder()
                                .canSync(true)
                                .status(WhatsAppSyncHistory.Status.NOT_REQUESTED)
                                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .isCoexistence(true)
                        .status(WhatsAppSyncStatus.Status.PENDING_VERIFICATION)
                        .build()
                )
                .build()

        val roundtrippedWhatsappSyncStartHistorySyncResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappSyncStartHistorySyncResponse),
                jacksonTypeRef<WhatsappSyncStartHistorySyncResponse>(),
            )

        assertThat(roundtrippedWhatsappSyncStartHistorySyncResponse)
            .isEqualTo(whatsappSyncStartHistorySyncResponse)
    }
}
