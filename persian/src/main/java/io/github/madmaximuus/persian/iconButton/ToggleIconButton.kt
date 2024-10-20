package io.github.madmaximuus.persian.iconButton

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.surface.Surface

/**
 * A composable function that creates a toggle icon button.
 *
 * This button is designed to be used as a toggle action button with an icon. It supports customization
 * through various parameters such as size, colors, and interaction source. The button can switch between
 * two icons based on its checked state.
 *
 * @param modifier The [Modifier] to be applied to the button.
 * @param icon The [Painter] that represents the icon to be displayed when the button is not checked.
 * @param checkedIcon The [Painter] that represents the icon to be displayed when the button is checked.
 * @param checked Whether the button is checked or not.
 * @param onCheckedChange The callback to be invoked when the checked state of the button changes.
 * @param enabled Whether the button is enabled or disabled.
 * @param sizes The [IconButtonSizes] that define the size and shape of the button.
 * @param colors The [ToggleIconButtonColors] that define the colors of the button.
 * @param interactionSource The [MutableInteractionSource] that handles the interaction state of the button.
 */
@Composable
fun PrimaryToggleIconButton(
    modifier: Modifier = Modifier,
    icon: Painter,
    checkedIcon: Painter,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    enabled: Boolean = true,
    sizes: IconButtonSizes = IconButtonDefaults.mediumSizes(),
    colors: ToggleIconButtonColors = IconButtonDefaults.primaryToggleIconButtonColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) = Surface(
    checked = checked,
    onCheckedChange = onCheckedChange,
    modifier = modifier
        .semantics { role = Role.Checkbox }
        .size(sizes.size),
    enabled = enabled,
    shape = sizes.shape,
    color = colors.containerColor(enabled, checked),
    contentColor = colors.contentColor(enabled, checked),
    interactionSource = interactionSource
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = if (checked) checkedIcon else icon,
            sizes = sizes.iconSizes
        )
    }
}

/**
 * A composable function that creates a secondary toggle icon button.
 *
 * This button is designed to be used as a secondary toggle action button with an icon. It supports customization
 * through various parameters such as size, colors, and interaction source. The button can switch between
 * two icons based on its checked state.
 *
 * @param modifier The [Modifier] to be applied to the button.
 * @param icon The [Painter] that represents the icon to be displayed when the button is not checked.
 * @param checkedIcon The [Painter] that represents the icon to be displayed when the button is checked.
 * @param checked Whether the button is checked or not.
 * @param onCheckedChange The callback to be invoked when the checked state of the button changes.
 * @param enabled Whether the button is enabled or disabled.
 * @param sizes The [IconButtonSizes] that define the size and shape of the button.
 * @param colors The [ToggleIconButtonColors] that define the colors of the button.
 * @param interactionSource The [MutableInteractionSource] that handles the interaction state of the button.
 */
@Composable
fun SecondaryToggleIconButton(
    modifier: Modifier = Modifier,
    icon: Painter,
    checkedIcon: Painter,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    enabled: Boolean = true,
    sizes: IconButtonSizes = IconButtonDefaults.mediumSizes(),
    colors: ToggleIconButtonColors = IconButtonDefaults.secondaryToggleIconButtonColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) = Surface(
    checked = checked,
    onCheckedChange = onCheckedChange,
    modifier = modifier
        .semantics { role = Role.Checkbox }
        .size(sizes.size),
    enabled = enabled,
    shape = sizes.shape,
    color = colors.containerColor(enabled, checked),
    contentColor = colors.contentColor(enabled, checked),
    interactionSource = interactionSource
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = if (checked) checkedIcon else icon,
            sizes = sizes.iconSizes
        )
    }
}

/**
 * A composable function that creates a tertiary toggle icon button.
 *
 * This button is designed to be used as a tertiary toggle action button with an icon. It supports customization
 * through various parameters such as size, colors, and interaction source. The button can switch between
 * two icons based on its checked state.
 *
 * @param modifier The [Modifier] to be applied to the button.
 * @param icon The [Painter] that represents the icon to be displayed when the button is not checked.
 * @param checkedIcon The [Painter] that represents the icon to be displayed when the button is checked.
 * @param checked Whether the button is checked or not.
 * @param onCheckedChange The callback to be invoked when the checked state of the button changes.
 * @param enabled Whether the button is enabled or disabled.
 * @param sizes The [IconButtonSizes] that define the size and shape of the button.
 * @param colors The [ToggleIconButtonColors] that define the colors of the button.
 * @param interactionSource The [MutableInteractionSource] that handles the interaction state of the button.
 */
@Composable
fun TertiaryToggleIconButton(
    modifier: Modifier = Modifier,
    icon: Painter,
    checkedIcon: Painter,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    enabled: Boolean = true,
    sizes: IconButtonSizes = IconButtonDefaults.mediumSizes(),
    colors: ToggleIconButtonColors = IconButtonDefaults.tertiaryToggleIconButtonColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) = Surface(
    checked = checked,
    onCheckedChange = onCheckedChange,
    modifier = modifier
        .semantics { role = Role.Checkbox }
        .size(sizes.size),
    enabled = enabled,
    shape = sizes.shape,
    color = colors.containerColor(enabled, checked),
    contentColor = colors.contentColor(enabled, checked),
    interactionSource = interactionSource
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = if (checked) checkedIcon else icon,
            sizes = sizes.iconSizes
        )
    }
}

/**
 * A composable function that creates an outlined toggle icon button.
 *
 * This button is designed to be used as an outlined toggle action button with an icon. It supports customization
 * through various parameters such as size, colors, and interaction source. The button can switch between
 * two icons based on its checked state and has an outlined border when not checked.
 *
 * @param modifier The [Modifier] to be applied to the button.
 * @param icon The [Painter] that represents the icon to be displayed when the button is not checked.
 * @param checkedIcon The [Painter] that represents the icon to be displayed when the button is checked.
 * @param checked Whether the button is checked or not.
 * @param onCheckedChange The callback to be invoked when the checked state of the button changes.
 * @param enabled Whether the button is enabled or disabled.
 * @param sizes The [IconButtonSizes] that define the size and shape of the button.
 * @param colors The [ToggleIconButtonColors] that define the colors of the button.
 * @param interactionSource The [MutableInteractionSource] that handles the interaction state of the button.
 */
@Composable
fun OutlinedToggleIconButton(
    modifier: Modifier = Modifier,
    icon: Painter,
    checkedIcon: Painter,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    enabled: Boolean = true,
    sizes: IconButtonSizes = IconButtonDefaults.mediumSizes(),
    colors: ToggleIconButtonColors = IconButtonDefaults.outlinedToggleIconButtonColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) = Surface(
    checked = checked,
    onCheckedChange = onCheckedChange,
    modifier = modifier
        .semantics { role = Role.Checkbox }
        .size(sizes.size),
    enabled = enabled,
    shape = sizes.shape,
    color = colors.containerColor(enabled, checked),
    contentColor = colors.contentColor(enabled, checked),
    border = if (checked) null else BorderStroke(
        1.dp,
        colors.contentColor(enabled, false)
    ),
    interactionSource = interactionSource
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = if (checked) checkedIcon else icon,
            sizes = sizes.iconSizes
        )
    }
}