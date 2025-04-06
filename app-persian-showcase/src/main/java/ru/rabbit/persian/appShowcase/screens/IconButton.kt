package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.NavController
import io.github.madmaximuus.persian.formItem.Checkbox
import io.github.madmaximuus.persian.formItem.Checkboxes
import io.github.madmaximuus.persian.formItem.FormItem
import io.github.madmaximuus.persian.formItem.RadioButton
import io.github.madmaximuus.persian.formItem.RadioButtons
import io.github.madmaximuus.persian.formItem.Subhead
import io.github.madmaximuus.persian.iconButton.IconButton
import io.github.madmaximuus.persian.iconButton.IconButtonDefaults
import io.github.madmaximuus.persian.iconButton.ToggleIconButton
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.heart.Heart
import ru.rabbit.persian.appShowcase.R
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object IconButton : Screen {

    override val name: String = "Icon button"

    override val image: Int = R.drawable.icon_button

    override val navigation: String = "iconButton"

    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() },
            topAppBarScrollBehavior = topAppBarScrollBehavior,
        ) {
            val size = IconButtonDefaults.largeSizes()
            var sizeState by remember { mutableStateOf(size) }

            val colors = IconButtonDefaults.primaryIconButtonColors()
            var colorsState by remember { mutableStateOf(colors) }

            val toggleColors = IconButtonDefaults.primaryToggleIconButtonColors()
            var toggleColorsState by remember { mutableStateOf(toggleColors) }

            val (enabled, onEnabledChange) = remember { mutableStateOf(true) }
            val (checked, onCheckedChange) = remember { mutableStateOf(false) }

            val typeStates = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(false)
                )
            }

            val styleStates = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(false),
                    mutableStateOf(false),
                    mutableStateOf(false)
                )
            }

            val sizeStates = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(false),
                    mutableStateOf(false)
                )
            }
            val large = IconButtonDefaults.largeSizes()
            val medium = IconButtonDefaults.mediumSizes()
            val small = IconButtonDefaults.smallSizes()

            val primaryColors = IconButtonDefaults.primaryIconButtonColors()
            val secondaryColors = IconButtonDefaults.secondaryIconButtonColors()
            val tertiaryColors = IconButtonDefaults.tertiaryIconButtonColors()
            val outlinedColors = IconButtonDefaults.outlinedIconButtonColors()
            val primaryToggleColors = IconButtonDefaults.primaryToggleIconButtonColors()
            val secondaryToggleColors = IconButtonDefaults.secondaryToggleIconButtonColors()
            val tertiaryToggleColors = IconButtonDefaults.tertiaryToggleIconButtonColors()
            val outlinedToggleColors = IconButtonDefaults.outlinedToggleIconButtonColors()

            Column(
                Modifier
                    .fillMaxSize()
                    .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection)
                    .verticalScroll(rememberScrollState())
                    .padding(it)
            ) {
                SampleRow(
                    text = "Sample",
                    firstItem = true
                ) {
                    when {
                        typeStates[0].value -> {
                            IconButton(
                                sizes = sizeState,
                                enabled = enabled,
                                icon = rememberVectorPainter(image = PersianSymbols.Default.Heart),
                                colors = colorsState,
                                onClick = {}
                            )
                        }

                        typeStates[1].value -> {
                            ToggleIconButton(
                                icon = rememberVectorPainter(image = PersianSymbols.Default.Heart),
                                checkedIcon = rememberVectorPainter(image = PersianSymbols.Filled.Heart),
                                checked = checked,
                                sizes = sizeState,
                                colors = toggleColorsState,
                                enabled = enabled,
                                onCheckedChange = onCheckedChange
                            )
                        }
                    }
                }
                FormItem(
                    subhead = { Subhead(text = "Type") },
                    content = {
                        RadioButtons {
                            RadioButton(
                                text = "Default",
                                selected = typeStates[0].value,
                                onSelectedChange = {
                                    typeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                }
                            )
                            RadioButton(
                                text = "Toggleable",
                                selected = typeStates[1].value,
                                onSelectedChange = {
                                    typeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                    }
                                }
                            )
                        }
                    }
                )
                FormItem(
                    subhead = { Subhead(text = "Style") },
                    content = {
                        RadioButtons {
                            RadioButton(
                                text = "Primary",
                                selected = styleStates[0].value,
                                onSelectedChange = {
                                    styleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                        colorsState = primaryColors
                                        toggleColorsState = primaryToggleColors
                                    }
                                }
                            )
                            RadioButton(
                                text = "Secondary",
                                selected = styleStates[1].value,
                                onSelectedChange = {
                                    styleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                        colorsState = secondaryColors
                                        toggleColorsState = secondaryToggleColors
                                    }
                                }
                            )
                            RadioButton(
                                text = "Tertiary",
                                selected = styleStates[2].value,
                                onSelectedChange = {
                                    styleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 2
                                        colorsState = tertiaryColors
                                        toggleColorsState = tertiaryToggleColors
                                    }
                                }
                            )
                            RadioButton(
                                text = "Outlined",
                                selected = styleStates[3].value,
                                onSelectedChange = {
                                    styleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 3
                                        colorsState = outlinedColors
                                        toggleColorsState = outlinedToggleColors
                                    }
                                }
                            )
                        }
                    }
                )
                FormItem(
                    subhead = { Subhead(text = "Size") },
                    content = {
                        RadioButtons {
                            RadioButton(
                                text = "Large",
                                selected = sizeStates[0].value,
                                onSelectedChange = {
                                    sizeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                    sizeState = large
                                }
                            )
                            RadioButton(
                                text = "Medium",
                                selected = sizeStates[1].value,
                                onSelectedChange = {
                                    sizeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                    }
                                    sizeState = medium
                                }
                            )
                            RadioButton(
                                text = "Small",
                                selected = sizeStates[2].value,
                                onSelectedChange = {
                                    sizeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 2
                                    }
                                    sizeState = small
                                }
                            )
                        }
                    }
                )
                FormItem(
                    subhead = { Subhead(text = "Settings") },
                    content = {
                        Checkboxes {
                            Checkbox(
                                text = "Enabled",
                                checked = enabled,
                                onCheckedChange = onEnabledChange
                            )
                        }
                    }
                )
            }
        }
    }
}