// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RequirementTest {

    @Test
    fun create() {
        val requirement =
            Requirement.builder()
                .id("id")
                .action("ordering")
                .countryCode("DE")
                .phoneNumberType("local")
                .addRequirementType(
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
                )
                .build()

        assertThat(requirement.id()).isEqualTo("id")
        assertThat(requirement.action()).isEqualTo("ordering")
        assertThat(requirement.countryCode()).isEqualTo("DE")
        assertThat(requirement.phoneNumberType()).isEqualTo("local")
        assertThat(requirement.requirementTypes())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val requirement =
            Requirement.builder()
                .id("id")
                .action("ordering")
                .countryCode("DE")
                .phoneNumberType("local")
                .addRequirementType(
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
                )
                .build()

        val roundtrippedRequirement =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(requirement),
                jacksonTypeRef<Requirement>(),
            )

        assertThat(roundtrippedRequirement).isEqualTo(requirement)
    }
}
