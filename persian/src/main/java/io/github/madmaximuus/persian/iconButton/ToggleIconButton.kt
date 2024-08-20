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

@Composable
fun ToggleIconButton(
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