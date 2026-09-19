// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import com.zavudev.api.models.phonenumbers.PhoneNumberPurchaseParams
import com.zavudev.api.models.phonenumbers.PhoneNumberRequirementsParams
import com.zavudev.api.models.phonenumbers.PhoneNumberSearchAvailableParams
import com.zavudev.api.models.phonenumbers.PhoneNumberType
import com.zavudev.api.models.phonenumbers.PhoneNumberUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PhoneNumberServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val phoneNumberServiceAsync = client.phoneNumbers()

        val phoneNumberFuture = phoneNumberServiceAsync.retrieve("phoneNumberId")

        val phoneNumber = phoneNumberFuture.get()
        phoneNumber.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val phoneNumberServiceAsync = client.phoneNumbers()

        val phoneNumberFuture =
            phoneNumberServiceAsync.update(
                PhoneNumberUpdateParams.builder()
                    .phoneNumberId("phoneNumberId")
                    .name("Support Line")
                    .senderId("senderId")
                    .build()
            )

        val phoneNumber = phoneNumberFuture.get()
        phoneNumber.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val phoneNumberServiceAsync = client.phoneNumbers()

        val pageFuture = phoneNumberServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun purchase() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val phoneNumberServiceAsync = client.phoneNumbers()

        val responseFuture =
            phoneNumberServiceAsync.purchase(
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
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun release() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val phoneNumberServiceAsync = client.phoneNumbers()

        val future = phoneNumberServiceAsync.release("phoneNumberId")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun requirements() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val phoneNumberServiceAsync = client.phoneNumbers()

        val responseFuture =
            phoneNumberServiceAsync.requirements(
                PhoneNumberRequirementsParams.builder()
                    .countryCode("xx")
                    .phoneNumber("phoneNumber")
                    .type(PhoneNumberType.LOCAL)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun searchAvailable() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val phoneNumberServiceAsync = client.phoneNumbers()

        val responseFuture =
            phoneNumberServiceAsync.searchAvailable(
                PhoneNumberSearchAvailableParams.builder()
                    .countryCode("xx")
                    .capabilities("voice,sms")
                    .contains("contains")
                    .limit(50L)
                    .type(PhoneNumberType.LOCAL)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
