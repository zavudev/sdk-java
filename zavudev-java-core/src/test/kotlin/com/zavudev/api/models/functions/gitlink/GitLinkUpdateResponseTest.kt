// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions.gitlink

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GitLinkUpdateResponseTest {

    @Test
    fun create() {
        val gitLinkUpdateResponse =
            GitLinkUpdateResponse.builder()
                .link(
                    GitLinkUpdateResponse.Link.builder()
                        .id("id")
                        .autoDeploy(true)
                        .branch("main")
                        .connection(GitLinkUpdateResponse.Link.Connection.APP)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .functionId("functionId")
                        .owner("acme")
                        .provider(GitLinkUpdateResponse.Link.Provider.GITHUB)
                        .repo("order-bot")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastCommitMessage("lastCommitMessage")
                        .lastCommitSha("lastCommitSha")
                        .lastDeployAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastError("lastError")
                        .lastStatus(GitLinkUpdateResponse.Link.LastStatus.DEPLOYING)
                        .rootDir("rootDir")
                        .build()
                )
                .webhookUrl("https://example.com")
                .webhookSecret("ghs_a1b2c3...")
                .build()

        assertThat(gitLinkUpdateResponse.link())
            .isEqualTo(
                GitLinkUpdateResponse.Link.builder()
                    .id("id")
                    .autoDeploy(true)
                    .branch("main")
                    .connection(GitLinkUpdateResponse.Link.Connection.APP)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .functionId("functionId")
                    .owner("acme")
                    .provider(GitLinkUpdateResponse.Link.Provider.GITHUB)
                    .repo("order-bot")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastCommitMessage("lastCommitMessage")
                    .lastCommitSha("lastCommitSha")
                    .lastDeployAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastError("lastError")
                    .lastStatus(GitLinkUpdateResponse.Link.LastStatus.DEPLOYING)
                    .rootDir("rootDir")
                    .build()
            )
        assertThat(gitLinkUpdateResponse.webhookUrl()).isEqualTo("https://example.com")
        assertThat(gitLinkUpdateResponse.webhookSecret()).contains("ghs_a1b2c3...")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val gitLinkUpdateResponse =
            GitLinkUpdateResponse.builder()
                .link(
                    GitLinkUpdateResponse.Link.builder()
                        .id("id")
                        .autoDeploy(true)
                        .branch("main")
                        .connection(GitLinkUpdateResponse.Link.Connection.APP)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .functionId("functionId")
                        .owner("acme")
                        .provider(GitLinkUpdateResponse.Link.Provider.GITHUB)
                        .repo("order-bot")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastCommitMessage("lastCommitMessage")
                        .lastCommitSha("lastCommitSha")
                        .lastDeployAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastError("lastError")
                        .lastStatus(GitLinkUpdateResponse.Link.LastStatus.DEPLOYING)
                        .rootDir("rootDir")
                        .build()
                )
                .webhookUrl("https://example.com")
                .webhookSecret("ghs_a1b2c3...")
                .build()

        val roundtrippedGitLinkUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gitLinkUpdateResponse),
                jacksonTypeRef<GitLinkUpdateResponse>(),
            )

        assertThat(roundtrippedGitLinkUpdateResponse).isEqualTo(gitLinkUpdateResponse)
    }
}
