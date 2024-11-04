package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import io.github.madmaximuus.persian.forms.Checkbox
import io.github.madmaximuus.persian.forms.Checkboxes
import io.github.madmaximuus.persian.forms.Form
import io.github.madmaximuus.persian.forms.RadioButton
import io.github.madmaximuus.persian.forms.RadioButtons
import io.github.madmaximuus.persian.forms.Subhead
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.segmentedButton.EndSegment
import io.github.madmaximuus.persian.segmentedButton.MiddleSegment
import io.github.madmaximuus.persian.segmentedButton.MultiChoiceSegmentedButtonRow
import io.github.madmaximuus.persian.segmentedButton.SegmentedButtonDefaults
import io.github.madmaximuus.persian.segmentedButton.SingleChoiceSegmentedButtonRow
import io.github.madmaximuus.persian.segmentedButton.StartSegment
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import io.github.madmaximuus.persianSymbols.device.laptop.macbook.DeviceLaptopMacbook
import io.github.madmaximuus.persianSymbols.device.mobile.iPhone.one.DeviceMobileIPhone1
import io.github.madmaximuus.persianSymbols.device.tablet.iPad.DeviceTabletIPad
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object SegmentedButton : Screen {
    override val name: String = "Segmented button"

    override val navigation: String = "segmented_button"

    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() },
            topAppBarScrollBehavior = topAppBarScrollBehavior,
        ) {
            val size = SegmentedButtonDefaults.largeSizes()
            var sizeState by remember { mutableStateOf(size) }
            val (enabled, onEnabledChecked) = remember { mutableStateOf(true) }
            var label by remember { mutableStateOf(true) }
            var icon by remember { mutableStateOf(true) }
            val modeStates = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(false)
                )
            }

            val singleChoiceSelectedState = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(false),
                    mutableStateOf(false)
                )
            }
            val multipleChoiceSelectedState = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(true),
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
            val large = SegmentedButtonDefaults.largeSizes()
            val medium = SegmentedButtonDefaults.mediumSizes()
            val small = SegmentedButtonDefaults.smallSizes()

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
                    when {
                        modeStates[0].value -> {
                            SingleChoiceSegmentedButtonRow(
                                modifier = Modifier.fillMaxWidth(),
                                sizes = sizeState,
                                enabled = enabled
                            ) {
                                StartSegment(
                                    selected = singleChoiceSelectedState[0].value,
                                    label = if (label) "Label 1" else null,
                                    icon = if (icon) rememberVectorPainter(image = PersianSymbols.Default.DeviceMobileIPhone1) else null,
                                    onClick = {
                                        singleChoiceSelectedState.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 0
                                        }
                                    }
                                )
                                MiddleSegment(
                                    selected = singleChoiceSelectedState[1].value,
                                    label = if (label) "Label 2" else null,
                                    icon = if (icon) rememberVectorPainter(image = PersianSymbols.Default.DeviceTabletIPad) else null,
                                    onClick = {
                                        singleChoiceSelectedState.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 1
                                        }
                                    }
                                )
                                EndSegment(
                                    selected = singleChoiceSelectedState[2].value,
                                    label = if (label) "Label 3" else null,
                                    icon = if (icon) rememberVectorPainter(image = PersianSymbols.Default.DeviceLaptopMacbook) else null,
                                    onClick = {
                                        singleChoiceSelectedState.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 2
                                        }
                                    }
                                )
                            }
                        }

                        modeStates[1].value -> {
                            MultiChoiceSegmentedButtonRow(
                                modifier = Modifier.fillMaxWidth(),
                                sizes = sizeState,
                                enabled = enabled
                            ) {
                                StartSegment(
                                    checked = multipleChoiceSelectedState[0].value,
                                    label = if (label) "Label 1" else null,
                                    icon = if (icon) rememberVectorPainter(image = PersianSymbols.Default.DeviceMobileIPhone1) else null,
                                    onCheckedChange = { isChecked ->
                                        multipleChoiceSelectedState[0].value = isChecked
                                    }
                                )
                                MiddleSegment(
                                    checked = multipleChoiceSelectedState[1].value,
                                    label = if (label) "Label 2" else null,
                                    icon = if (icon) rememberVectorPainter(image = PersianSymbols.Default.DeviceTabletIPad) else null,
                                    onCheckedChange = { isChecked ->
                                        multipleChoiceSelectedState[1].value = isChecked
                                    }
                                )
                                EndSegment(
                                    checked = multipleChoiceSelectedState[2].value,
                                    label = if (label) "Label 3" else null,
                                    icon = if (icon) rememberVectorPainter(image = PersianSymbols.Default.DeviceLaptopMacbook) else null,
                                    onCheckedChange = { isChecked ->
                                        multipleChoiceSelectedState[2].value = isChecked
                                    }
                                )
                            }
                        }
                    }
                }
                Form(
                    modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                    subhead = {
                        Subhead(
                            text = "Mode"
                        )
                    },
                    content = {
                        RadioButtons {
                            RadioButton(
                                text = "Single choice",
                                selected = modeStates[0].value,
                                onSelectedChange = {
                                    modeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                }
                            )
                            RadioButton(
                                text = "Multiple choice",
                                selected = modeStates[1].value,
                                onSelectedChange = {
                                    modeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                    }
                                }
                            )
                        }
                    }
                )
                Form(
                    modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                    subhead = {
                        Subhead(
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
                                text = "Multiple",
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
                    modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                    subhead = {
                        Subhead(
                            text = "Settings"
                        )
                    },
                    content = {
                        Checkboxes {
                            Checkbox(
                                text = "Leading",
                                checked = icon,
                                onCheckedChange = { isChecked ->
                                    icon = isChecked
                                    if (!label && !isChecked) label = true
                                }
                            )
                            Checkbox(
                                text = "Trailing",
                                checked = label,
                                onCheckedChange = { isChecked ->
                                    label = isChecked
                                    if (!icon && !isChecked) icon = true
                                }
                            )
                            Checkbox(
                                text = "Enabled",
                                checked = enabled,
                                onCheckedChange = onEnabledChecked
                            )
                        }
                    }
                )
            }
        }
    }
}