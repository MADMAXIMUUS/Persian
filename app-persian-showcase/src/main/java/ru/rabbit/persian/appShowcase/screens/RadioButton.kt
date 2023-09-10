package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold
import ru.rabbit.persian.radioButtons.PersianRadioButton

object RadioButton : Screen {

    override val name: String = "Radio Buttons"

    override val navigation: String = "radio"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() }
        ) {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = it
            ) {
                item {
                    var state by remember { mutableStateOf(false) }
                    SampleRow(text = "Unselected", firstItem = true) {
                        Column(modifier = Modifier.fillMaxWidth()) {
                            PersianRadioButton.Primary(
                                text = "Radio Button",
                                checked = state,
                                enabled = false,
                                onCheckedChange = {
                                    state = !state
                                }
                            )
                            PersianRadioButton.Primary(
                                text = "Radio Button",
                                checked = state,
                                onCheckedChange = {
                                    state = !state
                                }
                            )
                        }
                    }
                }
                item {
                    SampleRow(text = "Selected", firstItem = true) {
                        var state by remember { mutableStateOf(true) }
                        Column(modifier = Modifier.fillMaxWidth()) {
                            PersianRadioButton.Primary(
                                text = "Radio Button",
                                checked = state,
                                enabled = false,
                                onCheckedChange = {
                                    state = !state
                                }
                            )
                            PersianRadioButton.Primary(
                                text = "Radio Button",
                                checked = state,
                                onCheckedChange = {
                                    state = !state
                                }
                            )
                        }
                    }
                }
                item {
                    SampleRow(text = "Selected Group", firstItem = true) {
                        val states = remember {
                            listOf(
                                mutableStateOf(true),
                                mutableStateOf(false),
                                mutableStateOf(false)
                            )
                        }
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .selectableGroup()
                        ) {
                            PersianRadioButton.Primary(
                                text = "Radio Button",
                                checked = states[0].value,
                                onCheckedChange = {
                                    states.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                }
                            )
                            PersianRadioButton.Primary(
                                text = "Radio Button",
                                checked = states[1].value,
                                onCheckedChange = {
                                    states.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                    }
                                }
                            )
                            PersianRadioButton.Primary(
                                text = "Radio Button",
                                checked = states[2].value,
                                onCheckedChange = {
                                    states.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 2
                                    }
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}