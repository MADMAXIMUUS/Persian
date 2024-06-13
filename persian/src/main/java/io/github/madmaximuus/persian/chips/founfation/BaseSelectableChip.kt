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
import androidx.compose.runtime.rememberUpdatedState
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
internal fun BaseSelectableChip(
    selected: Boolean,
    modifier: Modifier,
    onClick: () -> Unit,
    enabled: Boolean,
    label: String,
    leadingIcon: Painter?,
    avatar: String?,
    image: String?,
    trailingIcon: Painter?,
    onTrailingClick: (() -> Unit)?,
    colors: SelectableChipColors,
    elevation: SelectableChipElevation,
    sizes: SelectableChipSizes,
    paddingValues: PaddingValues,
    interactionSource: MutableInteractionSource
) {
    Surface(
        selected = selected,
        onClick = onClick,
        modifier = modifier.semantics { role = Role.Checkbox },
        enabled = enabled,
        shape = sizes.shape,
        color = colors.containerColor(enabled, selected).value,
        border = BorderStroke(
            sizes.borderWidth(enabled, selected),
            colors.borderColor(enabled, selected)
        ),
        tonalElevation = elevation.tonalElevation(enabled),
        shadowElevation = elevation.shadowElevation(
            enabled = enabled,
            interactionSource = interactionSource
        ).value,
        interactionSource = interactionSource,
    ) {
        ChipContent(
            label = label,
            labelTextStyle = sizes.labelStyle,
            leadingIcon = leadingIcon,
            avatar = avatar,
            image = image,
            labelColor = colors.labelColor(enabled, selected),
            trailingIcon = trailingIcon,
            onTrailingClick = onTrailingClick,
            leadingIconColor = colors.leadingIconContentColor(enabled, selected),
            trailingIconColor = colors.trailingIconContentColor(enabled, selected),
            paddingValues = paddingValues,
            selected = selected,
            leadingIconSize = sizes.leadingIconSize,
            trailingIconSize = sizes.trailingIconSize,
            enabled = enabled
        )
    }
}

@Immutable
class SelectableChipColors internal constructor(
    private val containerColor: Color,
    private val labelColor: Color,
    private val leadingIconColor: Color,
    private val trailingIconColor: Color,
    private val disabledContainerColor: Color,
    private val disabledLabelColor: Color,
    private val disabledLeadingIconColor: Color,
    private val disabledTrailingIconColor: Color,
    private val selectedContainerColor: Color,
    private val disabledSelectedContainerColor: Color,
    private val selectedLabelColor: Color,
    private val selectedLeadingIconColor: Color,
    private val selectedTrailingIconColor: Color,
    private val borderColor: Color,
    private val selectedBorderColor: Color,
    private val disabledBorderColor: Color,
    private val disabledSelectedBorderColor: Color
) {
    fun copy(
        containerColor: Color = this.containerColor,
        labelColor: Color = this.labelColor,
        leadingIconColor: Color = this.leadingIconColor,
        trailingIconColor: Color = this.trailingIconColor,
        disabledContainerColor: Color = this.disabledContainerColor,
        disabledLabelColor: Color = this.disabledLabelColor,
        disabledLeadingIconColor: Color = this.disabledLeadingIconColor,
        disabledTrailingIconColor: Color = this.disabledTrailingIconColor,
        selectedContainerColor: Color = this.selectedContainerColor,
        disabledSelectedContainerColor: Color = this.disabledSelectedContainerColor,
        selectedLabelColor: Color = this.selectedLabelColor,
        selectedLeadingIconColor: Color = this.selectedLeadingIconColor,
        selectedTrailingIconColor: Color = this.selectedTrailingIconColor,
        borderColor: Color = this.borderColor,
        selectedBorderColor: Color = this.selectedBorderColor,
        disabledBorderColor: Color = this.disabledBorderColor,
        disabledSelectedBorderColor: Color = this.disabledSelectedBorderColor
    ) = SelectableChipColors(
        containerColor.takeOrElse { this.containerColor },
        labelColor.takeOrElse { this.labelColor },
        leadingIconColor.takeOrElse { this.leadingIconColor },
        trailingIconColor.takeOrElse { this.trailingIconColor },
        disabledContainerColor.takeOrElse { this.disabledContainerColor },
        disabledLabelColor.takeOrElse { this.disabledLabelColor },
        disabledLeadingIconColor.takeOrElse { this.disabledLeadingIconColor },
        disabledTrailingIconColor.takeOrElse { this.disabledTrailingIconColor },
        selectedContainerColor.takeOrElse { this.selectedContainerColor },
        disabledSelectedContainerColor.takeOrElse { this.disabledSelectedContainerColor },
        selectedLabelColor.takeOrElse { this.selectedLabelColor },
        selectedLeadingIconColor.takeOrElse { this.selectedLeadingIconColor },
        selectedTrailingIconColor.takeOrElse { this.selectedTrailingIconColor },
        borderColor.takeOrElse { this.borderColor },
        selectedBorderColor.takeOrElse { this.selectedBorderColor },
        disabledBorderColor.takeOrElse { this.disabledBorderColor },
        disabledSelectedBorderColor.takeOrElse { this.disabledSelectedBorderColor }
    )


    @Composable
    internal fun containerColor(enabled: Boolean, selected: Boolean): State<Color> {
        val target = when {
            !enabled -> if (selected) disabledSelectedContainerColor else disabledContainerColor
            !selected -> containerColor
            else -> selectedContainerColor
        }
        return rememberUpdatedState(target)
    }


    internal fun labelColor(enabled: Boolean, selected: Boolean): Color {
        return when {
            !enabled -> disabledLabelColor
            !selected -> labelColor
            else -> selectedLabelColor
        }
    }

    internal fun leadingIconContentColor(enabled: Boolean, selected: Boolean): Color {
        return when {
            !enabled -> disabledLeadingIconColor
            !selected -> leadingIconColor
            else -> selectedLeadingIconColor
        }
    }

    internal fun trailingIconContentColor(enabled: Boolean, selected: Boolean): Color {
        return when {
            !enabled -> disabledTrailingIconColor
            !selected -> trailingIconColor
            else -> selectedTrailingIconColor
        }
    }

    internal fun borderColor(enabled: Boolean, selected: Boolean): Color {
        return when {
            !enabled && !selected -> disabledBorderColor
            !enabled -> disabledSelectedBorderColor
            selected -> selectedBorderColor
            else -> borderColor
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is SelectableChipColors) return false

        if (containerColor != other.containerColor) return false
        if (labelColor != other.labelColor) return false
        if (leadingIconColor != other.leadingIconColor) return false
        if (trailingIconColor != other.trailingIconColor) return false
        if (disabledContainerColor != other.disabledContainerColor) return false
        if (disabledLabelColor != other.disabledLabelColor) return false
        if (disabledLeadingIconColor != other.disabledLeadingIconColor) return false
        if (disabledTrailingIconColor != other.disabledTrailingIconColor) return false
        if (selectedContainerColor != other.selectedContainerColor) return false
        if (disabledSelectedContainerColor != other.disabledSelectedContainerColor) return false
        if (selectedLabelColor != other.selectedLabelColor) return false
        if (selectedLeadingIconColor != other.selectedLeadingIconColor) return false
        return selectedTrailingIconColor == other.selectedTrailingIconColor
    }

    override fun hashCode(): Int {
        var result = containerColor.hashCode()
        result = 31 * result + labelColor.hashCode()
        result = 31 * result + leadingIconColor.hashCode()
        result = 31 * result + trailingIconColor.hashCode()
        result = 31 * result + disabledContainerColor.hashCode()
        result = 31 * result + disabledLabelColor.hashCode()
        result = 31 * result + disabledLeadingIconColor.hashCode()
        result = 31 * result + disabledTrailingIconColor.hashCode()
        result = 31 * result + selectedContainerColor.hashCode()
        result = 31 * result + disabledSelectedContainerColor.hashCode()
        result = 31 * result + selectedLabelColor.hashCode()
        result = 31 * result + selectedLeadingIconColor.hashCode()
        result = 31 * result + selectedTrailingIconColor.hashCode()

        return result
    }
}

@Immutable
class SelectableChipSizes internal constructor(
    internal val trailingIconSize: IconBoxSize,
    internal val leadingIconSize: IconBoxSize,
    internal val labelStyle: TextStyle,
    private val borderWidth: Dp,
    private val selectedBorderWith: Dp,
    internal val shape: Shape,
    private val disabledBorderWith: Dp,
    private val selectedDisabledBorderWith: Dp
) {

    @Stable
    internal fun borderWidth(enabled: Boolean, selected: Boolean): Dp =
        if (enabled) {
            if (selected) selectedBorderWith else borderWidth
        } else
            if (selected) selectedDisabledBorderWith else disabledBorderWith

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
class SelectableChipElevation internal constructor(
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
                    // No transition when moving to a disabled state
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
        if (other == null || other !is SelectableChipElevation) return false

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