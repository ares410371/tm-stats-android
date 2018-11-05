package com.boardgame.tm_stats.model

data class PlayerWrapper (val name: String, val points: Int, val corporation: Long) {
  override fun toString(): String = "(name: $name, points: $points, corporation id: $corporation)"
}