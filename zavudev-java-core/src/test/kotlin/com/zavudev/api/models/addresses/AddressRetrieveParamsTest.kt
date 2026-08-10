// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.addresses

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddressRetrieveParamsTest {

    @Test
    fun create() {
        AddressRetrieveParams.builder().addressId("addressId").build()
    }

    @Test
    fun pathParams() {
        val params = AddressRetrieveParams.builder().addressId("addressId").build()

        assertThat(params._pathParam(0)).isEqualTo("addressId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
