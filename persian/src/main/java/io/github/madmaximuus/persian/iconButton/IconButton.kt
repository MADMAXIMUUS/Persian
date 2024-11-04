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
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.fab.Fab
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
 * - See [SecondaryIconButton] for a medium-emphasis button.
 * - See [TertiaryIconButton] for a low-emphasis button.
 * - See [OutlinedIconButton] for a middle ground between [SecondaryIconButton] and [TertiaryIconButton].
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
 * Buttons help people initiate actions, from sending an email, to sharing a document or liking a
 * post.
 *
 * Secondary buttons are medium-emphasis buttons that is an alternative middle ground between
 * default [PrimaryIconButton]s and [TertiaryIconButton]s. They can be used in contexts where
 * lower-priority button requires slightly more emphasis than [TertiaryIconButton], such as "Next"
 * in an onboarding flow. Secondary buttons use the primary container color mapping.
 *
 * Choose the best button for an action based on the amount of emphasis it needs. The more important
 * an action is, the higher emphasis its button should be.
 * - See [PrimaryIconButton] for a high-emphasis button.
 * - See [TertiaryIconButton] for a low-emphasis button.
 * - See [OutlinedIconButton] for a middle ground between [SecondaryIconButton] and [TertiaryIconButton].
 *
 * @param icon The [Painter] that represents the icon to be displayed in the button.
 * @param modifier The [Modifier] to be applied to this button.
 * @param enabled controls the enabled state of this button. When `false`, this component will not
 *   respond to user input, and it will appear visually disabled and disabled to accessibility
 *   services.
 * @param colors The colors of the background and the content in enabled and disabled.
 * @param sizes The sizes for the content, paddings, shape and height.
 * @param onClick Called when this button is clicked.
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this button. You can use this to change the button's appearance or
 *   preview the button in different states. Note that if `null` is provided, interactions will
 *   still happen internally.
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
 * Buttons help people initiate actions, from sending an email, to sharing a document, to liking a
 * post.
 *
 * Tertiary buttons are typically used for less-pronounced actions, including those located in dialogs
 * and cards. In cards, tertiary buttons help maintain an emphasis on card content. Tertiary buttons are
 * used for the lowest priority actions, especially when presenting multiple options.
 *
 * Choose the best button for an action based on the amount of emphasis it needs. The more important
 * an action is, the higher emphasis its button should be.
 * - See [PrimaryIconButton] for a high-emphasis button.
 * - See [SecondaryIconButton] for a medium-emphasis button.
 * - See [OutlinedIconButton] for a middle ground between [SecondaryIconButton] and [TertiaryIconButton].
 *
 * @param icon The [Painter] that represents the icon to be displayed in the button.
 * @param modifier The [Modifier] to be applied to this button.
 * @param enabled controls the enabled state of this button. When `false`, this component will not
 *   respond to user input, and it will appear visually disabled and disabled to accessibility
 *   services.
 * @param colors The colors of the background and the content in enabled and disabled.
 * @param sizes The sizes for the content, paddings, shape and height.
 * @param onClick Called when this button is clicked.
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this button. You can use this to change the button's appearance or
 *   preview the button in different states. Note that if `null` is provided, interactions will
 *   still happen internally.
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
 * Buttons help people initiate actions, from sending an email, to sharing a document, to liking a
 * post.
 *
 * Outlined buttons are low-emphasis buttons. They contain actions that are important, but are
 * not the primary action in an app.
 *
 * Choose the best button for an action based on the amount of emphasis it needs. The more important
 * an action is, the higher emphasis its button should be.
 * - See [PrimaryIconButton] for a high-emphasis button.
 * - See [SecondaryIconButton] for a medium-emphasis button.
 * - See [TertiaryIconButton] for a low-emphasis button.
 *
 * @param icon The [Painter] that represents the icon to be displayed in the button.
 * @param modifier The [Modifier] to be applied to this button.
 * @param enabled controls the enabled state of this button. When `false`, this component will not
 *   respond to user input, and it will appear visually disabled and disabled to accessibility
 *   services.
 * @param colors The colors of the background and the content in enabled and disabled.
 * @param sizes The sizes for the content, paddings, shape and height.
 * @param onClick Called when this button is clicked.
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this button. You can use this to change the button's appearance or
 *   preview the button in different states. Note that if `null` is provided, interactions will
 *   still happen internally.
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