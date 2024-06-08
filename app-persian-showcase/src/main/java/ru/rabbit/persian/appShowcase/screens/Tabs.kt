package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.NavController
import io.github.madmaximuus.persian.tabs.IconSide
import io.github.madmaximuus.persian.tabs.PersianFixedTabs
import io.github.madmaximuus.persian.tabs.PersianScrollableTabs
import io.github.madmaximuus.persian.tabs.TabItem
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.user.base.User
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Tabs : Screen {

    override val name: String = "Tabs"

    override val navigation: String = "tab"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        SampleScaffold(
            title = name,
            onBackClick = {
                navController?.navigateUp()
            }
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection),
                contentPadding = it,
            ) {
                item {
                    SampleRow(text = "Scrollable Icon Left", firstItem = true) {
                        val list = remember { mutableStateListOf<TabItem>() }
                        for (i in 0..20) {
                            list.add(
                                TabItem(
                                    label = "Label $i",
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                    selected = i == 0
                                )
                            )
                        }

                        PersianScrollableTabs(
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

                                    icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                    selected = i == 0
                                )
                            )
                        }

                        PersianScrollableTabs(
                            tabItems = list,
                            onTabClicked = { item ->
                                selectNewTab(list, item)
                            }
                        )
                    }
                }
                item {
                    SampleRow(text = "Scrollable Icon Left") {
                        val list = remember { mutableStateListOf<TabItem>() }
                        for (i in 0..20) {
                            list.add(
                                TabItem(
                                    label = "Label $i",

                                    icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                    selected = i == 0,
                                    iconSide = IconSide.LEFT
                                )
                            )
                        }

                        PersianScrollableTabs(
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

                        PersianScrollableTabs(
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

                                    icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                    selected = i == 0
                                )
                            )
                        }

                        PersianFixedTabs(
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
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                    selected = i == 0
                                )
                            )
                        }

                        PersianFixedTabs(
                            tabItems = list,
                            onTabClicked = { item ->
                                selectNewTab(list, item)
                            }
                        )
                    }
                }
                item {
                    SampleRow(text = "Fixed Icon Left") {
                        val list = remember { mutableStateListOf<TabItem>() }
                        for (i in 0..2) {
                            list.add(
                                TabItem(
                                    label = "Label $i",
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                    selected = i == 0,
                                    iconSide = IconSide.LEFT
                                )
                            )
                        }

                        PersianFixedTabs(
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

                        PersianFixedTabs(
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