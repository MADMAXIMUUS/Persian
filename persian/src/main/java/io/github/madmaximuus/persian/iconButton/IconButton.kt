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
 * A composable function that creates a primary icon button.
 *
 * This button is designed to be used as a primary action button with an icon. It supports customization
 * through various parameters such as size, colors, and interaction source.
 *
 * @param onClick The callback to be invoked when the button is clicked.
 * @param icon The [Painter] that represents the icon to be displayed in the button.
 * @param modifier The [Modifier] to be applied to the button.
 * @param enabled Whether the button is enabled or disabled.
 * @param sizes The [IconButtonSizes] that define the size and shape of the button.
 * @param colors The [IconButtonColors] that define the colors of the button.
 * @param interactionSource The [MutableInteractionSource] that handles the interaction state of the button.
 */
@Composable
fun PrimaryIconButton(
    onClick: () -> Unit,
    icon: Painter,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    sizes: IconButtonSizes = IconButtonDefaults.mediumSizes(),
    colors: IconButtonColors = IconButtonDefaults.primaryIconButtonColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) = Surface(
    onClick = onClick,
    modifier = modifier
        .semantics { role = Role.Button }
        .size(sizes.size),
    enabled = enabled,
    shape = sizes.shape,
    color = colors.containerColor(enabled),
    contentColor = colors.contentColor(enabled),
    interactionSource = interactionSource
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = icon,
            sizes = sizes.iconSizes,
            tint = colors.contentColor(enabled = enabled)
        )
    }
}

/**
 * A composable function that creates a secondary icon button.
 *
 * This button is designed to be used as a secondary action button with an icon. It supports customization
 * through various parameters such as size, colors, and interaction source.
 *
 * @param onClick The callback to be invoked when the button is clicked.
 * @param icon The [Painter] that represents the icon to be displayed in the button.
 * @param modifier The [Modifier] to be applied to the button.
 * @param enabled Whether the button is enabled or disabled.
 * @param sizes The [IconButtonSizes] that define the size and shape of the button.
 * @param colors The [IconButtonColors] that define the colors of the button.
 * @param interactionSource The [MutableInteractionSource] that handles the interaction state of the button.
 */
@Composable
fun SecondaryIconButton(
    onClick: () -> Unit,
    icon: Painter,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    sizes: IconButtonSizes = IconButtonDefaults.mediumSizes(),
    colors: IconButtonColors = IconButtonDefaults.secondaryIconButtonColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) = Surface(
    onClick = onClick,
    modifier = modifier
        .semantics { role = Role.Button }
        .size(sizes.size),
    enabled = enabled,
    shape = sizes.shape,
    color = colors.containerColor(enabled),
    contentColor = colors.contentColor(enabled),
    interactionSource = interactionSource
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = icon,
            sizes = sizes.iconSizes
        )
    }
}

/**
 * A composable function that creates a tertiary icon button.
 *
 * This button is designed to be used as a tertiary action button with an icon. It supports customization
 * through various parameters such as size, colors, and interaction source.
 *
 * @param onClick The callback to be invoked when the button is clicked.
 * @param icon The [Painter] that represents the icon to be displayed in the button.
 * @param modifier The [Modifier] to be applied to the button.
 * @param enabled Whether the button is enabled or disabled.
 * @param sizes The [IconButtonSizes] that define the size and shape of the button.
 * @param colors The [IconButtonColors] that define the colors of the button.
 * @param interactionSource The [MutableInteractionSource] that handles the interaction state of the button.
 */
@Composable
fun TertiaryIconButton(
    onClick: () -> Unit,
    icon: Painter,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    sizes: IconButtonSizes = IconButtonDefaults.mediumSizes(),
    colors: IconButtonColors = IconButtonDefaults.tertiaryIconButtonColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) = Surface(
    onClick = onClick,
    modifier = modifier
        .semantics { role = Role.Button }
        .size(sizes.size),
    enabled = enabled,
    shape = sizes.shape,
    color = colors.containerColor(enabled),
    contentColor = colors.contentColor(enabled),
    interactionSource = interactionSource
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = icon,
            sizes = sizes.iconSizes
        )
    }
}

/**
 * A composable function that creates an outlined icon button.
 *
 * This button is designed to be used as an outlined action button with an icon. It supports customization
 * through various parameters such as size, colors, and interaction source. The button has an outlined border.
 *
 * @param onClick The callback to be invoked when the button is clicked.
 * @param icon The [Painter] that represents the icon to be displayed in the button.
 * @param modifier The [Modifier] to be applied to the button.
 * @param enabled Whether the button is enabled or disabled.
 * @param sizes The [IconButtonSizes] that define the size and shape of the button.
 * @param colors The [IconButtonColors] that define the colors of the button.
 * @param interactionSource The [MutableInteractionSource] that handles the interaction state of the button.
 */
@Composable
fun OutlinedIconButton(
    onClick: () -> Unit,
    icon: Painter,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    sizes: IconButtonSizes = IconButtonDefaults.mediumSizes(),
    colors: IconButtonColors = IconButtonDefaults.outlinedIconButtonColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) = Surface(
    onClick = onClick,
    modifier = modifier
        .semantics { role = Role.Button }
        .size(sizes.size),
    enabled = enabled,
    shape = sizes.shape,
    color = colors.containerColor(enabled),
    contentColor = colors.contentColor(enabled),
    border = BorderStroke(
        1.dp,
        colors.contentColor(enabled)
    ),
    interactionSource = interactionSource
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = icon,
            sizes = sizes.iconSizes
        )
    }
}