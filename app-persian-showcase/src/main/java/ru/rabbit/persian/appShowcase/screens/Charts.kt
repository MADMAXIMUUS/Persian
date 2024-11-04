package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.NavController
import io.github.madmaximuus.persian.charts.donut.DonutChart
import io.github.madmaximuus.persian.charts.donut.DonutChartDefaults
import io.github.madmaximuus.persian.charts.pie.PieChart
import io.github.madmaximuus.persian.charts.pie.PieChartDefaults
import io.github.madmaximuus.persian.charts.util.ChartConfig
import io.github.madmaximuus.persian.charts.util.ChartData
import io.github.madmaximuus.persian.checkboxes.Checkbox
import io.github.madmaximuus.persian.forms.Checkboxes
import io.github.madmaximuus.persian.forms.Form
import io.github.madmaximuus.persian.forms.RadioButton
import io.github.madmaximuus.persian.forms.RadioButtons
import io.github.madmaximuus.persian.forms.Subhead
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Charts : Screen {
    override val name: String = "Charts"

    override val navigation: String = "chart"

    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() },
            topAppBarScrollBehavior = topAppBarScrollBehavior,
        ) {
            val (divided, onDividedChange) = remember { mutableStateOf(false) }
            val (title, onTitleChange) = remember { mutableStateOf(false) }
            val (subtitle, onSubtitleChange) = remember { mutableStateOf(false) }
            val (label, onLabelChange) = remember { mutableStateOf(false) }
            val (total, onTotalChange) = remember { mutableStateOf(false) }
            var selectedStyle by remember { mutableStateOf("Pie") }

            val styleStates = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(false)
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
                    .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection)
                    .verticalScroll(rememberScrollState())
                    .navigationBarsPadding()
            ) {
                SampleRow(text = "Sample", firstItem = true) {
                    when (selectedStyle) {
                        "Pie" -> {
                            PieChart(
                                modifier = Modifier,
                                data = listOf(
                                    ChartData(
                                        10.0,
                                        Color(0xFF5F00AA)
                                    ),
                                    ChartData(
                                        20.0,
                                        Color(0xFF004EC3)
                                    ),
                                    ChartData(
                                        30.0,
                                        Color(0xFF277A00)
                                    ),
                                    ChartData(
                                        40.0,
                                        Color(0xFFFFA800)
                                    ),
                                    ChartData(
                                        50.0,
                                        Color(0xFF9B0000)
                                    ),
                                ),
                                config = ChartConfig(
                                    showLabel = label,
                                    showTotalValueAsSubtitle = total,
                                    divided = divided
                                ),
                                style = PieChartDefaults.style()
                            )
                        }

                        "Donut" -> {
                            DonutChart(
                                modifier = Modifier,
                                data = listOf(
                                    ChartData(
                                        10.0,
                                        Color(0xFF5F00AA)
                                    ),
                                    ChartData(
                                        20.0,
                                        Color(0xFF004EC3)
                                    ),
                                    ChartData(
                                        30.0,
                                        Color(0xFF277A00)
                                    ),
                                    ChartData(
                                        40.0,
                                        Color(0xFFFFA800)
                                    ),
                                    ChartData(
                                        50.0,
                                        Color(0xFF9B0000)
                                    ),
                                ),
                                config = ChartConfig(
                                    showLabel = label,
                                    showTotalValueAsSubtitle = total,
                                    divided = divided,
                                ),
                                title = if (title) "Title" else null,
                                subtitle = if (subtitle) "Subtitle" else null,
                                style = DonutChartDefaults.style()
                            )
                        }
                    }
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = PersianTheme.spacing.size12),
                ) {
                    Form(
                        subhead = {
                            Subhead(text = "Style")
                        },
                        content = {
                            RadioButtons {
                                RadioButton(
                                    text = "Pie",
                                    selected = styleStates[0].value,
                                    onSelectedChange = {
                                        styleStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 0
                                        }
                                        selectedStyle = "Pie"
                                    }
                                )
                                RadioButton(
                                    text = "Donut",
                                    selected = styleStates[1].value,
                                    onSelectedChange = {
                                        styleStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 1
                                        }
                                        selectedStyle = "Donut"
                                    }
                                )
                            }
                        }
                    )
                    Form(
                        modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                        subhead = {
                            Subhead(text = "Settings")
                        },
                        content = {
                            Checkboxes {
                                Checkbox(
                                    modifier = Modifier.fillMaxWidth(),
                                    text = "Labels",
                                    checked = label,
                                    onCheckedChange = onLabelChange
                                )
                                if (selectedStyle == "Donut") {
                                    Checkbox(
                                        modifier = Modifier.fillMaxWidth(),
                                        text = "Total",
                                        checked = total,
                                        onCheckedChange = onTotalChange
                                    )
                                    Checkbox(
                                        modifier = Modifier.fillMaxWidth(),
                                        text = "Title",
                                        checked = title,
                                        onCheckedChange = onTitleChange
                                    )
                                    Checkbox(
                                        modifier = Modifier.fillMaxWidth(),
                                        text = "Subtitle",
                                        checked = subtitle,
                                        onCheckedChange = onSubtitleChange
                                    )
                                    Checkbox(
                                        modifier = Modifier.fillMaxWidth(),
                                        text = "Divided",
                                        checked = divided,
                                        onCheckedChange = onDividedChange
                                    )
                                }
                            }
                        }
                    )
                }
            }
        }
    }
}