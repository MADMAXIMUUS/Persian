package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.navigation.NavController
import io.github.madmaximuus.persian.checkboxes.Checkbox
import io.github.madmaximuus.persian.fab.Fab
import io.github.madmaximuus.persian.fab.FabDefaults
import io.github.madmaximuus.persian.fab.SmallFab
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.plus.base.Plus
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Fab : Screen {

    override val name: String = "FABs"

    override val navigation: String = "fab"

    @OptIn(ExperimentalLayoutApi::class)
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
                    SampleRow(text = "FAB") {
                        Fab(
                            icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                            colors = FabDefaults.neutralColors(),
                            onClick = {}
                        )
                        Fab(
                            icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                            colors = FabDefaults.primaryColors(),
                            onClick = {}
                        )
                        Fab(
                            icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                            colors = FabDefaults.secondaryColors(),
                            onClick = {}
                        )
                        Fab(
                            icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                            colors = FabDefaults.tertiaryColors(),
                            onClick = {}
                        )
                    }
                }
                item {
                    SampleRow(text = "FAB with text") {
                        val (expandable, onExpandableChange) = remember { mutableStateOf(true) }
                        Column(
                            Modifier.fillMaxWidth()
                        ) {
                            FlowRow(
                                modifier = Modifier.fillMaxWidth(),
                                maxItemsInEachRow = 2,
                                horizontalArrangement = Arrangement.spacedBy(
                                    PersianTheme.spacing.size24,
                                    Alignment.CenterHorizontally
                                ),
                                verticalArrangement = Arrangement.spacedBy(
                                    PersianTheme.spacing.size24,
                                    Alignment.CenterVertically
                                ),
                            ) {
                                Fab(
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                                    title = "Add",
                                    expanded = expandable,
                                    colors = FabDefaults.neutralColors(),
                                    onClick = {}
                                )
                                Fab(
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                                    title = "Add",
                                    expanded = expandable,
                                    colors = FabDefaults.primaryColors(),
                                    onClick = {}
                                )
                                Fab(
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                                    title = "Add",
                                    expanded = expandable,
                                    colors = FabDefaults.secondaryColors(),
                                    onClick = {}
                                )
                                Fab(
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                                    title = "Add",
                                    expanded = expandable,
                                    colors = FabDefaults.tertiaryColors(),
                                    onClick = {}
                                )
                            }
                            Checkbox(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = PersianTheme.spacing.size8),
                                text = "Expandable",
                                checked = expandable,
                                onCheckedChange = onExpandableChange
                            )
                        }
                    }
                }
            }
        }
    }
}