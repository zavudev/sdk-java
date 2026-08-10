// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.number10dlc.campaigns

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import com.zavudev.api.models.number10dlc.campaigns.phonenumbers.PhoneNumberAssignParams
import com.zavudev.api.models.number10dlc.campaigns.phonenumbers.PhoneNumberUnassignParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PhoneNumberServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val phoneNumberServiceAsync = client.number10dlc().campaigns().phoneNumbers()

        val phoneNumbersFuture = phoneNumberServiceAsync.list("campaignId")

        val phoneNumbers = phoneNumbersFuture.get()
        phoneNumbers.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun assign() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val phoneNumberServiceAsync = client.number10dlc().campaigns().phoneNumbers()

        val responseFuture =
            phoneNumberServiceAsync.assign(
                PhoneNumberAssignParams.builder()
                    .campaignId("campaignId")
                    .phoneNumberId("pn_abc123")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun unassign() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val phoneNumberServiceAsync = client.number10dlc().campaigns().phoneNumbers()

        val future =
            phoneNumberServiceAsync.unassign(
                PhoneNumberUnassignParams.builder()
                    .campaignId("campaignId")
                    .assignmentId("assignmentId")
                    .build()
            )

        val response = future.get()
    }
}
