// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.urls

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UrlEscalateParamsTest {

    @Test
    fun create() {
        UrlEscalateParams.builder()
            .urlId("urlId")
            .reason("This is our official landing page and was rejected in error.")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            UrlEscalateParams.builder()
                .urlId("urlId")
                .reason("This is our official landing page and was rejected in error.")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("urlId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            UrlEscalateParams.builder()
                .urlId("urlId")
                .reason("This is our official landing page and was rejected in error.")
                .build()

        val body = params._body()

        assertThat(body.reason())
            .isEqualTo("This is our official landing page and was rejected in error.")
    }
}
