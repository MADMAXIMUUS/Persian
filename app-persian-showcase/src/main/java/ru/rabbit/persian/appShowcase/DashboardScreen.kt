package ru.rabbit.persian.appShowcase

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.windowInsetsBottomHeight
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.toolingGraphicsLayer
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.surface.Surface
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import ru.rabbit.persian.appShowcase.componets.SampleScaffold
import ru.rabbit.persian.appShowcase.screens.Screen

@Composable
fun DashboardScreen(
    navController: NavHostController,
    foundationScreens: List<Screen>,
    componentScreens: List<Screen>
) {
    val topAppBarScrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
    SampleScaffold(
        title = "Persian",
        topAppBarScrollBehavior = topAppBarScrollBehavior
    ) { padding ->
        LazyVerticalGrid(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = PersianTheme.spacing.size16)
                .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection),
            contentPadding = padding,
            columns = GridCells.Adaptive(200.dp),
            verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size16),
            horizontalArrangement = Arrangement.spacedBy(
                PersianTheme.spacing.size16,
                alignment = Alignment.CenterHorizontally
            )
        ) {
            item(
                span = { GridItemSpan(maxLineSpan) }
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Foundation",
                    style = PersianTheme.typography.headlineSmall
                )
            }
            items(foundationScreens, key = { it.name }, contentType = { it }) {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .heightIn(min = 272.dp),
                    shape = PersianTheme.shapes.shape20,
                    border = BorderStroke(
                        width = 1.dp,
                        color = PersianTheme.colorScheme.outline
                    )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .clickable {
                                navController.navigate(it.navigation)
                            }
                            .padding(PersianTheme.spacing.size12),
                        verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
                    ) {
                        Box(
                            modifier = Modifier
                                .clip(PersianTheme.shapes.shape10)
                                .clipToBounds()
                                .fillMaxWidth()
                                .wrapContentHeight()
                                .toolingGraphicsLayer()
                                .paint(
                                    painter = painterResource(it.image),
                                    contentScale = ContentScale.FillWidth
                                )
                        )
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = it.name,
                            textAlign = TextAlign.Center,
                            style = PersianTheme.typography.titleLarge
                        )
                    }
                }
            }
            item(
                span = { GridItemSpan(maxLineSpan) }
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = PersianTheme.spacing.size24),
                    text = "Components",
                    style = PersianTheme.typography.headlineSmall
                )
            }
            items(componentScreens, key = { it.name }, contentType = { it }) {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .heightIn(min = 272.dp),
                    shape = PersianTheme.shapes.shape20,
                    border = BorderStroke(
                        width = 1.dp,
                        color = PersianTheme.colorScheme.outline
                    )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .clickable {
                                navController.navigate(it.navigation)
                            }
                            .padding(PersianTheme.spacing.size12),
                        verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
                    ) {
                        Box(
                            modifier = Modifier
                                .clip(PersianTheme.shapes.shape10)
                                .clipToBounds()
                                .fillMaxWidth()
                                .wrapContentHeight()
                                .toolingGraphicsLayer()
                                .paint(
                                    painter = painterResource(it.image),
                                    colorFilter = null,
                                    contentScale = ContentScale.FillWidth
                                )
                        )
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = it.name,
                            textAlign = TextAlign.Center,
                            style = PersianTheme.typography.titleLarge
                        )
                    }
                }
            }
            item(
                span = { GridItemSpan(maxLineSpan) }
            ) {
                Spacer(
                    modifier = Modifier
                        .windowInsetsBottomHeight(WindowInsets.navigationBars)
                )
            }
        }
    }
}
