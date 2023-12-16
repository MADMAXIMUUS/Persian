package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import io.github.madmaximuus.persian.fab.PersianFabDefaults
import io.github.madmaximuus.persian.fab.PersianMediumFab
import io.github.madmaximuus.persian.fab.PersianSmallFab
import io.github.madmaximuus.persian.foundation.icons
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

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
                        PersianSmallFab(
                            icon = MaterialTheme.icons.add,
                            colors = PersianFabDefaults.neutralColors(),
                            onClick = {}
                        )
                        PersianSmallFab(
                            icon = MaterialTheme.icons.add,
                            colors = PersianFabDefaults.primaryColors(),
                            onClick = {}
                        )
                        PersianSmallFab(
                            icon = MaterialTheme.icons.add,
                            colors = PersianFabDefaults.secondaryColors(),
                            onClick = {}
                        )
                        PersianSmallFab(
                            icon = MaterialTheme.icons.add,
                            colors = PersianFabDefaults.tertiaryColors(),
                            onClick = {}
                        )
                    }
                }
                item {
                    SampleRow(text = "Medium FAB") {
                        PersianMediumFab(
                            icon = MaterialTheme.icons.add,
                            colors = PersianFabDefaults.neutralColors(),
                            onClick = {}
                        )
                        PersianMediumFab(
                            icon = MaterialTheme.icons.add,
                            colors = PersianFabDefaults.primaryColors(),
                            onClick = {}
                        )
                        PersianMediumFab(
                            icon = MaterialTheme.icons.add,
                            colors = PersianFabDefaults.secondaryColors(),
                            onClick = {}
                        )
                        PersianMediumFab(
                            icon = MaterialTheme.icons.add,
                            colors = PersianFabDefaults.tertiaryColors(),
                            onClick = {}
                        )
                    }
                }
                item {
                    SampleRow(text = "Medium Expanded FAB") {
                        PersianMediumFab(
                            icon = MaterialTheme.icons.add,
                            title = "Add",
                            expanded = true,
                            colors = PersianFabDefaults.neutralColors(),
                            onClick = {}
                        )
                        PersianMediumFab(
                            icon = MaterialTheme.icons.add,
                            title = "Add",
                            expanded = true,
                            colors = PersianFabDefaults.primaryColors(),
                            onClick = {}
                        )
                    }
                }
                item {
                    SampleRow(text = "Medium Expanded FAB", lastItem = true) {
                        PersianMediumFab(
                            icon = MaterialTheme.icons.add,
                            title = "Add",
                            expanded = true,
                            colors = PersianFabDefaults.secondaryColors(),
                            onClick = {}
                        )
                        PersianMediumFab(
                            icon = MaterialTheme.icons.add,
                            title = "Add",
                            expanded = true,
                            colors = PersianFabDefaults.tertiaryColors(),
                            onClick = {}
                        )
                    }
                }
            }
        }
    }
}