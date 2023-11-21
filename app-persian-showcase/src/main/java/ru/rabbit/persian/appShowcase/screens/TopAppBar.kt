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
import io.github.madmaximuus.persian.buttons.PersianPrimaryButton
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.topAppBar.ActionItem
import io.github.madmaximuus.persian.topAppBar.PersianTopAppBar
import io.github.madmaximuus.persian.topAppBar.PersianTopAppBarLeft
import io.github.madmaximuus.persian.topAppBar.PersianTopAppBarMiddle
import io.github.madmaximuus.persian.topAppBar.PersianTopAppBarRight

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
                PersianTopAppBar(
                    left = if (navigationLeft) {
                        PersianTopAppBarLeft.Navigation(
                            onClick = {
                                navController?.navigateUp()
                            }
                        )
                    } else if (closeLeft) {
                        PersianTopAppBarLeft.Close(
                            onClick = {
                                navController?.navigateUp()
                            }
                        )
                    } else if (avatarLeft) {
                        PersianTopAppBarLeft.Avatar(
                            avatarUrl = "https://loremflickr.com/320/240",
                            onClick = {
                                navController?.navigateUp()
                            }
                        )
                    } else null,
                    middle =
                    if (middleTitle) PersianTopAppBarMiddle.Title(text = name)
                    else if (middleIcon) PersianTopAppBarMiddle.Icon(icon = MaterialTheme.icons.appLogo)
                    else PersianTopAppBarMiddle.Title(text = name),
                    actionItemsCount = actionItemCount,
                    right = if (actionButtonRight) {
                        PersianTopAppBarRight.Action(text = "Action", onClick = {})
                    } else if (actionIconRight) {
                        PersianTopAppBarRight.Icons(
                            expanded = remember { mutableStateOf(false) },
                            actionItem = listOf(
                                ActionItem(
                                    icon = MaterialTheme.icons.notifications,
                                    title = "notifications",
                                    contentDescription = "",
                                    onClick = {}
                                )
                            )
                        )
                    } else if (actionIconsRight) {
                        PersianTopAppBarRight.Icons(
                            expanded = remember { mutableStateOf(false) },
                            actionItem = listOf(
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
                        PersianTopAppBarRight.Icons(
                            expanded = expanded,
                            actionItem = listOf(
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
                    } else null
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
                PersianPrimaryButton(text = "Middle Title") {
                    middleTitle = true
                    middleIcon = false
                }
                PersianPrimaryButton(text = "Middle Icon") {
                    middleIcon = true
                    middleTitle = false
                }
                PersianPrimaryButton(text = "Left Navigation") {
                    navigationLeft = true
                    closeLeft = false
                    avatarLeft = false
                }
                PersianPrimaryButton(text = "Left Close") {
                    navigationLeft = false
                    closeLeft = true
                    avatarLeft = false
                }
                PersianPrimaryButton(text = "Left Avatar") {
                    navigationLeft = false
                    closeLeft = false
                    avatarLeft = true
                }
                PersianPrimaryButton(text = "Right Action") {
                    actionButtonRight = true
                    actionIconRight = false
                    actionIconsRight = false
                    actionIconsOverflowRight = false
                    actionItemCount = 1
                }
                PersianPrimaryButton(text = "Right Icon") {
                    actionButtonRight = false
                    actionIconRight = true
                    actionIconsRight = false
                    actionIconsOverflowRight = false
                    actionItemCount = 1
                }
                PersianPrimaryButton(text = "Right Icons") {
                    actionButtonRight = false
                    actionIconRight = false
                    actionIconsRight = true
                    actionIconsOverflowRight = false
                    actionItemCount = 3
                }
                PersianPrimaryButton(text = "Right Icons Overflow") {
                    actionButtonRight = false
                    actionIconRight = false
                    actionIconsRight = false
                    actionIconsOverflowRight = true
                    actionItemCount = 3
                }
            }
        }
    }
}