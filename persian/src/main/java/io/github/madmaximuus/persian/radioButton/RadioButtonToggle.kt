package io.github.madmaximuus.persian.radioButton

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.selection.selectable
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianState38
import io.github.madmaximuus.persian.foundation.minimumInteractiveComponentSize
import io.github.madmaximuus.persian.foundation.ripple.ripple
import io.github.madmaximuus.persian.text.Text

/**
 * Radio buttons allow users to select one option from a set.
 *
 * [RadioButtonToggle]s can be combined together with [Text] in the desired layout (e.g. [Column] or
 * [Row]) to achieve radio group-like behaviour, where the entire layout is selectable:
 *
 * @param selected whether this radio button is selected or not
 * @param onClick called when this radio button is clicked. If `null`, then this radio button will
 *   not be interactable, unless something else handles its input events and updates its state.
 * @param modifier the [Modifier] to be applied to this radio button
 * @param enabled controls the enabled state of this radio button. When `false`, this component will
 *   not respond to user input, and it will appear visually disabled and disabled to accessibility
 *   services.
 * @param colors [RadioButtonToggleColors] that will be used to resolve the color used for this radio
 *   button in different states. See [RadioButtonDefaults.colors].
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this radio button. You can use this to change the radio button's
 *   appearance or preview the radio button in different states. Note that if `null` is provided,
 *   interactions will still happen internally.
 */
@Composable
fun RadioButtonToggle(
    selected: Boolean,
    onClick: (() -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: RadioButtonToggleColors = RadioButtonDefaults.toggleColors(),
    interactionSource: MutableInteractionSource? = null
) {
    val dotRadius =
        animateDpAsState(
            targetValue = if (selected) RadioButtonDotSize / 2 else 0.dp,
            animationSpec = tween(durationMillis = RadioAnimationDuration),
            label = ""
        )
    val radioColor = colors.radioColor(selected)
    val selectableModifier =
        if (onClick != null) {
            Modifier.selectable(
                selected = selected,
                onClick = onClick,
                enabled = enabled,
                role = Role.RadioButton,
                interactionSource = interactionSource,
                indication = ripple(
                    bounded = false,
                    radius = 24.dp
                )
            )
        } else {
            Modifier
        }
    Canvas(
        modifier = modifier
            .then(
                if (onClick != null) {
                    Modifier.minimumInteractiveComponentSize()
                } else {
                    Modifier
                }
            )
            .then(selectableModifier)
            .wrapContentSize(Alignment.Center)
            .size(24.dp)
            .graphicsLayer {
                alpha = if (enabled) 1f
                else PersianState38
            }
    ) {
        val strokeWidth = RadioStrokeWidth.toPx()
        drawCircle(
            color = radioColor.value,
            radius = 11.dp.toPx() - strokeWidth / 2,
            style = Stroke(strokeWidth)
        )
        if (dotRadius.value > 0.dp) {
            drawCircle(
                color = radioColor.value,
                radius = dotRadius.value.toPx(),
                style = Fill
            )
        }
    }
}

private val RadioButtonDotSize = 12.dp
private val RadioStrokeWidth = 2.dp

private const val RadioAnimationDuration = 100
