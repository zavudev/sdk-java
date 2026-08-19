// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.templates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateSyncResponseTest {

    @Test
    fun create() {
        val templateSyncResponse =
            TemplateSyncResponse.builder()
                .accountsSynced(0L)
                .addError("string")
                .imported(0L)
                .linked(0L)
                .skipped(0L)
                .updated(0L)
                .build()

        assertThat(templateSyncResponse.accountsSynced()).isEqualTo(0L)
        assertThat(templateSyncResponse.errors()).containsExactly("string")
        assertThat(templateSyncResponse.imported()).isEqualTo(0L)
        assertThat(templateSyncResponse.linked()).isEqualTo(0L)
        assertThat(templateSyncResponse.skipped()).isEqualTo(0L)
        assertThat(templateSyncResponse.updated()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val templateSyncResponse =
            TemplateSyncResponse.builder()
                .accountsSynced(0L)
                .addError("string")
                .imported(0L)
                .linked(0L)
                .skipped(0L)
                .updated(0L)
                .build()

        val roundtrippedTemplateSyncResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(templateSyncResponse),
                jacksonTypeRef<TemplateSyncResponse>(),
            )

        assertThat(roundtrippedTemplateSyncResponse).isEqualTo(templateSyncResponse)
    }
}
