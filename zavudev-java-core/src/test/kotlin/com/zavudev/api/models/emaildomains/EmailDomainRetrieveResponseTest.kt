// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.emaildomains

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailDomainRetrieveResponseTest {

    @Test
    fun create() {
        val emailDomainRetrieveResponse =
            EmailDomainRetrieveResponse.builder()
                .domain(
                    EmailDomainRetrieveResponse.Domain.builder()
                        .id("emd_abc123")
                        .dkimStatus("not_started")
                        .domain("example.com")
                        .status("pending")
                        .addDnsRecord(
                            EmailDomainRetrieveResponse.Domain.DnsRecord.builder()
                                .name("name")
                                .purpose(EmailDomainRetrieveResponse.Domain.DnsRecord.Purpose.DKIM)
                                .required(true)
                                .type("CNAME")
                                .value("value")
                                .priority(0L)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(emailDomainRetrieveResponse.domain())
            .isEqualTo(
                EmailDomainRetrieveResponse.Domain.builder()
                    .id("emd_abc123")
                    .dkimStatus("not_started")
                    .domain("example.com")
                    .status("pending")
                    .addDnsRecord(
                        EmailDomainRetrieveResponse.Domain.DnsRecord.builder()
                            .name("name")
                            .purpose(EmailDomainRetrieveResponse.Domain.DnsRecord.Purpose.DKIM)
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
        val emailDomainRetrieveResponse =
            EmailDomainRetrieveResponse.builder()
                .domain(
                    EmailDomainRetrieveResponse.Domain.builder()
                        .id("emd_abc123")
                        .dkimStatus("not_started")
                        .domain("example.com")
                        .status("pending")
                        .addDnsRecord(
                            EmailDomainRetrieveResponse.Domain.DnsRecord.builder()
                                .name("name")
                                .purpose(EmailDomainRetrieveResponse.Domain.DnsRecord.Purpose.DKIM)
                                .required(true)
                                .type("CNAME")
                                .value("value")
                                .priority(0L)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedEmailDomainRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailDomainRetrieveResponse),
                jacksonTypeRef<EmailDomainRetrieveResponse>(),
            )

        assertThat(roundtrippedEmailDomainRetrieveResponse).isEqualTo(emailDomainRetrieveResponse)
    }
}
