// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions.gitlink

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GitLinkUnlinkParamsTest {

    @Test
    fun create() {
        GitLinkUnlinkParams.builder().functionId("functionId").build()
    }

    @Test
    fun pathParams() {
        val params = GitLinkUnlinkParams.builder().functionId("functionId").build()

        assertThat(params._pathParam(0)).isEqualTo("functionId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
