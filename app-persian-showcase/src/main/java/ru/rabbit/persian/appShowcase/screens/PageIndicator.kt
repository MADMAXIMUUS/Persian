package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.pageIndicator.IndicatorStyle
import io.github.madmaximuus.persian.pageIndicator.PageIndicator
import io.github.madmaximuus.persian.text.Text
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object PageIndicator : Screen {

    override val name: String = "Page indicator"

    override val navigation: String = "page_indicator"

    @Composable
    override fun Content(navController: NavController?) {
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() }
        ) {

            val pagerState = rememberPagerState { 5 }
            val list = listOf(Color.Red, Color.Cyan, Color.Blue, Color.Green, Color.Magenta)

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(
                    PersianTheme.spacing.size24,
                    Alignment.CenterVertically
                )
            ) {
                Box {
                    HorizontalPager(
                        modifier = Modifier
                            .fillMaxSize(),
                        state = pagerState
                    ) { index ->
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(list[index]),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = (index + 1).toString(),
                                style = PersianTheme.typography.displayLarge,
                                color = PersianTheme.colorScheme.onSurface
                            )
                        }
                    }
                    Column(
                        Modifier
                            .fillMaxWidth()
                            .align(Alignment.BottomCenter)
                            .padding(bottom = PersianTheme.spacing.size24)
                            .navigationBarsPadding(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size12)
                    ) {
                        PageIndicator(
                            pagerState = pagerState,
                            visibleIndicatorCount = 5,
                            style = IndicatorStyle.LINE
                        )
                        PageIndicator(
                            pagerState = pagerState,
                            visibleIndicatorCount = 3,
                            style = IndicatorStyle.DOT
                        )
                    }
                }
            }
        }
    }
}