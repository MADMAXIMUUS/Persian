package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.core.net.toUri
import androidx.navigation.NavController
import io.github.madmaximuus.persian.chip.Chip
import io.github.madmaximuus.persian.chip.ChipDefaults
import io.github.madmaximuus.persian.chip.Icon
import io.github.madmaximuus.persian.chip.Image
import io.github.madmaximuus.persian.chip.toggleable.Avatar
import io.github.madmaximuus.persian.chip.toggleable.Icon
import io.github.madmaximuus.persian.chip.toggleable.Image
import io.github.madmaximuus.persian.chip.toggleable.ToggleableChip
import io.github.madmaximuus.persian.chip.toggleable.ToggleableChipDefaults
import io.github.madmaximuus.persian.formItem.Checkbox
import io.github.madmaximuus.persian.formItem.Checkboxes
import io.github.madmaximuus.persian.formItem.FormItem
import io.github.madmaximuus.persian.formItem.Input
import io.github.madmaximuus.persian.formItem.RadioButton
import io.github.madmaximuus.persian.formItem.RadioButtons
import io.github.madmaximuus.persian.formItem.Subhead
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.globe.Globe
import io.github.madmaximuus.persianSymbols.xmark.XMark
import ru.rabbit.persian.appShowcase.R
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Chips : Screen {
    override val name: String = "Chips"

    override val image: Int = R.drawable.chips

    override val navigation: String = "chips"

    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() }
        ) {
            var selected by remember { mutableStateOf(false) }
            val labelState = rememberTextFieldState("Chip")
            val (leading, onLeadingChange) = remember { mutableStateOf(true) }
            val (trailing, onTrailingChange) = remember { mutableStateOf(true) }
            val (enabled, onEnabledChane) = remember { mutableStateOf(true) }

            val chipSize = ChipDefaults.mediumSizes()
            var chipSizeState by remember { mutableStateOf(chipSize) }

            val toggleableChipSize = ToggleableChipDefaults.mediumSizes()
            var toggleableChipSizeState by remember { mutableStateOf(toggleableChipSize) }

            val sizeStates = remember {
                listOf(
                    mutableStateOf(false),
                    mutableStateOf(true),
                    mutableStateOf(false),
                )
            }

            val styleStates = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(false),
                )
            }

            val leadingStates = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(false),
                    mutableStateOf(false),
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection)
                    .verticalScroll(rememberScrollState())
                    .padding(it)
                    .navigationBarsPadding(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size2)
            ) {
                SampleRow(
                    text = "Sample",
                    firstItem = true
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
                    ) {
                        when {
                            styleStates[0].value -> {
                                Chip(
                                    label = labelState.text.toString(),
                                    enabled = enabled,
                                    sizes = chipSizeState,
                                    leading = if (leading) {
                                        {
                                            when {
                                                leadingStates[0].value -> {
                                                    Icon(
                                                        painter = rememberVectorPainter(
                                                            PersianSymbols.Default.Globe
                                                        )
                                                    )
                                                }

                                                leadingStates[2].value -> {
                                                    Image(imageUrl = "https://loremflickr.com/320/240".toUri())
                                                }
                                            }
                                        }
                                    } else null,
                                    onClick = { }
                                )
                            }

                            styleStates[1].value -> {
                                ToggleableChip(
                                    label = labelState.text.toString(),
                                    selected = selected,
                                    enabled = enabled,
                                    sizes = toggleableChipSizeState,
                                    leading = if (leading) {
                                        {
                                            when {
                                                leadingStates[0].value -> {
                                                    Icon(icon = rememberVectorPainter(PersianSymbols.Default.Globe))
                                                }

                                                leadingStates[1].value -> {
                                                    Avatar(avatarUrl = "https://loremflickr.com/320/240".toUri())
                                                }

                                                leadingStates[2].value -> {
                                                    Image(imageUrl = "https://loremflickr.com/320/240".toUri())
                                                }
                                            }
                                        }
                                    } else null,
                                    trailing = if (trailing) {
                                        {
                                            Icon(
                                                icon = rememberVectorPainter(PersianSymbols.Default.XMark),
                                                onClick = {})
                                        }
                                    } else null,
                                    onClick = { selected = !selected }
                                )
                            }
                        }
                    }
                }
                FormItem(
                    subhead = { Subhead(text = "Label") },
                    content = { Input(state = labelState) }
                )
                val chipSmall = ChipDefaults.smallSizes()
                val chipMedium = ChipDefaults.mediumSizes()
                val chipLarge = ChipDefaults.largeSizes()

                val toggleableChipSmall = ToggleableChipDefaults.smallSizes()
                val toggleableChipMedium = ToggleableChipDefaults.mediumSizes()
                val toggleableChipLarge = ToggleableChipDefaults.largeSizes()
                FormItem(
                    subhead = { Subhead(text = "Size") },
                    content = {
                        RadioButtons {
                            RadioButton(
                                text = "Small",
                                selected = sizeStates[0].value,
                                onSelectedChange = {
                                    sizeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                    chipSizeState = chipSmall
                                    toggleableChipSizeState = toggleableChipSmall
                                }
                            )
                            RadioButton(
                                text = "Medium",
                                selected = sizeStates[1].value,
                                onSelectedChange = {
                                    sizeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                    }
                                    chipSizeState = chipMedium
                                    toggleableChipSizeState = toggleableChipMedium
                                }
                            )
                            RadioButton(
                                text = "Large",
                                selected = sizeStates[2].value,
                                onSelectedChange = {
                                    sizeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 2
                                    }
                                    chipSizeState = chipLarge
                                    toggleableChipSizeState = toggleableChipLarge
                                }
                            )
                        }
                    }
                )
                FormItem(
                    subhead = { Subhead(text = "Style") },
                    content = {
                        RadioButtons {
                            RadioButton(
                                text = "Default",
                                selected = styleStates[0].value,
                                onSelectedChange = {
                                    styleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                }
                            )
                            RadioButton(
                                text = "Toggleable",
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
                FormItem(
                    subhead = { Subhead(text = "Settings") },
                    content = {
                        Checkboxes {
                            Checkbox(
                                text = "Leading",
                                checked = leading,
                                onCheckedChange = onLeadingChange
                            )
                            if (styleStates[1].value) {
                                Checkbox(
                                    text = "Trailing",
                                    checked = trailing,
                                    onCheckedChange = onTrailingChange
                                )
                            }
                            Checkbox(
                                text = "Enabled",
                                checked = enabled,
                                onCheckedChange = onEnabledChane
                            )
                        }
                    }
                )
                if (leading) {
                    FormItem(
                        subhead = {
                            Subhead(text = "Leading")
                        },
                        content = {
                            RadioButtons {
                                RadioButton(
                                    text = "Icon",
                                    selected = leadingStates[0].value,
                                    onSelectedChange = {
                                        leadingStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 0
                                        }
                                    }
                                )
                                if (styleStates[1].value) {
                                    RadioButton(
                                        text = "Avatar",
                                        selected = leadingStates[1].value,
                                        onSelectedChange = {
                                            leadingStates.forEachIndexed { index, mutableState ->
                                                mutableState.value = index == 1
                                            }
                                        }
                                    )
                                }
                                RadioButton(
                                    text = "Image",
                                    selected = leadingStates[2].value,
                                    onSelectedChange = {
                                        leadingStates.forEachIndexed { index, mutableState ->
                                            mutableState.value = index == 2
                                        }
                                    }
                                )
                            }
                        }
                    )
                }
            }
        }
    }
}