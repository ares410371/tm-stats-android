package com.boardgame.tm_stats

import com.boardgame.tm_stats.model.CorporationListResponse
import com.boardgame.tm_stats.model.CorporationResponse
import retrofit2.Call
import retrofit2.http.GET

interface TmStatsApi {

    @GET("/corporation")
    fun getAllCorporations(): Call<List<CorporationResponse>>
}