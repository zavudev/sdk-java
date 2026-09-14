// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions.gitlink

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GitLinkLinkParamsTest {

    @Test
    fun create() {
        GitLinkLinkParams.builder()
            .functionId("functionId")
            .owner("acme")
            .repo("order-bot")
            .autoDeploy(true)
            .branch("main")
            .rootDir("apps/bot")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            GitLinkLinkParams.builder()
                .functionId("functionId")
                .owner("acme")
                .repo("order-bot")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("functionId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            GitLinkLinkParams.builder()
                .functionId("functionId")
                .owner("acme")
                .repo("order-bot")
                .autoDeploy(true)
                .branch("main")
                .rootDir("apps/bot")
                .build()

        val body = params._body()

        assertThat(body.owner()).isEqualTo("acme")
        assertThat(body.repo()).isEqualTo("order-bot")
        assertThat(body.autoDeploy()).contains(true)
        assertThat(body.branch()).contains("main")
        assertThat(body.rootDir()).contains("apps/bot")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            GitLinkLinkParams.builder()
                .functionId("functionId")
                .owner("acme")
                .repo("order-bot")
                .build()

        val body = params._body()

        assertThat(body.owner()).isEqualTo("acme")
        assertThat(body.repo()).isEqualTo("order-bot")
    }
}
