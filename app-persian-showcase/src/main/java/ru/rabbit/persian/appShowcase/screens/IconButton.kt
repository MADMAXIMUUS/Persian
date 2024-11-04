package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
import io.github.madmaximuus.persian.checkboxes.Checkbox
import io.github.madmaximuus.persian.forms.Checkboxes
import io.github.madmaximuus.persian.forms.Form
import io.github.madmaximuus.persian.forms.RadioButton
import io.github.madmaximuus.persian.forms.RadioButtons
import io.github.madmaximuus.persian.forms.Subhead
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.iconButton.IconButtonDefaults
import io.github.madmaximuus.persian.iconButton.OutlinedIconButton
import io.github.madmaximuus.persian.iconButton.OutlinedToggleIconButton
import io.github.madmaximuus.persian.iconButton.PrimaryIconButton
import io.github.madmaximuus.persian.iconButton.PrimaryToggleIconButton
import io.github.madmaximuus.persian.iconButton.SecondaryIconButton
import io.github.madmaximuus.persian.iconButton.SecondaryToggleIconButton
import io.github.madmaximuus.persian.iconButton.TertiaryIconButton
import io.github.madmaximuus.persian.iconButton.TertiaryToggleIconButton
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.user.base.User
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object IconButton : Screen {

    override val name: String = "Icon button"

    override val navigation: String = "iconButton"

    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() },
            topAppBarScrollBehavior = topAppBarScrollBehavior,
        ) {
            val size = IconButtonDefaults.largeSizes()
            var sizeState by remember { mutableStateOf(size) }
            val (enabled, onEnabledChange) = remember { mutableStateOf(true) }
            val (checked, onCheckedChange) = remember { mutableStateOf(false) }

            val typeStates = remember {
                listOf(
                    mutableStateOf(true),
                    mutableStateOf(false)
                )
            }

            val styleStates = remember {
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
            val large = IconButtonDefaults.largeSizes()
            val medium = IconButtonDefaults.mediumSizes()
            val small = IconButtonDefaults.smallSizes()

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
                        typeStates[0].value -> {
                            when {
                                styleStates[0].value -> {
                                    PrimaryIconButton(
                                        sizes = sizeState,
                                        enabled = enabled,
                                        icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                        onClick = {}
                                    )
                                }

                                styleStates[1].value -> {
                                    SecondaryIconButton(
                                        sizes = sizeState,
                                        enabled = enabled,
                                        icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                        onClick = {}
                                    )
                                }

                                styleStates[2].value -> {
                                    TertiaryIconButton(
                                        sizes = sizeState,
                                        enabled = enabled,
                                        icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                        onClick = {}
                                    )
                                }

                                styleStates[3].value -> {
                                    OutlinedIconButton(
                                        sizes = sizeState,
                                        enabled = enabled,
                                        icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                        onClick = {}
                                    )
                                }
                            }
                        }

                        typeStates[1].value -> {
                            when {
                                styleStates[0].value -> {
                                    PrimaryToggleIconButton(
                                        icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                        checkedIcon = rememberVectorPainter(image = PersianSymbols.Filled.User),
                                        checked = checked,
                                        sizes = sizeState,
                                        enabled = enabled,
                                        onCheckedChange = onCheckedChange
                                    )
                                }

                                styleStates[1].value -> {
                                    SecondaryToggleIconButton(
                                        icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                        checkedIcon = rememberVectorPainter(image = PersianSymbols.Filled.User),
                                        checked = checked,
                                        sizes = sizeState,
                                        enabled = enabled,
                                        onCheckedChange = onCheckedChange
                                    )
                                }

                                styleStates[2].value -> {
                                    TertiaryToggleIconButton(
                                        icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                        checkedIcon = rememberVectorPainter(image = PersianSymbols.Filled.User),
                                        checked = checked,
                                        sizes = sizeState,
                                        enabled = enabled,
                                        onCheckedChange = onCheckedChange
                                    )
                                }

                                styleStates[3].value -> {
                                    OutlinedToggleIconButton(
                                        icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                        checkedIcon = rememberVectorPainter(image = PersianSymbols.Filled.User),
                                        checked = checked,
                                        sizes = sizeState,
                                        enabled = enabled,
                                        onCheckedChange = onCheckedChange
                                    )
                                }
                            }
                        }
                    }
                }
                Form(
                    modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                    subhead = {
                        Subhead(
                            text = "Type"
                        )
                    },
                    content = {
                        RadioButtons {
                            RadioButton(
                                text = "Default",
                                selected = typeStates[0].value,
                                onSelectedChange = {
                                    typeStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                }
                            )
                            RadioButton(
                                text = "Toggle",
                                selected = typeStates[1].value,
                                onSelectedChange = {
                                    typeStates.forEachIndexed { index, mutableState ->
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
                            text = "Style"
                        )
                    },
                    content = {
                        RadioButtons {
                            RadioButton(
                                text = "Primary",
                                selected = styleStates[0].value,
                                onSelectedChange = {
                                    styleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                }
                            )
                            RadioButton(
                                text = "Secondary",
                                selected = styleStates[1].value,
                                onSelectedChange = {
                                    styleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                    }
                                }
                            )
                            RadioButton(
                                text = "Tertiary",
                                selected = styleStates[2].value,
                                onSelectedChange = {
                                    styleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 2
                                    }
                                }
                            )
                            RadioButton(
                                text = "Outlined",
                                selected = styleStates[3].value,
                                onSelectedChange = {
                                    styleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 3
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
                    modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                    subhead = {
                        Subhead(
                            text = "Settings"
                        )
                    },
                    content = {
                        Checkboxes {
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