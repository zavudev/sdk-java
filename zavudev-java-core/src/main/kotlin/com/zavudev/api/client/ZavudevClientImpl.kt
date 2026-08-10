// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.client

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.getPackageVersion
import com.zavudev.api.services.blocking.AddressService
import com.zavudev.api.services.blocking.AddressServiceImpl
import com.zavudev.api.services.blocking.BalanceService
import com.zavudev.api.services.blocking.BalanceServiceImpl
import com.zavudev.api.services.blocking.BroadcastService
import com.zavudev.api.services.blocking.BroadcastServiceImpl
import com.zavudev.api.services.blocking.ContactService
import com.zavudev.api.services.blocking.ContactServiceImpl
import com.zavudev.api.services.blocking.FunctionService
import com.zavudev.api.services.blocking.FunctionServiceImpl
import com.zavudev.api.services.blocking.IntrospectService
import com.zavudev.api.services.blocking.IntrospectServiceImpl
import com.zavudev.api.services.blocking.InvitationService
import com.zavudev.api.services.blocking.InvitationServiceImpl
import com.zavudev.api.services.blocking.MeService
import com.zavudev.api.services.blocking.MeServiceImpl
import com.zavudev.api.services.blocking.MessageService
import com.zavudev.api.services.blocking.MessageServiceImpl
import com.zavudev.api.services.blocking.Number10dlcService
import com.zavudev.api.services.blocking.Number10dlcServiceImpl
import com.zavudev.api.services.blocking.PhoneNumberService
import com.zavudev.api.services.blocking.PhoneNumberServiceImpl
import com.zavudev.api.services.blocking.RegulatoryDocumentService
import com.zavudev.api.services.blocking.RegulatoryDocumentServiceImpl
import com.zavudev.api.services.blocking.SenderService
import com.zavudev.api.services.blocking.SenderServiceImpl
import com.zavudev.api.services.blocking.SubAccountService
import com.zavudev.api.services.blocking.SubAccountServiceImpl
import com.zavudev.api.services.blocking.TemplateService
import com.zavudev.api.services.blocking.TemplateServiceImpl
import com.zavudev.api.services.blocking.UrlService
import com.zavudev.api.services.blocking.UrlServiceImpl
import java.util.function.Consumer

class ZavudevClientImpl(private val clientOptions: ClientOptions) : ZavudevClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: ZavudevClientAsync by lazy { ZavudevClientAsyncImpl(clientOptions) }

    private val withRawResponse: ZavudevClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val messages: MessageService by lazy { MessageServiceImpl(clientOptionsWithUserAgent) }

    private val templates: TemplateService by lazy {
        TemplateServiceImpl(clientOptionsWithUserAgent)
    }

    private val senders: SenderService by lazy { SenderServiceImpl(clientOptionsWithUserAgent) }

    private val contacts: ContactService by lazy { ContactServiceImpl(clientOptionsWithUserAgent) }

    private val broadcasts: BroadcastService by lazy {
        BroadcastServiceImpl(clientOptionsWithUserAgent)
    }

    private val introspect: IntrospectService by lazy {
        IntrospectServiceImpl(clientOptionsWithUserAgent)
    }

    private val phoneNumbers: PhoneNumberService by lazy {
        PhoneNumberServiceImpl(clientOptionsWithUserAgent)
    }

    private val addresses: AddressService by lazy { AddressServiceImpl(clientOptionsWithUserAgent) }

    private val regulatoryDocuments: RegulatoryDocumentService by lazy {
        RegulatoryDocumentServiceImpl(clientOptionsWithUserAgent)
    }

    private val invitations: InvitationService by lazy {
        InvitationServiceImpl(clientOptionsWithUserAgent)
    }

    private val urls: UrlService by lazy { UrlServiceImpl(clientOptionsWithUserAgent) }

    private val balance: BalanceService by lazy { BalanceServiceImpl(clientOptionsWithUserAgent) }

    private val subAccounts: SubAccountService by lazy {
        SubAccountServiceImpl(clientOptionsWithUserAgent)
    }

    private val number10dlc: Number10dlcService by lazy {
        Number10dlcServiceImpl(clientOptionsWithUserAgent)
    }

    private val me: MeService by lazy { MeServiceImpl(clientOptionsWithUserAgent) }

    private val functions: FunctionService by lazy {
        FunctionServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): ZavudevClientAsync = async

    override fun withRawResponse(): ZavudevClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ZavudevClient =
        ZavudevClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun messages(): MessageService = messages

    override fun templates(): TemplateService = templates

    override fun senders(): SenderService = senders

    override fun contacts(): ContactService = contacts

    override fun broadcasts(): BroadcastService = broadcasts

    override fun introspect(): IntrospectService = introspect

    override fun phoneNumbers(): PhoneNumberService = phoneNumbers

    override fun addresses(): AddressService = addresses

    override fun regulatoryDocuments(): RegulatoryDocumentService = regulatoryDocuments

    override fun invitations(): InvitationService = invitations

    override fun urls(): UrlService = urls

    override fun balance(): BalanceService = balance

    override fun subAccounts(): SubAccountService = subAccounts

    override fun number10dlc(): Number10dlcService = number10dlc

    override fun me(): MeService = me

    override fun functions(): FunctionService = functions

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ZavudevClient.WithRawResponse {

        private val messages: MessageService.WithRawResponse by lazy {
            MessageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val templates: TemplateService.WithRawResponse by lazy {
            TemplateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val senders: SenderService.WithRawResponse by lazy {
            SenderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val contacts: ContactService.WithRawResponse by lazy {
            ContactServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val broadcasts: BroadcastService.WithRawResponse by lazy {
            BroadcastServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val introspect: IntrospectService.WithRawResponse by lazy {
            IntrospectServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumbers: PhoneNumberService.WithRawResponse by lazy {
            PhoneNumberServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val addresses: AddressService.WithRawResponse by lazy {
            AddressServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val regulatoryDocuments: RegulatoryDocumentService.WithRawResponse by lazy {
            RegulatoryDocumentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val invitations: InvitationService.WithRawResponse by lazy {
            InvitationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val urls: UrlService.WithRawResponse by lazy {
            UrlServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val balance: BalanceService.WithRawResponse by lazy {
            BalanceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val subAccounts: SubAccountService.WithRawResponse by lazy {
            SubAccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val number10dlc: Number10dlcService.WithRawResponse by lazy {
            Number10dlcServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val me: MeService.WithRawResponse by lazy {
            MeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val functions: FunctionService.WithRawResponse by lazy {
            FunctionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ZavudevClient.WithRawResponse =
            ZavudevClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun messages(): MessageService.WithRawResponse = messages

        override fun templates(): TemplateService.WithRawResponse = templates

        override fun senders(): SenderService.WithRawResponse = senders

        override fun contacts(): ContactService.WithRawResponse = contacts

        override fun broadcasts(): BroadcastService.WithRawResponse = broadcasts

        override fun introspect(): IntrospectService.WithRawResponse = introspect

        override fun phoneNumbers(): PhoneNumberService.WithRawResponse = phoneNumbers

        override fun addresses(): AddressService.WithRawResponse = addresses

        override fun regulatoryDocuments(): RegulatoryDocumentService.WithRawResponse =
            regulatoryDocuments

        override fun invitations(): InvitationService.WithRawResponse = invitations

        override fun urls(): UrlService.WithRawResponse = urls

        override fun balance(): BalanceService.WithRawResponse = balance

        override fun subAccounts(): SubAccountService.WithRawResponse = subAccounts

        override fun number10dlc(): Number10dlcService.WithRawResponse = number10dlc

        override fun me(): MeService.WithRawResponse = me

        override fun functions(): FunctionService.WithRawResponse = functions
    }
}
