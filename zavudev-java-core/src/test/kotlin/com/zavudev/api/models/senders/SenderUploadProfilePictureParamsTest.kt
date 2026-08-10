// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SenderUploadProfilePictureParamsTest {

    @Test
    fun create() {
        SenderUploadProfilePictureParams.builder()
            .senderId("senderId")
            .imageUrl("https://example.com/profile.jpg")
            .mimeType(SenderUploadProfilePictureParams.MimeType.IMAGE_JPEG)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SenderUploadProfilePictureParams.builder()
                .senderId("senderId")
                .imageUrl("https://example.com/profile.jpg")
                .mimeType(SenderUploadProfilePictureParams.MimeType.IMAGE_JPEG)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("senderId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SenderUploadProfilePictureParams.builder()
                .senderId("senderId")
                .imageUrl("https://example.com/profile.jpg")
                .mimeType(SenderUploadProfilePictureParams.MimeType.IMAGE_JPEG)
                .build()

        val body = params._body()

        assertThat(body.imageUrl()).isEqualTo("https://example.com/profile.jpg")
        assertThat(body.mimeType()).isEqualTo(SenderUploadProfilePictureParams.MimeType.IMAGE_JPEG)
    }
}
