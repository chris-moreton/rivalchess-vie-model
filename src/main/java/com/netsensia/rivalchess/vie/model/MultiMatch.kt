package com.netsensia.rivalchess.vie.model

data class MultiMatch(
        val engineMatch: EngineMatch,
        val nodeVariationPercent: Int,
        val matchCount: Int
)
