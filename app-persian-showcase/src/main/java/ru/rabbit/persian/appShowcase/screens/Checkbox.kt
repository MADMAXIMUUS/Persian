package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.navigation.NavController
import io.github.madmaximuus.persian.checkbox.Checkbox
import io.github.madmaximuus.persian.checkbox.TriStateCheckbox
import io.github.madmaximuus.persian.foundation.PersianTheme
import ru.rabbit.persian.appShowcase.R
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Checkbox : Screen {

    override val name: String = "Checkbox"

    override val image: Int = R.drawable.checkbox

    override val navigation: String = "checkbox"

    @Composable
    override fun Content(navController: NavController?) {
        val (checked, onCheckedChange) = remember { mutableStateOf(true) }
        val (checked1, onCheckedChange1) = remember { mutableStateOf(false) }
        SampleScaffold(
            title = "Checkboxes",
            onBackClick = { navController?.navigateUp() }
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize(),
                contentPadding = it,
            ) {
                item {
                    Checkbox(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Checked by default",
                        checked = checked,
                        onCheckedChange = onCheckedChange
                    )
                }
                item {
                    Checkbox(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Unchecked by default",
                        checked = checked1,
                        onCheckedChange = onCheckedChange1
                    )
                }
                item {
                    Checkbox(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Checked disabled",
                        checked = true,
                        enabled = false,
                        onCheckedChange = {}
                    )
                }
                item {
                    Checkbox(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Unchecked disabled",
                        checked = false,
                        enabled = false,
                        onCheckedChange = {}
                    )
                }
                item {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        val (state, onStateChange) = remember { mutableStateOf(true) }
                        val (state2, onStateChange2) = remember { mutableStateOf(true) }

                        val parentState = remember(state, state2) {
                            if (state && state2) ToggleableState.On
                            else if (!state && !state2) ToggleableState.Off
                            else ToggleableState.Indeterminate
                        }

                        val onParentClick = {
                            val s = parentState != ToggleableState.On
                            onStateChange(s)
                            onStateChange2(s)
                        }

                        TriStateCheckbox(
                            modifier = Modifier.fillMaxWidth(),
                            state = parentState,
                            onClick = onParentClick,
                            text = "Parent"
                        )
                        Spacer(
                            Modifier
                                .fillMaxWidth()
                                .height(PersianTheme.spacing.size4)
                        )
                        Column(
                            Modifier
                                .fillMaxWidth()
                                .padding(start = PersianTheme.spacing.size12)
                        ) {
                            Checkbox(
                                modifier = Modifier.fillMaxWidth(),
                                checked = state,
                                onCheckedChange = onStateChange,
                                text = "Child"
                            )
                            Spacer(
                                Modifier
                                    .fillMaxWidth()
                                    .height(PersianTheme.spacing.size4)
                            )
                            Checkbox(
                                modifier = Modifier.fillMaxWidth(),
                                checked = state2,
                                onCheckedChange = onStateChange2,
                                text = "Child 2"
                            )
                        }
                    }

                }
            }
        }
    }
}