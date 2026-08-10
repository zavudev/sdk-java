// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappBusinessProfileResponseTest {

    @Test
    fun create() {
        val whatsappBusinessProfileResponse =
            WhatsappBusinessProfileResponse.builder()
                .profile(
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
                )
                .build()

        assertThat(whatsappBusinessProfileResponse.profile())
            .isEqualTo(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsappBusinessProfileResponse =
            WhatsappBusinessProfileResponse.builder()
                .profile(
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
                )
                .build()

        val roundtrippedWhatsappBusinessProfileResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappBusinessProfileResponse),
                jacksonTypeRef<WhatsappBusinessProfileResponse>(),
            )

        assertThat(roundtrippedWhatsappBusinessProfileResponse)
            .isEqualTo(whatsappBusinessProfileResponse)
    }
}
