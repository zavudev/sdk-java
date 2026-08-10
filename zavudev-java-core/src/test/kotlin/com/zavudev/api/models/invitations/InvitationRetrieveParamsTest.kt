// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.invitations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvitationRetrieveParamsTest {

    @Test
    fun create() {
        InvitationRetrieveParams.builder().invitationId("invitationId").build()
    }

    @Test
    fun pathParams() {
        val params = InvitationRetrieveParams.builder().invitationId("invitationId").build()

        assertThat(params._pathParam(0)).isEqualTo("invitationId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
