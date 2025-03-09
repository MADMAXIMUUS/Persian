package io.github.madmaximuus.persian.iconButton

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import io.github.madmaximuus.persian.fab.Fab
import io.github.madmaximuus.persian.foundation.PersianState38
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.surface.Surface


/**
 * Buttons help people initiate actions, from sending an email, to sharing a document, to liking a
 * post.
 *
 * Primary buttons are high-emphasis buttons. Primary buttons have the most visual impact after the
 * [Fab], and should be used for important, final actions that complete a flow,
 * like "Save", "Join now", or "Confirm".
 *
 * Choose the best button for an action based on the amount of emphasis it needs. The more important
 * an action is, the higher emphasis its button should be.
 * - See secondary [IconButton] for a medium-emphasis button.
 * - See tertiary [IconButton] for a low-emphasis button.
 * - See outlined [IconButton] for a middle ground between secondary [IconButton] and tertiary [IconButton].
 *
 * @param icon The [Painter] that represents the icon to be displayed in the button.
 * @param modifier The [Modifier] to be applied to this button.
 * @param enabled controls the enabled state of this button. When `false`, this component will not
 *   respond to user input, and it will appear visually disabled and disabled to accessibility
 *   services.
 * @param colors The colors of the container and the content in enabled and disabled.
 * @param sizes The sizes for the content, shape and height.
 * @param onClick Called when this button is clicked.
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this button. You can use this to change the button's appearance or
 *   preview the button in different states. Note that if `null` is provided, interactions will
 *   still happen internally.
 */
@Composable
fun IconButton(
    onClick: () -> Unit,
    icon: Painter,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    sizes: IconButtonSizes = IconButtonDefaults.mediumSizes(),
    colors: IconButtonColors = IconButtonDefaults.primaryIconButtonColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) = IconButtonImpl(
    onClick = onClick,
    icon = icon,
    modifier = modifier,
    enabled = enabled,
    sizes = sizes,
    colors = colors,
    interactionSource = interactionSource
)

/**
 * Buttons help people initiate actions, from sending an email, to sharing a document, to liking a
 * post.
 *
 * @param icon The [Painter] that represents the icon to be displayed in the button.
 * @param modifier The [Modifier] to be applied to this button.
 * @param enabled controls the enabled state of this button. When `false`, this component will not
 *   respond to user input, and it will appear visually disabled and disabled to accessibility
 *   services.
 * @param colors The colors of the container and the content in enabled and disabled.
 * @param sizes The sizes for the content, shape and height.
 * @param onClick Called when this button is clicked.
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this button. You can use this to change the button's appearance or
 *   preview the button in different states. Note that if `null` is provided, interactions will
 *   still happen internally.
 */
@Composable
fun IconButtonImpl(
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
        .size(sizes.size)
        .graphicsLayer {
            alpha = if (enabled) 1f
            else PersianState38
        },
    enabled = enabled,
    shape = sizes.shape,
    color = colors.containerColor,
    contentColor = colors.contentColor,
    border = if (colors.borderColor != Color.Transparent) BorderStroke(
        sizes.borderStrokeThickness,
        colors.borderColor
    ) else null,
    interactionSource = interactionSource
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = icon,
            sizes = sizes.iconSizes,
            tint = colors.contentColor
        )
    }
}