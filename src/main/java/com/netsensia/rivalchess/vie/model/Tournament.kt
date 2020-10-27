package com.netsensia.rivalchess.vie.model

data class Tournament(
    val engines: List<EngineSettings>,
    val tournamentType: TournamentType,
    val nodeVariationPercent: Int,
    val roundCount: Int
)
