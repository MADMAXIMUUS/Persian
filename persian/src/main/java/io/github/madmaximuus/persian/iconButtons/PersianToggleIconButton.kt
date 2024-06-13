package io.github.madmaximuus.persian.iconButtons

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
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
import io.github.madmaximuus.persian.iconBox.PersianIconBox
import io.github.madmaximuus.persian.surface.Surface

@Composable
fun PersianPrimaryToggleIconButton(
    modifier: Modifier = Modifier,
    icon: Painter,
    checkedIcon: Painter,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    enabled: Boolean = true,
    sizes: IconButtonSizes = PersianIconButtonDefaults.mediumSizes(),
    colors: ToggleIconButtonColors = PersianIconButtonDefaults.primaryToggleIconButtonColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) = Surface(
    checked = checked,
    onCheckedChange = onCheckedChange,
    modifier = modifier.semantics { role = Role.Checkbox },
    enabled = enabled,
    shape = sizes.shape,
    color = colors.containerColor(enabled, checked).value,
    contentColor = colors.contentColor(enabled, checked).value,
    interactionSource = interactionSource
) {
    Box(
        modifier = Modifier.size(sizes.size),
        contentAlignment = Alignment.Center
    ) {
        if (checked) {
            PersianIconBox(
                icon = checkedIcon,
                size = sizes.iconSize
            )
        } else {
            PersianIconBox(
                icon = icon,
                size = sizes.iconSize
            )
        }
    }
}

@Composable
fun PersianSecondaryToggleIconButton(
    modifier: Modifier = Modifier,
    icon: Painter,
    checkedIcon: Painter,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    enabled: Boolean = true,
    sizes: IconButtonSizes = PersianIconButtonDefaults.mediumSizes(),
    colors: ToggleIconButtonColors = PersianIconButtonDefaults.secondaryToggleIconButtonColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) = Surface(
    checked = checked,
    onCheckedChange = onCheckedChange,
    modifier = modifier.semantics { role = Role.Checkbox },
    enabled = enabled,
    shape = sizes.shape,
    color = colors.containerColor(enabled, checked).value,
    contentColor = colors.contentColor(enabled, checked).value,
    interactionSource = interactionSource
) {
    Box(
        modifier = Modifier.size(sizes.size),
        contentAlignment = Alignment.Center
    ) {
        if (checked) {
            PersianIconBox(
                icon = checkedIcon,
                size = sizes.iconSize
            )
        } else {
            PersianIconBox(
                icon = icon,
                size = sizes.iconSize
            )
        }
    }
}

@Composable
fun PersianTertiaryToggleIconButton(
    modifier: Modifier = Modifier,
    icon: Painter,
    checkedIcon: Painter,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    enabled: Boolean = true,
    sizes: IconButtonSizes = PersianIconButtonDefaults.mediumSizes(),
    colors: ToggleIconButtonColors = PersianIconButtonDefaults.tertiaryToggleIconButtonColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) = Surface(
    checked = checked,
    onCheckedChange = onCheckedChange,
    modifier = modifier.semantics { role = Role.Checkbox },
    enabled = enabled,
    shape = sizes.shape,
    color = colors.containerColor(enabled, checked).value,
    contentColor = colors.contentColor(enabled, checked).value,
    interactionSource = interactionSource
) {
    Box(
        modifier = Modifier.size(sizes.size),
        contentAlignment = Alignment.Center
    ) {
        if (checked) {
            PersianIconBox(
                icon = checkedIcon,
                size = sizes.iconSize
            )
        } else {
            PersianIconBox(
                icon = icon,
                size = sizes.iconSize
            )
        }
    }
}

@Composable
fun PersianOutlinedToggleIconButton(
    modifier: Modifier = Modifier,
    icon: Painter,
    checkedIcon: Painter,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    enabled: Boolean = true,
    sizes: IconButtonSizes = PersianIconButtonDefaults.mediumSizes(),
    colors: ToggleIconButtonColors = PersianIconButtonDefaults.outlinedToggleIconButtonColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) = Surface(
    checked = checked,
    onCheckedChange = onCheckedChange,
    modifier = modifier.semantics { role = Role.Checkbox },
    enabled = enabled,
    shape = sizes.shape,
    color = colors.containerColor(enabled, checked).value,
    contentColor = colors.contentColor(enabled, checked).value,
    border = if (checked) null else BorderStroke(
        1.dp,
        colors.contentColor(enabled, checked).value
    ),
    interactionSource = interactionSource
) {
    Box(
        modifier = Modifier.size(sizes.size),
        contentAlignment = Alignment.Center
    ) {
        if (checked) {
            PersianIconBox(
                icon = checkedIcon,
                size = sizes.iconSize
            )
        } else {
            PersianIconBox(
                icon = icon,
                size = sizes.iconSize
            )
        }
    }
}