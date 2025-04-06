package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import io.github.madmaximuus.persian.formItem.FormItem
import io.github.madmaximuus.persian.formItem.RadioButton
import io.github.madmaximuus.persian.formItem.RadioButtons
import io.github.madmaximuus.persian.formItem.Subhead
import io.github.madmaximuus.persian.radioButton.RadioButton
import ru.rabbit.persian.appShowcase.R
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object RadioButton : Screen {

    override val name: String = "Radio button"

    override val image: Int = R.drawable.radio_button

    override val navigation: String = "radio"

    @Composable
    override fun Content(navController: NavController?) {
        val (checked, onCheckedChange) = remember { mutableStateOf(true) }
        val (checked1, onCheckedChange1) = remember { mutableStateOf(false) }
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() }
        ) {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = it
            ) {
                item {
                    RadioButton(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Selected by default",
                        selected = checked,
                        onSelectedChange = onCheckedChange
                    )
                }
                item {
                    RadioButton(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Unselected by default",
                        selected = checked1,
                        onSelectedChange = onCheckedChange1
                    )
                }
                item {
                    RadioButton(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Selected disabled",
                        selected = true,
                        enabled = false,
                        onSelectedChange = {}
                    )
                }
                item {
                    RadioButton(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Unselected disabled",
                        selected = false,
                        enabled = false,
                        onSelectedChange = {}
                    )
                }
                item {
                    val states = remember {
                        listOf(
                            mutableStateOf(true),
                            mutableStateOf(false),
                            mutableStateOf(false)
                        )
                    }
                    FormItem(
                        subhead = { Subhead(text = "Selected group") },
                        content = {
                            RadioButtons {
                                RadioButton(
                                    text = "Radio Button 1",
                                    selected = states[0].value,
                                    onSelectedChange = {
                                        states.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 0
                                        }
                                    }
                                )
                                RadioButton(
                                    text = "Radio Button 2",
                                    selected = states[1].value,
                                    onSelectedChange = {
                                        states.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 1
                                        }
                                    }
                                )
                                RadioButton(
                                    text = "Radio Button 3",
                                    selected = states[2].value,
                                    onSelectedChange = {
                                        states.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 2
                                        }
                                    }
                                )
                            }
                        }
                    )
                }
            }
        }
    }
}