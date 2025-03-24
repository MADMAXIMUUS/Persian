package io.github.madmaximuus.persian.segmentedControls.button

import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.toggleable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.surface.Surface
import io.github.madmaximuus.persian.text.Text

/**
 * A default Toggleable Segmented Button. Also known as Outlined Segmented Button. See
 * [Modifier.selectable].
 *
 * Selectable segmented buttons should be used for cases where the selection is mutually exclusive,
 * when only one button can be selected at a time.
 *
 * This should typically be used inside of a [SingleChoiceSegmentedButtonRow]
 *
 * @param selected whether this button is selected or not
 * @param onClick callback to be invoked when the button is clicked. therefore the change of checked
 *   state in requested.
 * @param modifier the [Modifier] to be applied to this button
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this button. You can use this to change the button's appearance or
 *   preview the button in different states. Note that if `null` is provided, interactions will
 *   still happen internally.
 * @param icon the icon slot for this button, you can pass null in unchecked, in which case the
 *   content will displace to show the checked icon, or pass different icon lambdas for unchecked
 *   and checked in which case the icons will crossfade.
 * @param label content to be rendered inside this button
 */
@Composable
fun SingleChoiceSegmentedButtonRowScope.Segment(
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    icon: Painter? = null,
    label: String? = null,
    interactionSource: MutableInteractionSource? = null,
) {
    require(icon != null || label != null) {
        throw IllegalArgumentException("Icon or label required")
    }
    @Suppress("NAME_SHADOWING")
    val interactionSource = interactionSource ?: remember { MutableInteractionSource() }
    val contentColor = colors.segmentColors.contentColor(selected)

    Surface(
        modifier = modifier
            .weight(1f)
            .widthIn(min = 90.dp)
            .fillMaxHeight()
            .semantics { role = Role.RadioButton },
        selected = selected,
        onClick = onClick,
        enabled = enabled,
        color = if (selected) colors.segmentColors.activeContainerColor else Color.Transparent,
        contentColor = contentColor,
        interactionSource = interactionSource
    ) {
        SegmentContent(icon, label, selected, sizes, colors.segmentColors)
    }
}

/**
 * A default Toggleable Segmented Button. Also known as Outlined Segmented Button. See
 * [Modifier.toggleable].
 *
 * Toggleable segmented buttons should be used for cases where the selection is not mutually
 * exclusive.
 *
 * This should typically be used inside of a [MultiChoiceSegmentedButtonRow]
 *
 * @param checked whether this button is checked or not
 * @param onCheckedChange callback to be invoked when the button is clicked. therefore the change of
 *   checked state in requested.
 * @param modifier the [Modifier] to be applied to this button
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this button. You can use this to change the button's appearance or
 *   preview the button in different states. Note that if `null` is provided, interactions will
 *   still happen internally.
 * @param icon the icon slot for this button, you can pass null in unchecked, in which case the
 *   content will displace to show the checked icon, or pass different icon lambdas for unchecked
 *   and checked in which case the icons will crossfade.
 * @param label content to be rendered inside this button
 */
@Composable
fun MultiChoiceSegmentedButtonRowScope.Segment(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    icon: Painter? = null,
    label: String? = null,
    interactionSource: MutableInteractionSource? = null,
) {
    require(icon != null || label != null) {
        throw IllegalArgumentException("Icon or label required")
    }
    @Suppress("NAME_SHADOWING")
    val interactionSource = interactionSource ?: remember { MutableInteractionSource() }
    val contentColor = colors.segmentColors.contentColor(checked)

    Surface(
        modifier = modifier
            .weight(1f)
            .fillMaxHeight()
            .widthIn(min = 90.dp),
        checked = checked,
        onCheckedChange = onCheckedChange,
        enabled = enabled,
        color = if (checked) colors.segmentColors.activeContainerColor else Color.Transparent,
        contentColor = contentColor,
        interactionSource = interactionSource
    ) {
        SegmentContent(icon, label, checked, sizes, colors.segmentColors)
    }
}

/**
 * A composable function that creates the content for a segmented button.
 *
 * This function configures the content of a segmented button, including an icon, a selected icon, and a label.
 * The content is displayed based on the selected state and enabled state of the button.
 *
 * @param icon The optional icon [Painter] for the icon.
 * @param label The optional text label for the segmented button.
 * @param selected A boolean indicating whether the segmented button is selected.
 * @param sizes The sizes configuration for the segmented button.
 * @param colors The colors configuration for the segmented button.
 */
@Composable
private fun SegmentContent(
    icon: Painter?,
    label: String?,
    selected: Boolean,
    sizes: SegmentedButtonRowSizes,
    colors: SegmentColors
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(
            PersianTheme.spacing.size8,
            Alignment.CenterHorizontally
        ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        icon?.let {
            Icon(
                painter = icon,
                sizes = sizes.iconSize,
                tint = colors.contentColor(selected),
                contentDescription = null,
            )
        }
        label?.let {
            Text(
                text = it,
                color = colors.contentColor(selected),
                style = sizes.labelTextStyle
            )
        }
    }
}