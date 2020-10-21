package com.netsensia.rivalchess.vie.model

data class EngineSettings(
        val version: String,
        val maxNodes: Int,
        val maxMillis: Int,
        val openingBook: String
)