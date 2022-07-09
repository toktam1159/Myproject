package com.finex.myproject.ui.screens.main

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.finex.myproject.domain.get_house.GetHouseUseCase
import com.plcoding.cryptocurrencyappyt.common.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainHouseListViewModel @Inject constructor(
    private val getHouseUseCase: GetHouseUseCase
) : ViewModel() {

    private val _state = mutableStateOf(HouseListState())
    val state: State<HouseListState> = _state

    init {
        viewModelScope.launch {
delay(10000L)
            getCoins()
        }
    }

    private fun getCoins() {
        getHouseUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = HouseListState(houses = result.data)
                }
                is Resource.Error -> {
                    _state.value = HouseListState(
                        error = result.message ?: "An unexpected error occured"
                    )
                }
                is Resource.Loading -> {
                    _state.value = HouseListState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }
}