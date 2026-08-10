// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.number10dlc.brands

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandSubmitParamsTest {

    @Test
    fun create() {
        BrandSubmitParams.builder().brandId("brandId").build()
    }

    @Test
    fun pathParams() {
        val params = BrandSubmitParams.builder().brandId("brandId").build()

        assertThat(params._pathParam(0)).isEqualTo("brandId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
