// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.regulatorydocuments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RegulatoryDocumentDeleteParamsTest {

    @Test
    fun create() {
        RegulatoryDocumentDeleteParams.builder().documentId("documentId").build()
    }

    @Test
    fun pathParams() {
        val params = RegulatoryDocumentDeleteParams.builder().documentId("documentId").build()

        assertThat(params._pathParam(0)).isEqualTo("documentId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
