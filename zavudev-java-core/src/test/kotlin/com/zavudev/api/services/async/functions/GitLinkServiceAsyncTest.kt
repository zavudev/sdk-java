// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.functions

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import com.zavudev.api.models.functions.gitlink.GitLinkLinkParams
import com.zavudev.api.models.functions.gitlink.GitLinkUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GitLinkServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val gitLinkServiceAsync = client.functions().gitLink()

        val gitLinkFuture = gitLinkServiceAsync.retrieve("functionId")

        val gitLink = gitLinkFuture.get()
        gitLink.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val gitLinkServiceAsync = client.functions().gitLink()

        val gitLinkFuture =
            gitLinkServiceAsync.update(
                GitLinkUpdateParams.builder()
                    .functionId("functionId")
                    .autoDeploy(false)
                    .branch("branch")
                    .rootDir("rootDir")
                    .build()
            )

        val gitLink = gitLinkFuture.get()
        gitLink.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deployNow() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val gitLinkServiceAsync = client.functions().gitLink()

        val responseFuture = gitLinkServiceAsync.deployNow("functionId")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun link() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val gitLinkServiceAsync = client.functions().gitLink()

        val responseFuture =
            gitLinkServiceAsync.link(
                GitLinkLinkParams.builder()
                    .functionId("functionId")
                    .owner("acme")
                    .repo("order-bot")
                    .autoDeploy(true)
                    .branch("main")
                    .rootDir("apps/bot")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun unlink() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val gitLinkServiceAsync = client.functions().gitLink()

        val future = gitLinkServiceAsync.unlink("functionId")

        val response = future.get()
    }
}
