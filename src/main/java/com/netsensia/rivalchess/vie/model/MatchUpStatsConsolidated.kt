package com.netsensia.rivalchess.vie.model

data class MatchUpStatsConsolidated (
        val engine1: String,
        val engine2: String,
        val engine1Wins: Int,
        val draws: Int,
        val engine2Wins: Int,
        val engine1AsWhiteCount: Int
)