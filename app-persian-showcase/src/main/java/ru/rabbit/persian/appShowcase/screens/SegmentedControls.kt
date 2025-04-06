package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.NavController
import io.github.madmaximuus.persian.formItem.Checkbox
import io.github.madmaximuus.persian.formItem.Checkboxes
import io.github.madmaximuus.persian.formItem.FormItem
import io.github.madmaximuus.persian.formItem.RadioButton
import io.github.madmaximuus.persian.formItem.RadioButtons
import io.github.madmaximuus.persian.formItem.Subhead
import io.github.madmaximuus.persian.segmentedControls.button.MultiChoiceSegmentedButtonRow
import io.github.madmaximuus.persian.segmentedControls.button.Segment
import io.github.madmaximuus.persian.segmentedControls.button.SegmentedButtonDefaults
import io.github.madmaximuus.persian.segmentedControls.button.SingleChoiceSegmentedButtonRow
import io.github.madmaximuus.persian.segmentedControls.tabs.Segment
import io.github.madmaximuus.persian.segmentedControls.tabs.SegmentedTabsDefaults
import io.github.madmaximuus.persian.segmentedControls.tabs.SegmentedTabsRow
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import io.github.madmaximuus.persianSymbols.device.laptop.macbook.DeviceLaptopMacbook
import io.github.madmaximuus.persianSymbols.device.mobile.iPhone.one.DeviceMobileIPhone1
import io.github.madmaximuus.persianSymbols.device.tablet.iPad.DeviceTabletIPad
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import ru.rabbit.persian.appShowcase.R
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object SegmentedControls : Screen {
    override val name: String = "Segmented controls"
    override val image: Int = R.drawable.segmented_button

    override val navigation: String = "segmented_controls"

    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() },
            topAppBarScrollBehavior = topAppBarScrollBehavior,
        ) {
            var state by remember { mutableIntStateOf(0) }
            val sizeButton = SegmentedButtonDefaults.largeSizes()
            val sizeTabs = SegmentedTabsDefaults.largeSizes()
            var sizeButtonState by remember { mutableStateOf(sizeButton) }
            var sizeTabsState by remember { mutableStateOf(sizeTabs) }
            val (enabled, onEnabledChecked) = remember { mutableStateOf(true) }
            var label by remember { mutableStateOf(true) }
            var icon by remember { mutableStateOf(true) }
            val styleStates = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(false)
                )
            }
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
            val largeButton = SegmentedButtonDefaults.largeSizes()
            val mediumButton = SegmentedButtonDefaults.mediumSizes()
            val smallButton = SegmentedButtonDefaults.smallSizes()

            val largeTabs = SegmentedTabsDefaults.largeSizes()
            val mediumTabs = SegmentedTabsDefaults.mediumSizes()
            val smallTabs = SegmentedTabsDefaults.smallSizes()

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
                        styleStates[0].value -> {
                            SegmentedTabsRow(
                                selectedIndex = state,
                                sizes = sizeTabsState,
                                enabled = enabled
                            ) {
                                Segment(
                                    selected = singleChoiceSelectedState[0].value,
                                    label = if (label) "Label 1" else null,
                                    icon = if (icon) rememberVectorPainter(image = PersianSymbols.Filled.DeviceMobileIPhone1) else null,
                                    onClick = {
                                        singleChoiceSelectedState.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 0
                                        }
                                        state = 0
                                    }
                                )
                                Segment(
                                    selected = singleChoiceSelectedState[1].value,
                                    label = if (label) "Label 2" else null,
                                    icon = if (icon) rememberVectorPainter(image = PersianSymbols.Filled.DeviceTabletIPad) else null,
                                    onClick = {
                                        singleChoiceSelectedState.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 1
                                        }
                                        state = 1
                                    }
                                )
                                Segment(
                                    selected = singleChoiceSelectedState[2].value,
                                    label = if (label) "Label 3" else null,
                                    icon = if (icon) rememberVectorPainter(image = PersianSymbols.Filled.DeviceLaptopMacbook) else null,
                                    onClick = {
                                        singleChoiceSelectedState.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 2
                                        }
                                        state = 2
                                    }
                                )
                            }
                        }

                        styleStates[1].value -> {
                            when {
                                modeStates[0].value -> {
                                    SingleChoiceSegmentedButtonRow(
                                        modifier = Modifier.fillMaxWidth(),
                                        sizes = sizeButtonState,
                                        enabled = enabled
                                    ) {
                                        Segment(
                                            selected = singleChoiceSelectedState[0].value,
                                            label = if (label) "Label 1" else null,
                                            icon = if (icon) rememberVectorPainter(image = PersianSymbols.Filled.DeviceMobileIPhone1) else null,
                                            onClick = {
                                                singleChoiceSelectedState.forEachIndexed { index, mutableState ->
                                                    mutableState.value = index == 0
                                                }
                                            }
                                        )
                                        Segment(
                                            selected = singleChoiceSelectedState[1].value,
                                            label = if (label) "Label 2" else null,
                                            icon = if (icon) rememberVectorPainter(image = PersianSymbols.Filled.DeviceTabletIPad) else null,
                                            onClick = {
                                                singleChoiceSelectedState.forEachIndexed { index, mutableState ->
                                                    mutableState.value = index == 1
                                                }
                                            }
                                        )
                                        Segment(
                                            selected = singleChoiceSelectedState[2].value,
                                            label = if (label) "Label 3" else null,
                                            icon = if (icon) rememberVectorPainter(image = PersianSymbols.Filled.DeviceLaptopMacbook) else null,
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
                                        sizes = sizeButtonState,
                                        enabled = enabled
                                    ) {
                                        Segment(
                                            checked = multipleChoiceSelectedState[0].value,
                                            label = if (label) "Label 1" else null,
                                            icon = if (icon) rememberVectorPainter(image = PersianSymbols.Filled.DeviceMobileIPhone1) else null,
                                            onCheckedChange = { isChecked ->
                                                multipleChoiceSelectedState[0].value = isChecked
                                            }
                                        )
                                        Segment(
                                            checked = multipleChoiceSelectedState[1].value,
                                            label = if (label) "Label 2" else null,
                                            icon = if (icon) rememberVectorPainter(image = PersianSymbols.Filled.DeviceTabletIPad) else null,
                                            onCheckedChange = { isChecked ->
                                                multipleChoiceSelectedState[1].value = isChecked
                                            }
                                        )
                                        Segment(
                                            checked = multipleChoiceSelectedState[2].value,
                                            label = if (label) "Label 3" else null,
                                            icon = if (icon) rememberVectorPainter(image = PersianSymbols.Filled.DeviceLaptopMacbook) else null,
                                            onCheckedChange = { isChecked ->
                                                multipleChoiceSelectedState[2].value = isChecked
                                            }
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
                FormItem(
                    subhead = { Subhead(text = "Style") },
                    content = {
                        RadioButtons {
                            RadioButton(
                                text = "Tabs",
                                selected = styleStates[0].value,
                                onSelectedChange = {
                                    styleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                }
                            )
                            RadioButton(
                                text = "Button",
                                selected = styleStates[1].value,
                                onSelectedChange = {
                                    styleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                    }
                                }
                            )
                        }
                    }
                )
                if (!styleStates[0].value) {
                    FormItem(
                        subhead = { Subhead(text = "Mode") },
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
                }
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
                                    sizeButtonState = largeButton
                                    sizeTabsState = largeTabs
                                }
                            )
                            RadioButton(
                                text = "Medium",
                                selected = sizeStates[1].value,
                                onSelectedChange = {
                                    sizeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                    }
                                    sizeButtonState = mediumButton
                                    sizeTabsState = mediumTabs
                                }
                            )
                            RadioButton(
                                text = "Small",
                                selected = sizeStates[2].value,
                                onSelectedChange = {
                                    sizeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 2
                                    }
                                    sizeButtonState = smallButton
                                    sizeTabsState = smallTabs
                                }
                            )
                        }
                    }
                )
                FormItem(
                    subhead = { Subhead(text = "Settings") },
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
                                text = "Text",
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