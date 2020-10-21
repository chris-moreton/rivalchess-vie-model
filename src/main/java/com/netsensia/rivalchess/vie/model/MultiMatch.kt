package com.netsensia.rivalchess.vie.model

data class MultiMatch(
    val engineSettings: EngineSettings,
    val nodeVariationPercent: Int,
    val matchCount: Int
)
