package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.navigation.NavController
import io.github.madmaximuus.persian.fab.PersianFabDefaults
import io.github.madmaximuus.persian.fab.PersianMediumFab
import io.github.madmaximuus.persian.fab.PersianSmallFab
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.plus.base.Plus
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
                            icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                            colors = PersianFabDefaults.neutralColors(),
                            onClick = {}
                        )
                        PersianSmallFab(
                            icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                            colors = PersianFabDefaults.primaryColors(),
                            onClick = {}
                        )
                        PersianSmallFab(
                            icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                            colors = PersianFabDefaults.secondaryColors(),
                            onClick = {}
                        )
                        PersianSmallFab(
                            icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                            colors = PersianFabDefaults.tertiaryColors(),
                            onClick = {}
                        )
                    }
                }
                item {
                    SampleRow(text = "Medium FAB") {
                        PersianMediumFab(
                            icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                            colors = PersianFabDefaults.neutralColors(),
                            onClick = {}
                        )
                        PersianMediumFab(
                            icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                            colors = PersianFabDefaults.primaryColors(),
                            onClick = {}
                        )
                        PersianMediumFab(
                            icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                            colors = PersianFabDefaults.secondaryColors(),
                            onClick = {}
                        )
                        PersianMediumFab(
                            icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                            colors = PersianFabDefaults.tertiaryColors(),
                            onClick = {}
                        )
                    }
                }
                item {
                    SampleRow(text = "Medium Expanded FAB") {
                        PersianMediumFab(
                            icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                            title = "Add",
                            expanded = true,
                            colors = PersianFabDefaults.neutralColors(),
                            onClick = {}
                        )
                        PersianMediumFab(
                            icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
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
                            icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                            title = "Add",
                            expanded = true,
                            colors = PersianFabDefaults.secondaryColors(),
                            onClick = {}
                        )
                        PersianMediumFab(
                            icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
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