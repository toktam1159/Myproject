package com.finex.myproject.data.repository

import com.finex.myproject.data.HouseApi
import com.finex.myproject.data.remote.dto.HouseDto
import com.finex.myproject.domain.repository.HouseRepository
import javax.inject.Inject

class HouseRepositoryImpl @Inject constructor(
    private val api: HouseApi
) : HouseRepository {

    override suspend fun getCoins(): HouseDto {
        return api.getCoins()
    }

}