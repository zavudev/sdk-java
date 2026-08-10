package com.zavudev.api.errors

open class ZavudevException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
