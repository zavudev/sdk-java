// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberCapabilitiesTest {

    @Test
    fun create() {
        val phoneNumberCapabilities =
            PhoneNumberCapabilities.builder().mms(true).sms(true).voice(true).build()

        assertThat(phoneNumberCapabilities.mms()).contains(true)
        assertThat(phoneNumberCapabilities.sms()).contains(true)
        assertThat(phoneNumberCapabilities.voice()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberCapabilities =
            PhoneNumberCapabilities.builder().mms(true).sms(true).voice(true).build()

        val roundtrippedPhoneNumberCapabilities =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberCapabilities),
                jacksonTypeRef<PhoneNumberCapabilities>(),
            )

        assertThat(roundtrippedPhoneNumberCapabilities).isEqualTo(phoneNumberCapabilities)
    }
}
