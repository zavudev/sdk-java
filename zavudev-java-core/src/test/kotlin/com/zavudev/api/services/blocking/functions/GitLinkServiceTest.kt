// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.functions

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.models.functions.gitlink.GitLinkLinkParams
import com.zavudev.api.models.functions.gitlink.GitLinkUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GitLinkServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val gitLinkService = client.functions().gitLink()

        val gitLink = gitLinkService.retrieve("functionId")

        gitLink.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val gitLinkService = client.functions().gitLink()

        val gitLink =
            gitLinkService.update(
                GitLinkUpdateParams.builder()
                    .functionId("functionId")
                    .autoDeploy(false)
                    .branch("branch")
                    .rootDir("rootDir")
                    .build()
            )

        gitLink.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deployNow() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val gitLinkService = client.functions().gitLink()

        val response = gitLinkService.deployNow("functionId")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun link() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val gitLinkService = client.functions().gitLink()

        val response =
            gitLinkService.link(
                GitLinkLinkParams.builder()
                    .functionId("functionId")
                    .owner("acme")
                    .repo("order-bot")
                    .autoDeploy(true)
                    .branch("main")
                    .rootDir("apps/bot")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun unlink() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val gitLinkService = client.functions().gitLink()

        gitLinkService.unlink("functionId")
    }
}
