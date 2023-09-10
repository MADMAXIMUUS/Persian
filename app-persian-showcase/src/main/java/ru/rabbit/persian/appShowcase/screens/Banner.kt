package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold
import ru.rabbit.persian.banners.PersianBanner
import ru.rabbit.persian.foundation.icons

object Banner : Screen {

    override val name: String = "Banner"

    override val navigation: String = "banner"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() }
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize(),
                contentPadding = it
            ) {
                item {
                    SampleRow(text = "Banner", firstItem = true) {
                        PersianBanner.Tertiary(text = "Some Text")
                    }
                }
                item {
                    SampleRow(text = "Banner with icon", lastItem = true) {
                        PersianBanner.Tertiary(
                            text = "Some Text",
                            icon = MaterialTheme.icons.globeUk
                        )
                    }
                }
            }
        }
    }
}