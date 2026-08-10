// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.number10dlc.brands

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandListUseCasesResponseTest {

    @Test
    fun create() {
        val brandListUseCasesResponse =
            BrandListUseCasesResponse.builder()
                .addUseCase(
                    BrandListUseCasesResponse.UseCase.builder()
                        .description("description")
                        .name("name")
                        .build()
                )
                .build()

        assertThat(brandListUseCasesResponse.useCases())
            .containsExactly(
                BrandListUseCasesResponse.UseCase.builder()
                    .description("description")
                    .name("name")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandListUseCasesResponse =
            BrandListUseCasesResponse.builder()
                .addUseCase(
                    BrandListUseCasesResponse.UseCase.builder()
                        .description("description")
                        .name("name")
                        .build()
                )
                .build()

        val roundtrippedBrandListUseCasesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandListUseCasesResponse),
                jacksonTypeRef<BrandListUseCasesResponse>(),
            )

        assertThat(roundtrippedBrandListUseCasesResponse).isEqualTo(brandListUseCasesResponse)
    }
}
