package com.boardgame.tm_stats.model

data class GameRequest (
    val boardName: String,
    val generationCount: Int,
    val playerOne: PlayerWrapper? = null,
    val playerTwo: PlayerWrapper? = null,
    val playerThree: PlayerWrapper? = null,
    val playerFour: PlayerWrapper? = null,
    val playerFive: PlayerWrapper? = null
)