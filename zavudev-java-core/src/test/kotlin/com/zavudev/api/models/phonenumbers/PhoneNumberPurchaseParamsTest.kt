// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.phonenumbers

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberPurchaseParamsTest {

    @Test
    fun create() {
        PhoneNumberPurchaseParams.builder()
            .phoneNumber("+15551234567")
            .name("Primary Line")
            .addRegulatoryRequirement(
                PhoneNumberPurchaseParams.RegulatoryRequirement.builder()
                    .fieldValue("jd7x2k3m4n5p6q7r8s9t0abc")
                    .requirementType("8c5b1a2e-0f3d-4f5b-9a61-2c7e4d9b1f10")
                    .build()
            )
            .type(PhoneNumberType.LOCAL)
            .build()
    }

    @Test
    fun body() {
        val params =
            PhoneNumberPurchaseParams.builder()
                .phoneNumber("+15551234567")
                .name("Primary Line")
                .addRegulatoryRequirement(
                    PhoneNumberPurchaseParams.RegulatoryRequirement.builder()
                        .fieldValue("jd7x2k3m4n5p6q7r8s9t0abc")
                        .requirementType("8c5b1a2e-0f3d-4f5b-9a61-2c7e4d9b1f10")
                        .build()
                )
                .type(PhoneNumberType.LOCAL)
                .build()

        val body = params._body()

        assertThat(body.phoneNumber()).isEqualTo("+15551234567")
        assertThat(body.name()).contains("Primary Line")
        assertThat(body.regulatoryRequirements().getOrNull())
            .containsExactly(
                PhoneNumberPurchaseParams.RegulatoryRequirement.builder()
                    .fieldValue("jd7x2k3m4n5p6q7r8s9t0abc")
                    .requirementType("8c5b1a2e-0f3d-4f5b-9a61-2c7e4d9b1f10")
                    .build()
            )
        assertThat(body.type()).contains(PhoneNumberType.LOCAL)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PhoneNumberPurchaseParams.builder().phoneNumber("+15551234567").build()

        val body = params._body()

        assertThat(body.phoneNumber()).isEqualTo("+15551234567")
    }
}
