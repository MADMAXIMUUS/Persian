package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import io.github.madmaximuus.persian.pageIndicator.IndicatorOrientation
import io.github.madmaximuus.persian.pageIndicator.PersianPageIndicator
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object PageIndicator : Screen {

    override val name: String = "Page Indicator"

    override val navigation: String = "page_indicator"

    @OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
    @Composable
    override fun Content(navController: NavController?) {
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() }
        ) {

            val pagerState = rememberPagerState {
                3
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                HorizontalPager(
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(1f),
                    state = pagerState
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(1f),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = (it + 1).toString(),
                            style = MaterialTheme.typography.displayLarge
                        )
                    }
                }

                PersianPageIndicator(
                    modifier = Modifier
                        .background(Color.Red),
                    pagerState = pagerState,
                    visibleIndicatorCount = 10
                )
                PersianPageIndicator(
                    modifier = Modifier
                        .background(Color.Red),
                    pagerState = pagerState,
                    orientation = IndicatorOrientation.VERTICAL,
                    visibleIndicatorCount = 3
                )
            }
        }
    }
}