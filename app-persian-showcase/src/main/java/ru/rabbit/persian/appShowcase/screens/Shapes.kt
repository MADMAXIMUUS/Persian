package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import ru.rabbit.persian.appShowcase.R
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Shapes : Screen {
    override val name: String = "Shapes"
    override val image: Int = R.drawable.shapes
    override val navigation: String = "shapes"

    @OptIn(ExperimentalLayoutApi::class)
    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() },
            topAppBarScrollBehavior = topAppBarScrollBehavior
        ) {
            FlowRow(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
                    .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection)
                    .verticalScroll(rememberScrollState())
                    .navigationBarsPadding(),
                horizontalArrangement = Arrangement.spacedBy(
                    PersianTheme.spacing.size12,
                    Alignment.CenterHorizontally
                ),
                verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size12)
            ) {
                Box(
                    modifier = Modifier
                        .size(200.dp)
                        .background(PersianTheme.colorScheme.surfaceContainerHighest)
                        .padding(PersianTheme.spacing.size12),
                ){
                    Text(
                        modifier = Modifier.align(Alignment.TopStart),
                        text = "0",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.TopEnd),
                        text = "0",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.BottomStart),
                        text = "0",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.BottomEnd),
                        text = "0",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                }
                Box(
                    modifier = Modifier
                        .size(200.dp)
                        .background(
                            PersianTheme.colorScheme.surfaceContainerHighest,
                            PersianTheme.shapes.shape4
                        )
                        .padding(PersianTheme.spacing.size12)
                ){
                    Text(
                        modifier = Modifier.align(Alignment.TopStart),
                        text = "4",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.TopEnd),
                        text = "4",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.BottomStart),
                        text = "4",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.BottomEnd),
                        text = "4",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                }
                Box(
                    modifier = Modifier
                        .size(200.dp)
                        .background(
                            PersianTheme.colorScheme.surfaceContainerHighest,
                            PersianTheme.shapes.shape6
                        )
                        .padding(PersianTheme.spacing.size12)
                ){
                    Text(
                        modifier = Modifier.align(Alignment.TopStart),
                        text = "6",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.TopEnd),
                        text = "6",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.BottomStart),
                        text = "6",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.BottomEnd),
                        text = "6",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                }
                Box(
                    modifier = Modifier
                        .size(200.dp)
                        .background(
                            PersianTheme.colorScheme.surfaceContainerHighest,
                            PersianTheme.shapes.shape8
                        )
                        .padding(PersianTheme.spacing.size12)
                ){
                    Text(
                        modifier = Modifier.align(Alignment.TopStart),
                        text = "8",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.TopEnd),
                        text = "8",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.BottomStart),
                        text = "8",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.BottomEnd),
                        text = "8",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                }
                Box(
                    modifier = Modifier
                        .size(200.dp)
                        .background(
                            PersianTheme.colorScheme.surfaceContainerHighest,
                            PersianTheme.shapes.shape10
                        )
                        .padding(PersianTheme.spacing.size12)
                ){
                    Text(
                        modifier = Modifier.align(Alignment.TopStart),
                        text = "8",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.TopEnd),
                        text = "8",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.BottomStart),
                        text = "8",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.BottomEnd),
                        text = "8",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                }
                Box(
                    modifier = Modifier
                        .size(200.dp)
                        .background(
                            PersianTheme.colorScheme.surfaceContainerHighest,
                            PersianTheme.shapes.shape10
                        )
                        .padding(PersianTheme.spacing.size12)
                ){
                    Text(
                        modifier = Modifier.align(Alignment.TopStart),
                        text = "10",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.TopEnd),
                        text = "10",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.BottomStart),
                        text = "10",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.BottomEnd),
                        text = "10",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                }
                Box(
                    modifier = Modifier
                        .size(200.dp)
                        .background(
                            PersianTheme.colorScheme.surfaceContainerHighest,
                            PersianTheme.shapes.shape12
                        )
                        .padding(PersianTheme.spacing.size12)
                ){
                    Text(
                        modifier = Modifier.align(Alignment.TopStart),
                        text = "12",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.TopEnd),
                        text = "12",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.BottomStart),
                        text = "12",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.BottomEnd),
                        text = "12",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                }
                Box(
                    modifier = Modifier
                        .size(200.dp)
                        .background(
                            PersianTheme.colorScheme.surfaceContainerHighest,
                            PersianTheme.shapes.shape14
                        )
                        .padding(PersianTheme.spacing.size12)
                ){
                    Text(
                        modifier = Modifier.align(Alignment.TopStart),
                        text = "14",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.TopEnd),
                        text = "14",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.BottomStart),
                        text = "14",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.BottomEnd),
                        text = "14",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                }
                Box(
                    modifier = Modifier
                        .size(200.dp)
                        .background(
                            PersianTheme.colorScheme.surfaceContainerHighest,
                            PersianTheme.shapes.shape16
                        )
                        .padding(PersianTheme.spacing.size12)
                ){
                    Text(
                        modifier = Modifier.align(Alignment.TopStart),
                        text = "16",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.TopEnd),
                        text = "16",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.BottomStart),
                        text = "16",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.BottomEnd),
                        text = "16",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                }
                Box(
                    modifier = Modifier
                        .size(200.dp)
                        .background(
                            PersianTheme.colorScheme.surfaceContainerHighest,
                            PersianTheme.shapes.shape18
                        )
                        .padding(PersianTheme.spacing.size12)
                ){
                    Text(
                        modifier = Modifier.align(Alignment.TopStart),
                        text = "18",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.TopEnd),
                        text = "18",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.BottomStart),
                        text = "18",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.BottomEnd),
                        text = "18",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                }
                Box(
                    modifier = Modifier
                        .size(200.dp)
                        .background(
                            PersianTheme.colorScheme.surfaceContainerHighest,
                            PersianTheme.shapes.shape20
                        )
                        .padding(PersianTheme.spacing.size12)
                ){
                    Text(
                        modifier = Modifier.align(Alignment.TopStart),
                        text = "20",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.TopEnd),
                        text = "20",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.BottomStart),
                        text = "20",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.BottomEnd),
                        text = "20",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                }
                Box(
                    modifier = Modifier
                        .size(200.dp)
                        .background(
                            PersianTheme.colorScheme.surfaceContainerHighest,
                            PersianTheme.shapes.shape22
                        )
                        .padding(PersianTheme.spacing.size12)
                ){
                    Text(
                        modifier = Modifier.align(Alignment.TopStart),
                        text = "22",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.TopEnd),
                        text = "22",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.BottomStart),
                        text = "22",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.BottomEnd),
                        text = "22",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                }
                Box(
                    modifier = Modifier
                        .size(200.dp)
                        .background(
                            PersianTheme.colorScheme.surfaceContainerHighest,
                            PersianTheme.shapes.shape24
                        )
                        .padding(PersianTheme.spacing.size12)
                ){
                    Text(
                        modifier = Modifier.align(Alignment.TopStart),
                        text = "24",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.TopEnd),
                        text = "24",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.BottomStart),
                        text = "24",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Text(
                        modifier = Modifier.align(Alignment.BottomEnd),
                        text = "24",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                }
                Box(
                    modifier = Modifier
                        .size(200.dp)
                        .background(
                            PersianTheme.colorScheme.surfaceContainerHighest,
                            PersianTheme.shapes.full
                        )
                        .padding(PersianTheme.spacing.size12),
                    contentAlignment = Alignment.Center
                ){
                    Text(
                        text = "Full",
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                }
            }
        }
    }
}