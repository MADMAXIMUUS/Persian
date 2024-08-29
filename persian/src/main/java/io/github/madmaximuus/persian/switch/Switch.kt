package io.github.madmaximuus.persian.switch

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.AnimationVector1D
import androidx.compose.animation.core.SnapSpec
import androidx.compose.animation.core.TweenSpec
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.indication
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.selection.toggleable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.node.LayoutModifierNode
import androidx.compose.ui.node.ModifierNodeElement
import androidx.compose.ui.node.invalidateMeasurement
import androidx.compose.ui.platform.InspectorInfo
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.LocalContentColor
import io.github.madmaximuus.persian.foundation.minimumInteractiveComponentSize
import io.github.madmaximuus.persian.foundation.ripple.ripple
import io.github.madmaximuus.persian.icon.Icon
import kotlinx.coroutines.launch

/**
 * Switches toggle the state of a single item on or off.
 *
 * @param checked whether or not this switch is checked
 * @param onCheckedChange called when this switch is clicked. If `null`, then this switch will not
 *   be interactable, unless something else handles its input events and updates its state.
 * @param modifier the [Modifier] to be applied to this switch
 * @param enabled controls the enabled state of this switch. When `false`, this component will not
 *   respond to user input, and it will appear visually disabled and disabled to accessibility
 *   services.
 * @param colors [SwitchColors] that will be used to resolve the colors used for this switch in
 *   different states. See [SwitchDefaults.colors].
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this switch. You can use this to change the switch's appearance or
 *   preview the switch in different states. Note that if `null` is provided, interactions will
 *   still happen internally.
 */
@Composable
fun Switch(
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)?,
    modifier: Modifier = Modifier,
    checkedIcon: Painter? = null,
    uncheckedIcon: Painter? = null,
    enabled: Boolean = true,
    colors: SwitchColors = SwitchDefaults.colors(),
    sizes: SwitchSizes = SwitchDefaults.sizes(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    val icon: (@Composable () -> Unit)? = when {
        checkedIcon == null && uncheckedIcon == null -> null
        checkedIcon != null && checked -> {
            {
                Icon(
                    painter = checkedIcon,
                    sizes = sizes.iconSizes
                )
            }
        }

        uncheckedIcon != null && !checked -> {
            {
                Icon(
                    painter = uncheckedIcon,
                    sizes = sizes.iconSizes
                )
            }
        }

        else -> null
    }

    val toggleableModifier =
        if (onCheckedChange != null) {
            Modifier
                .minimumInteractiveComponentSize()
                .toggleable(
                    value = checked,
                    onValueChange = onCheckedChange,
                    enabled = enabled,
                    role = Role.Switch,
                    interactionSource = interactionSource,
                    indication = null
                )
        } else {
            Modifier
        }

    SwitchImpl(
        modifier =
        modifier
            .then(toggleableModifier)
            .wrapContentSize(Alignment.Center)
            .requiredSize(SwitchWidth, SwitchHeight),
        checked = checked,
        enabled = enabled,
        colors = colors,
        sizes = sizes,
        interactionSource = interactionSource,
        thumbContent = icon,
    )
}

@Composable
@Suppress("ComposableLambdaParameterNaming", "ComposableLambdaParameterPosition")
private fun SwitchImpl(
    modifier: Modifier,
    checked: Boolean,
    enabled: Boolean,
    colors: SwitchColors,
    sizes: SwitchSizes,
    thumbContent: (@Composable () -> Unit)?,
    interactionSource: InteractionSource,
) {
    val trackColor = colors.trackColor(enabled, checked)
    val resolvedThumbColor = colors.thumbColor(enabled, checked)

    Box(
        modifier
            .border(sizes.trackBorderWith, colors.borderColor(enabled, checked), sizes.trackShape)
            .background(trackColor, sizes.trackShape)
    ) {
        Box(
            modifier =
            Modifier
                .align(Alignment.CenterStart)
                .then(
                    ThumbElement(
                        interactionSource,
                        checked,
                        sizes.toggleSize,
                        sizes.uncheckedToggleSizes
                    )
                )
                .indication(
                    interactionSource = interactionSource,
                    indication = ripple(
                        bounded = false,
                        radius = 20.dp
                    )
                )
                .background(resolvedThumbColor, sizes.toggleShape),
            contentAlignment = Alignment.Center
        ) {
            if (thumbContent != null) {
                val iconColor = colors.iconColor(enabled, checked)
                CompositionLocalProvider(
                    LocalContentColor provides iconColor,
                    content = thumbContent
                )
            }
        }
    }
}

private data class ThumbElement(
    val interactionSource: InteractionSource,
    val checked: Boolean,
    private val thumbSize: Dp,
    private val uncheckedThumbSize: Dp
) : ModifierNodeElement<ThumbNode>() {
    override fun create() = ThumbNode(interactionSource, checked, thumbSize, uncheckedThumbSize)

    override fun update(node: ThumbNode) {
        node.interactionSource = interactionSource
        if (node.checked != checked) {
            node.invalidateMeasurement()
        }
        node.checked = checked
        node.update()
    }

    override fun InspectorInfo.inspectableProperties() {
        name = "switchThumb"
        properties["interactionSource"] = interactionSource
        properties["checked"] = checked
    }
}

private class ThumbNode(
    var interactionSource: InteractionSource,
    var checked: Boolean,
    private val thumbSize: Dp,
    private val uncheckedThumbSize: Dp
) : Modifier.Node(), LayoutModifierNode {

    override val shouldAutoInvalidate: Boolean
        get() = false

    private var isPressed = false
    private var offsetAnim: Animatable<Float, AnimationVector1D>? = null
    private var sizeAnim: Animatable<Float, AnimationVector1D>? = null
    private var initialOffset: Float = Float.NaN
    private var initialSize: Float = Float.NaN

    override fun onAttach() {
        coroutineScope.launch {
            var pressCount = 0
            interactionSource.interactions.collect { interaction ->
                when (interaction) {
                    is PressInteraction.Press -> pressCount++
                    is PressInteraction.Release -> pressCount--
                    is PressInteraction.Cancel -> pressCount--
                }
                val pressed = pressCount > 0
                if (isPressed != pressed) {
                    isPressed = pressed
                    invalidateMeasurement()
                }
            }
        }
    }

    override fun MeasureScope.measure(
        measurable: Measurable,
        constraints: Constraints,
    ): MeasureResult {
        val hasContent =
            measurable.maxIntrinsicHeight(constraints.maxWidth) != 0 &&
                    measurable.maxIntrinsicWidth(constraints.maxHeight) != 0
        val size =
            when {
                isPressed -> 28.0.dp
                hasContent || checked -> thumbSize
                else -> uncheckedThumbSize
            }.toPx()

        val actualSize = (sizeAnim?.value ?: size).toInt()
        val placeable = measurable.measure(Constraints.fixed(actualSize, actualSize))
        val thumbPaddingStart = (SwitchHeight - size.toDp()) / 2f
        val minBound = thumbPaddingStart.toPx()
        val thumbPadding = (SwitchHeight - thumbSize) / 2
        val thumbPathLength = (SwitchWidth - thumbSize) - thumbPadding

        val maxBound = thumbPathLength.toPx()
        val offset =
            when {
                isPressed && checked -> maxBound - 2.dp.toPx()
                isPressed && !checked -> 2.dp.toPx()
                checked -> maxBound
                else -> minBound
            }

        if (sizeAnim?.targetValue != size) {
            coroutineScope.launch {
                sizeAnim?.animateTo(
                    size,
                    if (isPressed) SnapSpec else AnimationSpec
                )
            }
        }

        if (offsetAnim?.targetValue != offset) {
            coroutineScope.launch {
                offsetAnim?.animateTo(
                    offset,
                    if (isPressed) SnapSpec else AnimationSpec
                )
            }
        }

        if (initialSize.isNaN() && initialOffset.isNaN()) {
            initialSize = size
            initialOffset = offset
        }

        return layout(actualSize, actualSize) {
            placeable.placeRelative(offsetAnim?.value?.toInt() ?: offset.toInt(), 0)
        }
    }

    fun update() {
        if (sizeAnim == null && !initialSize.isNaN()) {
            sizeAnim = Animatable(initialSize)
        }

        if (offsetAnim == null && !initialOffset.isNaN()) offsetAnim = Animatable(initialOffset)
    }
}


/* @VisibleForTesting */

private val SwitchWidth = 52.dp
private val SwitchHeight = 32.dp
private val SnapSpec = SnapSpec<Float>()
private val AnimationSpec = TweenSpec<Float>(durationMillis = 100)
