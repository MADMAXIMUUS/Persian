package ru.rabbit.persian.appShowcase.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController

interface Screen {

    val name: String

    val navigation: String

    @Composable
    fun Content(navController: NavController?)
}