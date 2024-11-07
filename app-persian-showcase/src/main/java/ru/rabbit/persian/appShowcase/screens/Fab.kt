package ru.rabbit.persian.appShowcase.screens

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.navigation.NavController
import io.github.madmaximuus.persian.fab.Fab
import io.github.madmaximuus.persian.fab.FabDefaults
import io.github.madmaximuus.persian.fab.SmallFab
import io.github.madmaximuus.persian.forms.Checkbox
import io.github.madmaximuus.persian.forms.Checkboxes
import io.github.madmaximuus.persian.forms.Form
import io.github.madmaximuus.persian.forms.Input
import io.github.madmaximuus.persian.forms.RadioButton
import io.github.madmaximuus.persian.forms.RadioButtons
import io.github.madmaximuus.persian.forms.Subhead
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.plus.base.Plus
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Fab : Screen {

    override val name: String = "FABs"

    override val navigation: String = "fab"

    @Composable
    override fun Content(navController: NavController?) {

        val (expandable, onExpandableChange) = remember { mutableStateOf(true) }
        val labelState = rememberTextFieldState("Fab")

        val sizeStates = remember {
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

        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() }
        ) {
            Column(
                modifier = Modifier
                    .animateContentSize()
                    .fillMaxWidth()
                    .padding(it)
            ) {
                SampleRow(text = "Sample", firstItem = true) {
                    when {
                        sizeStates[0].value -> {
                            Fab(
                                icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                                title = "Add",
                                expanded = expandable,
                                colors = when {
                                    styleStates[0].value -> FabDefaults.neutralColors()
                                    styleStates[1].value -> FabDefaults.primaryColors()
                                    styleStates[2].value -> FabDefaults.secondaryColors()
                                    styleStates[3].value -> FabDefaults.tertiaryColors()
                                    else -> FabDefaults.neutralColors()
                                },
                                onClick = {}
                            )

                        }

                        sizeStates[1].value -> {
                            SmallFab(
                                icon = rememberVectorPainter(image = PersianSymbols.Default.Plus),
                                colors = when {
                                    styleStates[0].value -> FabDefaults.neutralColors()
                                    styleStates[1].value -> FabDefaults.primaryColors()
                                    styleStates[2].value -> FabDefaults.secondaryColors()
                                    styleStates[3].value -> FabDefaults.tertiaryColors()
                                    else -> FabDefaults.neutralColors()
                                },
                                onClick = {}
                            )
                        }
                    }
                }
                if (sizeStates[0].value) {
                    Form(
                        subhead = { Subhead(text = "Label") },
                        content = { Input(state = labelState) }
                    )
                }
                Form(
                    modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                    subhead = { Subhead(text = "Size") },
                    content = {
                        RadioButtons {
                            RadioButton(
                                text = "Default",
                                selected = sizeStates[0].value,
                                onSelectedChange = {
                                    sizeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                }
                            )
                            RadioButton(
                                text = "Small",
                                selected = sizeStates[1].value,
                                onSelectedChange = {
                                    sizeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                    }
                                }
                            )
                        }
                    }
                )
                Form(
                    modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                    subhead = { Subhead(text = "Size") },
                    content = {
                        RadioButtons {
                            RadioButton(
                                text = "Neutral",
                                selected = styleStates[0].value,
                                onSelectedChange = {
                                    styleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                }
                            )
                            RadioButton(
                                text = "Primary",
                                selected = styleStates[1].value,
                                onSelectedChange = {
                                    styleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                    }
                                }
                            )
                            RadioButton(
                                text = "Secondary",
                                selected = styleStates[2].value,
                                onSelectedChange = {
                                    styleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 2
                                    }
                                }
                            )
                            RadioButton(
                                text = "Tertiary",
                                selected = styleStates[3].value,
                                onSelectedChange = {
                                    styleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 3
                                    }
                                }
                            )
                        }
                    }
                )
                if (sizeStates[0].value) {
                    Form(
                        modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                        subhead = { Subhead(text = "Settings") },
                        content = {
                            Checkboxes {
                                Checkbox(
                                    text = "Expanded",
                                    checked = expandable,
                                    onCheckedChange = onExpandableChange
                                )
                            }
                        }
                    )
                }
            }
        }
    }
}