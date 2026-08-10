// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RequirementTypeTest {

    @Test
    fun create() {
        val requirementType =
            RequirementType.builder()
                .id("id")
                .description("description")
                .name("name")
                .type(RequirementFieldType.TEXTUAL)
                .acceptanceCriteria(
                    RequirementAcceptanceCriteria.builder()
                        .addAllowedValue("string")
                        .maxLength(0L)
                        .minLength(0L)
                        .regexPattern("regexPattern")
                        .build()
                )
                .example("example")
                .build()

        assertThat(requirementType.id()).isEqualTo("id")
        assertThat(requirementType.description()).isEqualTo("description")
        assertThat(requirementType.name()).isEqualTo("name")
        assertThat(requirementType.type()).isEqualTo(RequirementFieldType.TEXTUAL)
        assertThat(requirementType.acceptanceCriteria())
            .contains(
                RequirementAcceptanceCriteria.builder()
                    .addAllowedValue("string")
                    .maxLength(0L)
                    .minLength(0L)
                    .regexPattern("regexPattern")
                    .build()
            )
        assertThat(requirementType.example()).contains("example")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val requirementType =
            RequirementType.builder()
                .id("id")
                .description("description")
                .name("name")
                .type(RequirementFieldType.TEXTUAL)
                .acceptanceCriteria(
                    RequirementAcceptanceCriteria.builder()
                        .addAllowedValue("string")
                        .maxLength(0L)
                        .minLength(0L)
                        .regexPattern("regexPattern")
                        .build()
                )
                .example("example")
                .build()

        val roundtrippedRequirementType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(requirementType),
                jacksonTypeRef<RequirementType>(),
            )

        assertThat(roundtrippedRequirementType).isEqualTo(requirementType)
    }
}
