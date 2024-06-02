package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import io.github.madmaximuus.persian.dividers.HorizontalInsetSide
import io.github.madmaximuus.persian.dividers.PersianFullHeightVerticalDivider
import io.github.madmaximuus.persian.dividers.PersianFullWidthHorizontalDivider
import io.github.madmaximuus.persian.dividers.PersianInsetHorizontalDivider
import io.github.madmaximuus.persian.dividers.PersianInsetVerticalDivider
import io.github.madmaximuus.persian.dividers.PersianMiddleInsetsHorizontalDivider
import io.github.madmaximuus.persian.dividers.PersianMiddleInsetsVerticalDivider
import io.github.madmaximuus.persian.dividers.VerticalInsetSide
import io.github.madmaximuus.persian.foundation.spacing
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Divider : Screen {

    override val name: String = "Dividers"

    override val navigation: String = "divider"

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
                    .fillMaxSize()
                    .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection),
                contentPadding = it
            ) {
                item {
                    SampleRow(text = "Full Size Horizontal", firstItem = true) {
                        Column(
                            Modifier.fillMaxWidth(),
                            verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.size8)
                        ) {
                            Box(modifier = Modifier
                                .size(100.dp, 10.dp)
                                .background(MaterialTheme.colorScheme.onSurface),
                                content = {}
                            )
                            Box(modifier = Modifier
                                .size(150.dp, 10.dp)
                                .background(MaterialTheme.colorScheme.onSurface),
                                content = {}
                            )
                            PersianFullWidthHorizontalDivider()
                        }
                    }
                }
                item {
                    SampleRow(text = "Middle Size Left Horizontal") {
                        Column(
                            Modifier.fillMaxWidth(),
                            verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.size8)
                        ) {
                            Box(modifier = Modifier
                                .size(100.dp, 10.dp)
                                .background(MaterialTheme.colorScheme.onSurface),
                                content = {}
                            )
                            Box(modifier = Modifier
                                .size(150.dp, 10.dp)
                                .background(MaterialTheme.colorScheme.onSurface),
                                content = {}
                            )
                            PersianMiddleInsetsHorizontalDivider(
                                insetSide = HorizontalInsetSide.LEFT
                            )
                        }
                    }
                }
                item {
                    SampleRow(text = "Middle Size Right Horizontal") {
                        Column(
                            Modifier.fillMaxWidth(),
                            verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.size8)
                        ) {
                            Box(modifier = Modifier
                                .size(100.dp, 10.dp)
                                .background(MaterialTheme.colorScheme.onSurface),
                                content = {}
                            )
                            Box(modifier = Modifier
                                .size(150.dp, 10.dp)
                                .background(MaterialTheme.colorScheme.onSurface),
                                content = {}
                            )
                            PersianMiddleInsetsHorizontalDivider(
                                insetSide = HorizontalInsetSide.RIGHT
                            )
                        }
                    }
                }
                item {
                    SampleRow(text = "Insets Horizontal") {
                        Column(
                            Modifier.fillMaxWidth(),
                            verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.size8)
                        ) {
                            Box(modifier = Modifier
                                .size(100.dp, 10.dp)
                                .background(MaterialTheme.colorScheme.onSurface),
                                content = {}
                            )
                            Box(modifier = Modifier
                                .size(150.dp, 10.dp)
                                .background(MaterialTheme.colorScheme.onSurface),
                                content = {}
                            )
                            PersianInsetHorizontalDivider()
                        }
                    }
                }
                item {
                    SampleRow(text = "Full Size Vertical") {
                        Row(
                            Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.size8)
                        ) {
                            Box(modifier = Modifier
                                .size(10.dp, 100.dp)
                                .background(MaterialTheme.colorScheme.onSurface),
                                content = {}
                            )
                            Box(modifier = Modifier
                                .size(10.dp, 150.dp)
                                .background(MaterialTheme.colorScheme.onSurface),
                                content = {}
                            )
                            PersianFullHeightVerticalDivider()
                        }
                    }
                }
                item {
                    SampleRow(text = "Middle Size Top Vertical") {
                        Row(
                            Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.size8)
                        ) {
                            Box(modifier = Modifier
                                .size(10.dp, 100.dp)
                                .background(MaterialTheme.colorScheme.onSurface),
                                content = {}
                            )
                            Box(modifier = Modifier
                                .size(10.dp, 150.dp)
                                .background(MaterialTheme.colorScheme.onSurface),
                                content = {}
                            )
                            PersianMiddleInsetsVerticalDivider(
                                insetSide = VerticalInsetSide.TOP
                            )
                        }
                    }
                }
                item {
                    SampleRow(text = "Middle Size Bottom Vertical") {
                        Row(
                            Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.size8)
                        ) {
                            Box(modifier = Modifier
                                .size(10.dp, 100.dp)
                                .background(MaterialTheme.colorScheme.onSurface),
                                content = {}
                            )
                            Box(modifier = Modifier
                                .size(10.dp, 150.dp)
                                .background(MaterialTheme.colorScheme.onSurface),
                                content = {}
                            )
                            PersianMiddleInsetsVerticalDivider(
                                insetSide = VerticalInsetSide.BOTTOM
                            )
                        }
                    }
                }
                item {
                    SampleRow(text = "Insets Vertical", lastItem = true) {
                        Row(
                            Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.size8)
                        ) {
                            Box(modifier = Modifier
                                .size(10.dp, 100.dp)
                                .background(MaterialTheme.colorScheme.onSurface),
                                content = {}
                            )
                            Box(modifier = Modifier
                                .size(10.dp, 150.dp)
                                .background(MaterialTheme.colorScheme.onSurface),
                                content = {}
                            )
                            PersianInsetVerticalDivider()
                        }
                    }
                }
            }
        }
    }
}