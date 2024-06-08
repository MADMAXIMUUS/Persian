package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.navigation.NavController
import io.github.madmaximuus.persian.buttons.PersianButtonDefaults
import io.github.madmaximuus.persian.buttons.PersianPrimaryButton
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.inputs.PersianOutlineInput
import io.github.madmaximuus.persian.radioButtons.PersianRadioButton
import io.github.madmaximuus.persian.snackbar.PersianSnackbarLeft
import io.github.madmaximuus.persian.snackbar.PersianSnackbarRight
import io.github.madmaximuus.persian.snackbar.PersianSnackbarVisuals
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.wifi.slash.WifiSlash
import kotlinx.coroutines.launch
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Snackbar : Screen {

    override val name: String = "Snackbar"

    override val navigation: String = "snackbar"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        val snackbarHostState = remember { SnackbarHostState() }
        val coroutineScope = rememberCoroutineScope()

        val (text, onTextChange) = remember { mutableStateOf("Message") }
        var left by remember { mutableStateOf<PersianSnackbarLeft?>(null) }
        var right by remember { mutableStateOf<PersianSnackbarRight?>(null) }

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
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.medium)
            ) {
                PersianPrimaryButton(
                    text = "Show snackbar",
                    sizes = PersianButtonDefaults.largeSizes()
                ) {
                    coroutineScope.launch {
                        snackbarHostState.currentSnackbarData?.dismiss()
                        snackbarHostState.showSnackbar(
                            PersianSnackbarVisuals(
                                message = text,
                                duration = SnackbarDuration.Short,
                                left = left,
                                right = right
                            )
                        )
                    }
                }
                SampleRow(text = "Message") {
                    PersianOutlineInput(
                        value = text,
                        onValueChange = onTextChange
                    )
                }
                val leftStates = remember {
                    listOf(
                        mutableStateOf(true),
                        mutableStateOf(false),
                        mutableStateOf(false),
                        mutableStateOf(false),
                        mutableStateOf(false),
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = MaterialTheme.spacing.small,
                            bottom = MaterialTheme.spacing.small,
                            start = MaterialTheme.spacing.medium,
                            end = MaterialTheme.spacing.medium
                        ),
                ) {
                    Text(
                        text = "Left",
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = Modifier.height(MaterialTheme.spacing.extraSmall))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .selectableGroup()
                    ) {
                        val icon = rememberVectorPainter(image = PersianSymbols.Default.WifiSlash)
                        val color = MaterialTheme.extendedColorScheme.primary
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
                            text = "Icon",
                            checked = leftStates[1].value,
                            onCheckedChange = {
                                leftStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 1
                                }
                                left = PersianSnackbarLeft.Icon(
                                    icon = icon,
                                    color = color
                                )
                            }
                        )
                        PersianRadioButton(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Avatar",
                            checked = leftStates[2].value,
                            onCheckedChange = {
                                leftStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 2
                                }
                                left = PersianSnackbarLeft.Avatar(
                                    avatarUrl = "https://loremflickr.com/320/240"
                                )
                            }
                        )
                        PersianRadioButton(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Image",
                            checked = leftStates[3].value,
                            onCheckedChange = {
                                leftStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 3
                                }
                                left = PersianSnackbarLeft.Image(
                                    imageUrl = "https://loremflickr.com/320/240"
                                )
                            }
                        )
                        PersianRadioButton(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Progress",
                            checked = leftStates[4].value,
                            onCheckedChange = {
                                leftStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 4
                                }
                                left = PersianSnackbarLeft.Progress(
                                    progress = 0.5f
                                )
                            }
                        )
                    }
                }
                val rightStates = remember {
                    listOf(
                        mutableStateOf(true),
                        mutableStateOf(false),
                        mutableStateOf(false),
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = MaterialTheme.spacing.small,
                            bottom = MaterialTheme.spacing.small,
                            start = MaterialTheme.spacing.medium,
                            end = MaterialTheme.spacing.medium
                        ),
                ) {
                    Text(
                        text = "Right",
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = Modifier.height(MaterialTheme.spacing.extraSmall))
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
                                right = PersianSnackbarRight.Action(
                                    text = "Aciton",
                                    onClick = {}
                                )
                            }
                        )
                        PersianRadioButton(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Close",
                            checked = rightStates[2].value,
                            onCheckedChange = {
                                rightStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 2
                                }
                                right = PersianSnackbarRight.Close(onClick = {})
                            }
                        )
                    }
                }
            }
        }
    }
}