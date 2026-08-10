// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.broadcasts

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.core.JsonValue
import com.zavudev.api.models.broadcasts.contacts.ContactAddParams
import com.zavudev.api.models.broadcasts.contacts.ContactRemoveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ContactServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val contactService = client.broadcasts().contacts()

        val page = contactService.list("broadcastId")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun add() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val contactService = client.broadcasts().contacts()

        val response =
            contactService.add(
                ContactAddParams.builder()
                    .broadcastId("broadcastId")
                    .addContact(
                        ContactAddParams.Contact.builder()
                            .recipient("+14155551234")
                            .templateButtonVariables(
                                ContactAddParams.Contact.TemplateButtonVariables.builder()
                                    .putAdditionalProperty("0", JsonValue.from("abc-report-token"))
                                    .build()
                            )
                            .templateHeaderVariables(
                                ContactAddParams.Contact.TemplateHeaderVariables.builder()
                                    .putAdditionalProperty("1", JsonValue.from("Jorge y Laura"))
                                    .build()
                            )
                            .templateVariables(
                                ContactAddParams.Contact.TemplateVariables.builder()
                                    .putAdditionalProperty("name", JsonValue.from("John"))
                                    .putAdditionalProperty("order_id", JsonValue.from("ORD-001"))
                                    .build()
                            )
                            .build()
                    )
                    .addContact(
                        ContactAddParams.Contact.builder()
                            .recipient("+14155555678")
                            .templateButtonVariables(
                                ContactAddParams.Contact.TemplateButtonVariables.builder()
                                    .putAdditionalProperty("0", JsonValue.from("abc-report-token"))
                                    .build()
                            )
                            .templateHeaderVariables(
                                ContactAddParams.Contact.TemplateHeaderVariables.builder()
                                    .putAdditionalProperty("1", JsonValue.from("Jorge y Laura"))
                                    .build()
                            )
                            .templateVariables(
                                ContactAddParams.Contact.TemplateVariables.builder()
                                    .putAdditionalProperty("name", JsonValue.from("Jane"))
                                    .putAdditionalProperty("order_id", JsonValue.from("ORD-002"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun remove() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val contactService = client.broadcasts().contacts()

        contactService.remove(
            ContactRemoveParams.builder().broadcastId("broadcastId").contactId("contactId").build()
        )
    }
}
