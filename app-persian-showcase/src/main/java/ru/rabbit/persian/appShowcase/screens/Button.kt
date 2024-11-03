package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
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
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.button.OutlinedButton
import io.github.madmaximuus.persian.button.PrimaryButton
import io.github.madmaximuus.persian.button.SecondaryButton
import io.github.madmaximuus.persian.button.TertiaryButton
import io.github.madmaximuus.persian.forms.Checkbox
import io.github.madmaximuus.persian.forms.Checkboxes
import io.github.madmaximuus.persian.forms.Form
import io.github.madmaximuus.persian.forms.Input
import io.github.madmaximuus.persian.forms.RadioButton
import io.github.madmaximuus.persian.forms.RadioButtons
import io.github.madmaximuus.persian.forms.Subhead
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import io.github.madmaximuus.persianSymbols.chevronRight.base.ChevronRight
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.plus.base.Plus
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Button : Screen {
    override val name: String = "Button"

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
            val (text, onTextChange) = remember { mutableStateOf("Button") }
            val (leading, onLeadingChange) = remember { mutableStateOf(false) }
            val (trailing, onTrailingChange) = remember { mutableStateOf(false) }
            val (additionInfo, onAdditionalInfoChange) = remember { mutableStateOf(false) }
            val (additionInfoValue, onAdditionalInfoValueChange) = remember { mutableStateOf("Addition info") }
            val size = ButtonDefaults.largeSizes()
            var sizeState by remember { mutableStateOf(size) }
            val (enabled, onEnabledChange) = remember { mutableStateOf(true) }
            val (loading, onLoadingChange) = remember { mutableStateOf(false) }
            var selectedButtonStyle by remember { mutableStateOf("Primary") }
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
                    when (selectedButtonStyle) {
                        "Primary" -> {
                            PrimaryButton(
                                text = text,
                                sizes = sizeState,
                                enabled = enabled,
                                loading = loading,
                                additionInfoText = if (additionInfo) additionInfoValue else null,
                                leadingIcon = if (leading)
                                    rememberVectorPainter(image = PersianSymbols.Default.Plus)
                                else null,
                                trailingIcon = if (trailing)
                                    rememberVectorPainter(image = PersianSymbols.Default.ChevronRight)
                                else null,
                                onClick = {}
                            )
                        }

                        "Secondary" -> {
                            SecondaryButton(
                                text = text,
                                sizes = sizeState,
                                enabled = enabled,
                                loading = loading,
                                additionInfoText = if (additionInfo) additionInfoValue else null,
                                leadingIcon = if (leading)
                                    rememberVectorPainter(image = PersianSymbols.Default.Plus)
                                else null,
                                trailingIcon = if (trailing)
                                    rememberVectorPainter(image = PersianSymbols.Default.ChevronRight)
                                else null,
                                onClick = {}
                            )
                        }

                        "Tertiary" -> {
                            TertiaryButton(
                                text = text,
                                sizes = sizeState,
                                enabled = enabled,
                                loading = loading,
                                additionInfoText = if (additionInfo) additionInfoValue else null,
                                leadingIcon = if (leading)
                                    rememberVectorPainter(image = PersianSymbols.Default.Plus)
                                else null,
                                trailingIcon = if (trailing)
                                    rememberVectorPainter(image = PersianSymbols.Default.ChevronRight)
                                else null,
                                onClick = {}
                            )
                        }

                        "Outlined" -> {
                            OutlinedButton(
                                text = text,
                                sizes = sizeState,
                                enabled = enabled,
                                loading = loading,
                                additionInfoText = if (additionInfo) additionInfoValue else null,
                                leadingIcon = if (leading)
                                    rememberVectorPainter(image = PersianSymbols.Default.Plus)
                                else null,
                                trailingIcon = if (trailing)
                                    rememberVectorPainter(image = PersianSymbols.Default.ChevronRight)
                                else null,
                                onClick = {}
                            )
                        }
                    }
                }
                Form(
                    subhead = {
                        Subhead(text = "Label")
                    },
                    content = {
                        Input(
                            value = text,
                            onValueChange = onTextChange
                        )
                    }
                )
                if (additionInfo) {
                    Form(
                        modifier = Modifier
                            .padding(top = PersianTheme.spacing.size12),
                        subhead = {
                            Subhead(text = "Additional info")
                        },
                        content = {
                            Input(
                                value = additionInfoValue,
                                onValueChange = onAdditionalInfoValueChange
                            )
                        }
                    )
                }
                Form(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = PersianTheme.spacing.size12),
                    subhead = {
                        Subhead(text = "Style")
                    },
                    content = {
                        RadioButtons {
                            RadioButton(
                                text = "Primary",
                                selected = buttonStyleStates[0].value,
                                onSelectedChange = {
                                    buttonStyleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                    selectedButtonStyle = "Primary"
                                }
                            )
                            RadioButton(
                                text = "Secondary",
                                selected = buttonStyleStates[1].value,
                                onSelectedChange = {
                                    buttonStyleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                    }
                                    selectedButtonStyle = "Secondary"
                                }
                            )
                            RadioButton(
                                text = "Tertiary",
                                selected = buttonStyleStates[2].value,
                                onSelectedChange = {
                                    buttonStyleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 2
                                    }
                                    selectedButtonStyle = "Tertiary"
                                }
                            )
                            RadioButton(
                                text = "Outlined",
                                selected = buttonStyleStates[3].value,
                                onSelectedChange = {
                                    buttonStyleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 3
                                    }
                                    selectedButtonStyle = "Outlined"
                                }
                            )
                        }
                    }
                )
                Form(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = PersianTheme.spacing.size12),
                    subhead = {
                        Subhead(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Size"
                        )
                    },
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
                Form(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = PersianTheme.spacing.size20),
                    subhead = {
                        Subhead(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Additional settings"
                        )
                    },
                    content = {
                        Checkboxes {
                            Checkbox(
                                text = "Additional info",
                                checked = additionInfo,
                                onCheckedChange = onAdditionalInfoChange
                            )
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
                /*Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = PersianTheme.spacing.size8,
                            bottom = PersianTheme.spacing.size8,
                            start = PersianTheme.spacing.size12,
                            end = PersianTheme.spacing.size12
                        ),
                ) {
                    Text(
                        text = "Additional settings",
                        style = PersianTheme.typography.titleMedium,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = Modifier.height(PersianTheme.spacing.size4))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Checkbox(
                            text = "Addition info",
                            checked = additionInfo, onAdditionalInfoChange
                        ),
                        onCheckedChange = { isChecked ->
                            additionInfo, onAdditionaInfoLabelChange) = isChecked
                        }
                        )

                        Checkbox(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Show Leading icon",
                            checked = showLeadingIcon,
                            onCheckedChange = {
                                showLeadingIcon = !showLeadingIcon
                            }
                        )
                        Checkbox(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Show Trailing icon",
                            checked = showTrailingIcon,
                            onCheckedChange = {
                                showTrailingIcon = !showTrailingIcon
                            }
                        )
                        Checkbox(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Enabled",
                            checked = enabled,
                            onCheckedChange = {
                                enabled = !enabled
                            }
                        )
                        Checkbox(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Loading",
                            checked = loading,
                            onCheckedChange = {
                                loading = !loading
                            }
                        )
                    }
                }*/
            }
        }
    }
}