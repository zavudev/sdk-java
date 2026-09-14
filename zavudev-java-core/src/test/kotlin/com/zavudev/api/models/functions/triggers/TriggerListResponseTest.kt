// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions.triggers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TriggerListResponseTest {

    @Test
    fun create() {
        val triggerListResponse =
            TriggerListResponse.builder()
                .addTrigger(
                    TriggerListResponse.Trigger.builder()
                        .id("id")
                        .active(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eventType("eventType")
                        .functionId("functionId")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cron("*/15 * * * *")
                        .lastRunAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .nextRunAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .senderId("senderId")
                        .build()
                )
                .build()

        assertThat(triggerListResponse.triggers())
            .containsExactly(
                TriggerListResponse.Trigger.builder()
                    .id("id")
                    .active(true)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .eventType("eventType")
                    .functionId("functionId")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .cron("*/15 * * * *")
                    .lastRunAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .nextRunAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .senderId("senderId")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val triggerListResponse =
            TriggerListResponse.builder()
                .addTrigger(
                    TriggerListResponse.Trigger.builder()
                        .id("id")
                        .active(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eventType("eventType")
                        .functionId("functionId")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cron("*/15 * * * *")
                        .lastRunAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .nextRunAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .senderId("senderId")
                        .build()
                )
                .build()

        val roundtrippedTriggerListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(triggerListResponse),
                jacksonTypeRef<TriggerListResponse>(),
            )

        assertThat(roundtrippedTriggerListResponse).isEqualTo(triggerListResponse)
    }
}
