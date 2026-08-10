// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.me

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeRetrieveResponseTest {

    @Test
    fun create() {
        val meRetrieveResponse =
            MeRetrieveResponse.builder()
                .apiKey(MeRetrieveResponse.ApiKey.builder().id("id").build())
                .isTestMode(true)
                .project(
                    MeRetrieveResponse.Project.builder()
                        .id("id")
                        .isSubAccount(true)
                        .name("name")
                        .build()
                )
                .team(MeRetrieveResponse.Team.builder().id("id").name("name").build())
                .build()

        assertThat(meRetrieveResponse.apiKey())
            .isEqualTo(MeRetrieveResponse.ApiKey.builder().id("id").build())
        assertThat(meRetrieveResponse.isTestMode()).isEqualTo(true)
        assertThat(meRetrieveResponse.project())
            .isEqualTo(
                MeRetrieveResponse.Project.builder()
                    .id("id")
                    .isSubAccount(true)
                    .name("name")
                    .build()
            )
        assertThat(meRetrieveResponse.team())
            .isEqualTo(MeRetrieveResponse.Team.builder().id("id").name("name").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meRetrieveResponse =
            MeRetrieveResponse.builder()
                .apiKey(MeRetrieveResponse.ApiKey.builder().id("id").build())
                .isTestMode(true)
                .project(
                    MeRetrieveResponse.Project.builder()
                        .id("id")
                        .isSubAccount(true)
                        .name("name")
                        .build()
                )
                .team(MeRetrieveResponse.Team.builder().id("id").name("name").build())
                .build()

        val roundtrippedMeRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(meRetrieveResponse),
                jacksonTypeRef<MeRetrieveResponse>(),
            )

        assertThat(roundtrippedMeRetrieveResponse).isEqualTo(meRetrieveResponse)
    }
}
