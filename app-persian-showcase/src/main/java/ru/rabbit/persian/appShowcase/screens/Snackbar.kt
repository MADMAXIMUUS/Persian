package ru.rabbit.persian.appShowcase.screens

import android.net.Uri
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.navigation.NavController
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.button.PrimaryButton
import io.github.madmaximuus.persian.formItem.Checkbox
import io.github.madmaximuus.persian.formItem.Checkboxes
import io.github.madmaximuus.persian.formItem.FormItem
import io.github.madmaximuus.persian.formItem.Input
import io.github.madmaximuus.persian.formItem.RadioButton
import io.github.madmaximuus.persian.formItem.RadioButtons
import io.github.madmaximuus.persian.formItem.Subhead
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.snackbar.Action
import io.github.madmaximuus.persian.snackbar.Avatar
import io.github.madmaximuus.persian.snackbar.Close
import io.github.madmaximuus.persian.snackbar.Icon
import io.github.madmaximuus.persian.snackbar.Image
import io.github.madmaximuus.persian.snackbar.SnackbarDuration
import io.github.madmaximuus.persian.snackbar.SnackbarHostState
import io.github.madmaximuus.persian.snackbar.SnackbarPosition
import io.github.madmaximuus.persian.snackbar.Timer
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.wifi.slash.WifiSlash
import kotlinx.coroutines.launch
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Snackbar : Screen {

    override val name: String = "Snackbar"

    override val navigation: String = "snackbar"

    @Composable
    override fun Content(navController: NavController?) {
        val snackbarHostState = remember { SnackbarHostState() }
        val coroutineScope = rememberCoroutineScope()
        val (showOnTop, showOnTopChange) = remember { mutableStateOf(false) }

        val messageState = rememberTextFieldState("Message")

        val (left, onLeftChange) = remember { mutableStateOf(false) }
        val leftStates = remember {
            listOf(
                mutableStateOf(true),
                mutableStateOf(false),
                mutableStateOf(false),
                mutableStateOf(false),
            )
        }

        val (right, onRightChange) = remember { mutableStateOf(false) }
        val rightStates = remember {
            listOf(
                mutableStateOf(true),
                mutableStateOf(false),
            )
        }

        SampleScaffold(
            title = name,
            onBackClick = {
                navController?.navigateUp()
            },
            snackbarHostState = snackbarHostState,
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it),
            ) {
                FormItem(
                    subhead = { Subhead(text = "Message") },
                    content = { Input(state = messageState) }
                )
                if (left) {
                    FormItem(
                        subhead = { Subhead(text = "Left") },
                        content = {
                            RadioButtons {
                                RadioButton(
                                    text = "Icon",
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
                                RadioButton(
                                    text = "Image",
                                    selected = leftStates[2].value,
                                    onSelectedChange = {
                                        leftStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 2
                                        }
                                    }
                                )
                                RadioButton(
                                    text = "Timer",
                                    selected = leftStates[3].value,
                                    onSelectedChange = {
                                        leftStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 3
                                        }
                                    }
                                )
                            }
                        }
                    )
                }
                if (right) {
                    FormItem(
                        subhead = { Subhead(text = "Right") },
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
                                    text = "Close",
                                    selected = rightStates[1].value,
                                    onSelectedChange = {
                                        rightStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 1
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
                                text = "Left",
                                checked = left,
                                onCheckedChange = onLeftChange
                            )
                            Checkbox(
                                text = "Right",
                                checked = right,
                                onCheckedChange = onRightChange
                            )
                            Checkbox(
                                text = "On top",
                                checked = showOnTop,
                                onCheckedChange = showOnTopChange
                            )
                        }
                    }
                )
                PrimaryButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = PersianTheme.spacing.size16)
                        .padding(top = PersianTheme.spacing.size8),
                    text = "Show snackbar",
                    sizes = ButtonDefaults.largeSizes()
                ) {
                    snackbarHostState.currentSnackbarData?.dismiss()
                    coroutineScope.launch {
                        snackbarHostState.showSnackbar(
                            message = messageState.text.toString(),
                            duration = SnackbarDuration.Short,
                            hasProgress = leftStates[3].value,
                            snackbarPosition = if (showOnTop) SnackbarPosition.Top else SnackbarPosition.Bottom,
                            left = if (left) {
                                {
                                    when {
                                        leftStates[0].value -> {
                                            Icon(
                                                icon = rememberVectorPainter(image = PersianSymbols.Default.WifiSlash),
                                                contentDescription = ""
                                            )
                                        }

                                        leftStates[1].value -> {
                                            Avatar(
                                                avatarUrl = Uri.parse("https://loremflickr.com/320/240")
                                            )
                                        }

                                        leftStates[2].value -> {
                                            Image(
                                                imageUrl = Uri.parse("https://loremflickr.com/320/240")
                                            )
                                        }

                                        leftStates[3].value -> {
                                            Timer(
                                                progress = 5f
                                            )
                                        }
                                    }
                                }
                            } else null,
                            right = if (right) {
                                {
                                    when {
                                        rightStates[0].value -> {
                                            Action(
                                                text = "Action",
                                                onClick = { data -> data.dismiss() }
                                            )
                                        }

                                        rightStates[1].value -> {
                                            Close()
                                        }

                                        else -> {}
                                    }
                                }
                            } else null,
                        )
                    }
                }
            }
        }
    }
}