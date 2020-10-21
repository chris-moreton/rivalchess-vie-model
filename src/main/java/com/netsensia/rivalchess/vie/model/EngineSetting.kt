package com.netsensia.rivalchess.vie.model

data class EngineSetting(
        val version: String,
        val maxNodes: Int,
        val maxMillis: Int,
        val openingBook: String
)