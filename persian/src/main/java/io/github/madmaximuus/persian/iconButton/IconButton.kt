package io.github.madmaximuus.persian.iconButton

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
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.surface.Surface

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
    modifier = modifier.semantics { role = Role.Button },
    enabled = enabled,
    shape = sizes.shape,
    color = colors.containerColor(enabled),
    contentColor = colors.contentColor(enabled),
    interactionSource = interactionSource
) {
    Box(
        modifier = Modifier.size(sizes.size),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = icon,
            sizes = sizes.iconSizes,
            tint = colors.contentColor(enabled = enabled)
        )
    }
}

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
    modifier = modifier.semantics { role = Role.Button },
    enabled = enabled,
    shape = sizes.shape,
    color = colors.containerColor(enabled),
    contentColor = colors.contentColor(enabled),
    interactionSource = interactionSource
) {
    Box(
        modifier = Modifier.size(sizes.size),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = icon,
            sizes = sizes.iconSizes
        )
    }
}

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
    modifier = modifier.semantics { role = Role.Button },
    enabled = enabled,
    shape = sizes.shape,
    color = colors.containerColor(enabled),
    contentColor = colors.contentColor(enabled),
    interactionSource = interactionSource
) {
    Box(
        modifier = Modifier.size(sizes.size),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = icon,
            sizes = sizes.iconSizes
        )
    }
}

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
    modifier = modifier.semantics { role = Role.Button },
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
        modifier = Modifier.size(sizes.size),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = icon,
            sizes = sizes.iconSizes
        )
    }
}