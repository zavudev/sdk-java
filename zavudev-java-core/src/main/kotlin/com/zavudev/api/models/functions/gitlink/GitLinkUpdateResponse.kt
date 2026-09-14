// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions.gitlink

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.zavudev.api.core.Enum
import com.zavudev.api.core.ExcludeMissing
import com.zavudev.api.core.JsonField
import com.zavudev.api.core.JsonMissing
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.checkRequired
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class GitLinkUpdateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val link: JsonField<Link>,
    private val webhookUrl: JsonField<String>,
    private val webhookSecret: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("link") @ExcludeMissing link: JsonField<Link> = JsonMissing.of(),
        @JsonProperty("webhookUrl")
        @ExcludeMissing
        webhookUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webhookSecret")
        @ExcludeMissing
        webhookSecret: JsonField<String> = JsonMissing.of(),
    ) : this(link, webhookUrl, webhookSecret, mutableMapOf())

    /**
     * A GitHub repository bound to a function. A push to `branch` deploys the function. A function
     * holds at most one link.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun link(): Link = link.getRequired("link")

    /**
     * Endpoint that receives GitHub's push deliveries. Only needed on a `manual` link, where you
     * add it to the repository yourself.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun webhookUrl(): String = webhookUrl.getRequired("webhookUrl")

    /**
     * Shared secret for the repository's webhook. **Returned only when creating a `manual` link,
     * and only there** — every later read strips it, and re-linking mints a new one. Absent
     * entirely on an `app` link, which needs no secret of its own.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookSecret(): Optional<String> = webhookSecret.getOptional("webhookSecret")

    /**
     * Returns the raw JSON value of [link].
     *
     * Unlike [link], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("link") @ExcludeMissing fun _link(): JsonField<Link> = link

    /**
     * Returns the raw JSON value of [webhookUrl].
     *
     * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhookUrl") @ExcludeMissing fun _webhookUrl(): JsonField<String> = webhookUrl

    /**
     * Returns the raw JSON value of [webhookSecret].
     *
     * Unlike [webhookSecret], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhookSecret")
    @ExcludeMissing
    fun _webhookSecret(): JsonField<String> = webhookSecret

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GitLinkUpdateResponse].
         *
         * The following fields are required:
         * ```java
         * .link()
         * .webhookUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GitLinkUpdateResponse]. */
    class Builder internal constructor() {

        private var link: JsonField<Link>? = null
        private var webhookUrl: JsonField<String>? = null
        private var webhookSecret: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(gitLinkUpdateResponse: GitLinkUpdateResponse) = apply {
            link = gitLinkUpdateResponse.link
            webhookUrl = gitLinkUpdateResponse.webhookUrl
            webhookSecret = gitLinkUpdateResponse.webhookSecret
            additionalProperties = gitLinkUpdateResponse.additionalProperties.toMutableMap()
        }

        /**
         * A GitHub repository bound to a function. A push to `branch` deploys the function. A
         * function holds at most one link.
         */
        fun link(link: Link) = link(JsonField.of(link))

        /**
         * Sets [Builder.link] to an arbitrary JSON value.
         *
         * You should usually call [Builder.link] with a well-typed [Link] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun link(link: JsonField<Link>) = apply { this.link = link }

        /**
         * Endpoint that receives GitHub's push deliveries. Only needed on a `manual` link, where
         * you add it to the repository yourself.
         */
        fun webhookUrl(webhookUrl: String) = webhookUrl(JsonField.of(webhookUrl))

        /**
         * Sets [Builder.webhookUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookUrl(webhookUrl: JsonField<String>) = apply { this.webhookUrl = webhookUrl }

        /**
         * Shared secret for the repository's webhook. **Returned only when creating a `manual`
         * link, and only there** — every later read strips it, and re-linking mints a new one.
         * Absent entirely on an `app` link, which needs no secret of its own.
         */
        fun webhookSecret(webhookSecret: String) = webhookSecret(JsonField.of(webhookSecret))

        /**
         * Sets [Builder.webhookSecret] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookSecret] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookSecret(webhookSecret: JsonField<String>) = apply {
            this.webhookSecret = webhookSecret
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [GitLinkUpdateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .link()
         * .webhookUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): GitLinkUpdateResponse =
            GitLinkUpdateResponse(
                checkRequired("link", link),
                checkRequired("webhookUrl", webhookUrl),
                webhookSecret,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws ZavudevInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): GitLinkUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        link().validate()
        webhookUrl()
        webhookSecret()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: ZavudevInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (link.asKnown().getOrNull()?.validity() ?: 0) +
            (if (webhookUrl.asKnown().isPresent) 1 else 0) +
            (if (webhookSecret.asKnown().isPresent) 1 else 0)

    /**
     * A GitHub repository bound to a function. A push to `branch` deploys the function. A function
     * holds at most one link.
     */
    class Link
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val autoDeploy: JsonField<Boolean>,
        private val branch: JsonField<String>,
        private val connection: JsonField<Connection>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val functionId: JsonField<String>,
        private val owner: JsonField<String>,
        private val provider: JsonField<Provider>,
        private val repo: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val lastCommitMessage: JsonField<String>,
        private val lastCommitSha: JsonField<String>,
        private val lastDeployAt: JsonField<OffsetDateTime>,
        private val lastError: JsonField<String>,
        private val lastStatus: JsonField<LastStatus>,
        private val rootDir: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("autoDeploy")
            @ExcludeMissing
            autoDeploy: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("branch") @ExcludeMissing branch: JsonField<String> = JsonMissing.of(),
            @JsonProperty("connection")
            @ExcludeMissing
            connection: JsonField<Connection> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("functionId")
            @ExcludeMissing
            functionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("owner") @ExcludeMissing owner: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<Provider> = JsonMissing.of(),
            @JsonProperty("repo") @ExcludeMissing repo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("lastCommitMessage")
            @ExcludeMissing
            lastCommitMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lastCommitSha")
            @ExcludeMissing
            lastCommitSha: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lastDeployAt")
            @ExcludeMissing
            lastDeployAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("lastError")
            @ExcludeMissing
            lastError: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lastStatus")
            @ExcludeMissing
            lastStatus: JsonField<LastStatus> = JsonMissing.of(),
            @JsonProperty("rootDir") @ExcludeMissing rootDir: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            autoDeploy,
            branch,
            connection,
            createdAt,
            functionId,
            owner,
            provider,
            repo,
            updatedAt,
            lastCommitMessage,
            lastCommitSha,
            lastDeployAt,
            lastError,
            lastStatus,
            rootDir,
            mutableMapOf(),
        )

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * When false the link is kept and pushes are ignored.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun autoDeploy(): Boolean = autoDeploy.getRequired("autoDeploy")

        /**
         * Only pushes to this branch deploy.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun branch(): String = branch.getRequired("branch")

        /**
         * How this link authenticates, decided by the server rather than by the caller.
         * - `app`: the Zavu GitHub App is installed on the account. Pushes arrive on the app's
         *   webhook and private repositories work. Nothing to configure in the repository.
         * - `manual`: no installation. The link carries its own secret and you add the webhook to
         *   the repository yourself.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun connection(): Connection = connection.getRequired("connection")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun functionId(): String = functionId.getRequired("functionId")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun owner(): String = owner.getRequired("owner")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun provider(): Provider = provider.getRequired("provider")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun repo(): String = repo.getRequired("repo")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastCommitMessage(): Optional<String> =
            lastCommitMessage.getOptional("lastCommitMessage")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastCommitSha(): Optional<String> = lastCommitSha.getOptional("lastCommitSha")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastDeployAt(): Optional<OffsetDateTime> = lastDeployAt.getOptional("lastDeployAt")

        /**
         * Why the last deploy failed. Null otherwise.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastError(): Optional<String> = lastError.getOptional("lastError")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastStatus(): Optional<LastStatus> = lastStatus.getOptional("lastStatus")

        /**
         * Subdirectory holding the project, for monorepos. Null when the project is at the
         * repository root.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rootDir(): Optional<String> = rootDir.getOptional("rootDir")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [autoDeploy].
         *
         * Unlike [autoDeploy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("autoDeploy")
        @ExcludeMissing
        fun _autoDeploy(): JsonField<Boolean> = autoDeploy

        /**
         * Returns the raw JSON value of [branch].
         *
         * Unlike [branch], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("branch") @ExcludeMissing fun _branch(): JsonField<String> = branch

        /**
         * Returns the raw JSON value of [connection].
         *
         * Unlike [connection], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("connection")
        @ExcludeMissing
        fun _connection(): JsonField<Connection> = connection

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [functionId].
         *
         * Unlike [functionId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("functionId")
        @ExcludeMissing
        fun _functionId(): JsonField<String> = functionId

        /**
         * Returns the raw JSON value of [owner].
         *
         * Unlike [owner], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("owner") @ExcludeMissing fun _owner(): JsonField<String> = owner

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<Provider> = provider

        /**
         * Returns the raw JSON value of [repo].
         *
         * Unlike [repo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("repo") @ExcludeMissing fun _repo(): JsonField<String> = repo

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updatedAt")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [lastCommitMessage].
         *
         * Unlike [lastCommitMessage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("lastCommitMessage")
        @ExcludeMissing
        fun _lastCommitMessage(): JsonField<String> = lastCommitMessage

        /**
         * Returns the raw JSON value of [lastCommitSha].
         *
         * Unlike [lastCommitSha], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("lastCommitSha")
        @ExcludeMissing
        fun _lastCommitSha(): JsonField<String> = lastCommitSha

        /**
         * Returns the raw JSON value of [lastDeployAt].
         *
         * Unlike [lastDeployAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("lastDeployAt")
        @ExcludeMissing
        fun _lastDeployAt(): JsonField<OffsetDateTime> = lastDeployAt

        /**
         * Returns the raw JSON value of [lastError].
         *
         * Unlike [lastError], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lastError") @ExcludeMissing fun _lastError(): JsonField<String> = lastError

        /**
         * Returns the raw JSON value of [lastStatus].
         *
         * Unlike [lastStatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lastStatus")
        @ExcludeMissing
        fun _lastStatus(): JsonField<LastStatus> = lastStatus

        /**
         * Returns the raw JSON value of [rootDir].
         *
         * Unlike [rootDir], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rootDir") @ExcludeMissing fun _rootDir(): JsonField<String> = rootDir

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Link].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .autoDeploy()
             * .branch()
             * .connection()
             * .createdAt()
             * .functionId()
             * .owner()
             * .provider()
             * .repo()
             * .updatedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Link]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var autoDeploy: JsonField<Boolean>? = null
            private var branch: JsonField<String>? = null
            private var connection: JsonField<Connection>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var functionId: JsonField<String>? = null
            private var owner: JsonField<String>? = null
            private var provider: JsonField<Provider>? = null
            private var repo: JsonField<String>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var lastCommitMessage: JsonField<String> = JsonMissing.of()
            private var lastCommitSha: JsonField<String> = JsonMissing.of()
            private var lastDeployAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var lastError: JsonField<String> = JsonMissing.of()
            private var lastStatus: JsonField<LastStatus> = JsonMissing.of()
            private var rootDir: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(link: Link) = apply {
                id = link.id
                autoDeploy = link.autoDeploy
                branch = link.branch
                connection = link.connection
                createdAt = link.createdAt
                functionId = link.functionId
                owner = link.owner
                provider = link.provider
                repo = link.repo
                updatedAt = link.updatedAt
                lastCommitMessage = link.lastCommitMessage
                lastCommitSha = link.lastCommitSha
                lastDeployAt = link.lastDeployAt
                lastError = link.lastError
                lastStatus = link.lastStatus
                rootDir = link.rootDir
                additionalProperties = link.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** When false the link is kept and pushes are ignored. */
            fun autoDeploy(autoDeploy: Boolean) = autoDeploy(JsonField.of(autoDeploy))

            /**
             * Sets [Builder.autoDeploy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoDeploy] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun autoDeploy(autoDeploy: JsonField<Boolean>) = apply { this.autoDeploy = autoDeploy }

            /** Only pushes to this branch deploy. */
            fun branch(branch: String) = branch(JsonField.of(branch))

            /**
             * Sets [Builder.branch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.branch] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun branch(branch: JsonField<String>) = apply { this.branch = branch }

            /**
             * How this link authenticates, decided by the server rather than by the caller.
             * - `app`: the Zavu GitHub App is installed on the account. Pushes arrive on the app's
             *   webhook and private repositories work. Nothing to configure in the repository.
             * - `manual`: no installation. The link carries its own secret and you add the webhook
             *   to the repository yourself.
             */
            fun connection(connection: Connection) = connection(JsonField.of(connection))

            /**
             * Sets [Builder.connection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connection] with a well-typed [Connection] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun connection(connection: JsonField<Connection>) = apply {
                this.connection = connection
            }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun functionId(functionId: String) = functionId(JsonField.of(functionId))

            /**
             * Sets [Builder.functionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.functionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun functionId(functionId: JsonField<String>) = apply { this.functionId = functionId }

            fun owner(owner: String) = owner(JsonField.of(owner))

            /**
             * Sets [Builder.owner] to an arbitrary JSON value.
             *
             * You should usually call [Builder.owner] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun owner(owner: JsonField<String>) = apply { this.owner = owner }

            fun provider(provider: Provider) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [Provider] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<Provider>) = apply { this.provider = provider }

            fun repo(repo: String) = repo(JsonField.of(repo))

            /**
             * Sets [Builder.repo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.repo] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun repo(repo: JsonField<String>) = apply { this.repo = repo }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            fun lastCommitMessage(lastCommitMessage: String?) =
                lastCommitMessage(JsonField.ofNullable(lastCommitMessage))

            /**
             * Alias for calling [Builder.lastCommitMessage] with `lastCommitMessage.orElse(null)`.
             */
            fun lastCommitMessage(lastCommitMessage: Optional<String>) =
                lastCommitMessage(lastCommitMessage.getOrNull())

            /**
             * Sets [Builder.lastCommitMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastCommitMessage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastCommitMessage(lastCommitMessage: JsonField<String>) = apply {
                this.lastCommitMessage = lastCommitMessage
            }

            fun lastCommitSha(lastCommitSha: String?) =
                lastCommitSha(JsonField.ofNullable(lastCommitSha))

            /** Alias for calling [Builder.lastCommitSha] with `lastCommitSha.orElse(null)`. */
            fun lastCommitSha(lastCommitSha: Optional<String>) =
                lastCommitSha(lastCommitSha.getOrNull())

            /**
             * Sets [Builder.lastCommitSha] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastCommitSha] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastCommitSha(lastCommitSha: JsonField<String>) = apply {
                this.lastCommitSha = lastCommitSha
            }

            fun lastDeployAt(lastDeployAt: OffsetDateTime?) =
                lastDeployAt(JsonField.ofNullable(lastDeployAt))

            /** Alias for calling [Builder.lastDeployAt] with `lastDeployAt.orElse(null)`. */
            fun lastDeployAt(lastDeployAt: Optional<OffsetDateTime>) =
                lastDeployAt(lastDeployAt.getOrNull())

            /**
             * Sets [Builder.lastDeployAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastDeployAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun lastDeployAt(lastDeployAt: JsonField<OffsetDateTime>) = apply {
                this.lastDeployAt = lastDeployAt
            }

            /** Why the last deploy failed. Null otherwise. */
            fun lastError(lastError: String?) = lastError(JsonField.ofNullable(lastError))

            /** Alias for calling [Builder.lastError] with `lastError.orElse(null)`. */
            fun lastError(lastError: Optional<String>) = lastError(lastError.getOrNull())

            /**
             * Sets [Builder.lastError] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastError] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastError(lastError: JsonField<String>) = apply { this.lastError = lastError }

            fun lastStatus(lastStatus: LastStatus?) = lastStatus(JsonField.ofNullable(lastStatus))

            /** Alias for calling [Builder.lastStatus] with `lastStatus.orElse(null)`. */
            fun lastStatus(lastStatus: Optional<LastStatus>) = lastStatus(lastStatus.getOrNull())

            /**
             * Sets [Builder.lastStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastStatus] with a well-typed [LastStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastStatus(lastStatus: JsonField<LastStatus>) = apply {
                this.lastStatus = lastStatus
            }

            /**
             * Subdirectory holding the project, for monorepos. Null when the project is at the
             * repository root.
             */
            fun rootDir(rootDir: String?) = rootDir(JsonField.ofNullable(rootDir))

            /** Alias for calling [Builder.rootDir] with `rootDir.orElse(null)`. */
            fun rootDir(rootDir: Optional<String>) = rootDir(rootDir.getOrNull())

            /**
             * Sets [Builder.rootDir] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rootDir] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rootDir(rootDir: JsonField<String>) = apply { this.rootDir = rootDir }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Link].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .autoDeploy()
             * .branch()
             * .connection()
             * .createdAt()
             * .functionId()
             * .owner()
             * .provider()
             * .repo()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Link =
                Link(
                    checkRequired("id", id),
                    checkRequired("autoDeploy", autoDeploy),
                    checkRequired("branch", branch),
                    checkRequired("connection", connection),
                    checkRequired("createdAt", createdAt),
                    checkRequired("functionId", functionId),
                    checkRequired("owner", owner),
                    checkRequired("provider", provider),
                    checkRequired("repo", repo),
                    checkRequired("updatedAt", updatedAt),
                    lastCommitMessage,
                    lastCommitSha,
                    lastDeployAt,
                    lastError,
                    lastStatus,
                    rootDir,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ZavudevInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Link = apply {
            if (validated) {
                return@apply
            }

            id()
            autoDeploy()
            branch()
            connection().validate()
            createdAt()
            functionId()
            owner()
            provider().validate()
            repo()
            updatedAt()
            lastCommitMessage()
            lastCommitSha()
            lastDeployAt()
            lastError()
            lastStatus().ifPresent { it.validate() }
            rootDir()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ZavudevInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (autoDeploy.asKnown().isPresent) 1 else 0) +
                (if (branch.asKnown().isPresent) 1 else 0) +
                (connection.asKnown().getOrNull()?.validity() ?: 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (functionId.asKnown().isPresent) 1 else 0) +
                (if (owner.asKnown().isPresent) 1 else 0) +
                (provider.asKnown().getOrNull()?.validity() ?: 0) +
                (if (repo.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (lastCommitMessage.asKnown().isPresent) 1 else 0) +
                (if (lastCommitSha.asKnown().isPresent) 1 else 0) +
                (if (lastDeployAt.asKnown().isPresent) 1 else 0) +
                (if (lastError.asKnown().isPresent) 1 else 0) +
                (lastStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (if (rootDir.asKnown().isPresent) 1 else 0)

        /**
         * How this link authenticates, decided by the server rather than by the caller.
         * - `app`: the Zavu GitHub App is installed on the account. Pushes arrive on the app's
         *   webhook and private repositories work. Nothing to configure in the repository.
         * - `manual`: no installation. The link carries its own secret and you add the webhook to
         *   the repository yourself.
         */
        class Connection @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val APP = of("app")

                @JvmField val MANUAL = of("manual")

                @JvmStatic fun of(value: String) = Connection(JsonField.of(value))
            }

            /** An enum containing [Connection]'s known values. */
            enum class Known {
                APP,
                MANUAL,
            }

            /**
             * An enum containing [Connection]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Connection] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                APP,
                MANUAL,
                /**
                 * An enum member indicating that [Connection] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    APP -> Value.APP
                    MANUAL -> Value.MANUAL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ZavudevInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    APP -> Known.APP
                    MANUAL -> Known.MANUAL
                    else -> throw ZavudevInvalidDataException("Unknown Connection: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ZavudevInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    ZavudevInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ZavudevInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Connection = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: ZavudevInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Connection && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Provider @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val GITHUB = of("github")

                @JvmStatic fun of(value: String) = Provider(JsonField.of(value))
            }

            /** An enum containing [Provider]'s known values. */
            enum class Known {
                GITHUB
            }

            /**
             * An enum containing [Provider]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Provider] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                GITHUB,
                /**
                 * An enum member indicating that [Provider] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    GITHUB -> Value.GITHUB
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ZavudevInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    GITHUB -> Known.GITHUB
                    else -> throw ZavudevInvalidDataException("Unknown Provider: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ZavudevInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    ZavudevInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ZavudevInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Provider = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: ZavudevInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Provider && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class LastStatus @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DEPLOYING = of("deploying")

                @JvmField val DEPLOYED = of("deployed")

                @JvmField val FAILED = of("failed")

                @JvmStatic fun of(value: String) = LastStatus(JsonField.of(value))
            }

            /** An enum containing [LastStatus]'s known values. */
            enum class Known {
                DEPLOYING,
                DEPLOYED,
                FAILED,
            }

            /**
             * An enum containing [LastStatus]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [LastStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DEPLOYING,
                DEPLOYED,
                FAILED,
                /**
                 * An enum member indicating that [LastStatus] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DEPLOYING -> Value.DEPLOYING
                    DEPLOYED -> Value.DEPLOYED
                    FAILED -> Value.FAILED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ZavudevInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    DEPLOYING -> Known.DEPLOYING
                    DEPLOYED -> Known.DEPLOYED
                    FAILED -> Known.FAILED
                    else -> throw ZavudevInvalidDataException("Unknown LastStatus: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ZavudevInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    ZavudevInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ZavudevInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): LastStatus = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: ZavudevInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LastStatus && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Link &&
                id == other.id &&
                autoDeploy == other.autoDeploy &&
                branch == other.branch &&
                connection == other.connection &&
                createdAt == other.createdAt &&
                functionId == other.functionId &&
                owner == other.owner &&
                provider == other.provider &&
                repo == other.repo &&
                updatedAt == other.updatedAt &&
                lastCommitMessage == other.lastCommitMessage &&
                lastCommitSha == other.lastCommitSha &&
                lastDeployAt == other.lastDeployAt &&
                lastError == other.lastError &&
                lastStatus == other.lastStatus &&
                rootDir == other.rootDir &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                autoDeploy,
                branch,
                connection,
                createdAt,
                functionId,
                owner,
                provider,
                repo,
                updatedAt,
                lastCommitMessage,
                lastCommitSha,
                lastDeployAt,
                lastError,
                lastStatus,
                rootDir,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Link{id=$id, autoDeploy=$autoDeploy, branch=$branch, connection=$connection, createdAt=$createdAt, functionId=$functionId, owner=$owner, provider=$provider, repo=$repo, updatedAt=$updatedAt, lastCommitMessage=$lastCommitMessage, lastCommitSha=$lastCommitSha, lastDeployAt=$lastDeployAt, lastError=$lastError, lastStatus=$lastStatus, rootDir=$rootDir, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GitLinkUpdateResponse &&
            link == other.link &&
            webhookUrl == other.webhookUrl &&
            webhookSecret == other.webhookSecret &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(link, webhookUrl, webhookSecret, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GitLinkUpdateResponse{link=$link, webhookUrl=$webhookUrl, webhookSecret=$webhookSecret, additionalProperties=$additionalProperties}"
}
