package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
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
import io.github.madmaximuus.persian.buttons.PersianButtonDefaults
import io.github.madmaximuus.persian.buttons.PersianOutlinedButton
import io.github.madmaximuus.persian.buttons.PersianPrimaryButton
import io.github.madmaximuus.persian.buttons.PersianSecondaryButton
import io.github.madmaximuus.persian.buttons.PersianTertiaryButton
import io.github.madmaximuus.persian.checkboxes.PersianCheckbox
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.inputs.PersianOutlineInput
import io.github.madmaximuus.persian.radioButtons.PersianRadioButton
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persianSymbols.chevronRight.base.ChevronRight
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.plus.base.Plus
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Button : Screen {
    override val name: String = "Buttons"

    override val navigation: String = "button"

    @OptIn(ExperimentalMaterial3Api::class)
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
            val size = PersianButtonDefaults.largeSizes()
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
                    text = "Sample Button",
                    firstItem = true
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        PersianPrimaryButton(
                            text = text,
                            sizes = sizeState,
                            enabled = enabled,
                            loading = loading,
                            additionInfoText = if (showAdditionInfoLabel) additionInfoLabelText else null,
                            leadingIcon = if (showLeadingIcon) rememberVectorPainter(image = PersianSymbols.Default.Plus) else null,
                            trailingIcon = if (showTrailingIcon) rememberVectorPainter(image = PersianSymbols.Default.ChevronRight) else null,
                            onClick = {}
                        )
                        Spacer(modifier = Modifier.height(PersianTheme.spacing.size16))
                        PersianSecondaryButton(
                            text = text,
                            sizes = sizeState,
                            enabled = enabled,
                            loading = loading,
                            additionInfoText = if (showAdditionInfoLabel) additionInfoLabelText else null,
                            leadingIcon = if (showLeadingIcon) rememberVectorPainter(image = PersianSymbols.Default.Plus) else null,
                            trailingIcon = if (showTrailingIcon) rememberVectorPainter(image = PersianSymbols.Default.ChevronRight) else null,
                            onClick = {}
                        )
                        Spacer(modifier = Modifier.height(PersianTheme.spacing.size16))
                        PersianTertiaryButton(
                            text = text,
                            sizes = sizeState,
                            enabled = enabled,
                            loading = loading,
                            additionInfoText = if (showAdditionInfoLabel) additionInfoLabelText else null,
                            leadingIcon = if (showLeadingIcon) rememberVectorPainter(image = PersianSymbols.Default.Plus) else null,
                            trailingIcon = if (showTrailingIcon) rememberVectorPainter(image = PersianSymbols.Default.ChevronRight) else null,
                            onClick = {}
                        )
                        Spacer(modifier = Modifier.height(PersianTheme.spacing.size16))
                        PersianOutlinedButton(
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
                    PersianOutlineInput(
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
                val large = PersianButtonDefaults.largeSizes()
                val medium = PersianButtonDefaults.mediumSizes()
                val small = PersianButtonDefaults.smallSizes()
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
                        PersianRadioButton(
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
                        PersianRadioButton(
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
                        PersianRadioButton(
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
                        PersianCheckbox(
                            text = "Addition info",
                            checked = showAdditionInfoLabel,
                            onCheckedChange = { isChecked ->
                                showAdditionInfoLabel = isChecked
                            }
                        )
                        if (showAdditionInfoLabel) {
                            PersianOutlineInput(
                                value = additionInfoLabelText,
                                onValueChange = { label ->
                                    additionInfoLabelText = label
                                }
                            )
                        }
                        PersianCheckbox(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Show Leading icon",
                            checked = showLeadingIcon,
                            onCheckedChange = {
                                showLeadingIcon = !showLeadingIcon
                            }
                        )
                        PersianCheckbox(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Show Trailing icon",
                            checked = showTrailingIcon,
                            onCheckedChange = {
                                showTrailingIcon = !showTrailingIcon
                            }
                        )
                        PersianCheckbox(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Enabled",
                            checked = enabled,
                            onCheckedChange = {
                                enabled = !enabled
                            }
                        )
                        PersianCheckbox(
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