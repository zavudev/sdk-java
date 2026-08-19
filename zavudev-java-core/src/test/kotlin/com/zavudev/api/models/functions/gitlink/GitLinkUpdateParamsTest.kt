// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions.gitlink

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GitLinkUpdateParamsTest {

    @Test
    fun create() {
        GitLinkUpdateParams.builder()
            .functionId("functionId")
            .autoDeploy(false)
            .branch("branch")
            .rootDir("rootDir")
            .build()
    }

    @Test
    fun pathParams() {
        val params = GitLinkUpdateParams.builder().functionId("functionId").build()

        assertThat(params._pathParam(0)).isEqualTo("functionId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            GitLinkUpdateParams.builder()
                .functionId("functionId")
                .autoDeploy(false)
                .branch("branch")
                .rootDir("rootDir")
                .build()

        val body = params._body()

        assertThat(body.autoDeploy()).contains(false)
        assertThat(body.branch()).contains("branch")
        assertThat(body.rootDir()).contains("rootDir")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = GitLinkUpdateParams.builder().functionId("functionId").build()

        val body = params._body()
    }
}
