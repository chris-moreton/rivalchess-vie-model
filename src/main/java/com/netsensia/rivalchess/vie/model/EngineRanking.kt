package com.netsensia.rivalchess.vie.model

data class EngineRanking(
        val name: String,
        val elo: Int,
        val played: Int
)