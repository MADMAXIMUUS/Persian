package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.radioButton.RadioButton
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object RadioButton : Screen {

    override val name: String = "Radio Button"

    override val navigation: String = "radio"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        val (checked, onCheckedChange) = remember { mutableStateOf(true) }
        val (checked1, onCheckedChange1) = remember { mutableStateOf(false) }
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() }
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = PersianTheme.spacing.size12),
                contentPadding = it
            ) {
                item {
                    RadioButton(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Selected by default",
                        checked = checked,
                        onCheckedChange = onCheckedChange
                    )
                }
                item {
                    RadioButton(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Unselected by default",
                        checked = checked1,
                        onCheckedChange = onCheckedChange1
                    )
                }
                item {
                    RadioButton(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Selected disabled",
                        checked = true,
                        enabled = false,
                        onCheckedChange = {}
                    )
                }
                item {
                    RadioButton(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Unselected disabled",
                        checked = false,
                        enabled = false,
                        onCheckedChange = {}
                    )
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
                            RadioButton(
                                modifier = Modifier.fillMaxWidth(),
                                text = "Radio Button 1",
                                checked = states[0].value,
                                onCheckedChange = {
                                    states.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                }
                            )
                            RadioButton(
                                modifier = Modifier.fillMaxWidth(),
                                text = "Radio Button 2",
                                checked = states[1].value,
                                onCheckedChange = {
                                    states.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                    }
                                }
                            )
                            RadioButton(
                                modifier = Modifier.fillMaxWidth(),
                                text = "Radio Button 3",
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