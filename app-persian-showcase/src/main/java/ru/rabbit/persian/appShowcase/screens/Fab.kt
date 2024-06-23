package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.navigation.NavController
import io.github.madmaximuus.persian.fab.FabDefaults
import io.github.madmaximuus.persian.fab.MediumFab
import io.github.madmaximuus.persian.fab.SmallFab
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
                        SmallFab(
                            icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                            colors = FabDefaults.neutralColors(),
                            onClick = {}
                        )
                        SmallFab(
                            icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                            colors = FabDefaults.primaryColors(),
                            onClick = {}
                        )
                        SmallFab(
                            icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                            colors = FabDefaults.secondaryColors(),
                            onClick = {}
                        )
                        SmallFab(
                            icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                            colors = FabDefaults.tertiaryColors(),
                            onClick = {}
                        )
                    }
                }
                item {
                    SampleRow(text = "Medium FAB") {
                        MediumFab(
                            icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                            colors = FabDefaults.neutralColors(),
                            onClick = {}
                        )
                        MediumFab(
                            icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                            colors = FabDefaults.primaryColors(),
                            onClick = {}
                        )
                        MediumFab(
                            icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                            colors = FabDefaults.secondaryColors(),
                            onClick = {}
                        )
                        MediumFab(
                            icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                            colors = FabDefaults.tertiaryColors(),
                            onClick = {}
                        )
                    }
                }
                item {
                    SampleRow(text = "Medium Expanded FAB") {
                        MediumFab(
                            icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                            title = "Add",
                            expanded = true,
                            colors = FabDefaults.neutralColors(),
                            onClick = {}
                        )
                        MediumFab(
                            icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                            title = "Add",
                            expanded = true,
                            colors = FabDefaults.primaryColors(),
                            onClick = {}
                        )
                    }
                }
                item {
                    SampleRow(text = "Medium Expanded FAB", lastItem = true) {
                        MediumFab(
                            icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                            title = "Add",
                            expanded = true,
                            colors = FabDefaults.secondaryColors(),
                            onClick = {}
                        )
                        MediumFab(
                            icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                            title = "Add",
                            expanded = true,
                            colors = FabDefaults.tertiaryColors(),
                            onClick = {}
                        )
                    }
                }
            }
        }
    }
}