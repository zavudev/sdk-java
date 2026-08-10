// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SenderUploadProfilePictureResponseTest {

    @Test
    fun create() {
        val senderUploadProfilePictureResponse =
            SenderUploadProfilePictureResponse.builder()
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

        assertThat(senderUploadProfilePictureResponse.profile())
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
        assertThat(senderUploadProfilePictureResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val senderUploadProfilePictureResponse =
            SenderUploadProfilePictureResponse.builder()
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

        val roundtrippedSenderUploadProfilePictureResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(senderUploadProfilePictureResponse),
                jacksonTypeRef<SenderUploadProfilePictureResponse>(),
            )

        assertThat(roundtrippedSenderUploadProfilePictureResponse)
            .isEqualTo(senderUploadProfilePictureResponse)
    }
}
