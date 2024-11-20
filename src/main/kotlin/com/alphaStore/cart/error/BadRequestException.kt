package com.alphaStore.cart.error

class BadRequestException(
    var errorMessage: String = "",
    var code: Int? = null,
    var type: String? = null
) : RuntimeException()