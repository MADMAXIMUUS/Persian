package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.surface.Surface
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import ru.rabbit.persian.appShowcase.R
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Elevation : Screen {
    override val name: String = "Elevation"
    override val image: Int = R.drawable.elevation
    override val navigation: String = "elevation"

    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() },
            topAppBarScrollBehavior = topAppBarScrollBehavior
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
                    .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection)
                    .verticalScroll(rememberScrollState())
                    .navigationBarsPadding(),
                verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size12)
            ) {
                SampleRow(text = "1", firstItem = true) {
                    Surface(
                        modifier = Modifier.size(200.dp),
                        shape = PersianTheme.shapes.shape24,
                        color = PersianTheme.colorScheme.surfaceContainerHighest,
                        shadowElevation = PersianTheme.elevation.elevation1
                    ) {}
                }
                SampleRow(text = "2") {
                    Surface(
                        modifier = Modifier.size(200.dp),
                        shape = PersianTheme.shapes.shape24,
                        color = PersianTheme.colorScheme.surfaceContainerHighest,
                        shadowElevation = PersianTheme.elevation.elevation2
                    ) {}
                }
                SampleRow(text = "3") {
                    Surface(
                        modifier = Modifier.size(200.dp),
                        shape = PersianTheme.shapes.shape24,
                        color = PersianTheme.colorScheme.surfaceContainerHighest,
                        shadowElevation = PersianTheme.elevation.elevation3
                    ) {}
                }
                SampleRow(text = "4") {
                    Surface(
                        modifier = Modifier.size(200.dp),
                        shape = PersianTheme.shapes.shape24,
                        color = PersianTheme.colorScheme.surfaceContainerHighest,
                        shadowElevation = PersianTheme.elevation.elevation4
                    ) {}
                }
                SampleRow(text = "5", lastItem = true) {
                    Surface(
                        modifier = Modifier.size(200.dp),
                        shape = PersianTheme.shapes.shape24,
                        color = PersianTheme.colorScheme.surfaceContainerHighest,
                        shadowElevation = PersianTheme.elevation.elevation5
                    ) {}
                }
            }
        }
    }
}