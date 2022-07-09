package com.finex.myproject.ui.screens.main

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController

@Composable
fun MainScreen(
    navController: NavController,
    viewModel: MainHouseListViewModel = hiltViewModel()
) {
    Scaffold(modifier = Modifier.fillMaxSize(), backgroundColor = Color.Red) {

    }
}