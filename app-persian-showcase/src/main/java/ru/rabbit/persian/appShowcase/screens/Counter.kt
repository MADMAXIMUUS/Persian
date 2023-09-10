package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold
import ru.rabbit.persian.counter.PersianBadge
import ru.rabbit.persian.counter.PersianCounter
import ru.rabbit.persian.counter.PersianCounterSizes
import ru.rabbit.persian.foundation.PersianComponentStyle
import ru.rabbit.persian.foundation.icons
import ru.rabbit.persian.iconButtons.PersianIconButton

object Counter : Screen {

    override val name: String = "Counters"

    override val navigation: String = "counter"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() }
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize(),
                contentPadding = it
            ) {
                item {
                    SampleRow(text = "Counter Default", firstItem = true) {
                        PersianCounter.Default(count = 1)
                        PersianCounter.Default(count = 10)
                        PersianCounter.Default(count = 100)
                    }
                }
                item {
                    SampleRow(text = "Counter Tonal") {
                        PersianCounter.Tonal(count = 1)
                        PersianCounter.Tonal(count = 10)
                        PersianCounter.Tonal(count = 100)
                    }
                }
                item {
                    SampleRow(text = "Counter Transparent") {
                        PersianCounter.Transparent(count = 1)
                        PersianCounter.Transparent(count = 10)
                        PersianCounter.Transparent(count = 100)
                    }
                }
                item {
                    SampleRow(text = "Badge", lastItem = true) {
                        PersianBadge.Primary(
                            content = {
                                PersianIconButton.Primary(
                                    icon = MaterialTheme.icons.notifications,
                                    style = PersianComponentStyle.STANDARD,
                                    onClick = {}
                                )
                            },
                            sizes = PersianCounterSizes.medium(
                                badgeHorizontalOffset = (-12).dp,
                                badgeVerticalOffset = 15.dp
                            )
                        )
                        PersianBadge.Primary(
                            count = 1,
                            content = {
                                PersianIconButton.Primary(
                                    icon = MaterialTheme.icons.notifications,
                                    style = PersianComponentStyle.STANDARD,
                                    onClick = {}
                                )
                            },
                            sizes = PersianCounterSizes.medium(
                                badgeHorizontalOffset = (-12).dp,
                                badgeVerticalOffset = 15.dp
                            )
                        )
                        PersianBadge.Primary(
                            count = 10,
                            content = {
                                PersianIconButton.Primary(
                                    icon = MaterialTheme.icons.notifications,
                                    style = PersianComponentStyle.STANDARD,
                                    onClick = {}
                                )
                            },
                            sizes = PersianCounterSizes.medium(
                                badgeHorizontalOffset = (-12).dp,
                                badgeVerticalOffset = 15.dp
                            )
                        )
                        PersianBadge.Primary(
                            count = 100,
                            content = {
                                PersianIconButton.Primary(
                                    icon = MaterialTheme.icons.notifications,
                                    style = PersianComponentStyle.STANDARD,
                                    onClick = {}
                                )
                            },
                            sizes = PersianCounterSizes.medium(
                                badgeHorizontalOffset = (-12).dp,
                                badgeVerticalOffset = 15.dp
                            )
                        )
                    }
                }
            }
        }
    }
}