package io.github.madmaximuus.persian.fab

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkHorizontally
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.surface.Surface
import io.github.madmaximuus.persian.text.Text

@Composable
fun SmallFab(
    modifier: Modifier = Modifier,
    icon: Painter,
    sizes: FabSizes = FabDefaults.smallSizes(),
    colors: FabColors = FabDefaults.neutralColors(),
    elevation: FabElevation = FabDefaults.elevation(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit
) {
    Fab(
        onClick = onClick,
        modifier = modifier,
        sizes = sizes,
        colors = colors,
        elevation = elevation,
        interactionSource = interactionSource,
        content = {
            Icon(
                painter = icon,
                sizes = sizes.iconSizes,
                tint = colors.contentColor
            )
        },
    )
}

@Composable
fun MediumFab(
    modifier: Modifier = Modifier,
    icon: Painter,
    title: String? = null,
    expanded: Boolean = true,
    sizes: FabSizes = FabDefaults.mediumSizes(),
    colors: FabColors = FabDefaults.neutralColors(),
    elevation: FabElevation = FabDefaults.elevation(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
) {
    Fab(
        onClick = onClick,
        modifier = modifier,
        sizes = sizes,
        colors = colors,
        elevation = elevation,
        interactionSource = interactionSource,
    ) {
        val startPadding = if (expanded && title != null) ExtendedFabStartIconPadding else 0.dp
        val endPadding = if (expanded && title != null) ExtendedFabTextPadding else 0.dp

        Row(
            modifier = Modifier
                .sizeIn(
                    minWidth = if (expanded && title != null) ExtendedFabMinimumWidth
                    else 56.dp
                )
                .padding(
                    start = startPadding,
                    end = endPadding
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = if (expanded && title != null) Arrangement.Start else Arrangement.Center
        ) {
            Icon(
                painter = icon,
                tint = colors.contentColor
            )
            if (title != null) {
                AnimatedVisibility(
                    visible = expanded,
                    enter = ExtendedFabExpandAnimation,
                    exit = ExtendedFabCollapseAnimation,
                ) {
                    Row(Modifier.clearAndSetSemantics {}) {
                        Spacer(Modifier.width(ExtendedFabEndIconPadding))
                        Text(text = title)
                    }
                }
            }
        }
    }
}

@Composable
internal fun Fab(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    sizes: FabSizes = FabDefaults.mediumSizes(),
    colors: FabColors = FabDefaults.neutralColors(),
    elevation: FabElevation = FabDefaults.elevation(),
    interactionSource: MutableInteractionSource? = null,
    content: @Composable () -> Unit,
) {
    @Suppress("NAME_SHADOWING")
    val interactionSource = interactionSource ?: remember { MutableInteractionSource() }
    Surface(
        onClick = onClick,
        modifier = modifier.semantics { role = Role.Button },
        shape = sizes.cornerShape,
        color = colors.backgroundColor,
        contentColor = colors.contentColor,
        tonalElevation = elevation.tonalElevation(),
        shadowElevation = elevation.shadowElevation(interactionSource = interactionSource).value,
        interactionSource = interactionSource
    ) {
        Box(
            modifier.defaultMinSize(
                minWidth = sizes.boxSize,
                minHeight = sizes.boxSize
            ),
            contentAlignment = Alignment.Center,
        ) {
            content()
        }
    }
}


private val ExtendedFabStartIconPadding = 16.dp

private val ExtendedFabEndIconPadding = 12.dp

private val ExtendedFabTextPadding = 20.dp

private val ExtendedFabMinimumWidth = 80.dp

private val ExtendedFabCollapseAnimation =
    fadeOut(
        animationSpec =
        tween(
            durationMillis = 100,
            easing = CubicBezierEasing(0.0f, 0.0f, 1.0f, 1.0f),
        )
    ) + shrinkHorizontally(
        animationSpec =
        tween(
            durationMillis = 500,
            easing = CubicBezierEasing(0.0f, 0.0f, 1.0f, 1.0f),
        ),
        shrinkTowards = Alignment.Start,
    )

private val ExtendedFabExpandAnimation =
    fadeIn(
        animationSpec =
        tween(
            durationMillis = 100,
            delayMillis = 100,
            easing = CubicBezierEasing(0.0f, 0.0f, 1.0f, 1.0f),
        ),
    ) + expandHorizontally(
        animationSpec =
        tween(
            durationMillis = 500,
            easing = CubicBezierEasing(0.0f, 0.0f, 1.0f, 1.0f),
        ),
        expandFrom = Alignment.Start,
    )
