package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import io.github.madmaximuus.persian.counter.Badge
import io.github.madmaximuus.persian.counter.CounterDefaults
import io.github.madmaximuus.persian.counter.ErrorCounter
import io.github.madmaximuus.persian.counter.PrimaryCounter
import io.github.madmaximuus.persian.counter.SecondaryCounter
import io.github.madmaximuus.persian.counter.TertiaryCounter
import io.github.madmaximuus.persian.counter.utils.BadgeStyle
import io.github.madmaximuus.persian.iconButton.TertiaryIconButton
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.user.base.User
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Counter : Screen {

    override val name: String = "Counters"

    override val navigation: String = "counter"

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
                    SampleRow(text = "Error counter", firstItem = true) {
                        ErrorCounter(count = 1)
                        ErrorCounter(count = 10)
                        ErrorCounter(count = 100)
                    }
                }
                item {
                    SampleRow(text = "Primary counter") {
                        PrimaryCounter(count = 1)
                        PrimaryCounter(count = 10)
                        PrimaryCounter(count = 100)
                    }
                }
                item {
                    SampleRow(text = "Secondary Counter") {
                        SecondaryCounter(count = 1)
                        SecondaryCounter(count = 10)
                        SecondaryCounter(count = 100)
                    }
                }
                item {
                    SampleRow(text = "Tertiary counter") {
                        TertiaryCounter(count = 1)
                        TertiaryCounter(count = 10)
                        TertiaryCounter(count = 100)
                    }
                }
                item {
                    SampleRow(text = "Error badge") {
                        Badge(
                            count = 1,
                            colors = CounterDefaults.errorColors(),
                            sizes = CounterDefaults.sizes(
                                badgeTopOffset = 16.dp,
                                badgeRightOffset = 20.dp
                            ),
                            content = {
                                TertiaryIconButton(
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                    onClick = {}
                                )
                            },
                        )
                        Badge(
                            count = 1,
                            style = BadgeStyle.NUMBER,
                            sizes = CounterDefaults.sizes(
                                badgeTopOffset = 19.dp,
                                badgeRightOffset = 23.dp
                            ),
                            colors = CounterDefaults.errorColors(),
                            content = {
                                TertiaryIconButton(
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                    onClick = {}
                                )
                            }
                        )
                        Badge(
                            count = 10,
                            style = BadgeStyle.NUMBER,
                            sizes = CounterDefaults.sizes(
                                badgeTopOffset = 19.dp,
                                badgeRightOffset = 23.dp
                            ),
                            colors = CounterDefaults.errorColors(),
                            content = {
                                TertiaryIconButton(
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                    onClick = {}
                                )
                            }
                        )
                        Badge(
                            count = 100,
                            style = BadgeStyle.NUMBER,
                            sizes = CounterDefaults.sizes(
                                badgeTopOffset = 19.dp,
                                badgeRightOffset = 23.dp
                            ),
                            colors = CounterDefaults.errorColors(),
                            content = {
                                TertiaryIconButton(
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                    onClick = {}
                                )
                            }
                        )
                    }
                }
                item {
                    SampleRow(text = "Error badge") {
                        Badge(
                            count = 1,
                            colors = CounterDefaults.primaryColors(),
                            sizes = CounterDefaults.sizes(
                                badgeTopOffset = 16.dp,
                                badgeRightOffset = 20.dp
                            ),
                            content = {
                                TertiaryIconButton(
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                    onClick = {}
                                )
                            },
                        )
                        Badge(
                            count = 1,
                            style = BadgeStyle.NUMBER,
                            sizes = CounterDefaults.sizes(
                                badgeTopOffset = 19.dp,
                                badgeRightOffset = 23.dp
                            ),
                            colors = CounterDefaults.primaryColors(),
                            content = {
                                TertiaryIconButton(
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                    onClick = {}
                                )
                            }
                        )
                        Badge(
                            count = 10,
                            style = BadgeStyle.NUMBER,
                            sizes = CounterDefaults.sizes(
                                badgeTopOffset = 19.dp,
                                badgeRightOffset = 23.dp
                            ),
                            colors = CounterDefaults.primaryColors(),
                            content = {
                                TertiaryIconButton(
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                    onClick = {}
                                )
                            }
                        )
                        Badge(
                            count = 100,
                            style = BadgeStyle.NUMBER,
                            sizes = CounterDefaults.sizes(
                                badgeTopOffset = 19.dp,
                                badgeRightOffset = 23.dp
                            ),
                            colors = CounterDefaults.primaryColors(),
                            content = {
                                TertiaryIconButton(
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                    onClick = {}
                                )
                            }
                        )
                    }
                }
                item {
                    SampleRow(text = "Error badge", lastItem = true) {
                        Badge(
                            count = 1,
                            sizes = CounterDefaults.sizes(
                                badgeTopOffset = 16.dp,
                                badgeRightOffset = 20.dp
                            ),
                            colors = CounterDefaults.secondaryColors(),
                            content = {
                                TertiaryIconButton(
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                    onClick = {}
                                )
                            },
                        )
                        Badge(
                            count = 1,
                            style = BadgeStyle.NUMBER,
                            sizes = CounterDefaults.sizes(
                                badgeTopOffset = 19.dp,
                                badgeRightOffset = 23.dp
                            ),
                            colors = CounterDefaults.secondaryColors(),
                            content = {
                                TertiaryIconButton(
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                    onClick = {}
                                )
                            }
                        )
                        Badge(
                            count = 10,
                            style = BadgeStyle.NUMBER,
                            sizes = CounterDefaults.sizes(
                                badgeTopOffset = 19.dp,
                                badgeRightOffset = 23.dp
                            ),
                            colors = CounterDefaults.secondaryColors(),
                            content = {
                                TertiaryIconButton(
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                    onClick = {}
                                )
                            }
                        )
                        Badge(
                            count = 100,
                            style = BadgeStyle.NUMBER,
                            sizes = CounterDefaults.sizes(
                                badgeTopOffset = 19.dp,
                                badgeRightOffset = 23.dp
                            ),
                            colors = CounterDefaults.secondaryColors(),
                            content = {
                                TertiaryIconButton(
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