package com.finex.myproject.domain.repository.model

import com.finex.myproject.data.remote.dto.Loc
import com.finex.myproject.data.remote.dto.State

data class HouseModelResponse(
    val loc: List<Loc>,
    val state: List<State>
)