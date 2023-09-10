package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import ru.rabbit.persian.buttons.PersianButton
import ru.rabbit.persian.foundation.icons
import ru.rabbit.persian.foundation.spacing
import ru.rabbit.persian.topAppBar.ActionItem
import ru.rabbit.persian.topAppBar.PersianTopAppBar

object TopAppBar : Screen {
    override val name: String = "Top App Bar"
    override val navigation: String = "topAppBar"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        var middleTitle by remember { mutableStateOf(true) }
        var middleIcon by remember { mutableStateOf(false) }
        var navigationLeft by remember { mutableStateOf(true) }
        var closeLeft by remember { mutableStateOf(false) }
        var avatarLeft by remember { mutableStateOf(false) }
        var actionButtonRight by remember { mutableStateOf(false) }
        var actionIconRight by remember { mutableStateOf(false) }
        var actionIconsRight by remember { mutableStateOf(false) }
        var actionIconsOverflowRight by remember { mutableStateOf(false) }
        val expanded = remember { mutableStateOf(false) }
        var actionItemCount by remember { mutableIntStateOf(0) }
        Scaffold(
            topBar = {
                PersianTopAppBar.Primary(
                    left = {
                        if (navigationLeft) {
                            Navigation(
                                onClick = {
                                    navController?.navigateUp()
                                }
                            )
                        } else if (closeLeft) {
                            Close(
                                onClick = {
                                    navController?.navigateUp()
                                }
                            )
                        } else if (avatarLeft) {
                            Avatar(
                                image = "https://loremflickr.com/320/240",
                                onClick = {
                                    navController?.navigateUp()
                                }
                            )
                        }
                    },
                    middle = {
                        if (middleTitle)
                            Title(text = name)
                        else if (middleIcon)
                            Icon24(icon = MaterialTheme.icons.appLogo)
                    },
                    actionItemsCount = actionItemCount,
                    right = {
                        if (actionButtonRight) {
                            Button(text = "Action", onClick = {})
                        } else if (actionIconRight) {
                            Icons(
                                actions = listOf(
                                    ActionItem(
                                        icon = MaterialTheme.icons.notifications,
                                        title = "notifications",
                                        contentDescription = "",
                                        onClick = {}
                                    )
                                )
                            )
                        } else if (actionIconsRight) {
                            Icons(
                                actions = listOf(
                                    ActionItem(
                                        icon = MaterialTheme.icons.notifications,
                                        title = "notifications",
                                        contentDescription = "",
                                        onClick = {}
                                    ),
                                    ActionItem(
                                        icon = MaterialTheme.icons.notifications,
                                        title = "notifications",
                                        contentDescription = "",
                                        onClick = {}
                                    ),
                                    ActionItem(
                                        icon = MaterialTheme.icons.notifications,
                                        title = "notifications",
                                        contentDescription = "",
                                        onClick = {}
                                    )
                                )
                            )
                        } else if (actionIconsOverflowRight) {
                            Icons(
                                expanded = expanded,
                                actions = listOf(
                                    ActionItem(
                                        icon = MaterialTheme.icons.notifications,
                                        title = "notifications",
                                        contentDescription = "",
                                        badgeCount = 10,
                                        onClick = {}
                                    ),
                                    ActionItem(
                                        icon = MaterialTheme.icons.notifications,
                                        title = "notifications",
                                        contentDescription = "",
                                        badgeCount = 0,
                                        onClick = {}
                                    ),
                                    ActionItem(
                                        icon = MaterialTheme.icons.notifications,
                                        title = "notifications",
                                        contentDescription = "",
                                        onClick = {}
                                    ),
                                    ActionItem(
                                        icon = MaterialTheme.icons.notifications,
                                        title = "notifications",
                                        contentDescription = "",
                                        onClick = {}
                                    ),
                                    ActionItem(
                                        icon = MaterialTheme.icons.notifications,
                                        title = "notifications",
                                        contentDescription = "",
                                        onClick = {}
                                    ),
                                    ActionItem(
                                        icon = MaterialTheme.icons.notifications,
                                        title = "notifications",
                                        contentDescription = "",
                                        onClick = {}
                                    ),
                                    ActionItem(
                                        icon = MaterialTheme.icons.notifications,
                                        title = "notifications",
                                        contentDescription = "",
                                        onClick = {}
                                    ),
                                ),
                            )
                        }
                    }
                )
            }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.small)
            ) {
                PersianButton.Primary(text = "Middle Title") {
                    middleTitle = true
                    middleIcon = false
                }
                PersianButton.Primary(text = "Middle Icon") {
                    middleIcon = true
                    middleTitle = false
                }
                PersianButton.Primary(text = "Left Navigation") {
                    navigationLeft = true
                    closeLeft = false
                    avatarLeft = false
                }
                PersianButton.Primary(text = "Left Close") {
                    navigationLeft = false
                    closeLeft = true
                    avatarLeft = false
                }
                PersianButton.Primary(text = "Left Avatar") {
                    navigationLeft = false
                    closeLeft = false
                    avatarLeft = true
                }
                PersianButton.Primary(text = "Right Action") {
                    actionButtonRight = true
                    actionIconRight = false
                    actionIconsRight = false
                    actionIconsOverflowRight = false
                    actionItemCount=1
                }
                PersianButton.Primary(text = "Right Icon") {
                    actionButtonRight = false
                    actionIconRight = true
                    actionIconsRight = false
                    actionIconsOverflowRight = false
                    actionItemCount=1
                }
                PersianButton.Primary(text = "Right Icons") {
                    actionButtonRight = false
                    actionIconRight = false
                    actionIconsRight = true
                    actionIconsOverflowRight = false
                    actionItemCount=3
                }
                PersianButton.Primary(text = "Right Icons Overflow") {
                    actionButtonRight = false
                    actionIconRight = false
                    actionIconsRight = false
                    actionIconsOverflowRight = true
                    actionItemCount=3
                }
            }
        }
    }
}