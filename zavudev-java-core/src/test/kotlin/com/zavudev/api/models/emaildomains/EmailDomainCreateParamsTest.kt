// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.emaildomains

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailDomainCreateParamsTest {

    @Test
    fun create() {
        EmailDomainCreateParams.builder().domain("example.com").build()
    }

    @Test
    fun body() {
        val params = EmailDomainCreateParams.builder().domain("example.com").build()

        val body = params._body()

        assertThat(body.domain()).isEqualTo("example.com")
    }
}
