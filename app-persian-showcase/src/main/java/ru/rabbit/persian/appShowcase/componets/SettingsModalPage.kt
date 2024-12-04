package ru.rabbit.persian.appShowcase.componets

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.forms.FormItem
import io.github.madmaximuus.persian.forms.RadioButton
import io.github.madmaximuus.persian.forms.RadioButtons
import io.github.madmaximuus.persian.forms.Subhead
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.modalPage.Action
import io.github.madmaximuus.persian.modalPage.ModalPage
import io.github.madmaximuus.persian.modalPage.rememberPageState
import io.github.madmaximuus.persian.modalPage.util.DragAnchor
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import ru.rabbit.persian.appShowcase.util.LocalAppSettingsManager
import ru.rabbit.persian.appShowcase.util.Theme

@Composable
fun SettingsModalPage(
    onDismiss: () -> Unit
) {
    val settingsManager = LocalAppSettingsManager.current
    val scope = rememberCoroutineScope()
    val themeStates = remember {
        listOf(
            mutableStateOf(true),
            mutableStateOf(false),
            mutableStateOf(false)
        )
    }
    LaunchedEffect(Unit) {
        val theme = settingsManager.theme.first()
        when (theme) {
            Theme.SYSTEM -> {
                themeStates[0].value = true
                themeStates[1].value = false
                themeStates[2].value = false
            }

            Theme.LIGHT -> {
                themeStates[0].value = false
                themeStates[1].value = false
                themeStates[2].value = true
            }

            Theme.DARK -> {
                themeStates[0].value = false
                themeStates[1].value = true
                themeStates[2].value = false
            }
        }
    }
    ModalPage(
        onDismissRequest = onDismiss,
        pageState = rememberPageState(
            dragAnchors = setOf(DragAnchor.Fraction(0.33f))
        ),
        bottom = {
            this.Action(text = "Reset") {
                scope.launch {
                    settingsManager.updateTheme(Theme.SYSTEM)
                }
                themeStates.forEachIndexed { index, mutableState ->
                    mutableState.value = index == 0
                }
            }
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(it)
        ) {
            FormItem(
                modifier = Modifier
                    .padding(top = PersianTheme.spacing.size24),
                subhead = { Subhead(text = "Theme") },
                content = {
                    RadioButtons {
                        RadioButton(
                            text = "System",
                            selected = themeStates[0].value
                        ) {
                            scope.launch {
                                settingsManager.updateTheme(Theme.SYSTEM)
                            }
                            themeStates.forEachIndexed { index, mutableState ->
                                mutableState.value = index == 0
                            }
                        }
                        RadioButton(
                            text = "Dark",
                            selected = themeStates[1].value
                        ) {
                            scope.launch {
                                settingsManager.updateTheme(Theme.DARK)
                            }
                            themeStates.forEachIndexed { index, mutableState ->
                                mutableState.value = index == 1
                            }
                        }
                        RadioButton(
                            text = "Light",
                            selected = themeStates[2].value
                        ) {
                            scope.launch {
                                settingsManager.updateTheme(Theme.LIGHT)
                            }
                            themeStates.forEachIndexed { index, mutableState ->
                                mutableState.value = index == 2
                            }
                        }
                    }
                }
            )
        }
    }
}