// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.emaildomains

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailDomainRetrieveParamsTest {

    @Test
    fun create() {
        EmailDomainRetrieveParams.builder().domainId("domainId").build()
    }

    @Test
    fun pathParams() {
        val params = EmailDomainRetrieveParams.builder().domainId("domainId").build()

        assertThat(params._pathParam(0)).isEqualTo("domainId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
