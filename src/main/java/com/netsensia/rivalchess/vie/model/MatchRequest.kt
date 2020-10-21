package com.netsensia.rivalchess.vie.model

data class MatchRequest(
    val engine1: EngineSettings,
    val engine2: EngineSettings,
    val nodeVariationPercent: Int,
    val matchCount: Int
)
