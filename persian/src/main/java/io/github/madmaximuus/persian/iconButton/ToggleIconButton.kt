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
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
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
 * @param checked The checked state of this icon button
 * @param onCheckedChange Called when this button is clicked.
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this button. You can use this to change the button's appearance or
 *   preview the button in different states. Note that if `null` is provided, interactions will
 *   still happen internally.
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
        .size(sizes.size)
        .graphicsLayer {
            alpha = if (enabled) 1f
            else PersianState38
        },
    enabled = enabled,
    shape = sizes.shape,
    color = colors.containerColor(checked),
    contentColor = colors.contentColor(checked),
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
 * Buttons help people initiate actions, from sending an email, to sharing a document or liking a
 * post.
 *
 * Secondary buttons are medium-emphasis buttons that is an alternative middle ground between
 * default [PrimaryIconButton]s and [TertiaryIconButton]s. They can be used in contexts where
 * lower-priority button requires slightly more emphasis than [TertiaryIconButton], such as "Next"
 * in an onboarding flow. Secondary buttons use the primary container color mapping.
 *
 * @param icon The [Painter] that represents the icon to be displayed in the button.
 * @param modifier The [Modifier] to be applied to this button.
 * @param enabled controls the enabled state of this button. When `false`, this component will not
 *   respond to user input, and it will appear visually disabled and disabled to accessibility
 *   services.
 * @param colors The colors of the container and the content in enabled and disabled.
 * @param sizes The sizes for the content, shape and height.
 * @param checked The checked state of this icon button
 * @param onCheckedChange Called when this button is clicked.
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this button. You can use this to change the button's appearance or
 *   preview the button in different states. Note that if `null` is provided, interactions will
 *   still happen internally.
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
        .size(sizes.size)
        .graphicsLayer {
            alpha = if (enabled) 1f
            else PersianState38
        },
    enabled = enabled,
    shape = sizes.shape,
    color = colors.containerColor(checked),
    contentColor = colors.contentColor(checked),
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
 * @param colors The colors of the container and the content in enabled and disabled.
 * @param sizes The sizes for the content, shape and height.
 * @param checked The checked state of this icon button
 * @param onCheckedChange Called when this button is clicked.
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this button. You can use this to change the button's appearance or
 *   preview the button in different states. Note that if `null` is provided, interactions will
 *   still happen internally.
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
        .size(sizes.size)
        .graphicsLayer {
            alpha = if (enabled) 1f
            else PersianState38
        },
    enabled = enabled,
    shape = sizes.shape,
    color = colors.containerColor(checked),
    contentColor = colors.contentColor(checked),
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
 * @param colors The colors of the container and the content in enabled and disabled.
 * @param sizes The sizes for the content, shape and height.
 * @param checked The checked state of this icon button
 * @param onCheckedChange Called when this button is clicked.
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this button. You can use this to change the button's appearance or
 *   preview the button in different states. Note that if `null` is provided, interactions will
 *   still happen internally.
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
        .size(sizes.size)
        .graphicsLayer {
            alpha = if (enabled) 1f
            else PersianState38
        },
    enabled = enabled,
    shape = sizes.shape,
    color = colors.containerColor(checked),
    contentColor = colors.contentColor(checked),
    border = if (checked) null else BorderStroke(
        1.dp,
        colors.contentColor(false)
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