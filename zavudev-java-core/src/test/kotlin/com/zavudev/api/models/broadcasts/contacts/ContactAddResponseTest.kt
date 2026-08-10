// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.broadcasts.contacts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactAddResponseTest {

    @Test
    fun create() {
        val contactAddResponse =
            ContactAddResponse.builder()
                .added(0L)
                .duplicates(0L)
                .invalid(0L)
                .addError(
                    ContactAddResponse.Error.builder()
                        .reason("reason")
                        .recipient("recipient")
                        .build()
                )
                .build()

        assertThat(contactAddResponse.added()).isEqualTo(0L)
        assertThat(contactAddResponse.duplicates()).isEqualTo(0L)
        assertThat(contactAddResponse.invalid()).isEqualTo(0L)
        assertThat(contactAddResponse.errors().getOrNull())
            .containsExactly(
                ContactAddResponse.Error.builder().reason("reason").recipient("recipient").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactAddResponse =
            ContactAddResponse.builder()
                .added(0L)
                .duplicates(0L)
                .invalid(0L)
                .addError(
                    ContactAddResponse.Error.builder()
                        .reason("reason")
                        .recipient("recipient")
                        .build()
                )
                .build()

        val roundtrippedContactAddResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactAddResponse),
                jacksonTypeRef<ContactAddResponse>(),
            )

        assertThat(roundtrippedContactAddResponse).isEqualTo(contactAddResponse)
    }
}
