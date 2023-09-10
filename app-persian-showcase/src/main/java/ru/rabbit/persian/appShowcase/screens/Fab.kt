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
import ru.rabbit.persian.fab.PersianFab
import ru.rabbit.persian.fab.PersianFabColors
import ru.rabbit.persian.foundation.icons

object Fab : Screen {

    override val name: String = "FABs"

    override val navigation: String = "fab"

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
                    SampleRow(text = "Small FAB", firstItem = true) {
                        PersianFab.Small(
                            icon = MaterialTheme.icons.edit,
                            colors = PersianFabColors.neutral(),
                            onClick = {}
                        )
                        PersianFab.Small(
                            icon = MaterialTheme.icons.edit,
                            colors = PersianFabColors.primary(),
                            onClick = {}
                        )
                        PersianFab.Small(
                            icon = MaterialTheme.icons.edit,
                            colors = PersianFabColors.secondary(),
                            onClick = {}
                        )
                        PersianFab.Small(
                            icon = MaterialTheme.icons.edit,
                            colors = PersianFabColors.tertiary(),
                            onClick = {}
                        )
                    }
                }
                item {
                    SampleRow(text = "Medium FAB") {
                        PersianFab.Medium(
                            icon = MaterialTheme.icons.edit,
                            colors = PersianFabColors.neutral(),
                            onClick = {}
                        )
                        PersianFab.Medium(
                            icon = MaterialTheme.icons.edit,
                            colors = PersianFabColors.primary(),
                            onClick = {}
                        )
                        PersianFab.Medium(
                            icon = MaterialTheme.icons.edit,
                            colors = PersianFabColors.secondary(),
                            onClick = {}
                        )
                        PersianFab.Medium(
                            icon = MaterialTheme.icons.edit,
                            colors = PersianFabColors.tertiary(),
                            onClick = {}
                        )
                    }
                }
                item {
                    SampleRow(text = "Medium Expanded FAB") {
                        PersianFab.Medium(
                            icon = MaterialTheme.icons.edit,
                            title = "Edit",
                            expanded = true,
                            colors = PersianFabColors.neutral(),
                            onClick = {}
                        )
                        PersianFab.Medium(
                            icon = MaterialTheme.icons.edit,
                            title = "Edit",
                            expanded = true,
                            colors = PersianFabColors.primary(),
                            onClick = {}
                        )
                    }
                }
                item {
                    SampleRow(text = "Medium Expanded FAB", lastItem = true) {
                        PersianFab.Medium(
                            icon = MaterialTheme.icons.edit,
                            title = "Edit",
                            expanded = true,
                            colors = PersianFabColors.secondary(),
                            onClick = {}
                        )
                        PersianFab.Medium(
                            icon = MaterialTheme.icons.edit,
                            title = "Edit",
                            expanded = true,
                            colors = PersianFabColors.tertiary(),
                            onClick = {}
                        )
                    }
                }
            }
        }
    }
}