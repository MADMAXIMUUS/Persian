package io.github.madmaximuus.persian.chips.founfation

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.VectorConverter
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.interaction.FocusInteraction
import androidx.compose.foundation.interaction.HoverInteraction
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import io.github.madmaximuus.persian.foundation.animateElevation
import io.github.madmaximuus.persian.iconBox.IconBoxSize
import io.github.madmaximuus.persian.surface.Surface

@Composable
internal fun BaseChip(
    modifier: Modifier,
    onClick: () -> Unit,
    enabled: Boolean,
    label: String,
    leadingIcon: Painter?,
    image: String?,
    trailingIcon: Painter?,
    colors: ChipColors,
    sizes: ChipSizes,
    paddingValues: PaddingValues,
    elevation: ChipElevation,
    interactionSource: MutableInteractionSource,
) {
    Surface(
        onClick = onClick,
        modifier = modifier.semantics { role = Role.Button },
        enabled = enabled,
        shape = sizes.shape,
        color = colors.containerColor(enabled),
        border = BorderStroke(sizes.borderWidth(enabled), colors.borderColor(enabled)),
        tonalElevation = elevation.tonalElevation(enabled),
        shadowElevation = elevation.shadowElevation(
            enabled = enabled,
            interactionSource = interactionSource
        ).value,
        interactionSource = interactionSource,
    ) {
        ChipContent(
            label = label,
            selected = false,
            labelTextStyle = sizes.labelStyle,
            leadingIcon = leadingIcon,
            leadingIconSize = sizes.leadingIconSize,
            trailingIconSize = sizes.trailingIconSize,
            avatar = null,
            image = image,
            trailingIcon = trailingIcon,
            paddingValues = paddingValues,
            leadingIconColor = colors.leadingIconContentColor(enabled),
            trailingIconColor = colors.trailingIconContentColor(enabled),
            labelColor = colors.labelColor(enabled),
            onTrailingClick = null,
            enabled = enabled
        )
    }
}

@Immutable
class ChipColors internal constructor(
    private val containerColor: Color,
    private val labelColor: Color,
    private val leadingIconContentColor: Color,
    private val trailingIconContentColor: Color,
    private val borderColor: Color,
    private val disabledContainerColor: Color,
    private val disabledLabelColor: Color,
    private val disabledLeadingIconContentColor: Color,
    private val disabledTrailingIconContentColor: Color,
    private val disabledBorderColor: Color
) {
    fun copy(
        containerColor: Color = this.containerColor,
        labelColor: Color = this.labelColor,
        leadingIconContentColor: Color = this.leadingIconContentColor,
        trailingIconContentColor: Color = this.trailingIconContentColor,
        borderColor: Color = this.borderColor,
        disabledContainerColor: Color = this.disabledContainerColor,
        disabledLabelColor: Color = this.disabledLabelColor,
        disabledLeadingIconContentColor: Color = this.disabledLeadingIconContentColor,
        disabledTrailingIconContentColor: Color = this.disabledTrailingIconContentColor,
        disabledBorderColor: Color = this.disabledBorderColor
    ) = ChipColors(
        containerColor.takeOrElse { this.containerColor },
        labelColor.takeOrElse { this.labelColor },
        leadingIconContentColor.takeOrElse { this.leadingIconContentColor },
        trailingIconContentColor.takeOrElse { this.trailingIconContentColor },
        borderColor.takeOrElse { this.borderColor },
        disabledContainerColor.takeOrElse { this.disabledContainerColor },
        disabledLabelColor.takeOrElse { this.disabledLabelColor },
        disabledLeadingIconContentColor.takeOrElse { this.disabledLeadingIconContentColor },
        disabledTrailingIconContentColor.takeOrElse { this.disabledTrailingIconContentColor },
        disabledBorderColor.takeOrElse { this.disabledBorderColor }
    )

    @Stable
    internal fun containerColor(enabled: Boolean): Color =
        if (enabled) containerColor else disabledContainerColor

    @Stable
    internal fun labelColor(enabled: Boolean): Color =
        if (enabled) labelColor else disabledLabelColor

    @Stable
    internal fun leadingIconContentColor(enabled: Boolean): Color =
        if (enabled) leadingIconContentColor else disabledLeadingIconContentColor

    @Stable
    internal fun trailingIconContentColor(enabled: Boolean): Color =
        if (enabled) trailingIconContentColor else disabledTrailingIconContentColor

    @Stable
    internal fun borderColor(enabled: Boolean): Color =
        if (enabled) borderColor else disabledBorderColor

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ChipColors) return false

        if (containerColor != other.containerColor) return false
        if (labelColor != other.labelColor) return false
        if (leadingIconContentColor != other.leadingIconContentColor) return false
        if (trailingIconContentColor != other.trailingIconContentColor) return false
        if (disabledContainerColor != other.disabledContainerColor) return false
        if (disabledLabelColor != other.disabledLabelColor) return false
        if (disabledLeadingIconContentColor != other.disabledLeadingIconContentColor) return false
        return disabledTrailingIconContentColor == other.disabledTrailingIconContentColor
    }

    override fun hashCode(): Int {
        var result = containerColor.hashCode()
        result = 31 * result + labelColor.hashCode()
        result = 31 * result + leadingIconContentColor.hashCode()
        result = 31 * result + trailingIconContentColor.hashCode()
        result = 31 * result + disabledContainerColor.hashCode()
        result = 31 * result + disabledLabelColor.hashCode()
        result = 31 * result + disabledLeadingIconContentColor.hashCode()
        result = 31 * result + disabledTrailingIconContentColor.hashCode()

        return result
    }
}

@Immutable
class ChipSizes internal constructor(
    internal val trailingIconSize: IconBoxSize,
    internal val leadingIconSize: IconBoxSize,
    internal val labelStyle: TextStyle,
    internal val borderWidth: Dp,
    internal val shape: Shape,
    internal val disabledBorderWith: Dp,
) {

    @Stable
    internal fun borderWidth(enabled: Boolean): Dp =
        if (enabled) borderWidth else disabledBorderWith

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ChipSizes) return false

        if (trailingIconSize != other.trailingIconSize) return false
        if (leadingIconSize != other.leadingIconSize) return false
        if (labelStyle != other.labelStyle) return false
        if (borderWidth != other.borderWidth) return false
        if (shape != other.shape) return false
        return disabledBorderWith == other.disabledBorderWith
    }

    override fun hashCode(): Int {
        var result = trailingIconSize.hashCode()
        result = 31 * result + leadingIconSize.hashCode()
        result = 31 * result + labelStyle.hashCode()
        result = 31 * result + borderWidth.hashCode()
        result = 31 * result + disabledBorderWith.hashCode()
        result = 31 * result + shape.hashCode()

        return result
    }
}

@Immutable
class ChipElevation internal constructor(
    internal val elevation: Dp,
    private val pressedElevation: Dp,
    private val focusedElevation: Dp,
    private val hoveredElevation: Dp,
    private val draggedElevation: Dp,
    private val disabledElevation: Dp
) {

    internal fun tonalElevation(enabled: Boolean): Dp {
        return if (enabled) elevation else disabledElevation
    }

    @Composable
    internal fun shadowElevation(
        enabled: Boolean,
        interactionSource: InteractionSource
    ): State<Dp> {
        return animateElevation(enabled = enabled, interactionSource = interactionSource)
    }

    @Composable
    private fun animateElevation(
        enabled: Boolean,
        interactionSource: InteractionSource
    ): State<Dp> {
        val interactions = remember { mutableStateListOf<Interaction>() }
        var lastInteraction by remember { mutableStateOf<Interaction?>(null) }
        LaunchedEffect(interactionSource) {
            interactionSource.interactions.collect { interaction ->
                when (interaction) {
                    is HoverInteraction.Enter -> {
                        interactions.add(interaction)
                    }

                    is HoverInteraction.Exit -> {
                        interactions.remove(interaction.enter)
                    }

                    is FocusInteraction.Focus -> {
                        interactions.add(interaction)
                    }

                    is FocusInteraction.Unfocus -> {
                        interactions.remove(interaction.focus)
                    }

                    is PressInteraction.Press -> {
                        interactions.add(interaction)
                    }

                    is PressInteraction.Release -> {
                        interactions.remove(interaction.press)
                    }

                    is PressInteraction.Cancel -> {
                        interactions.remove(interaction.press)
                    }

                    is DragInteraction.Start -> {
                        interactions.add(interaction)
                    }

                    is DragInteraction.Stop -> {
                        interactions.remove(interaction.start)
                    }

                    is DragInteraction.Cancel -> {
                        interactions.remove(interaction.start)
                    }
                }
            }
        }

        val interaction = interactions.lastOrNull()

        val target = if (!enabled) {
            disabledElevation
        } else {
            when (interaction) {
                is PressInteraction.Press -> pressedElevation
                is HoverInteraction.Enter -> hoveredElevation
                is FocusInteraction.Focus -> focusedElevation
                is DragInteraction.Start -> draggedElevation
                else -> elevation
            }
        }

        val animatable = remember { Animatable(target, Dp.VectorConverter) }

        LaunchedEffect(target) {
            if (animatable.targetValue != target) {
                if (!enabled) {
                    animatable.snapTo(target)
                } else {
                    animatable.animateElevation(
                        from = lastInteraction, to = interaction, target = target
                    )
                }
                lastInteraction = interaction
            }
        }

        return animatable.asState()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ChipElevation) return false

        if (elevation != other.elevation) return false
        if (pressedElevation != other.pressedElevation) return false
        if (focusedElevation != other.focusedElevation) return false
        if (hoveredElevation != other.hoveredElevation) return false
        return disabledElevation == other.disabledElevation
    }

    override fun hashCode(): Int {
        var result = elevation.hashCode()
        result = 31 * result + pressedElevation.hashCode()
        result = 31 * result + focusedElevation.hashCode()
        result = 31 * result + hoveredElevation.hashCode()
        result = 31 * result + disabledElevation.hashCode()
        return result
    }
}