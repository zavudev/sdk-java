// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.errors

import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.http.Headers

abstract class ZavudevServiceException
protected constructor(message: String, cause: Throwable? = null) :
    ZavudevException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
