// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.emaildomains

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailDomainVerifyResponseTest {

    @Test
    fun create() {
        val emailDomainVerifyResponse =
            EmailDomainVerifyResponse.builder()
                .domain(
                    EmailDomainVerifyResponse.Domain.builder()
                        .id("emd_abc123")
                        .dkimStatus("not_started")
                        .domain("example.com")
                        .status("pending")
                        .addDnsRecord(
                            EmailDomainVerifyResponse.Domain.DnsRecord.builder()
                                .name("name")
                                .purpose(EmailDomainVerifyResponse.Domain.DnsRecord.Purpose.DKIM)
                                .required(true)
                                .type("CNAME")
                                .value("value")
                                .priority(0L)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(emailDomainVerifyResponse.domain())
            .isEqualTo(
                EmailDomainVerifyResponse.Domain.builder()
                    .id("emd_abc123")
                    .dkimStatus("not_started")
                    .domain("example.com")
                    .status("pending")
                    .addDnsRecord(
                        EmailDomainVerifyResponse.Domain.DnsRecord.builder()
                            .name("name")
                            .purpose(EmailDomainVerifyResponse.Domain.DnsRecord.Purpose.DKIM)
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
        val emailDomainVerifyResponse =
            EmailDomainVerifyResponse.builder()
                .domain(
                    EmailDomainVerifyResponse.Domain.builder()
                        .id("emd_abc123")
                        .dkimStatus("not_started")
                        .domain("example.com")
                        .status("pending")
                        .addDnsRecord(
                            EmailDomainVerifyResponse.Domain.DnsRecord.builder()
                                .name("name")
                                .purpose(EmailDomainVerifyResponse.Domain.DnsRecord.Purpose.DKIM)
                                .required(true)
                                .type("CNAME")
                                .value("value")
                                .priority(0L)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedEmailDomainVerifyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailDomainVerifyResponse),
                jacksonTypeRef<EmailDomainVerifyResponse>(),
            )

        assertThat(roundtrippedEmailDomainVerifyResponse).isEqualTo(emailDomainVerifyResponse)
    }
}
