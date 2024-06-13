package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.navigation.NavController
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.radioButtons.PersianRadioButton
import io.github.madmaximuus.persian.scafold.Scaffold
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persian.topAppBar.ActionItem
import io.github.madmaximuus.persian.topAppBar.PersianTopAppBar
import io.github.madmaximuus.persian.topAppBar.PersianTopAppBarLeft
import io.github.madmaximuus.persian.topAppBar.PersianTopAppBarRight
import io.github.madmaximuus.persianSymbols.bell.base.Bell
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

object TopAppBar : Screen {
    override val name: String = "Top App Bar"
    override val navigation: String = "topAppBar"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        var left by remember {
            mutableStateOf<PersianTopAppBarLeft?>(
                PersianTopAppBarLeft.Navigation(
                    onClick = { navController?.navigateUp() }
                )
            )
        }
        var right by remember { mutableStateOf<PersianTopAppBarRight?>(null) }

        val rightStates = remember {
            listOf(
                mutableStateOf(true),
                mutableStateOf(false),
                mutableStateOf(false),
                mutableStateOf(false),
                mutableStateOf(false),
            )
        }
        val expanded = remember { mutableStateOf(false) }
        Scaffold(
            topBar = {
                PersianTopAppBar(
                    left = left,
                    title = name,
                    right = right
                )
            }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                val leftStates = remember {
                    listOf(
                        mutableStateOf(false),
                        mutableStateOf(true),
                        mutableStateOf(false),
                        mutableStateOf(false),
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = PersianTheme.spacing.size8,
                            bottom = PersianTheme.spacing.size8,
                            start = PersianTheme.spacing.size12,
                            end = PersianTheme.spacing.size12
                        ),
                ) {
                    Text(
                        text = "Left",
                        style = PersianTheme.typography.titleMedium,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = Modifier.height(PersianTheme.spacing.size4))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .selectableGroup()
                    ) {
                        PersianRadioButton(
                            modifier = Modifier.fillMaxWidth(),
                            text = "None",
                            checked = leftStates[0].value,
                            onCheckedChange = {
                                leftStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 0
                                }
                                left = null
                            }
                        )
                        PersianRadioButton(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Navigation",
                            checked = leftStates[1].value,
                            onCheckedChange = {
                                leftStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 1
                                }
                                left = PersianTopAppBarLeft
                                    .Navigation(onClick = { navController?.navigateUp() })
                            }
                        )
                        PersianRadioButton(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Close",
                            checked = leftStates[2].value,
                            onCheckedChange = {
                                leftStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 2
                                }
                                left = PersianTopAppBarLeft
                                    .Close(onClick = { navController?.navigateUp() })
                            }
                        )
                        PersianRadioButton(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Small",
                            checked = leftStates[3].value,
                            onCheckedChange = {
                                leftStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 3
                                }
                                left = PersianTopAppBarLeft
                                    .Avatar(
                                        "https://loremflickr.com/320/240",
                                        onClick = { navController?.navigateUp() }
                                    )
                            }
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = PersianTheme.spacing.size8,
                            bottom = PersianTheme.spacing.size8,
                            start = PersianTheme.spacing.size12,
                            end = PersianTheme.spacing.size12
                        ),
                ) {
                    Text(
                        text = "Right",
                        style = PersianTheme.typography.titleMedium,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = Modifier.height(PersianTheme.spacing.size4))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .selectableGroup()
                    ) {
                        PersianRadioButton(
                            modifier = Modifier.fillMaxWidth(),
                            text = "None",
                            checked = rightStates[0].value,
                            onCheckedChange = {
                                rightStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 0
                                }
                                right = null
                            }
                        )
                        PersianRadioButton(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Action",
                            checked = rightStates[1].value,
                            onCheckedChange = {
                                rightStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 1
                                }
                                right = PersianTopAppBarRight
                                    .Action(
                                        text = "Action",
                                        onClick = {}
                                    )
                            }
                        )
                        val icon = rememberVectorPainter(image = PersianSymbols.Default.Bell)
                        PersianRadioButton(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Icon",
                            checked = rightStates[2].value,
                            onCheckedChange = {
                                rightStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 2
                                }
                                right = PersianTopAppBarRight
                                    .Icons(
                                        actionItem = listOf(
                                            ActionItem(
                                                icon = icon,
                                                title = "Notification",
                                                contentDescription = "",
                                                badgeCount = 10,
                                                onClick = {}
                                            )
                                        ),
                                        expanded = mutableStateOf(false)
                                    )
                            }
                        )
                        PersianRadioButton(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Icons",
                            checked = rightStates[3].value,
                            onCheckedChange = {
                                rightStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 3
                                }
                                right = PersianTopAppBarRight
                                    .Icons(
                                        actionItem = listOf(
                                            ActionItem(
                                                icon = icon,
                                                title = "Notification",
                                                contentDescription = "",
                                                onClick = {}
                                            ),
                                            ActionItem(
                                                icon = icon,
                                                title = "Notification",
                                                contentDescription = "",
                                                onClick = {}
                                            ),
                                            ActionItem(
                                                icon = icon,
                                                title = "Notification",
                                                contentDescription = "",
                                                badgeCount = 10,
                                                onClick = {}
                                            ),
                                        ),
                                        expanded = mutableStateOf(false)
                                    )
                            }
                        )
                        PersianRadioButton(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Icons Overflow",
                            checked = rightStates[4].value,
                            onCheckedChange = {
                                rightStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 4
                                }
                                right = PersianTopAppBarRight
                                    .Icons(
                                        actionItem = listOf(
                                            ActionItem(
                                                icon = icon,
                                                title = "Notification",
                                                contentDescription = "",
                                                badgeCount = 10,
                                                onClick = {}
                                            ),
                                            ActionItem(
                                                icon = icon,
                                                title = "Notification",
                                                contentDescription = "",
                                                onClick = {}
                                            ),
                                            ActionItem(
                                                icon = icon,
                                                title = "Notification",
                                                contentDescription = "",
                                                badgeCount = 0,
                                                onClick = {}
                                            ),
                                            ActionItem(
                                                icon = icon,
                                                title = "Notification",
                                                contentDescription = "",
                                                badgeCount = 10,
                                                onClick = {}
                                            ),
                                            ActionItem(
                                                icon = icon,
                                                title = "Notification",
                                                contentDescription = "",
                                                badgeCount = 10,
                                                onClick = {}
                                            ),
                                            ActionItem(
                                                icon = icon,
                                                title = "Notification",
                                                contentDescription = "",
                                                badgeCount = 10,
                                                onClick = {}
                                            ),
                                            ActionItem(
                                                icon = icon,
                                                title = "Notification",
                                                contentDescription = "",
                                                badgeCount = 10,
                                                onClick = {}
                                            ),
                                            ActionItem(
                                                icon = icon,
                                                title = "Notification",
                                                contentDescription = "",
                                                badgeCount = 10,
                                                onClick = {}
                                            ),
                                        ),
                                        expanded = expanded
                                    )
                            }
                        )
                    }
                }
            }

        }
    }
}