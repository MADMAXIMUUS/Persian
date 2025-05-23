package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
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
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.NavController
import io.github.madmaximuus.persian.checkbox.Checkbox
import io.github.madmaximuus.persian.formItem.Checkboxes
import io.github.madmaximuus.persian.formItem.FormItem
import io.github.madmaximuus.persian.formItem.RadioButton
import io.github.madmaximuus.persian.formItem.RadioButtons
import io.github.madmaximuus.persian.formItem.Subhead
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import ru.rabbit.persian.appShowcase.R
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Charts : Screen {
    override val name: String = "Charts"

    override val image: Int = R.drawable.charts

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
                CustomRoundedDonutChart(
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(1f),
                    data = listOf(40f, 30f, 20f, 10f),
                    colors = listOf(Color.Red, Color.Blue, Color.Green, Color.Yellow),
                    gapSize = 12f, // Настоящие разделители
                    innerRadiusFraction = 0.5f, // Donut (0f - Pie)
                    cornerRadius = 15f // Закругленные углы, как в Swift Charts
                )
                /*SampleRow(text = "Sample", firstItem = true) {
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
                }*/
                Column(modifier = Modifier.fillMaxWidth()) {
                    FormItem(
                        subhead = { Subhead(text = "Style") },
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
                    FormItem(
                        subhead = { Subhead(text = "Settings") },
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

    @Composable
    fun CustomRoundedDonutChart(
        data: List<Float>,
        colors: List<Color>,
        modifier: Modifier = Modifier,
        gapSize: Float = 0f, // Размер разделителей
        innerRadiusFraction: Float = 0.6f, // 0f - Pie, > 0 - Donut
        cornerRadius: Float = 15f // Закругленные углы
    ) {
        val sum = data.sum()
        val angles = data.map { it / sum * 360f }

        Canvas(modifier = modifier) {
            val radius = size.minDimension / 2
            val center = Offset(size.width / 2, size.height / 2)
            val innerRadius = radius * innerRadiusFraction
            val gapAngle = gapSize / radius * (180f / Math.PI.toFloat()) // Переводим gap в градусы

            var startAngle = 0f

            angles.forEachIndexed { index, sweepAngleRaw ->
                val sweepAngle = sweepAngleRaw - gapAngle // Коррекция с учётом gap
                if (sweepAngle <= 0) return@forEachIndexed

                /*drawRoundedArc(
                    color = Color.Blue,
                    startAngle = startAngle,
                    sweepAngle = sweepAngle,
                    width = 1000f,
                    cornerRadius = 0f
                )*/
                startAngle += sweepAngleRaw
            }
        }
    }


}