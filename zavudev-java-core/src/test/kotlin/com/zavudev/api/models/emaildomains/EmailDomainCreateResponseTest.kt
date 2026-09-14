// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.emaildomains

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailDomainCreateResponseTest {

    @Test
    fun create() {
        val emailDomainCreateResponse =
            EmailDomainCreateResponse.builder()
                .domain(
                    EmailDomainCreateResponse.Domain.builder()
                        .id("emd_abc123")
                        .dkimStatus("not_started")
                        .domain("example.com")
                        .status("pending")
                        .addDnsRecord(
                            EmailDomainCreateResponse.Domain.DnsRecord.builder()
                                .name("name")
                                .purpose(EmailDomainCreateResponse.Domain.DnsRecord.Purpose.DKIM)
                                .required(true)
                                .type("CNAME")
                                .value("value")
                                .priority(0L)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(emailDomainCreateResponse.domain())
            .isEqualTo(
                EmailDomainCreateResponse.Domain.builder()
                    .id("emd_abc123")
                    .dkimStatus("not_started")
                    .domain("example.com")
                    .status("pending")
                    .addDnsRecord(
                        EmailDomainCreateResponse.Domain.DnsRecord.builder()
                            .name("name")
                            .purpose(EmailDomainCreateResponse.Domain.DnsRecord.Purpose.DKIM)
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
        val emailDomainCreateResponse =
            EmailDomainCreateResponse.builder()
                .domain(
                    EmailDomainCreateResponse.Domain.builder()
                        .id("emd_abc123")
                        .dkimStatus("not_started")
                        .domain("example.com")
                        .status("pending")
                        .addDnsRecord(
                            EmailDomainCreateResponse.Domain.DnsRecord.builder()
                                .name("name")
                                .purpose(EmailDomainCreateResponse.Domain.DnsRecord.Purpose.DKIM)
                                .required(true)
                                .type("CNAME")
                                .value("value")
                                .priority(0L)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedEmailDomainCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailDomainCreateResponse),
                jacksonTypeRef<EmailDomainCreateResponse>(),
            )

        assertThat(roundtrippedEmailDomainCreateResponse).isEqualTo(emailDomainCreateResponse)
    }
}
