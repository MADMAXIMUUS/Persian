package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.navigation.NavController
import io.github.madmaximuus.persian.navigationBar.NavigationBarItem
import io.github.madmaximuus.persian.navigationBar.PersianNavigationBar
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.gear.Gear
import io.github.madmaximuus.persianSymbols.house.House
import io.github.madmaximuus.persianSymbols.magnifyingGlass.MagnifyingGlass
import io.github.madmaximuus.persianSymbols.message.bars.MessageBars
import io.github.madmaximuus.persianSymbols.message.base.Message
import io.github.madmaximuus.persianSymbols.user.base.User
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object NavigationBar : Screen {

    override val name: String = "Navigation Bars"

    override val navigation: String = "navBar"

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
                modifier = Modifier.fillMaxSize(),
                contentPadding = it
            ) {
                item {
                    SampleRow(text = "Navigation Bar with 3 items", firstItem = true) {
                        PersianNavigationBar(
                            actions = listOf(
                                NavigationBarItem(
                                    selected = true,
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.House),
                                    selectedIcon = rememberVectorPainter(image = PersianSymbols.Filled.House),
                                    text = "Home",
                                    badgeCount = 20,
                                    onClick = {}
                                ),
                                NavigationBarItem(
                                    selected = false,
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.MagnifyingGlass),
                                    selectedIcon = rememberVectorPainter(image = PersianSymbols.Default.MagnifyingGlass),
                                    text = "Search",
                                    onClick = {}
                                ),
                                NavigationBarItem(
                                    selected = false,
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.Message),
                                    selectedIcon = rememberVectorPainter(image = PersianSymbols.Filled.Message),
                                    text = "Chat",
                                    onClick = {}
                                ),
                            )
                        )
                    }
                }
                item {
                    SampleRow(text = "Navigation Bar with 4 items") {
                        PersianNavigationBar(
                            actions = listOf(
                                NavigationBarItem(
                                    selected = true,
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.House),
                                    selectedIcon = rememberVectorPainter(image = PersianSymbols.Filled.House),
                                    text = "House",
                                    badgeCount = 20,
                                    onClick = {}
                                ),
                                NavigationBarItem(
                                    selected = false,
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.MagnifyingGlass),
                                    selectedIcon = rememberVectorPainter(image = PersianSymbols.Default.MagnifyingGlass),
                                    text = "Search",
                                    onClick = {}
                                ),
                                NavigationBarItem(
                                    selected = false,
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.MessageBars),
                                    selectedIcon = rememberVectorPainter(image = PersianSymbols.Filled.MessageBars),
                                    text = "Chat",
                                    onClick = {}
                                ),
                                NavigationBarItem(
                                    selected = false,
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                    selectedIcon = rememberVectorPainter(image = PersianSymbols.Filled.User),
                                    text = "Profile",
                                    onClick = {}
                                ),
                            )
                        )
                    }
                }
                item {
                    SampleRow(text = "Navigation Bar with 5 items", lastItem = true) {
                        PersianNavigationBar(
                            actions = listOf(
                                NavigationBarItem(
                                    selected = true,
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.House),
                                    selectedIcon = rememberVectorPainter(image = PersianSymbols.Filled.House),
                                    text = "House",
                                    badgeCount = 20,
                                    onClick = {}
                                ),
                                NavigationBarItem(
                                    selected = false,
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.MagnifyingGlass),
                                    selectedIcon = rememberVectorPainter(image = PersianSymbols.Default.MagnifyingGlass),
                                    text = "Search",
                                    onClick = {}
                                ),
                                NavigationBarItem(
                                    selected = false,
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.MessageBars),
                                    selectedIcon = rememberVectorPainter(image = PersianSymbols.Filled.MessageBars),
                                    text = "Chat",
                                    onClick = {}
                                ),
                                NavigationBarItem(
                                    selected = false,
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                    selectedIcon = rememberVectorPainter(image = PersianSymbols.Filled.User),
                                    text = "Profile",
                                    onClick = {}
                                ),
                                NavigationBarItem(
                                    selected = false,
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.Gear),
                                    selectedIcon = rememberVectorPainter(image = PersianSymbols.Filled.Gear),
                                    text = "Settings",
                                    onClick = {}
                                ),
                            )
                        )
                    }
                }
            }
        }
    }
}