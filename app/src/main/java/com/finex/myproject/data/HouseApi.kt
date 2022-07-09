package com.finex.myproject.data

import com.finex.myproject.data.remote.dto.HouseDto
import retrofit2.http.GET


interface HouseApi {

    @GET("tourism-project/master/db.json")
    suspend fun getCoins(): HouseDto
/*
    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDto*/
}