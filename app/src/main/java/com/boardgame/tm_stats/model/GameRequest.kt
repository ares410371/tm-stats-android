package com.boardgame.tm_stats.model

class GameRequest (
    val boardName: String,
    val playerOne: PlayerWrapper,
    val playerTwo: PlayerWrapper,
    val playerThree: PlayerWrapper,
    val playerFour: PlayerWrapper,
    val playerFive: PlayerWrapper,
    val generationCount: Int
)