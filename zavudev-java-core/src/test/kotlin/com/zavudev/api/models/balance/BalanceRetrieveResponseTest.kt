// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.balance

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceRetrieveResponseTest {

    @Test
    fun create() {
        val balanceRetrieveResponse =
            BalanceRetrieveResponse.builder()
                .balance(0L)
                .currency("usd")
                .creditLimit(0L)
                .isSubAccount(true)
                .totalSpent(0L)
                .build()

        assertThat(balanceRetrieveResponse.balance()).isEqualTo(0L)
        assertThat(balanceRetrieveResponse.currency()).isEqualTo("usd")
        assertThat(balanceRetrieveResponse.creditLimit()).contains(0L)
        assertThat(balanceRetrieveResponse.isSubAccount()).contains(true)
        assertThat(balanceRetrieveResponse.totalSpent()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val balanceRetrieveResponse =
            BalanceRetrieveResponse.builder()
                .balance(0L)
                .currency("usd")
                .creditLimit(0L)
                .isSubAccount(true)
                .totalSpent(0L)
                .build()

        val roundtrippedBalanceRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(balanceRetrieveResponse),
                jacksonTypeRef<BalanceRetrieveResponse>(),
            )

        assertThat(roundtrippedBalanceRetrieveResponse).isEqualTo(balanceRetrieveResponse)
    }
}
