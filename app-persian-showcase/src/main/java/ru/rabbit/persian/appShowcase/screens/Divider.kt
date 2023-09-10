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
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold
import ru.rabbit.persian.dividers.PersianHorizontalDividers
import ru.rabbit.persian.dividers.PersianVerticalDividers
import ru.rabbit.persian.foundation.spacing

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
                            verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.small)
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
                            PersianHorizontalDividers.FullWidth()
                        }
                    }
                }
                item {
                    SampleRow(text = "Middle Size Left Horizontal") {
                        Column(
                            Modifier.fillMaxWidth(),
                            verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.small)
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
                            PersianHorizontalDividers
                                .MiddleInsets(insetSide = PersianHorizontalDividers.InsetSide.LEFT)
                        }
                    }
                }
                item {
                    SampleRow(text = "Middle Size Right Horizontal") {
                        Column(
                            Modifier.fillMaxWidth(),
                            verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.small)
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
                            PersianHorizontalDividers
                                .MiddleInsets(insetSide = PersianHorizontalDividers.InsetSide.RIGHT)
                        }
                    }
                }
                item {
                    SampleRow(text = "Insets Horizontal") {
                        Column(
                            Modifier.fillMaxWidth(),
                            verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.small)
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
                            PersianHorizontalDividers.Inset()
                        }
                    }
                }
                item {
                    SampleRow(text = "Full Size Vertical") {
                        Row(
                            Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.small)
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
                            PersianVerticalDividers.FullHeight()
                        }
                    }
                }
                item {
                    SampleRow(text = "Middle Size Top Vertical") {
                        Row(
                            Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.small)
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
                            PersianVerticalDividers.MiddleInsets(insetSide = PersianVerticalDividers.InsetSide.TOP)
                        }
                    }
                }
                item {
                    SampleRow(text = "Middle Size Bottom Vertical") {
                        Row(
                            Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.small)
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
                            PersianVerticalDividers.MiddleInsets(insetSide = PersianVerticalDividers.InsetSide.BOTTOM)
                        }
                    }
                }
                item {
                    SampleRow(text = "Insets Vertical", lastItem = true) {
                        Row(
                            Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.small)
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
                            PersianVerticalDividers.Inset()
                        }
                    }
                }
            }
        }
    }
}