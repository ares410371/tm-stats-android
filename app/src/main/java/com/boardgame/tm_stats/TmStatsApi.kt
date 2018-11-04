package com.boardgame.tm_stats

import com.boardgame.tm_stats.model.CorporationResponse
import com.boardgame.tm_stats.model.GameResponse
import com.boardgame.tm_stats.model.GameRequest
import com.boardgame.tm_stats.model.PlayerResponse
import com.boardgame.tm_stats.model.StatsCorporationResponse
import com.boardgame.tm_stats.model.StatsPlayerResponse
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface TmStatsApi {

    @GET("/corporation")
    fun getAllCorporations(): Call<List<CorporationResponse>>

    @GET("/game")
    fun getAllGames(): Call<List<GameResponse>>

    @POST("/game")
    fun createGame(@Body gameRequest: GameRequest): Call<ResponseBody>

    @GET("/player")
    fun getAllPlayers(): Call<List<PlayerResponse>>

    @GET("/stats/corporation")
    fun getStatsCorporation(): Call<List<StatsCorporationResponse>>

    @GET("/stats/player")
    fun getStatPlayer(): Call<List<StatsPlayerResponse>>
}