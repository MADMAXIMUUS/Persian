package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.NavController
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.button.OutlinedButton
import io.github.madmaximuus.persian.button.PrimaryButton
import io.github.madmaximuus.persian.button.SecondaryButton
import io.github.madmaximuus.persian.button.TertiaryButton
import io.github.madmaximuus.persian.checkboxes.Checkbox
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.input.OutlineInput
import io.github.madmaximuus.persian.radioButton.RadioButton
import io.github.madmaximuus.persian.text.Text
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
            var text by remember { mutableStateOf("Button") }
            var showLeadingIcon by remember { mutableStateOf(false) }
            var showTrailingIcon by remember { mutableStateOf(false) }
            var showAdditionInfoLabel by remember { mutableStateOf(false) }
            var additionInfoLabelText by remember { mutableStateOf("Addition Info") }
            val size = ButtonDefaults.largeSizes()
            var sizeState by remember { mutableStateOf(size) }
            var enabled by remember { mutableStateOf(true) }
            var loading by remember { mutableStateOf(false) }
            Column(
                Modifier
                    .fillMaxSize()
                    .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection)
                    .verticalScroll(rememberScrollState())
                    .padding(it)
            ) {
                SampleRow(
                    text = "Sample",
                    firstItem = true
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size16)
                    ) {
                        PrimaryButton(
                            text = text,
                            sizes = sizeState,
                            enabled = enabled,
                            loading = loading,
                            additionInfoText = if (showAdditionInfoLabel) additionInfoLabelText else null,
                            leadingIcon = if (showLeadingIcon) rememberVectorPainter(image = PersianSymbols.Default.Plus) else null,
                            trailingIcon = if (showTrailingIcon) rememberVectorPainter(image = PersianSymbols.Default.ChevronRight) else null,
                            onClick = {}
                        )
                        SecondaryButton(
                            text = text,
                            sizes = sizeState,
                            enabled = enabled,
                            loading = loading,
                            additionInfoText = if (showAdditionInfoLabel) additionInfoLabelText else null,
                            leadingIcon = if (showLeadingIcon) rememberVectorPainter(image = PersianSymbols.Default.Plus) else null,
                            trailingIcon = if (showTrailingIcon) rememberVectorPainter(image = PersianSymbols.Default.ChevronRight) else null,
                            onClick = {}
                        )
                        OutlinedButton(
                            text = text,
                            sizes = sizeState,
                            enabled = enabled,
                            loading = loading,
                            additionInfoText = if (showAdditionInfoLabel) additionInfoLabelText else null,
                            leadingIcon = if (showLeadingIcon) rememberVectorPainter(image = PersianSymbols.Default.Plus) else null,
                            trailingIcon = if (showTrailingIcon) rememberVectorPainter(image = PersianSymbols.Default.ChevronRight) else null,
                            onClick = {}
                        )
                        TertiaryButton(
                            text = text,
                            sizes = sizeState,
                            enabled = enabled,
                            loading = loading,
                            additionInfoText = if (showAdditionInfoLabel) additionInfoLabelText else null,
                            leadingIcon = if (showLeadingIcon) rememberVectorPainter(image = PersianSymbols.Default.Plus) else null,
                            trailingIcon = if (showTrailingIcon) rememberVectorPainter(image = PersianSymbols.Default.ChevronRight) else null,
                            onClick = {}
                        )
                    }
                }
                SampleRow(text = "Label") {
                    OutlineInput(
                        value = text,
                        onValueChange = { value ->
                            text = value
                        }
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
                        text = "Size",
                        style = PersianTheme.typography.titleMedium,
                        color = PersianTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = Modifier.height(PersianTheme.spacing.size4))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .selectableGroup()
                    ) {
                        RadioButton(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Large",
                            checked = sizeStates[0].value,
                            onCheckedChange = {
                                sizeStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 0
                                }
                                sizeState = large
                            }
                        )
                        RadioButton(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Medium",
                            checked = sizeStates[1].value,
                            onCheckedChange = {
                                sizeStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 1
                                }
                                sizeState = medium
                            }
                        )
                        RadioButton(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Small",
                            checked = sizeStates[2].value,
                            onCheckedChange = {
                                sizeStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 2
                                }
                                sizeState = small
                            }
                        )
                    }
                }
                Column(
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
                            checked = showAdditionInfoLabel,
                            onCheckedChange = { isChecked ->
                                showAdditionInfoLabel = isChecked
                            }
                        )
                        if (showAdditionInfoLabel) {
                            OutlineInput(
                                value = additionInfoLabelText,
                                onValueChange = { label ->
                                    additionInfoLabelText = label
                                }
                            )
                        }
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
                }
            }
        }
    }
}