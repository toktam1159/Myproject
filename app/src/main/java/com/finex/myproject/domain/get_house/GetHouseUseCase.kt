package com.finex.myproject.domain.get_house

import com.finex.myproject.data.remote.dto.toHouse
import com.finex.myproject.domain.repository.HouseRepository
import com.finex.myproject.domain.repository.model.HouseModelResponse
import com.plcoding.cryptocurrencyappyt.common.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetHouseUseCase @Inject constructor(
    private val repository: HouseRepository
) {
    operator fun invoke(): Flow<Resource<HouseModelResponse>> = flow {
        try {
            emit(Resource.Loading<HouseModelResponse>())
            val coins = repository.getCoins()
           // emit(Resource.Success<HouseModelResponse>(coins))
        } catch(e: HttpException) {
            emit(Resource.Error<HouseModelResponse>(e.localizedMessage ?: "An unexpected error occured"))
        } catch(e: IOException) {
            emit(Resource.Error<HouseModelResponse>("Couldn't reach server. Check your internet connection."))
        }
    }
}