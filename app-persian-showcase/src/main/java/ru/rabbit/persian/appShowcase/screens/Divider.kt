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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import io.github.madmaximuus.persian.dividers.DividerDefaults
import io.github.madmaximuus.persian.dividers.HorizontalDivider
import io.github.madmaximuus.persian.dividers.HorizontalInsetSide
import io.github.madmaximuus.persian.dividers.VerticalDivider
import io.github.madmaximuus.persian.dividers.VerticalInsetSide
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Divider : Screen {

    override val name: String = "Dividers"

    override val navigation: String = "divider"

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
                    SampleRow(text = "Horizontal divider", firstItem = true) {
                        Column(
                            Modifier.fillMaxWidth(),
                            verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(100.dp, 4.dp)
                                    .background(PersianTheme.colorScheme.onSurface)
                            )
                            Box(
                                modifier = Modifier
                                    .size(150.dp, 4.dp)
                                    .background(PersianTheme.colorScheme.onSurface)
                            )
                            HorizontalDivider()
                        }
                    }
                }
                item {
                    SampleRow(text = "Horizontal divider with left inset") {
                        Column(
                            Modifier.fillMaxWidth(),
                            verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
                        ) {
                            Box(modifier = Modifier
                                .size(100.dp, 4.dp)
                                .background(PersianTheme.colorScheme.onSurface),
                                content = {}
                            )
                            Box(modifier = Modifier
                                .size(150.dp, 4.dp)
                                .background(PersianTheme.colorScheme.onSurface),
                                content = {}
                            )
                            HorizontalDivider(
                                insetSide = HorizontalInsetSide.LEFT,
                                sizes = DividerDefaults.sizes(
                                    inset = PersianTheme.spacing.size24
                                )
                            )
                        }
                    }
                }
                item {
                    SampleRow(text = "horizontal divider with right inset") {
                        Column(
                            Modifier.fillMaxWidth(),
                            verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
                        ) {
                            Box(modifier = Modifier
                                .size(100.dp, 4.dp)
                                .background(PersianTheme.colorScheme.onSurface),
                                content = {}
                            )
                            Box(modifier = Modifier
                                .size(150.dp, 4.dp)
                                .background(PersianTheme.colorScheme.onSurface),
                                content = {}
                            )
                            HorizontalDivider(
                                insetSide = HorizontalInsetSide.RIGHT,
                                sizes = DividerDefaults.sizes(
                                    inset = PersianTheme.spacing.size24
                                )
                            )
                        }
                    }
                }
                item {
                    SampleRow(text = "Horizontal divider with both insets") {
                        Column(
                            Modifier.fillMaxWidth(),
                            verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
                        ) {
                            Box(modifier = Modifier
                                .size(100.dp, 4.dp)
                                .background(PersianTheme.colorScheme.onSurface),
                                content = {}
                            )
                            Box(modifier = Modifier
                                .size(150.dp, 4.dp)
                                .background(PersianTheme.colorScheme.onSurface),
                                content = {}
                            )
                            HorizontalDivider(
                                insetSide = HorizontalInsetSide.BOTH,
                                sizes = DividerDefaults.sizes(
                                    inset = PersianTheme.spacing.size24
                                )
                            )
                        }
                    }
                }
                item {
                    SampleRow(text = "Vertical divider") {
                        Row(
                            Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
                        ) {
                            Box(modifier = Modifier
                                .size(4.dp, 100.dp)
                                .background(PersianTheme.colorScheme.onSurface),
                                content = {}
                            )
                            Box(modifier = Modifier
                                .size(4.dp, 150.dp)
                                .background(PersianTheme.colorScheme.onSurface),
                                content = {}
                            )
                            VerticalDivider()
                        }
                    }
                }
                item {
                    SampleRow(text = "Vertical divider with top inset") {
                        Row(
                            Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
                        ) {
                            Box(modifier = Modifier
                                .size(4.dp, 100.dp)
                                .background(PersianTheme.colorScheme.onSurface),
                                content = {}
                            )
                            Box(modifier = Modifier
                                .size(4.dp, 150.dp)
                                .background(PersianTheme.colorScheme.onSurface),
                                content = {}
                            )
                            VerticalDivider(
                                insetSide = VerticalInsetSide.TOP,
                                sizes = DividerDefaults.sizes(
                                    inset = PersianTheme.spacing.size24
                                )
                            )
                        }
                    }
                }
                item {
                    SampleRow(text = "Vertical divider with bottom divider") {
                        Row(
                            Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
                        ) {
                            Box(modifier = Modifier
                                .size(4.dp, 100.dp)
                                .background(PersianTheme.colorScheme.onSurface),
                                content = {}
                            )
                            Box(modifier = Modifier
                                .size(4.dp, 150.dp)
                                .background(PersianTheme.colorScheme.onSurface),
                                content = {}
                            )
                            VerticalDivider(
                                insetSide = VerticalInsetSide.BOTTOM,
                                sizes = DividerDefaults.sizes(
                                    inset = PersianTheme.spacing.size24
                                )
                            )
                        }
                    }
                }
                item {
                    SampleRow(text = "Vertical divider with both insets", lastItem = true) {
                        Row(
                            Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
                        ) {
                            Box(modifier = Modifier
                                .size(4.dp, 100.dp)
                                .background(PersianTheme.colorScheme.onSurface),
                                content = {}
                            )
                            Box(modifier = Modifier
                                .size(4.dp, 150.dp)
                                .background(PersianTheme.colorScheme.onSurface),
                                content = {}
                            )
                            VerticalDivider(
                                insetSide = VerticalInsetSide.BOTH,
                                sizes = DividerDefaults.sizes(
                                    inset = PersianTheme.spacing.size24
                                )
                            )
                        }
                    }
                }
            }
        }
    }
}