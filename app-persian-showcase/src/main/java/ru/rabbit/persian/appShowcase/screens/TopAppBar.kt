package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.core.net.toUri
import androidx.navigation.NavController
import io.github.madmaximuus.persian.formItem.Checkbox
import io.github.madmaximuus.persian.formItem.Checkboxes
import io.github.madmaximuus.persian.formItem.FormItem
import io.github.madmaximuus.persian.formItem.RadioButton
import io.github.madmaximuus.persian.formItem.RadioButtons
import io.github.madmaximuus.persian.formItem.Subhead
import io.github.madmaximuus.persian.menu.DropdownMenuItem
import io.github.madmaximuus.persian.scafold.Scaffold
import io.github.madmaximuus.persian.topAppBar.Action
import io.github.madmaximuus.persian.topAppBar.Avatar
import io.github.madmaximuus.persian.topAppBar.IconButton
import io.github.madmaximuus.persian.topAppBar.More
import io.github.madmaximuus.persian.topAppBar.TopAppBar
import io.github.madmaximuus.persianSymbols.arrow.left.ArrowLeft
import io.github.madmaximuus.persianSymbols.bell.Bell
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.magnifyingGlass.MagnifyingGlass
import ru.rabbit.persian.appShowcase.R

object TopAppBar : Screen {
    override val name: String = "Top app bar"

    override val image: Int = R.drawable.top_app_bar

    override val navigation: String = "topAppBar"

    @Composable
    override fun Content(navController: NavController?) {
        val (counter, onCounterChange) = remember { mutableStateOf(false) }

        val (left, onLeftChange) = remember { mutableStateOf(true) }
        val leftStates = remember {
            listOf(
                mutableStateOf(true),
                mutableStateOf(false),
            )
        }

        val (right, onRightChange) = remember { mutableStateOf(true) }

        val rightStates = remember {
            listOf(
                mutableStateOf(false),
                mutableStateOf(true),
                mutableStateOf(false),
                mutableStateOf(false),
            )
        }
        val (expanded, onExpandedChange) = remember { mutableStateOf(false) }

        var showSettings by remember { mutableStateOf(false) }

        Scaffold(
            topBar = {
                TopAppBar(
                    leading = if (left) {
                        {
                            when {
                                leftStates[0].value -> {
                                    IconButton(
                                        icon = rememberVectorPainter(PersianSymbols.Default.ArrowLeft),
                                        onClick = { navController?.navigateUp() }
                                    )
                                }

                                leftStates[1].value -> {
                                    Avatar(
                                        avatarUrl = "https://loremflickr.com/320/240".toUri(),
                                        onClick = { navController?.navigateUp() }
                                    )
                                }
                            }
                        }
                    } else null,
                    title = name,
                    counterValue = if (counter) 10 else 0,
                    trailing = if (right) {
                        {
                            when {
                                rightStates[0].value -> {
                                    Action(
                                        text = "Action",
                                        onClick = {}
                                    )
                                }

                                rightStates[1].value -> {
                                    IconButton(
                                        icon = rememberVectorPainter(PersianSymbols.Default.Bell),
                                        onClick = {
                                            showSettings = true
                                        }
                                    )
                                }

                                rightStates[2].value -> {
                                    IconButton(
                                        icon = rememberVectorPainter(PersianSymbols.Default.Bell),
                                        onClick = {}
                                    )
                                    IconButton(
                                        icon = rememberVectorPainter(PersianSymbols.Default.MagnifyingGlass),
                                        onClick = {}
                                    )
                                }

                                rightStates[3].value -> {
                                    IconButton(
                                        icon = rememberVectorPainter(PersianSymbols.Default.Bell),
                                        onClick = {}
                                    )
                                    IconButton(
                                        icon = rememberVectorPainter(PersianSymbols.Default.MagnifyingGlass),
                                        onClick = {}
                                    )
                                    More(
                                        expanded = expanded,
                                        onExpandedChange = onExpandedChange,
                                        menuItems = {
                                            DropdownMenuItem(
                                                text = "Menu Action 1",
                                                onClick = { onExpandedChange(false) }
                                            )
                                            DropdownMenuItem(
                                                text = "Menu Action 1",
                                                onClick = { onExpandedChange(false) }
                                            )
                                            DropdownMenuItem(
                                                text = "Menu Action 1",
                                                onClick = { onExpandedChange(false) }
                                            )
                                            DropdownMenuItem(
                                                text = "Menu Action 1",
                                                onClick = { onExpandedChange(false) }
                                            )
                                            DropdownMenuItem(
                                                text = "Menu Action 1",
                                                onClick = { onExpandedChange(false) }
                                            )
                                        }
                                    )
                                }
                            }
                        }
                    } else null
                )
            }
        )
        {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                if (left) {
                    FormItem(
                        subhead = { Subhead(text = "Leading") },
                        content = {
                            RadioButtons {
                                RadioButton(
                                    text = "Icon button",
                                    selected = leftStates[0].value,
                                    onSelectedChange = {
                                        leftStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 0
                                        }
                                    }
                                )
                                RadioButton(
                                    text = "Avatar",
                                    selected = leftStates[1].value,
                                    onSelectedChange = {
                                        leftStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 1
                                        }
                                    }
                                )
                            }
                        }
                    )
                }
                if (right) {
                    FormItem(
                        subhead = { Subhead(text = "Trailing") },
                        content = {
                            RadioButtons {
                                RadioButton(
                                    text = "Action",
                                    selected = rightStates[0].value,
                                    onSelectedChange = {
                                        rightStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 0
                                        }
                                    }
                                )
                                RadioButton(
                                    text = "Icon",
                                    selected = rightStates[1].value,
                                    onSelectedChange = {
                                        rightStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 1
                                        }
                                    }
                                )
                                RadioButton(
                                    text = "Icons",
                                    selected = rightStates[2].value,
                                    onSelectedChange = {
                                        rightStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 2
                                        }
                                    }
                                )
                                RadioButton(
                                    text = "Icons with overflow",
                                    selected = rightStates[3].value,
                                    onSelectedChange = {
                                        rightStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 3
                                        }
                                    }
                                )
                            }
                        }
                    )
                }
                FormItem(
                    subhead = { Subhead(text = "Settings") },
                    content = {
                        Checkboxes {
                            Checkbox(
                                text = "Leading",
                                checked = left,
                                onCheckedChange = onLeftChange
                            )
                            Checkbox(
                                text = "Trailing",
                                checked = right,
                                onCheckedChange = onRightChange
                            )
                            Checkbox(
                                text = "Counter",
                                checked = counter,
                                onCheckedChange = onCounterChange
                            )
                        }
                    }
                )
            }
        }
    }
}