// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions.gitlink

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GitLinkDeployNowResponseTest {

    @Test
    fun create() {
        val gitLinkDeployNowResponse = GitLinkDeployNowResponse.builder().scheduled(true).build()

        assertThat(gitLinkDeployNowResponse.scheduled()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val gitLinkDeployNowResponse = GitLinkDeployNowResponse.builder().scheduled(true).build()

        val roundtrippedGitLinkDeployNowResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gitLinkDeployNowResponse),
                jacksonTypeRef<GitLinkDeployNowResponse>(),
            )

        assertThat(roundtrippedGitLinkDeployNowResponse).isEqualTo(gitLinkDeployNowResponse)
    }
}
