// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.introspect

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntrospectValidatePhoneResponseTest {

    @Test
    fun create() {
        val introspectValidatePhoneResponse =
            IntrospectValidatePhoneResponse.builder()
                .countryCode("CL")
                .phoneNumber("phoneNumber")
                .validNumber(true)
                .addAvailableChannel("string")
                .carrier(
                    IntrospectValidatePhoneResponse.Carrier.builder()
                        .name("Verizon Wireless")
                        .type(LineType.MOBILE)
                        .build()
                )
                .lineType(LineType.MOBILE)
                .nationalFormat("(312) 945-7420")
                .build()

        assertThat(introspectValidatePhoneResponse.countryCode()).isEqualTo("CL")
        assertThat(introspectValidatePhoneResponse.phoneNumber()).isEqualTo("phoneNumber")
        assertThat(introspectValidatePhoneResponse.validNumber()).isEqualTo(true)
        assertThat(introspectValidatePhoneResponse.availableChannels().getOrNull())
            .containsExactly("string")
        assertThat(introspectValidatePhoneResponse.carrier())
            .contains(
                IntrospectValidatePhoneResponse.Carrier.builder()
                    .name("Verizon Wireless")
                    .type(LineType.MOBILE)
                    .build()
            )
        assertThat(introspectValidatePhoneResponse.lineType()).contains(LineType.MOBILE)
        assertThat(introspectValidatePhoneResponse.nationalFormat()).contains("(312) 945-7420")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val introspectValidatePhoneResponse =
            IntrospectValidatePhoneResponse.builder()
                .countryCode("CL")
                .phoneNumber("phoneNumber")
                .validNumber(true)
                .addAvailableChannel("string")
                .carrier(
                    IntrospectValidatePhoneResponse.Carrier.builder()
                        .name("Verizon Wireless")
                        .type(LineType.MOBILE)
                        .build()
                )
                .lineType(LineType.MOBILE)
                .nationalFormat("(312) 945-7420")
                .build()

        val roundtrippedIntrospectValidatePhoneResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(introspectValidatePhoneResponse),
                jacksonTypeRef<IntrospectValidatePhoneResponse>(),
            )

        assertThat(roundtrippedIntrospectValidatePhoneResponse)
            .isEqualTo(introspectValidatePhoneResponse)
    }
}
