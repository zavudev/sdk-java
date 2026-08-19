// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.templates

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateSyncParamsTest {

    @Test
    fun create() {
        TemplateSyncParams.builder().senderId("sender_12345").build()
    }

    @Test
    fun body() {
        val params = TemplateSyncParams.builder().senderId("sender_12345").build()

        val body = params._body()

        assertThat(body.senderId()).contains("sender_12345")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TemplateSyncParams.builder().build()

        val body = params._body()
    }
}
