package io.github.madmaximuus.persian.fab

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkHorizontally
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
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
import io.github.madmaximuus.persian.text.Text

/**
 * A Floating Action Button (FAB) is useful for providing quick access to primary actions,
 * offering users a prominent and easily accessible interface element. It offers a straightforward
 * and effective method for enhancing user interaction and navigation, making it an essential tool
 * for improving user experience and design usability.
 *
 * @param modifier The modifier to be applied to the FAB.
 * @param icon The [Painter] that represents the icon to be displayed in the FAB.
 * @param sizes The [FabSizes] that define the sizes of the FAB.
 * @param colors The [FabColors] that define the colors of the FAB.
 * @param elevation The [FabElevation] that defines the elevation of the FAB.
 * @param interactionSource an hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this button. You can use this to change the button's appearance or
 *   preview the button in different states.
 * @param onClick The callback to be invoked when the FAB is clicked.
 */
@Composable
fun SmallFab(
    modifier: Modifier = Modifier,
    icon: Painter,
    sizes: FabSizes = FabDefaults.smallSizes(),
    colors: FabColors = FabDefaults.neutralColors(),
    elevation: FabElevation = FabDefaults.elevation(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit
) = FabImpl(
    onClick = onClick,
    icon = icon,
    title = null,
    expanded = false,
    modifier = modifier,
    sizes = sizes,
    colors = colors,
    elevation = elevation,
    interactionSource = interactionSource
)

/**
 * A Floating Action Button (FAB) is useful for providing quick access to primary actions,
 * offering users a prominent and easily accessible interface element. It offers a straightforward
 * and effective method for enhancing user interaction and navigation, making it an essential tool
 * for improving user experience and design usability.
 *
 * @param modifier The modifier to be applied to the FAB.
 * @param icon The [Painter] that represents the icon to be displayed in the FAB.
 * @param title The optional title text to be displayed in the FAB when expanded.
 * @param expanded A boolean indicating whether the FAB is in the expanded state.
 * @param sizes The [FabSizes] that define the sizes of the FAB and its icon.
 * @param colors The [FabColors] that define the colors of the FAB and its content.
 * @param elevation The [FabElevation] that defines the elevation of the FAB.
 * @param interactionSource an hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this button. You can use this to change the button's appearance or
 *   preview the button in different states.
 * @param onClick The callback to be invoked when the FAB is clicked.
 */
@Composable
fun Fab(
    modifier: Modifier = Modifier,
    icon: Painter,
    title: String? = null,
    expanded: Boolean = true,
    sizes: FabSizes = FabDefaults.defaultSizes(),
    colors: FabColors = FabDefaults.neutralColors(),
    elevation: FabElevation = FabDefaults.elevation(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
) = FabImpl(
    onClick = onClick,
    icon = icon,
    title = title,
    expanded = expanded,
    modifier = modifier,
    sizes = sizes,
    colors = colors,
    elevation = elevation,
    interactionSource = interactionSource,
)

/**
 * A base implementation for FAB.
 *
 * @param onClick The callback to be invoked when the FAB is clicked.
 * @param icon The [Painter] that represents the icon to be displayed in the FAB.
 * @param title The optional title text to be displayed in the FAB when expanded.
 * @param expanded A boolean indicating whether the FAB is in the expanded state.
 * @param modifier The modifier to be applied to the FAB.
 * @param sizes The [FabSizes] that define the sizes of the FAB and its icon.
 * @param colors The [FabColors] that define the colors of the FAB and its content.
 * @param elevation The [FabElevation] that defines the elevation of the FAB.
 * @param interactionSource The [MutableInteractionSource] that handles the interaction state of the FAB.
 */
@Composable
internal fun FabImpl(
    onClick: () -> Unit,
    icon: Painter,
    title: String?,
    expanded: Boolean,
    modifier: Modifier,
    sizes: FabSizes,
    colors: FabColors,
    elevation: FabElevation,
    interactionSource: MutableInteractionSource?,
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
        val startPadding = if (expanded && title != null) 14.dp else 0.dp
        val endPadding = if (expanded && title != null) 14.dp else 0.dp

        Row(
            modifier = Modifier
                .widthIn(min = sizes.boxSize)
                .height(sizes.boxSize)
                .padding(
                    start = startPadding,
                    end = endPadding
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                painter = icon,
                sizes = sizes.iconSizes,
                tint = colors.contentColor
            )
            if (title != null) {
                AnimatedVisibility(
                    visible = expanded,
                    enter = ExtendedFabExpandAnimation,
                    exit = ExtendedFabCollapseAnimation,
                ) {
                    Row {
                        Spacer(Modifier.width(8.dp))
                        Text(
                            text = title,
                            style = sizes.textStyle
                        )
                    }
                }
            }
        }
    }
}

private val ExtendedFabCollapseAnimation =
    fadeOut(
        animationSpec = tween(
            durationMillis = 100,
            delayMillis = 100,
            easing = CubicBezierEasing(0.0f, 0.0f, 1.0f, 1.0f),
        )
    ) + shrinkHorizontally(
        animationSpec = tween(
            durationMillis = 500,
            easing = CubicBezierEasing(0.0f, 0.0f, 1.0f, 1.0f),
        ),
        shrinkTowards = Alignment.Start,
    )

private val ExtendedFabExpandAnimation =
    fadeIn(
        animationSpec = tween(
            durationMillis = 100,
            delayMillis = 100,
            easing = CubicBezierEasing(0.0f, 0.0f, 1.0f, 1.0f),
        )
    ) + expandHorizontally(
        animationSpec = tween(
            durationMillis = 500,
            easing = CubicBezierEasing(0.0f, 0.0f, 1.0f, 1.0f),
        ),
        expandFrom = Alignment.Start,
    )
