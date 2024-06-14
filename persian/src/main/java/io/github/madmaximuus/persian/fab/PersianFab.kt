package io.github.madmaximuus.persian.fab

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import io.github.madmaximuus.persian.icon.Icon

@Composable
fun PersianSmallFab(
    modifier: Modifier = Modifier,
    icon: Painter,
    sizes: FabSizes = PersianFabDefaults.smallSizes(),
    colors: FabColors = PersianFabDefaults.neutralColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit
) {
    SmallFloatingActionButton(
        modifier = modifier
            .size(sizes.boxSize),
        contentColor = colors.content,
        containerColor = colors.backgroundColor,
        shape = sizes.cornerShape,
        interactionSource = interactionSource,
        onClick = onClick
    ) {
        Icon(
            painter = icon,
            size = sizes.iconSize
        )
    }
}

@Composable
fun PersianMediumFab(
    modifier: Modifier = Modifier,
    icon: Painter,
    title: String? = null,
    sizes: FabSizes = PersianFabDefaults.mediumSizes(),
    expanded: Boolean = true,
    colors: FabColors = PersianFabDefaults.neutralColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit
) {
    if (title == null) {
        FloatingActionButton(
            modifier = modifier
                .size(sizes.boxSize),
            contentColor = colors.content,
            containerColor = colors.backgroundColor,
            shape = sizes.cornerShape,
            interactionSource = interactionSource,
            onClick = onClick,
            content = {
                Icon(
                    painter = icon,
                    size = sizes.iconSize
                )
            }
        )
    } else {
        ExtendedFloatingActionButton(
            modifier = modifier
                .height(sizes.boxSize),
            contentColor = colors.content,
            containerColor = colors.backgroundColor,
            shape = sizes.cornerShape,
            expanded = expanded,
            interactionSource = interactionSource,
            onClick = onClick,
            icon = {
                Icon(
                    painter = icon,
                    size = sizes.iconSize
                )
            },
            text = {
                Text(
                    text = title,
                    style = sizes.textStyle
                )
            }
        )
    }
}