package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import io.github.madmaximuus.persian.counter.PersianBadge
import io.github.madmaximuus.persian.counter.PersianCounter
import io.github.madmaximuus.persian.counter.PersianCounterDefaults
import io.github.madmaximuus.persian.counter.PersianTonalCounter
import io.github.madmaximuus.persian.counter.PersianTransparentCounter
import io.github.madmaximuus.persian.iconButtons.PersianTertiaryIconButton
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.user.base.User
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Counter : Screen {

    override val name: String = "Counters"

    override val navigation: String = "counter"

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
                    SampleRow(text = "Counter Default", firstItem = true) {
                        PersianCounter(count = 1)
                        PersianCounter(count = 10)
                        PersianCounter(count = 100)
                    }
                }
                item {
                    SampleRow(text = "Counter Tonal") {
                        PersianTonalCounter(count = 1)
                        PersianTonalCounter(count = 10)
                        PersianTonalCounter(count = 100)
                    }
                }
                item {
                    SampleRow(text = "Counter Transparent") {
                        PersianTransparentCounter(count = 1)
                        PersianTransparentCounter(count = 10)
                        PersianTransparentCounter(count = 100)
                    }
                }
                item {
                    SampleRow(text = "Badge", lastItem = true) {
                        PersianBadge(
                            content = {
                                PersianTertiaryIconButton(
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                    onClick = {}
                                )
                            },
                            sizes = PersianCounterDefaults.sizes(
                                badgeHorizontalOffset = (-18).dp,
                                badgeVerticalOffset = 20.dp
                            )
                        )
                        PersianBadge(
                            count = 1,
                            content = {
                                PersianTertiaryIconButton(
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                    onClick = {}
                                )
                            }
                        )
                        PersianBadge(
                            count = 10,
                            content = {
                                PersianTertiaryIconButton(
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                    onClick = {}
                                )
                            }
                        )
                        PersianBadge(
                            count = 100,
                            content = {
                                PersianTertiaryIconButton(
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                    onClick = {}
                                )
                            }
                        )
                    }
                }
            }
        }
    }
}