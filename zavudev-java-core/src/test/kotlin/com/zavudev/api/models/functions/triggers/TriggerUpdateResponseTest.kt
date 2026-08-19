// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions.triggers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TriggerUpdateResponseTest {

    @Test
    fun create() {
        val triggerUpdateResponse = TriggerUpdateResponse.builder().active(true).ok(true).build()

        assertThat(triggerUpdateResponse.active()).isEqualTo(true)
        assertThat(triggerUpdateResponse.ok()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val triggerUpdateResponse = TriggerUpdateResponse.builder().active(true).ok(true).build()

        val roundtrippedTriggerUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(triggerUpdateResponse),
                jacksonTypeRef<TriggerUpdateResponse>(),
            )

        assertThat(roundtrippedTriggerUpdateResponse).isEqualTo(triggerUpdateResponse)
    }
}
