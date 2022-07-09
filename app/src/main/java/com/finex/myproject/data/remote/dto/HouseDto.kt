package com.finex.myproject.data.remote.dto

import com.finex.myproject.domain.repository.model.HouseModelResponse


data class HouseDto(
    val loc: List<Loc>,
    val state: List<State>
)

fun HouseDto.toHouse(): HouseModelResponse {
    return HouseModelResponse(
        loc = loc,
        state = state
    )
}