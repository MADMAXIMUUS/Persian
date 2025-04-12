package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.input.rememberTextFieldState
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
import io.github.madmaximuus.persian.button.Button
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.formItem.Checkbox
import io.github.madmaximuus.persian.formItem.Checkboxes
import io.github.madmaximuus.persian.formItem.FormItem
import io.github.madmaximuus.persian.formItem.Input
import io.github.madmaximuus.persian.formItem.RadioButton
import io.github.madmaximuus.persian.formItem.RadioButtons
import io.github.madmaximuus.persian.formItem.Subhead
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import io.github.madmaximuus.persianSymbols.chevron.right.ChevronRight
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.plus.Plus
import ru.rabbit.persian.appShowcase.R
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Button : Screen {
    override val name: String = "Button"

    override val image: Int = R.drawable.button

    override val navigation: String = "button"

    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() },
            topAppBarScrollBehavior = topAppBarScrollBehavior,
        ) {
            val labelState = rememberTextFieldState("Button")
            val (leading, onLeadingChange) = remember { mutableStateOf(false) }
            val (trailing, onTrailingChange) = remember { mutableStateOf(false) }
            val (additionInfo, onAdditionalInfoChange) = remember { mutableStateOf(false) }
            val additionalInfoState = rememberTextFieldState("Addition info")
            val size = ButtonDefaults.largeSizes()
            var sizeState by remember { mutableStateOf(size) }
            val (enabled, onEnabledChange) = remember { mutableStateOf(true) }
            val (loading, onLoadingChange) = remember { mutableStateOf(false) }

            val colors = ButtonDefaults.primaryColors()
            var colorsState by remember { mutableStateOf(colors) }

            val buttonStyleStates = remember {
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
            val large = ButtonDefaults.largeSizes()
            val medium = ButtonDefaults.mediumSizes()
            val small = ButtonDefaults.smallSizes()

            val primary = ButtonDefaults.primaryColors()
            val secondary = ButtonDefaults.secondaryColors()
            val tertiary = ButtonDefaults.tertiaryColors()
            val outlined = ButtonDefaults.outlinedColors()
            Column(
                Modifier
                    .fillMaxSize()
                    .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection)
                    .verticalScroll(rememberScrollState())
                    .padding(it)
                    .navigationBarsPadding()
            ) {
                SampleRow(
                    text = "Sample",
                    firstItem = true
                ) {
                    Button(
                        text = labelState.text.toString(),
                        sizes = sizeState,
                        colors = colorsState,
                        enabled = enabled,
                        loading = loading,
                        additionInfoText = if (additionInfo) additionalInfoState.text.toString() else null,
                        leadingIcon = if (leading)
                            rememberVectorPainter(image = PersianSymbols.Default.Plus)
                        else null,
                        trailingIcon = if (trailing)
                            rememberVectorPainter(image = PersianSymbols.Default.ChevronRight)
                        else null,
                        onClick = {}
                    )
                }
                FormItem(
                    subhead = { Subhead(text = "Label") },
                    content = { Input(state = labelState) }
                )
                if (additionInfo) {
                    FormItem(
                        subhead = { Subhead(text = "Additional info") },
                        content = { Input(state = additionalInfoState) }
                    )
                }
                FormItem(
                    subhead = { Subhead(text = "Style") },
                    content = {
                        RadioButtons {
                            RadioButton(
                                text = "Primary",
                                selected = buttonStyleStates[0].value,
                                onSelectedChange = {
                                    buttonStyleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                    colorsState = primary
                                }
                            )
                            RadioButton(
                                text = "Secondary",
                                selected = buttonStyleStates[1].value,
                                onSelectedChange = {
                                    buttonStyleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                    }
                                    colorsState = secondary
                                }
                            )
                            RadioButton(
                                text = "Tertiary",
                                selected = buttonStyleStates[2].value,
                                onSelectedChange = {
                                    buttonStyleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 2
                                    }
                                    colorsState = tertiary
                                }
                            )
                            RadioButton(
                                text = "Outlined",
                                selected = buttonStyleStates[3].value,
                                onSelectedChange = {
                                    buttonStyleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 3
                                    }
                                    colorsState = outlined
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
                            if (sizeState != small) {
                                Checkbox(
                                    text = "Additional info",
                                    checked = additionInfo,
                                    onCheckedChange = onAdditionalInfoChange
                                )
                            }
                            Checkbox(
                                text = "Leading",
                                checked = leading,
                                onCheckedChange = onLeadingChange
                            )
                            Checkbox(
                                text = "Trailing",
                                checked = trailing,
                                onCheckedChange = onTrailingChange
                            )
                            Checkbox(
                                text = "Loading",
                                checked = loading,
                                onCheckedChange = onLoadingChange
                            )
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