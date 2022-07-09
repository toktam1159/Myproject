package com.finex.myproject.domain.repository

import com.finex.myproject.data.remote.dto.HouseDto


interface HouseRepository {

    suspend fun getCoins(): HouseDto

    //suspend fun getCoinById(coinId: String): CoinDetailDto
}