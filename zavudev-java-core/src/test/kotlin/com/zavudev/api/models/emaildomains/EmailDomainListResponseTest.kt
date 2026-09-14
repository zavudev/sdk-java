// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.emaildomains

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailDomainListResponseTest {

    @Test
    fun create() {
        val emailDomainListResponse =
            EmailDomainListResponse.builder()
                .addItem(
                    EmailDomainListResponse.Item.builder()
                        .id("emd_abc123")
                        .dkimStatus("not_started")
                        .domain("example.com")
                        .status("pending")
                        .addDnsRecord(
                            EmailDomainListResponse.Item.DnsRecord.builder()
                                .name("name")
                                .purpose(EmailDomainListResponse.Item.DnsRecord.Purpose.DKIM)
                                .required(true)
                                .type("CNAME")
                                .value("value")
                                .priority(0L)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(emailDomainListResponse.items())
            .containsExactly(
                EmailDomainListResponse.Item.builder()
                    .id("emd_abc123")
                    .dkimStatus("not_started")
                    .domain("example.com")
                    .status("pending")
                    .addDnsRecord(
                        EmailDomainListResponse.Item.DnsRecord.builder()
                            .name("name")
                            .purpose(EmailDomainListResponse.Item.DnsRecord.Purpose.DKIM)
                            .required(true)
                            .type("CNAME")
                            .value("value")
                            .priority(0L)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailDomainListResponse =
            EmailDomainListResponse.builder()
                .addItem(
                    EmailDomainListResponse.Item.builder()
                        .id("emd_abc123")
                        .dkimStatus("not_started")
                        .domain("example.com")
                        .status("pending")
                        .addDnsRecord(
                            EmailDomainListResponse.Item.DnsRecord.builder()
                                .name("name")
                                .purpose(EmailDomainListResponse.Item.DnsRecord.Purpose.DKIM)
                                .required(true)
                                .type("CNAME")
                                .value("value")
                                .priority(0L)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedEmailDomainListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailDomainListResponse),
                jacksonTypeRef<EmailDomainListResponse>(),
            )

        assertThat(roundtrippedEmailDomainListResponse).isEqualTo(emailDomainListResponse)
    }
}
