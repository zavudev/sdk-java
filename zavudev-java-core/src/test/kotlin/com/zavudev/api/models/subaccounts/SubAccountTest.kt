// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.subaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubAccountTest {

    @Test
    fun create() {
        val subAccount =
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

        assertThat(subAccount.id()).isEqualTo("id")
        assertThat(subAccount.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subAccount.name()).isEqualTo("Client ABC")
        assertThat(subAccount.status()).isEqualTo(SubAccount.Status.ACTIVE)
        assertThat(subAccount.totalSpent()).isEqualTo(0L)
        assertThat(subAccount.apiKey()).contains("apiKey")
        assertThat(subAccount.creditLimit()).contains(0L)
        assertThat(subAccount.externalId()).contains("externalId")
        assertThat(subAccount.metadata())
            .contains(
                SubAccount.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subAccount =
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

        val roundtrippedSubAccount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subAccount),
                jacksonTypeRef<SubAccount>(),
            )

        assertThat(roundtrippedSubAccount).isEqualTo(subAccount)
    }
}
