// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.urls

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UrlRetrieveDetailsParamsTest {

    @Test
    fun create() {
        UrlRetrieveDetailsParams.builder().urlId("urlId").build()
    }

    @Test
    fun pathParams() {
        val params = UrlRetrieveDetailsParams.builder().urlId("urlId").build()

        assertThat(params._pathParam(0)).isEqualTo("urlId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
