package com.alphaStore.cart.model.minifiedImpl


import com.alphaStore.cart.model.minified.FetchMostRecentMinified
import java.time.Instant

data class FetchMostRecentMinifiedImpl(
    override var id: String,
    override var createdDate: Instant
) : FetchMostRecentMinified