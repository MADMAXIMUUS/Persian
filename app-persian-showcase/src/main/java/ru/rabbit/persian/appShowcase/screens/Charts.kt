package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.NavController
import io.github.madmaximuus.persian.charts.donut.DonutChartData
import io.github.madmaximuus.persian.charts.donut.PersianDonutChart
import io.github.madmaximuus.persian.charts.donut.PersianDonutChartsDefaults
import io.github.madmaximuus.persian.charts.donut.util.DonutChartConfig
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Charts : Screen {
    override val name: String = "Charts"

    override val navigation: String = "chart"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() },
            topAppBarScrollBehavior = topAppBarScrollBehavior
        ) {
            LazyColumn(
                modifier = Modifier
                    .padding(it)
                    .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection)
            ) {
                item {
                    SampleRow(text = "Default", firstItem = true) {
                        PersianDonutChart(
                            modifier = Modifier,
                            data = listOf(
                                DonutChartData(
                                    10.0,
                                    MaterialTheme.extendedColorScheme.primary
                                ),
                                DonutChartData(
                                    20.0,
                                    MaterialTheme.extendedColorScheme.secondary
                                ),
                                DonutChartData(
                                    30.0,
                                    MaterialTheme.extendedColorScheme.tertiary
                                ),
                                DonutChartData(
                                    40.0,
                                    MaterialTheme.extendedColorScheme.error
                                ),
                                DonutChartData(
                                    50.0,
                                    MaterialTheme.extendedColorScheme.correct
                                ),
                            ),
                            config = DonutChartConfig(
                                showLabel = false,
                                selectable = false,
                                showTotalValueAsSubtitle = false
                            ),
                            style = PersianDonutChartsDefaults.style(
                                gapPercent = 0f
                            )
                        )
                    }
                }
                item {
                    SampleRow(text = "Selectable") {
                        PersianDonutChart(
                            modifier = Modifier,
                            data = listOf(
                                DonutChartData(
                                    10.0,
                                    MaterialTheme.extendedColorScheme.primary
                                ),
                                DonutChartData(
                                    20.0,
                                    MaterialTheme.extendedColorScheme.secondary
                                ),
                                DonutChartData(
                                    30.0,
                                    MaterialTheme.extendedColorScheme.tertiary
                                ),
                                DonutChartData(
                                    40.0,
                                    MaterialTheme.extendedColorScheme.error
                                ),
                                DonutChartData(
                                    50.0,
                                    MaterialTheme.extendedColorScheme.correct
                                ),
                            ),
                            config = DonutChartConfig(
                                showLabel = false,
                                selectable = true,
                                showTotalValueAsSubtitle = false
                            ),
                            style = PersianDonutChartsDefaults.style(
                                gapPercent = 0f
                            )
                        )
                    }
                }
                item {
                    SampleRow(text = "Labeled") {
                        PersianDonutChart(
                            modifier = Modifier,
                            data = listOf(
                                DonutChartData(
                                    10.0,
                                    MaterialTheme.extendedColorScheme.primary
                                ),
                                DonutChartData(
                                    20.0,
                                    MaterialTheme.extendedColorScheme.secondary
                                ),
                                DonutChartData(
                                    30.0,
                                    MaterialTheme.extendedColorScheme.tertiary
                                ),
                                DonutChartData(
                                    40.0,
                                    MaterialTheme.extendedColorScheme.error
                                ),
                                DonutChartData(
                                    50.0,
                                    MaterialTheme.extendedColorScheme.correct
                                ),
                            ),
                            config = DonutChartConfig(
                                showLabel = true,
                                selectable = true,
                                showTotalValueAsSubtitle = false
                            ),
                            style = PersianDonutChartsDefaults.style(
                                gapPercent = 0f
                            )
                        )
                    }
                }
                item {
                    SampleRow(text = "With Title") {
                        PersianDonutChart(
                            modifier = Modifier,
                            title = "Title",
                            data = listOf(
                                DonutChartData(
                                    10.0,
                                    MaterialTheme.extendedColorScheme.primary
                                ),
                                DonutChartData(
                                    20.0,
                                    MaterialTheme.extendedColorScheme.secondary
                                ),
                                DonutChartData(
                                    30.0,
                                    MaterialTheme.extendedColorScheme.tertiary
                                ),
                                DonutChartData(
                                    40.0,
                                    MaterialTheme.extendedColorScheme.error
                                ),
                                DonutChartData(
                                    50.0,
                                    MaterialTheme.extendedColorScheme.correct
                                ),
                            ),
                            config = DonutChartConfig(
                                showLabel = true,
                                selectable = true,
                                showTotalValueAsSubtitle = false
                            ),
                            style = PersianDonutChartsDefaults.style(
                                gapPercent = 0f
                            )
                        )
                    }
                }
                item {
                    SampleRow(text = "With Subtitle") {
                        PersianDonutChart(
                            modifier = Modifier,
                            title = "Title",
                            subtitle = "Subtitle",
                            data = listOf(
                                DonutChartData(
                                    10.0,
                                    MaterialTheme.extendedColorScheme.primary
                                ),
                                DonutChartData(
                                    20.0,
                                    MaterialTheme.extendedColorScheme.secondary
                                ),
                                DonutChartData(
                                    30.0,
                                    MaterialTheme.extendedColorScheme.tertiary
                                ),
                                DonutChartData(
                                    40.0,
                                    MaterialTheme.extendedColorScheme.error
                                ),
                                DonutChartData(
                                    50.0,
                                    MaterialTheme.extendedColorScheme.correct
                                ),
                            ),
                            config = DonutChartConfig(
                                showLabel = true,
                                selectable = true,
                                showTotalValueAsSubtitle = false
                            ),
                            style = PersianDonutChartsDefaults.style(
                                gapPercent = 0f
                            )
                        )
                    }
                }
                item {
                    SampleRow(text = "With Total as Subtitle") {
                        PersianDonutChart(
                            modifier = Modifier,
                            title = "Title",
                            subtitle = "Subtitle",
                            data = listOf(
                                DonutChartData(
                                    10.0,
                                    MaterialTheme.extendedColorScheme.primary
                                ),
                                DonutChartData(
                                    20.0,
                                    MaterialTheme.extendedColorScheme.secondary
                                ),
                                DonutChartData(
                                    30.0,
                                    MaterialTheme.extendedColorScheme.tertiary
                                ),
                                DonutChartData(
                                    40.0,
                                    MaterialTheme.extendedColorScheme.error
                                ),
                                DonutChartData(
                                    50.0,
                                    MaterialTheme.extendedColorScheme.correct
                                ),
                            ),
                            config = DonutChartConfig(
                                showLabel = true,
                                selectable = true,
                                showTotalValueAsSubtitle = true
                            ),
                            style = PersianDonutChartsDefaults.style(
                                gapPercent = 0f
                            )
                        )
                    }
                }
                item {
                    SampleRow(text = "With Gap") {
                        PersianDonutChart(
                            modifier = Modifier,
                            title = "Title",
                            subtitle = "Subtitle",
                            data = listOf(
                                DonutChartData(
                                    10.0,
                                    MaterialTheme.extendedColorScheme.primary
                                ),
                                DonutChartData(
                                    20.0,
                                    MaterialTheme.extendedColorScheme.secondary
                                ),
                                DonutChartData(
                                    30.0,
                                    MaterialTheme.extendedColorScheme.tertiary
                                ),
                                DonutChartData(
                                    40.0,
                                    MaterialTheme.extendedColorScheme.error
                                ),
                                DonutChartData(
                                    50.0,
                                    MaterialTheme.extendedColorScheme.correct
                                ),
                            ),
                            config = DonutChartConfig(
                                showLabel = true,
                                selectable = true,
                                showTotalValueAsSubtitle = true
                            ),
                            style = PersianDonutChartsDefaults.style(
                                gapPercent = 0.04f
                            )
                        )
                    }
                }
            }
        }
    }
}