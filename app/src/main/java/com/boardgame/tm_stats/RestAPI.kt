package com.boardgame.tm_stats

import com.boardgame.tm_stats.model.CorporationResponse
import com.boardgame.tm_stats.utils.BASE_URL
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class RestAPI {

    private val tmStatsApi: TmStatsApi

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
        tmStatsApi = retrofit.create(TmStatsApi::class.java)
    }

    fun getAllCorporations() : Call<List<CorporationResponse>> {
        return tmStatsApi.getAllCorporations()
    }
}