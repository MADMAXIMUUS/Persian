package ru.rabbit.persian.appShowcase

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.windowInsetsBottomHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import io.github.madmaximuus.persian.foundation.LocalContentColor
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.iconBox.Icon
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persianSymbols.chevronRight.base.ChevronRight
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import ru.rabbit.persian.appShowcase.componets.SampleScaffold
import ru.rabbit.persian.appShowcase.screens.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(
    navController: NavHostController,
    screens: List<Screen>
) {
    val topAppBarScrollBehavior =
        TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
    SampleScaffold(
        title = "Persian",
        topAppBarScrollBehavior = topAppBarScrollBehavior
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection),
            contentPadding = padding,
            verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
        ) {
            items(screens, key = { it.name }) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .clickable {
                            navController.navigate(it.navigation)
                        }
                        .padding(horizontal = PersianTheme.spacing.size8),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Row(Modifier.fillMaxWidth()) {
                        Text(
                            text = it.name,
                            style = PersianTheme.typography.titleLarge,
                            modifier = Modifier
                                .padding(horizontal = PersianTheme.spacing.size12)
                                .weight(1f)
                        )
                        CompositionLocalProvider(LocalContentColor provides PersianTheme.colorScheme.onSurfaceVariant) {
                            Icon(
                                painter = rememberVectorPainter(image = PersianSymbols.Default.ChevronRight),
                                contentDescription = "",
                            )
                        }
                    }
                }
            }
            item {
                Spacer(
                    modifier = Modifier
                        .windowInsetsBottomHeight(WindowInsets.navigationBars)
                )
            }
        }
    }
}
