package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold
import ru.rabbit.persian.foundation.icons
import ru.rabbit.persian.tabs.PersianTabs
import ru.rabbit.persian.tabs.TabItem

object Tabs : Screen {

    override val name: String = "Tabs"

    override val navigation: String = "tab"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        SampleScaffold(
            title = name,
            onBackClick = {
                navController?.navigateUp()
            }
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize(),
                contentPadding = it
            ) {
                item {
                    SampleRow(text = "Scrollable Icon Left", firstItem = true) {
                        val list = remember { mutableStateListOf<TabItem>() }
                        for (i in 0..20) {
                            list.add(
                                TabItem(
                                    label = "Label $i",
                                    icon = MaterialTheme.icons.globeUk,
                                    selected = i == 0
                                )
                            )
                        }

                        PersianTabs.Scrollable(
                            tabItems = list,
                            onTabClicked = { item ->
                                selectNewTab(list, item)
                            }
                        )
                    }
                }
                item {
                    SampleRow(text = "Scrollable Icon Top") {
                        val list = remember { mutableStateListOf<TabItem>() }
                        for (i in 0..20) {
                            list.add(
                                TabItem(
                                    label = "Label $i",
                                    icon = MaterialTheme.icons.globeUk,
                                    topIcon = true,
                                    selected = i == 0
                                )
                            )
                        }

                        PersianTabs.Scrollable(
                            tabItems = list,
                            onTabClicked = { item ->
                                selectNewTab(list, item)
                            }
                        )
                    }
                }
                item {
                    SampleRow(text = "Scrollable Only Label") {
                        val list = remember { mutableStateListOf<TabItem>() }
                        for (i in 0..20) {
                            list.add(
                                TabItem(
                                    label = "Label $i",
                                    selected = i == 0
                                )
                            )
                        }

                        PersianTabs.Scrollable(
                            tabItems = list,
                            onTabClicked = { item ->
                                selectNewTab(list, item)
                            }
                        )
                    }
                }
                item {
                    SampleRow(text = "Fixed Left Icon") {
                        val list = remember { mutableStateListOf<TabItem>() }

                        for (i in 0..2) {
                            list.add(
                                TabItem(
                                    label = "Label $i",
                                    icon = MaterialTheme.icons.globeUk,
                                    selected = i == 0
                                )
                            )
                        }

                        PersianTabs.Fixed(
                            tabItems = list,
                            onTabClicked = { item ->
                                selectNewTab(list, item)
                            }
                        )
                    }
                }
                item {
                    SampleRow(text = "Fixed Top Icon") {
                        val list = remember { mutableStateListOf<TabItem>() }

                        for (i in 0..2) {
                            list.add(
                                TabItem(
                                    label = "Label $i",
                                    icon = MaterialTheme.icons.globeUk,
                                    topIcon = true,
                                    selected = i == 0
                                )
                            )
                        }

                        PersianTabs.Fixed(
                            tabItems = list,
                            onTabClicked = { item ->
                                selectNewTab(list, item)
                            }
                        )
                    }
                }
                item {
                    SampleRow(text = "Fixed Only Label", lastItem = true) {
                        val list = remember { mutableStateListOf<TabItem>() }

                        for (i in 0..2) {
                            list.add(
                                TabItem(
                                    label = "Label $i",
                                    selected = i == 0
                                )
                            )
                        }

                        PersianTabs.Fixed(
                            tabItems = list,
                            onTabClicked = { item ->
                                selectNewTab(list, item)
                            }
                        )
                    }
                }
            }
        }
    }

    private fun selectNewTab(list: MutableList<TabItem>, tabItemSelected: TabItem) {
        val indexOfLastSelected = list.indexOf(list.find { it.selected })
        val indexOfItem = list.indexOf(tabItemSelected)

        if (indexOfItem != indexOfLastSelected) {
            if (indexOfLastSelected != -1) {
                list[indexOfLastSelected] = list[indexOfLastSelected].copy(selected = false)
            }

            if (indexOfItem != -1) {
                list[indexOfItem] = list[indexOfItem].copy(selected = true)
            }
        }
    }
}