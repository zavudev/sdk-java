// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.number10dlc.campaigns

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.models.number10dlc.campaigns.phonenumbers.PhoneNumberAssignParams
import com.zavudev.api.models.number10dlc.campaigns.phonenumbers.PhoneNumberUnassignParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PhoneNumberServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberService = client.number10dlc().campaigns().phoneNumbers()

        val phoneNumbers = phoneNumberService.list("campaignId")

        phoneNumbers.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun assign() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberService = client.number10dlc().campaigns().phoneNumbers()

        val response =
            phoneNumberService.assign(
                PhoneNumberAssignParams.builder()
                    .campaignId("campaignId")
                    .phoneNumberId("pn_abc123")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun unassign() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberService = client.number10dlc().campaigns().phoneNumbers()

        phoneNumberService.unassign(
            PhoneNumberUnassignParams.builder()
                .campaignId("campaignId")
                .assignmentId("assignmentId")
                .build()
        )
    }
}
