// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.urls

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UrlSubmitForVerificationParamsTest {

    @Test
    fun create() {
        UrlSubmitForVerificationParams.builder().url("https://example.com/page").build()
    }

    @Test
    fun body() {
        val params =
            UrlSubmitForVerificationParams.builder().url("https://example.com/page").build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("https://example.com/page")
    }
}
