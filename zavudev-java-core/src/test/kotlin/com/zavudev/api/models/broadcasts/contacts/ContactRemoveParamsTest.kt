// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.broadcasts.contacts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactRemoveParamsTest {

    @Test
    fun create() {
        ContactRemoveParams.builder().broadcastId("broadcastId").contactId("contactId").build()
    }

    @Test
    fun pathParams() {
        val params =
            ContactRemoveParams.builder().broadcastId("broadcastId").contactId("contactId").build()

        assertThat(params._pathParam(0)).isEqualTo("broadcastId")
        assertThat(params._pathParam(1)).isEqualTo("contactId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
