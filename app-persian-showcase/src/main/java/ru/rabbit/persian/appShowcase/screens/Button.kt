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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.NavController
import io.github.madmaximuus.persian.buttons.IconSide
import io.github.madmaximuus.persian.buttons.PersianButton
import io.github.madmaximuus.persian.buttons.PersianButtonColors
import io.github.madmaximuus.persian.buttons.PersianButtonSizes
import io.github.madmaximuus.persian.checkboxes.PersianCheckbox
import io.github.madmaximuus.persian.foundation.PersianComponentStyle
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.inputs.PersianInputs
import io.github.madmaximuus.persian.radioButtons.PersianRadioButton
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
            var style by remember { mutableStateOf(PersianComponentStyle.FILL) }
            var text by remember { mutableStateOf("Button") }
            var iconSide by remember { mutableStateOf(IconSide.LEFT) }
            var showIcon by remember { mutableStateOf(false) }
            val size = PersianButtonSizes.large()
            var sizeState by remember { mutableStateOf(size) }
            var enabled by remember { mutableStateOf(true) }
            var loading by remember { mutableStateOf(false) }
            val colors = PersianButtonColors.primary(style = style)
            var colorState by remember { mutableStateOf(colors) }
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
                    when (colorState) {
                        PersianButtonColors.primary(style = style) -> {
                            PersianButton.Primary(
                                text = text,
                                size = sizeState,
                                style = style,
                                iconSide = iconSide,
                                colors = colorState,
                                enabled = enabled,
                                loading = loading,
                                icon = if (showIcon) MaterialTheme.icons.add else null,
                                onClick = {}
                            )
                        }

                        PersianButtonColors.secondary(style = style) -> {
                            PersianButton.Secondary(
                                text = text,
                                size = sizeState,
                                style = style,
                                iconSide = iconSide,
                                colors = colorState,
                                enabled = enabled,
                                loading = loading,
                                icon = if (showIcon) MaterialTheme.icons.add else null,
                                onClick = {}
                            )
                        }

                        PersianButtonColors.tertiary(style = style) -> {
                            PersianButton.Tertiary(
                                text = text,
                                size = sizeState,
                                style = style,
                                iconSide = iconSide,
                                enabled = enabled,
                                colors = colorState,
                                loading = loading,
                                icon = if (showIcon) MaterialTheme.icons.add else null,
                                onClick = {}
                            )
                        }

                        PersianButtonColors.negative(style = style) -> {
                            PersianButton.Negative(
                                text = text,
                                size = sizeState,
                                style = style,
                                iconSide = iconSide,
                                colors = colorState,
                                enabled = enabled,
                                loading = loading,
                                icon = if (showIcon) MaterialTheme.icons.add else null,
                                onClick = {}
                            )
                        }

                        PersianButtonColors.neutral(style = style) -> {
                            PersianButton.Neutral(
                                text = text,
                                size = sizeState,
                                style = style,
                                iconSide = iconSide,
                                colors = colorState,
                                enabled = enabled,
                                loading = loading,
                                icon = if (showIcon) MaterialTheme.icons.add else null,
                                onClick = {}
                            )
                        }
                    }
                }
                SampleRow(text = "Label") {
                    PersianInputs.Primary(
                        value = text,
                        onValueChange = { value ->
                            text = value
                        }
                    )
                }
                val styleStates = remember {
                    listOf(
                        mutableStateOf(true),
                        mutableStateOf(false),
                        mutableStateOf(false)
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
                        text = "Style",
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = Modifier.height(MaterialTheme.spacing.extraSmall))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .selectableGroup()
                    ) {
                        PersianRadioButton.Primary(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Fill",
                            checked = styleStates[0].value,
                            onCheckedChange = {
                                styleStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 0
                                }
                                style = PersianComponentStyle.FILL
                            }
                        )
                        PersianRadioButton.Primary(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Outline",
                            checked = styleStates[1].value,
                            onCheckedChange = {
                                styleStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 1
                                }
                                style = PersianComponentStyle.OUTLINED
                            }
                        )
                        PersianRadioButton.Primary(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Standard",
                            checked = styleStates[2].value,
                            onCheckedChange = {
                                styleStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 2
                                }
                                style = PersianComponentStyle.STANDARD
                            }
                        )
                    }
                }
                val sizeStates = remember {
                    listOf(
                        mutableStateOf(true),
                        mutableStateOf(false),
                        mutableStateOf(false)
                    )
                }
                val large = PersianButtonSizes.large()
                val medium = PersianButtonSizes.medium()
                val small = PersianButtonSizes.small()
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
                        text = "Size",
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = Modifier.height(MaterialTheme.spacing.extraSmall))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .selectableGroup()
                    ) {
                        PersianRadioButton.Primary(
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
                        PersianRadioButton.Primary(
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
                        PersianRadioButton.Primary(
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
                val colorStates = remember {
                    listOf(
                        mutableStateOf(true),
                        mutableStateOf(false),
                        mutableStateOf(false),
                        mutableStateOf(false),
                        mutableStateOf(false),
                    )
                }
                val primaryFill = PersianButtonColors.primary(style = PersianComponentStyle.FILL)
                val primaryOutlined =
                    PersianButtonColors.primary(style = PersianComponentStyle.OUTLINED)
                val primaryStandard =
                    PersianButtonColors.primary(style = PersianComponentStyle.STANDARD)
                val secondaryFill =
                    PersianButtonColors.secondary(style = PersianComponentStyle.FILL)
                val secondaryOutlined =
                    PersianButtonColors.secondary(style = PersianComponentStyle.OUTLINED)
                val secondaryStandard =
                    PersianButtonColors.secondary(style = PersianComponentStyle.STANDARD)
                val tertiaryFill = PersianButtonColors.tertiary(style = PersianComponentStyle.FILL)
                val tertiaryOutlined =
                    PersianButtonColors.tertiary(style = PersianComponentStyle.OUTLINED)
                val tertiaryStandard =
                    PersianButtonColors.tertiary(style = PersianComponentStyle.STANDARD)
                val negativeFill = PersianButtonColors.negative(style = PersianComponentStyle.FILL)
                val negativeOutlined =
                    PersianButtonColors.negative(style = PersianComponentStyle.OUTLINED)
                val negativeStandard =
                    PersianButtonColors.negative(style = PersianComponentStyle.STANDARD)
                val neutralFill = PersianButtonColors.neutral(style = PersianComponentStyle.FILL)
                val neutralOutlined =
                    PersianButtonColors.neutral(style = PersianComponentStyle.OUTLINED)
                val neutralStandard =
                    PersianButtonColors.neutral(style = PersianComponentStyle.STANDARD)
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
                        text = "Color",
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = Modifier.height(MaterialTheme.spacing.extraSmall))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .selectableGroup()
                    ) {
                        PersianRadioButton.Primary(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Primary",
                            checked = colorStates[0].value,
                            onCheckedChange = {
                                colorStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 0
                                }
                                colorState = when (style) {
                                    PersianComponentStyle.FILL -> primaryFill
                                    PersianComponentStyle.STANDARD -> primaryStandard
                                    PersianComponentStyle.OUTLINED -> primaryOutlined
                                    else -> primaryFill
                                }
                            }
                        )
                        PersianRadioButton.Primary(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Secondary",
                            checked = colorStates[1].value,
                            onCheckedChange = {
                                colorStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 1
                                }
                                colorState = when (style) {
                                    PersianComponentStyle.FILL -> secondaryFill
                                    PersianComponentStyle.STANDARD -> secondaryStandard
                                    PersianComponentStyle.OUTLINED -> secondaryOutlined
                                    else -> secondaryFill
                                }
                            }
                        )
                        PersianRadioButton.Primary(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Tertiary",
                            checked = colorStates[2].value,
                            onCheckedChange = {
                                colorStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 2
                                }
                                colorState = when (style) {
                                    PersianComponentStyle.FILL -> tertiaryFill
                                    PersianComponentStyle.STANDARD -> tertiaryStandard
                                    PersianComponentStyle.OUTLINED -> tertiaryOutlined
                                    else -> tertiaryFill
                                }
                            }
                        )
                        PersianRadioButton.Primary(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Negative",
                            checked = colorStates[3].value,
                            onCheckedChange = {
                                colorStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 3
                                }
                                colorState = when (style) {
                                    PersianComponentStyle.FILL -> negativeFill
                                    PersianComponentStyle.STANDARD -> negativeStandard
                                    PersianComponentStyle.OUTLINED -> negativeOutlined
                                    else -> negativeFill
                                }
                            }
                        )
                        PersianRadioButton.Primary(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Neutral",
                            checked = colorStates[4].value,
                            onCheckedChange = {
                                colorStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 4
                                }
                                colorState = when (style) {
                                    PersianComponentStyle.FILL -> neutralFill
                                    PersianComponentStyle.STANDARD -> neutralStandard
                                    PersianComponentStyle.OUTLINED -> neutralOutlined
                                    else -> neutralFill
                                }
                            }
                        )
                    }
                }
                val iconSideStates = remember {
                    listOf(
                        mutableStateOf(true),
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
                        text = "Icon side",
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = Modifier.height(MaterialTheme.spacing.extraSmall))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .selectableGroup()
                    ) {
                        PersianRadioButton.Primary(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Left",
                            checked = iconSideStates[0].value,
                            onCheckedChange = {
                                iconSideStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 0
                                }
                                iconSide = IconSide.LEFT
                            }
                        )
                        PersianRadioButton.Primary(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Right",
                            checked = iconSideStates[1].value,
                            onCheckedChange = {
                                iconSideStates.forEachIndexed { index, mutableState ->
                                    mutableState.value = index == 1
                                }
                                iconSide = IconSide.RIGHT
                            }
                        )
                    }
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
                        text = "Additional settings",
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = Modifier.height(MaterialTheme.spacing.extraSmall))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        PersianCheckbox.Primary(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Show icon",
                            checked = showIcon,
                            onCheckedChange = {
                                showIcon = !showIcon
                            }
                        )
                        PersianCheckbox.Primary(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Enabled",
                            checked = enabled,
                            onCheckedChange = {
                                enabled = !enabled
                            }
                        )
                        PersianCheckbox.Primary(
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