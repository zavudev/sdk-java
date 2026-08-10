// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.broadcasts.contacts

import com.zavudev.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactAddParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            ContactAddParams.builder()
                .broadcastId("broadcastId")
                .addContact(ContactAddParams.Contact.builder().recipient("+14155551234").build())
                .addContact(ContactAddParams.Contact.builder().recipient("+14155555678").build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("broadcastId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.contacts())
            .containsExactly(
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
                    .build(),
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
                    .build(),
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ContactAddParams.builder()
                .broadcastId("broadcastId")
                .addContact(ContactAddParams.Contact.builder().recipient("+14155551234").build())
                .addContact(ContactAddParams.Contact.builder().recipient("+14155555678").build())
                .build()

        val body = params._body()

        assertThat(body.contacts())
            .containsExactly(
                ContactAddParams.Contact.builder().recipient("+14155551234").build(),
                ContactAddParams.Contact.builder().recipient("+14155555678").build(),
            )
    }
}
