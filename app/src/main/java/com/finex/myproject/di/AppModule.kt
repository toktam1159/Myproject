package com.finex.myproject.di

import com.finex.myproject.data.HouseApi
import com.finex.myproject.data.repository.HouseRepositoryImpl
import com.plcoding.cryptocurrencyappyt.common.Constants
import com.finex.myproject.domain.repository.HouseRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providePaprikaApi(): HouseApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(HouseApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinRepository(api: HouseApi): HouseRepository {
        return HouseRepositoryImpl(api)
    }
}