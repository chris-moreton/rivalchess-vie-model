package com.netsensia.rivalchess.vie.model

data class Tournament(
    val engineSettings: List<EngineSetting>,
    val tournamentType: TournamentType,
    val nodeVariationPercent: Int,
    val roundCount: Int
)
