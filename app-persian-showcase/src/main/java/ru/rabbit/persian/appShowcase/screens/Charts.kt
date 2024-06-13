package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.NavController
import io.github.madmaximuus.persian.charts.donut.PersianDonutChart
import io.github.madmaximuus.persian.charts.donut.PersianDonutChartsDefaults
import io.github.madmaximuus.persian.charts.pie.PersianPieChart
import io.github.madmaximuus.persian.charts.util.ChartConfig
import io.github.madmaximuus.persian.charts.util.ChartData
import io.github.madmaximuus.persian.checkboxes.PersianCheckbox
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text
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
            topAppBarScrollBehavior = topAppBarScrollBehavior,
        ) {
            val (divided, onDividedChange) = remember { mutableStateOf(false) }
            val (title, onTitleChange) = remember { mutableStateOf(false) }
            val (subtitle, onSubtitleChange) = remember { mutableStateOf(false) }
            val (label, onLabelChange) = remember { mutableStateOf(false) }
            val (total, onTotalChange) = remember { mutableStateOf(false) }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
                    .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection)
                    .verticalScroll(rememberScrollState())
                    .navigationBarsPadding()
            ) {
                SampleRow(text = "Sample", firstItem = true) {
                    PersianDonutChart(
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
                        title = if (title) "Title" else null,
                        subtitle = if (subtitle) "Subtitle" else null,
                        style = PersianDonutChartsDefaults.style()
                    )
                }
                SampleRow(text = "Sample", firstItem = true) {
                    PersianPieChart(
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
                        style = PersianDonutChartsDefaults.style()
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = PersianTheme.spacing.size8,
                            bottom = PersianTheme.spacing.size8,
                            start = PersianTheme.spacing.size12,
                            end = PersianTheme.spacing.size12
                        ),
                ) {
                    Text(
                        text = "Settings",
                        style = PersianTheme.typography.titleMedium,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = Modifier.height(PersianTheme.spacing.size4))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        PersianCheckbox(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Show Total",
                            checked = total,
                            onCheckedChange = onTotalChange
                        )
                        PersianCheckbox(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Show Label",
                            checked = label,
                            onCheckedChange = onLabelChange
                        )
                        PersianCheckbox(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Title",
                            checked = title,
                            onCheckedChange = onTitleChange
                        )
                        PersianCheckbox(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Subtitle",
                            checked = subtitle,
                            onCheckedChange = onSubtitleChange
                        )
                        PersianCheckbox(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Divided",
                            checked = divided,
                            onCheckedChange = onDividedChange
                        )
                    }
                }
            }
        }
    }
}