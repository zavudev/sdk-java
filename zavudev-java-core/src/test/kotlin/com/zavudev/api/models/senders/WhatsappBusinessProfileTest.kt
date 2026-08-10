// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappBusinessProfileTest {

    @Test
    fun create() {
        val whatsappBusinessProfile =
            WhatsappBusinessProfile.builder()
                .about("Succulent specialists!")
                .address("1 Hacker Way, Menlo Park, CA 94025")
                .description(
                    "At Lucky Shrub, we specialize in providing a diverse range of high-quality succulents."
                )
                .email("contact@example.com")
                .profilePictureUrl("https://pps.whatsapp.net/v/t61.24...")
                .vertical(WhatsappBusinessProfileVertical.UNDEFINED)
                .addWebsite("https://www.example.com/")
                .build()

        assertThat(whatsappBusinessProfile.about()).contains("Succulent specialists!")
        assertThat(whatsappBusinessProfile.address()).contains("1 Hacker Way, Menlo Park, CA 94025")
        assertThat(whatsappBusinessProfile.description())
            .contains(
                "At Lucky Shrub, we specialize in providing a diverse range of high-quality succulents."
            )
        assertThat(whatsappBusinessProfile.email()).contains("contact@example.com")
        assertThat(whatsappBusinessProfile.profilePictureUrl())
            .contains("https://pps.whatsapp.net/v/t61.24...")
        assertThat(whatsappBusinessProfile.vertical())
            .contains(WhatsappBusinessProfileVertical.UNDEFINED)
        assertThat(whatsappBusinessProfile.websites().getOrNull())
            .containsExactly("https://www.example.com/")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsappBusinessProfile =
            WhatsappBusinessProfile.builder()
                .about("Succulent specialists!")
                .address("1 Hacker Way, Menlo Park, CA 94025")
                .description(
                    "At Lucky Shrub, we specialize in providing a diverse range of high-quality succulents."
                )
                .email("contact@example.com")
                .profilePictureUrl("https://pps.whatsapp.net/v/t61.24...")
                .vertical(WhatsappBusinessProfileVertical.UNDEFINED)
                .addWebsite("https://www.example.com/")
                .build()

        val roundtrippedWhatsappBusinessProfile =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappBusinessProfile),
                jacksonTypeRef<WhatsappBusinessProfile>(),
            )

        assertThat(roundtrippedWhatsappBusinessProfile).isEqualTo(whatsappBusinessProfile)
    }
}
