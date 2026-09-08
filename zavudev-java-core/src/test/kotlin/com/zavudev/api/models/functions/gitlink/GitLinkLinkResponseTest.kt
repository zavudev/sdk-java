// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions.gitlink

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GitLinkLinkResponseTest {

    @Test
    fun create() {
        val gitLinkLinkResponse =
            GitLinkLinkResponse.builder()
                .link(
                    GitLinkLinkResponse.Link.builder()
                        .id("id")
                        .autoDeploy(true)
                        .branch("main")
                        .connection(GitLinkLinkResponse.Link.Connection.APP)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .functionId("functionId")
                        .owner("acme")
                        .provider(GitLinkLinkResponse.Link.Provider.GITHUB)
                        .repo("order-bot")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastCommitMessage("lastCommitMessage")
                        .lastCommitSha("lastCommitSha")
                        .lastDeployAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastError("lastError")
                        .lastStatus(GitLinkLinkResponse.Link.LastStatus.DEPLOYING)
                        .rootDir("rootDir")
                        .build()
                )
                .webhookUrl("https://example.com")
                .webhookSecret("ghs_a1b2c3...")
                .build()

        assertThat(gitLinkLinkResponse.link())
            .isEqualTo(
                GitLinkLinkResponse.Link.builder()
                    .id("id")
                    .autoDeploy(true)
                    .branch("main")
                    .connection(GitLinkLinkResponse.Link.Connection.APP)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .functionId("functionId")
                    .owner("acme")
                    .provider(GitLinkLinkResponse.Link.Provider.GITHUB)
                    .repo("order-bot")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastCommitMessage("lastCommitMessage")
                    .lastCommitSha("lastCommitSha")
                    .lastDeployAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastError("lastError")
                    .lastStatus(GitLinkLinkResponse.Link.LastStatus.DEPLOYING)
                    .rootDir("rootDir")
                    .build()
            )
        assertThat(gitLinkLinkResponse.webhookUrl()).isEqualTo("https://example.com")
        assertThat(gitLinkLinkResponse.webhookSecret()).contains("ghs_a1b2c3...")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val gitLinkLinkResponse =
            GitLinkLinkResponse.builder()
                .link(
                    GitLinkLinkResponse.Link.builder()
                        .id("id")
                        .autoDeploy(true)
                        .branch("main")
                        .connection(GitLinkLinkResponse.Link.Connection.APP)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .functionId("functionId")
                        .owner("acme")
                        .provider(GitLinkLinkResponse.Link.Provider.GITHUB)
                        .repo("order-bot")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastCommitMessage("lastCommitMessage")
                        .lastCommitSha("lastCommitSha")
                        .lastDeployAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastError("lastError")
                        .lastStatus(GitLinkLinkResponse.Link.LastStatus.DEPLOYING)
                        .rootDir("rootDir")
                        .build()
                )
                .webhookUrl("https://example.com")
                .webhookSecret("ghs_a1b2c3...")
                .build()

        val roundtrippedGitLinkLinkResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gitLinkLinkResponse),
                jacksonTypeRef<GitLinkLinkResponse>(),
            )

        assertThat(roundtrippedGitLinkLinkResponse).isEqualTo(gitLinkLinkResponse)
    }
}
