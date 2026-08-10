// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SenderUpdateProfileResponseTest {

    @Test
    fun create() {
        val senderUpdateProfileResponse =
            SenderUpdateProfileResponse.builder()
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
                .success(true)
                .build()

        assertThat(senderUpdateProfileResponse.profile())
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
        assertThat(senderUpdateProfileResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val senderUpdateProfileResponse =
            SenderUpdateProfileResponse.builder()
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
                .success(true)
                .build()

        val roundtrippedSenderUpdateProfileResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(senderUpdateProfileResponse),
                jacksonTypeRef<SenderUpdateProfileResponse>(),
            )

        assertThat(roundtrippedSenderUpdateProfileResponse).isEqualTo(senderUpdateProfileResponse)
    }
}
