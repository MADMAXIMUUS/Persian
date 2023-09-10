package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold
import ru.rabbit.persian.search.PersianSearch

object Search : Screen {

    override val name: String = "Search"

    override val navigation: String = "search"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() }
        ) {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = it
            ) {
                item {
                    SampleRow(text = "Default", firstItem = true) {
                        PersianSearch.Primary(
                            value = "",
                            onValueChange = {}
                        )
                    }
                }
                item {
                    SampleRow(text = "With Placeholder") {
                        PersianSearch.Primary(
                            value = "",
                            onValueChange = {},
                            placeholder = "Search something"
                        )
                    }
                }
                item {
                    SampleRow(text = "Input") {
                        PersianSearch.Primary(
                            value = "Persian",
                            onValueChange = {},
                            placeholder = "Search something"
                        )
                    }
                }
                item {
                    SampleRow(text = "With navigation icon", lastItem = true) {
                        PersianSearch.Primary(
                            value = "Persian",
                            onValueChange = {},
                            showNavIcon = true,
                            placeholder = "Search something"
                        )
                    }
                }
            }
        }
    }
}