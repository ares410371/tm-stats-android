package com.boardgame.tm_stats

import com.boardgame.tm_stats.model.CorporationListResponse
import com.boardgame.tm_stats.model.CorporationResponse
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class RestAPI {

    private val tmStatsApi: TmStatsApi

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://tm-stats.herokuapp.com")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        tmStatsApi = retrofit.create(TmStatsApi::class.java)
    }

    fun getAllCorporations() : Call<List<CorporationResponse>> {
        return tmStatsApi.getAllCorporations()
    }
}