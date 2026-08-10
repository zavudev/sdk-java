// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.whatsappsync

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsAppSyncContactsTest {

    @Test
    fun create() {
        val whatsAppSyncContacts =
            WhatsAppSyncContacts.builder()
                .canSync(true)
                .status(WhatsAppSyncContacts.Status.NOT_REQUESTED)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(whatsAppSyncContacts.canSync()).isEqualTo(true)
        assertThat(whatsAppSyncContacts.status())
            .isEqualTo(WhatsAppSyncContacts.Status.NOT_REQUESTED)
        assertThat(whatsAppSyncContacts.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsAppSyncContacts =
            WhatsAppSyncContacts.builder()
                .canSync(true)
                .status(WhatsAppSyncContacts.Status.NOT_REQUESTED)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedWhatsAppSyncContacts =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsAppSyncContacts),
                jacksonTypeRef<WhatsAppSyncContacts>(),
            )

        assertThat(roundtrippedWhatsAppSyncContacts).isEqualTo(whatsAppSyncContacts)
    }
}
