// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.subaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubAccountRetrieveResponseTest {

    @Test
    fun create() {
        val subAccountRetrieveResponse =
            SubAccountRetrieveResponse.builder()
                .subAccount(
                    SubAccount.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("Client ABC")
                        .status(SubAccount.Status.ACTIVE)
                        .totalSpent(0L)
                        .apiKey("apiKey")
                        .creditLimit(0L)
                        .externalId("externalId")
                        .metadata(
                            SubAccount.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(subAccountRetrieveResponse.subAccount())
            .isEqualTo(
                SubAccount.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("Client ABC")
                    .status(SubAccount.Status.ACTIVE)
                    .totalSpent(0L)
                    .apiKey("apiKey")
                    .creditLimit(0L)
                    .externalId("externalId")
                    .metadata(
                        SubAccount.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subAccountRetrieveResponse =
            SubAccountRetrieveResponse.builder()
                .subAccount(
                    SubAccount.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("Client ABC")
                        .status(SubAccount.Status.ACTIVE)
                        .totalSpent(0L)
                        .apiKey("apiKey")
                        .creditLimit(0L)
                        .externalId("externalId")
                        .metadata(
                            SubAccount.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedSubAccountRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subAccountRetrieveResponse),
                jacksonTypeRef<SubAccountRetrieveResponse>(),
            )

        assertThat(roundtrippedSubAccountRetrieveResponse).isEqualTo(subAccountRetrieveResponse)
    }
}
