package com.finex.myproject.domain.repository.model

data class State(
    val about: String,
    val capital: String,
    val climate: String,
    val food: String,
    val history: String,
    val id: String,
    val img: List<String>,
    val name: String,
    val products: List<Product>,
    val time: String,
    val tourist: List<Tourist>
)