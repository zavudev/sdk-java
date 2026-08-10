// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.contacts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactRetrieveParamsTest {

    @Test
    fun create() {
        ContactRetrieveParams.builder().contactId("contactId").build()
    }

    @Test
    fun pathParams() {
        val params = ContactRetrieveParams.builder().contactId("contactId").build()

        assertThat(params._pathParam(0)).isEqualTo("contactId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
