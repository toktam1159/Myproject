package com.finex.myproject.ui.screens.main

import com.finex.myproject.domain.repository.model.HouseModelResponse

data class HouseListState(
    val isLoading: Boolean = false,
    val houses: HouseModelResponse? = null,
    val error: String = ""
)
