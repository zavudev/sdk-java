// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberRequirementsResponseTest {

    @Test
    fun create() {
        val phoneNumberRequirementsResponse =
            PhoneNumberRequirementsResponse.builder()
                .addItem(
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
                )
                .build()

        assertThat(phoneNumberRequirementsResponse.items())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberRequirementsResponse =
            PhoneNumberRequirementsResponse.builder()
                .addItem(
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
                )
                .build()

        val roundtrippedPhoneNumberRequirementsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberRequirementsResponse),
                jacksonTypeRef<PhoneNumberRequirementsResponse>(),
            )

        assertThat(roundtrippedPhoneNumberRequirementsResponse)
            .isEqualTo(phoneNumberRequirementsResponse)
    }
}
