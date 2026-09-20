// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.models.phonenumbers.PhoneNumberPurchaseParams
import com.zavudev.api.models.phonenumbers.PhoneNumberRequirementsParams
import com.zavudev.api.models.phonenumbers.PhoneNumberSearchAvailableParams
import com.zavudev.api.models.phonenumbers.PhoneNumberType
import com.zavudev.api.models.phonenumbers.PhoneNumberUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PhoneNumberServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberService = client.phoneNumbers()

        val phoneNumber = phoneNumberService.retrieve("phoneNumberId")

        phoneNumber.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberService = client.phoneNumbers()

        val phoneNumber =
            phoneNumberService.update(
                PhoneNumberUpdateParams.builder()
                    .phoneNumberId("phoneNumberId")
                    .name("Support Line")
                    .senderId("senderId")
                    .build()
            )

        phoneNumber.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberService = client.phoneNumbers()

        val page = phoneNumberService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun purchase() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberService = client.phoneNumbers()

        val response =
            phoneNumberService.purchase(
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

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun release() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberService = client.phoneNumbers()

        phoneNumberService.release("phoneNumberId")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun requirements() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberService = client.phoneNumbers()

        val response =
            phoneNumberService.requirements(
                PhoneNumberRequirementsParams.builder()
                    .countryCode("xx")
                    .phoneNumber("phoneNumber")
                    .type(PhoneNumberType.LOCAL)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun searchAvailable() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberService = client.phoneNumbers()

        val response =
            phoneNumberService.searchAvailable(
                PhoneNumberSearchAvailableParams.builder()
                    .countryCode("xx")
                    .capabilities("voice,sms")
                    .contains("contains")
                    .limit(50L)
                    .type(PhoneNumberType.LOCAL)
                    .build()
            )

        response.validate()
    }
}
