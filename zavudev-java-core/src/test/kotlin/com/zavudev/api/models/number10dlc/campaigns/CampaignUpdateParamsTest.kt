// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.number10dlc.campaigns

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignUpdateParamsTest {

    @Test
    fun create() {
        CampaignUpdateParams.builder()
            .campaignId("campaignId")
            .description("description")
            .helpMessage("helpMessage")
            .messageFlow("messageFlow")
            .name("name")
            .addOptInKeyword("string")
            .addOptOutKeyword("string")
            .addSampleMessage("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params = CampaignUpdateParams.builder().campaignId("campaignId").build()

        assertThat(params._pathParam(0)).isEqualTo("campaignId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CampaignUpdateParams.builder()
                .campaignId("campaignId")
                .description("description")
                .helpMessage("helpMessage")
                .messageFlow("messageFlow")
                .name("name")
                .addOptInKeyword("string")
                .addOptOutKeyword("string")
                .addSampleMessage("string")
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.helpMessage()).contains("helpMessage")
        assertThat(body.messageFlow()).contains("messageFlow")
        assertThat(body.name()).contains("name")
        assertThat(body.optInKeywords().getOrNull()).containsExactly("string")
        assertThat(body.optOutKeywords().getOrNull()).containsExactly("string")
        assertThat(body.sampleMessages().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CampaignUpdateParams.builder().campaignId("campaignId").build()

        val body = params._body()
    }
}
