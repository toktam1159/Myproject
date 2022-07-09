package com.finex.myproject

sealed class Screen(val route: String) {
    object HouseListScreen: Screen("house_list_screen")
    object HouseDetailScreen: Screen("house_detail_screen")
}
