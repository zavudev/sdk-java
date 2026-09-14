// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions.gitlink

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GitLinkRetrieveResponseTest {

    @Test
    fun create() {
        val gitLinkRetrieveResponse =
            GitLinkRetrieveResponse.builder()
                .link(
                    GitLinkRetrieveResponse.Link.builder()
                        .id("id")
                        .autoDeploy(true)
                        .branch("main")
                        .connection(GitLinkRetrieveResponse.Link.Connection.APP)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .functionId("functionId")
                        .owner("acme")
                        .provider(GitLinkRetrieveResponse.Link.Provider.GITHUB)
                        .repo("order-bot")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastCommitMessage("lastCommitMessage")
                        .lastCommitSha("lastCommitSha")
                        .lastDeployAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastError("lastError")
                        .lastStatus(GitLinkRetrieveResponse.Link.LastStatus.DEPLOYING)
                        .rootDir("rootDir")
                        .build()
                )
                .webhookUrl("https://example.com")
                .webhookSecret("ghs_a1b2c3...")
                .build()

        assertThat(gitLinkRetrieveResponse.link())
            .isEqualTo(
                GitLinkRetrieveResponse.Link.builder()
                    .id("id")
                    .autoDeploy(true)
                    .branch("main")
                    .connection(GitLinkRetrieveResponse.Link.Connection.APP)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .functionId("functionId")
                    .owner("acme")
                    .provider(GitLinkRetrieveResponse.Link.Provider.GITHUB)
                    .repo("order-bot")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastCommitMessage("lastCommitMessage")
                    .lastCommitSha("lastCommitSha")
                    .lastDeployAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastError("lastError")
                    .lastStatus(GitLinkRetrieveResponse.Link.LastStatus.DEPLOYING)
                    .rootDir("rootDir")
                    .build()
            )
        assertThat(gitLinkRetrieveResponse.webhookUrl()).isEqualTo("https://example.com")
        assertThat(gitLinkRetrieveResponse.webhookSecret()).contains("ghs_a1b2c3...")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val gitLinkRetrieveResponse =
            GitLinkRetrieveResponse.builder()
                .link(
                    GitLinkRetrieveResponse.Link.builder()
                        .id("id")
                        .autoDeploy(true)
                        .branch("main")
                        .connection(GitLinkRetrieveResponse.Link.Connection.APP)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .functionId("functionId")
                        .owner("acme")
                        .provider(GitLinkRetrieveResponse.Link.Provider.GITHUB)
                        .repo("order-bot")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastCommitMessage("lastCommitMessage")
                        .lastCommitSha("lastCommitSha")
                        .lastDeployAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastError("lastError")
                        .lastStatus(GitLinkRetrieveResponse.Link.LastStatus.DEPLOYING)
                        .rootDir("rootDir")
                        .build()
                )
                .webhookUrl("https://example.com")
                .webhookSecret("ghs_a1b2c3...")
                .build()

        val roundtrippedGitLinkRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gitLinkRetrieveResponse),
                jacksonTypeRef<GitLinkRetrieveResponse>(),
            )

        assertThat(roundtrippedGitLinkRetrieveResponse).isEqualTo(gitLinkRetrieveResponse)
    }
}
