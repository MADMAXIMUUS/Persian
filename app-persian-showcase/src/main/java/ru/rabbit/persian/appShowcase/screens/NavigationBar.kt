package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.navigationBar.NavigationBarItem
import io.github.madmaximuus.persian.navigationBar.PersianNavigationBar
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
                                    icon = MaterialTheme.icons.homeOutlined,
                                    selectedIcon = MaterialTheme.icons.homeFilled,
                                    text = "Feed",
                                    onClick = {}
                                ),
                                NavigationBarItem(
                                    selected = false,
                                    icon = MaterialTheme.icons.homeOutlined,
                                    selectedIcon = MaterialTheme.icons.homeFilled,
                                    text = "Feed",
                                    onClick = {}
                                ),
                                NavigationBarItem(
                                    selected = false,
                                    icon = MaterialTheme.icons.homeOutlined,
                                    selectedIcon = MaterialTheme.icons.homeFilled,
                                    text = "Feed",
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
                                    icon = MaterialTheme.icons.homeOutlined,
                                    selectedIcon = MaterialTheme.icons.homeFilled,
                                    text = "Feed",
                                    onClick = {}
                                ),
                                NavigationBarItem(
                                    selected = false,
                                    icon = MaterialTheme.icons.homeOutlined,
                                    selectedIcon = MaterialTheme.icons.homeFilled,
                                    text = "Feed",
                                    onClick = {}
                                ),
                                NavigationBarItem(
                                    selected = false,
                                    icon = MaterialTheme.icons.homeOutlined,
                                    selectedIcon = MaterialTheme.icons.homeFilled,
                                    text = "Feed",
                                    onClick = {}
                                ),
                                NavigationBarItem(
                                    selected = false,
                                    icon = MaterialTheme.icons.homeOutlined,
                                    selectedIcon = MaterialTheme.icons.homeFilled,
                                    text = "Feed",
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
                                    icon = MaterialTheme.icons.homeOutlined,
                                    selectedIcon = MaterialTheme.icons.homeFilled,
                                    text = "Feed",
                                    onClick = {}
                                ),
                                NavigationBarItem(
                                    selected = false,
                                    icon = MaterialTheme.icons.homeOutlined,
                                    selectedIcon = MaterialTheme.icons.homeFilled,
                                    text = "Feed",
                                    onClick = {}
                                ),
                                NavigationBarItem(
                                    selected = false,
                                    icon = MaterialTheme.icons.homeOutlined,
                                    selectedIcon = MaterialTheme.icons.homeFilled,
                                    text = "Feed",
                                    onClick = {}
                                ),
                                NavigationBarItem(
                                    selected = false,
                                    icon = MaterialTheme.icons.homeOutlined,
                                    selectedIcon = MaterialTheme.icons.homeFilled,
                                    text = "Feed",
                                    onClick = {}
                                ),
                                NavigationBarItem(
                                    selected = false,
                                    icon = MaterialTheme.icons.homeOutlined,
                                    selectedIcon = MaterialTheme.icons.homeFilled,
                                    text = "Feed",
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