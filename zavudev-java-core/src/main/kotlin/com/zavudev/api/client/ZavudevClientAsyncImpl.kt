// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.client

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.getPackageVersion
import com.zavudev.api.services.async.AddressServiceAsync
import com.zavudev.api.services.async.AddressServiceAsyncImpl
import com.zavudev.api.services.async.AgentServiceAsync
import com.zavudev.api.services.async.AgentServiceAsyncImpl
import com.zavudev.api.services.async.AgentTemplateServiceAsync
import com.zavudev.api.services.async.AgentTemplateServiceAsyncImpl
import com.zavudev.api.services.async.BalanceServiceAsync
import com.zavudev.api.services.async.BalanceServiceAsyncImpl
import com.zavudev.api.services.async.BroadcastServiceAsync
import com.zavudev.api.services.async.BroadcastServiceAsyncImpl
import com.zavudev.api.services.async.CallServiceAsync
import com.zavudev.api.services.async.CallServiceAsyncImpl
import com.zavudev.api.services.async.ContactServiceAsync
import com.zavudev.api.services.async.ContactServiceAsyncImpl
import com.zavudev.api.services.async.ConversationServiceAsync
import com.zavudev.api.services.async.ConversationServiceAsyncImpl
import com.zavudev.api.services.async.EmailDomainServiceAsync
import com.zavudev.api.services.async.EmailDomainServiceAsyncImpl
import com.zavudev.api.services.async.FunctionServiceAsync
import com.zavudev.api.services.async.FunctionServiceAsyncImpl
import com.zavudev.api.services.async.IntrospectServiceAsync
import com.zavudev.api.services.async.IntrospectServiceAsyncImpl
import com.zavudev.api.services.async.InvitationServiceAsync
import com.zavudev.api.services.async.InvitationServiceAsyncImpl
import com.zavudev.api.services.async.MeServiceAsync
import com.zavudev.api.services.async.MeServiceAsyncImpl
import com.zavudev.api.services.async.MessageServiceAsync
import com.zavudev.api.services.async.MessageServiceAsyncImpl
import com.zavudev.api.services.async.Number10dlcServiceAsync
import com.zavudev.api.services.async.Number10dlcServiceAsyncImpl
import com.zavudev.api.services.async.PhoneNumberServiceAsync
import com.zavudev.api.services.async.PhoneNumberServiceAsyncImpl
import com.zavudev.api.services.async.RegulatoryDocumentServiceAsync
import com.zavudev.api.services.async.RegulatoryDocumentServiceAsyncImpl
import com.zavudev.api.services.async.SenderServiceAsync
import com.zavudev.api.services.async.SenderServiceAsyncImpl
import com.zavudev.api.services.async.SubAccountServiceAsync
import com.zavudev.api.services.async.SubAccountServiceAsyncImpl
import com.zavudev.api.services.async.TemplateServiceAsync
import com.zavudev.api.services.async.TemplateServiceAsyncImpl
import com.zavudev.api.services.async.UrlServiceAsync
import com.zavudev.api.services.async.UrlServiceAsyncImpl
import java.util.function.Consumer

class ZavudevClientAsyncImpl(private val clientOptions: ClientOptions) : ZavudevClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: ZavudevClient by lazy { ZavudevClientImpl(clientOptions) }

    private val withRawResponse: ZavudevClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val messages: MessageServiceAsync by lazy {
        MessageServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val templates: TemplateServiceAsync by lazy {
        TemplateServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val senders: SenderServiceAsync by lazy {
        SenderServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val contacts: ContactServiceAsync by lazy {
        ContactServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val broadcasts: BroadcastServiceAsync by lazy {
        BroadcastServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val introspect: IntrospectServiceAsync by lazy {
        IntrospectServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val phoneNumbers: PhoneNumberServiceAsync by lazy {
        PhoneNumberServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val addresses: AddressServiceAsync by lazy {
        AddressServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val regulatoryDocuments: RegulatoryDocumentServiceAsync by lazy {
        RegulatoryDocumentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val invitations: InvitationServiceAsync by lazy {
        InvitationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val urls: UrlServiceAsync by lazy { UrlServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val balance: BalanceServiceAsync by lazy {
        BalanceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val subAccounts: SubAccountServiceAsync by lazy {
        SubAccountServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val number10dlc: Number10dlcServiceAsync by lazy {
        Number10dlcServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val me: MeServiceAsync by lazy { MeServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val functions: FunctionServiceAsync by lazy {
        FunctionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val conversations: ConversationServiceAsync by lazy {
        ConversationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val calls: CallServiceAsync by lazy { CallServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val agentTemplates: AgentTemplateServiceAsync by lazy {
        AgentTemplateServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val emailDomains: EmailDomainServiceAsync by lazy {
        EmailDomainServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val agents: AgentServiceAsync by lazy {
        AgentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): ZavudevClient = sync

    override fun withRawResponse(): ZavudevClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ZavudevClientAsync =
        ZavudevClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun messages(): MessageServiceAsync = messages

    override fun templates(): TemplateServiceAsync = templates

    override fun senders(): SenderServiceAsync = senders

    override fun contacts(): ContactServiceAsync = contacts

    override fun broadcasts(): BroadcastServiceAsync = broadcasts

    override fun introspect(): IntrospectServiceAsync = introspect

    override fun phoneNumbers(): PhoneNumberServiceAsync = phoneNumbers

    override fun addresses(): AddressServiceAsync = addresses

    override fun regulatoryDocuments(): RegulatoryDocumentServiceAsync = regulatoryDocuments

    override fun invitations(): InvitationServiceAsync = invitations

    override fun urls(): UrlServiceAsync = urls

    override fun balance(): BalanceServiceAsync = balance

    override fun subAccounts(): SubAccountServiceAsync = subAccounts

    override fun number10dlc(): Number10dlcServiceAsync = number10dlc

    override fun me(): MeServiceAsync = me

    override fun functions(): FunctionServiceAsync = functions

    override fun conversations(): ConversationServiceAsync = conversations

    override fun calls(): CallServiceAsync = calls

    override fun agentTemplates(): AgentTemplateServiceAsync = agentTemplates

    override fun emailDomains(): EmailDomainServiceAsync = emailDomains

    override fun agents(): AgentServiceAsync = agents

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ZavudevClientAsync.WithRawResponse {

        private val messages: MessageServiceAsync.WithRawResponse by lazy {
            MessageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val templates: TemplateServiceAsync.WithRawResponse by lazy {
            TemplateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val senders: SenderServiceAsync.WithRawResponse by lazy {
            SenderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val contacts: ContactServiceAsync.WithRawResponse by lazy {
            ContactServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val broadcasts: BroadcastServiceAsync.WithRawResponse by lazy {
            BroadcastServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val introspect: IntrospectServiceAsync.WithRawResponse by lazy {
            IntrospectServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumbers: PhoneNumberServiceAsync.WithRawResponse by lazy {
            PhoneNumberServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val addresses: AddressServiceAsync.WithRawResponse by lazy {
            AddressServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val regulatoryDocuments: RegulatoryDocumentServiceAsync.WithRawResponse by lazy {
            RegulatoryDocumentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val invitations: InvitationServiceAsync.WithRawResponse by lazy {
            InvitationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val urls: UrlServiceAsync.WithRawResponse by lazy {
            UrlServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val balance: BalanceServiceAsync.WithRawResponse by lazy {
            BalanceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val subAccounts: SubAccountServiceAsync.WithRawResponse by lazy {
            SubAccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val number10dlc: Number10dlcServiceAsync.WithRawResponse by lazy {
            Number10dlcServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val me: MeServiceAsync.WithRawResponse by lazy {
            MeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val functions: FunctionServiceAsync.WithRawResponse by lazy {
            FunctionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val conversations: ConversationServiceAsync.WithRawResponse by lazy {
            ConversationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val calls: CallServiceAsync.WithRawResponse by lazy {
            CallServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val agentTemplates: AgentTemplateServiceAsync.WithRawResponse by lazy {
            AgentTemplateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val emailDomains: EmailDomainServiceAsync.WithRawResponse by lazy {
            EmailDomainServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val agents: AgentServiceAsync.WithRawResponse by lazy {
            AgentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ZavudevClientAsync.WithRawResponse =
            ZavudevClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun messages(): MessageServiceAsync.WithRawResponse = messages

        override fun templates(): TemplateServiceAsync.WithRawResponse = templates

        override fun senders(): SenderServiceAsync.WithRawResponse = senders

        override fun contacts(): ContactServiceAsync.WithRawResponse = contacts

        override fun broadcasts(): BroadcastServiceAsync.WithRawResponse = broadcasts

        override fun introspect(): IntrospectServiceAsync.WithRawResponse = introspect

        override fun phoneNumbers(): PhoneNumberServiceAsync.WithRawResponse = phoneNumbers

        override fun addresses(): AddressServiceAsync.WithRawResponse = addresses

        override fun regulatoryDocuments(): RegulatoryDocumentServiceAsync.WithRawResponse =
            regulatoryDocuments

        override fun invitations(): InvitationServiceAsync.WithRawResponse = invitations

        override fun urls(): UrlServiceAsync.WithRawResponse = urls

        override fun balance(): BalanceServiceAsync.WithRawResponse = balance

        override fun subAccounts(): SubAccountServiceAsync.WithRawResponse = subAccounts

        override fun number10dlc(): Number10dlcServiceAsync.WithRawResponse = number10dlc

        override fun me(): MeServiceAsync.WithRawResponse = me

        override fun functions(): FunctionServiceAsync.WithRawResponse = functions

        override fun conversations(): ConversationServiceAsync.WithRawResponse = conversations

        override fun calls(): CallServiceAsync.WithRawResponse = calls

        override fun agentTemplates(): AgentTemplateServiceAsync.WithRawResponse = agentTemplates

        override fun emailDomains(): EmailDomainServiceAsync.WithRawResponse = emailDomains

        override fun agents(): AgentServiceAsync.WithRawResponse = agents
    }
}
