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
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import io.github.madmaximuus.persian.avatarsAndImages.AvatarColors
import io.github.madmaximuus.persian.avatarsAndImages.AvatarSizes
import io.github.madmaximuus.persian.avatarsAndImages.ImageColors
import io.github.madmaximuus.persian.avatarsAndImages.ImageSizes
import io.github.madmaximuus.persian.foundation.animateElevation
import io.github.madmaximuus.persian.icon.IconSizes
import io.github.madmaximuus.persian.surface.Surface

/**
 * Base composable function to implement chip
 *
 * @param selected Whether the chip is selected or not.
 * @param modifier The modifier to be applied to the chip.
 * @param onClick The callback to be invoked when the chip is clicked.
 * @param enabled Whether the chip is enabled or disabled.
 * @param label The text to be displayed on the chip.
 * @param leading The optional leading content of the chip.
 * @param trailing The optional trailing content of the chip.
 * @param colors The colors to be used for the chip.
 * @param elevation The elevation to be used for the chip.
 * @param sizes The sizes to be used for the chip.
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this chip. You can use this to change the chip's appearance or
 *   preview the chip in different states. Note that if `null` is provided, interactions will still
 *   happen internally.
 */
@Composable
internal fun BaseSelectableChip(
    selected: Boolean,
    modifier: Modifier,
    onClick: () -> Unit,
    enabled: Boolean,
    label: String,
    leading: (@Composable () -> Unit)?,
    trailing: (@Composable () -> Unit)?,
    colors: SelectableChipColors,
    elevation: SelectableChipElevation,
    sizes: SelectableChipSizes,
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
            labelColor = colors.labelColor(enabled, selected),
            leading = leading,
            trailing = trailing
        )
    }
}

/**
 * Represents the container and content colors used in a selectable chip in different states.
 *
 * @param containerColor The color of the chip's container when it is enabled and not selected.
 * @param labelColor The color of the chip's label text when it is enabled and not selected.
 * @param leadingIconColor The color of the leading icon when it is enabled and not selected.
 * @param trailingIconColor The color of the trailing icon when it is enabled and not selected.
 * @param disabledContainerColor The color of the chip's container when it is disabled and not selected.
 * @param disabledLabelColor The color of the chip's label text when it is disabled and not selected.
 * @param disabledLeadingIconColor The color of the leading icon when it is disabled and not selected.
 * @param disabledTrailingIconColor The color of the trailing icon when it is disabled and not selected.
 * @param selectedContainerColor The color of the chip's container when it is selected.
 * @param disabledSelectedContainerColor The color of the chip's container when it is disabled and selected.
 * @param selectedLabelColor The color of the chip's label text when it is selected.
 * @param selectedLeadingIconColor The color of the leading icon when it is selected.
 * @param selectedTrailingIconColor The color of the trailing icon when it is selected.
 * @param borderColor The color of the chip's border when it is enabled and not selected.
 * @param selectedBorderColor The color of the chip's border when it is selected.
 * @param disabledBorderColor The color of the chip's border when it is disabled and not selected.
 * @param disabledSelectedBorderColor The color of the chip's border when it is disabled and selected.
 * @param avatarColors The colors to be used for avatars within the chip.
 * @param imageColors The colors to be used for images within the chip.
 */
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
    private val disabledSelectedBorderColor: Color,

    internal val avatarColors: AvatarColors,
    internal val imageColors: ImageColors
) {
    /**
     * Returns a copy of this [SelectableChipColors], optionally overriding some of the values.
     *
     * @param containerColor The color of the chip's container when it is enabled and not selected.
     * @param labelColor The color of the chip's label text when it is enabled and not selected.
     * @param leadingIconColor The color of the leading icon when it is enabled and not selected.
     * @param trailingIconColor The color of the trailing icon when it is enabled and not selected.
     * @param disabledContainerColor The color of the chip's container when it is disabled and not selected.
     * @param disabledLabelColor The color of the chip's label text when it is disabled and not selected.
     * @param disabledLeadingIconColor The color of the leading icon when it is disabled and not selected.
     * @param disabledTrailingIconColor The color of the trailing icon when it is disabled and not selected.
     * @param selectedContainerColor The color of the chip's container when it is selected.
     * @param disabledSelectedContainerColor The color of the chip's container when it is disabled and selected.
     * @param selectedLabelColor The color of the chip's label text when it is selected.
     * @param selectedLeadingIconColor The color of the leading icon when it is selected.
     * @param selectedTrailingIconColor The color of the trailing icon when it is selected.
     * @param borderColor The color of the chip's border when it is enabled and not selected.
     * @param selectedBorderColor The color of the chip's border when it is selected.
     * @param disabledBorderColor The color of the chip's border when it is disabled and not selected.
     * @param disabledSelectedBorderColor The color of the chip's border when it is disabled and selected.
     * @param imageColors The colors to be used for images within the chip.
     * @param avatarColors The colors to be used for avatars within the chip.
     */
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
        disabledSelectedBorderColor: Color = this.disabledSelectedBorderColor,
        avatarColors: AvatarColors = this.avatarColors,
        imageColors: ImageColors = this.imageColors
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
        disabledSelectedBorderColor.takeOrElse { this.disabledSelectedBorderColor },
        avatarColors = avatarColors,
        imageColors = imageColors
    )

    /**
     * Returns the color of the chip's container based on its enabled and selected states.
     *
     * @param enabled Whether the chip is enabled or disabled.
     * @param selected Whether the chip is selected or not.
     */
    @Composable
    internal fun containerColor(enabled: Boolean, selected: Boolean): State<Color> {
        val target = when {
            !enabled -> if (selected) disabledSelectedContainerColor else disabledContainerColor
            !selected -> containerColor
            else -> selectedContainerColor
        }
        return rememberUpdatedState(target)
    }

    /**
     * Returns the color of the chip's label text based on its enabled and selected states.
     *
     * @param enabled Whether the chip is enabled or disabled.
     * @param selected Whether the chip is selected or not.
     */
    internal fun labelColor(enabled: Boolean, selected: Boolean): Color {
        return when {
            !enabled -> disabledLabelColor
            !selected -> labelColor
            else -> selectedLabelColor
        }
    }

    /**
     * Returns the color of the leading icon based on its enabled and selected states.
     *
     * @param enabled Whether the chip is enabled or disabled.
     * @param selected Whether the chip is selected or not.
     */
    internal fun leadingIconContentColor(enabled: Boolean, selected: Boolean): Color {
        return when {
            !enabled -> disabledLeadingIconColor
            !selected -> leadingIconColor
            else -> selectedLeadingIconColor
        }
    }

    /**
     * Returns the color of the trailing icon based on its enabled and selected states.
     *
     * @param enabled Whether the chip is enabled or disabled.
     * @param selected Whether the chip is selected or not.
     */
    internal fun trailingIconContentColor(enabled: Boolean, selected: Boolean): Color {
        return when {
            !enabled -> disabledTrailingIconColor
            !selected -> trailingIconColor
            else -> selectedTrailingIconColor
        }
    }

    /**
     * Returns the color of the chip's border based on its enabled and selected states.
     *
     * @param enabled Whether the chip is enabled or disabled.
     * @param selected Whether the chip is selected or not.
     * @return The color of the chip's border.
     */
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

/**
 * Represents the container and content sizes used in a selectable chip in different states.
 *
 * @param trailingIconSizes The sizes to be used for the trailing icon.
 * @param leadingIconSizes The sizes to be used for the leading icon.
 * @param labelStyle The text style to be used for the chip's label.
 * @param borderWidth The width of the chip's border when it is enabled and not selected.
 * @param selectedBorderWith The width of the chip's border when it is selected.
 * @param shape The shape to be used for the chip.
 * @param disabledBorderWith The width of the chip's border when it is disabled and not selected.
 * @param selectedDisabledBorderWith The width of the chip's border when it is disabled and selected.
 * @param avatarSizes The sizes to be used for avatars within the chip.
 * @param imageSizes The sizes to be used for images within the chip.
 */
@Immutable
class SelectableChipSizes internal constructor(
    internal val trailingIconSizes: IconSizes,
    internal val leadingIconSizes: IconSizes,
    internal val labelStyle: TextStyle,
    private val borderWidth: Dp,
    private val selectedBorderWith: Dp,
    internal val shape: Shape,
    private val disabledBorderWith: Dp,
    private val selectedDisabledBorderWith: Dp,

    internal val avatarSizes: AvatarSizes,
    internal val imageSizes: ImageSizes
) {
    /**
     * Returns the width of the chip's border based on its enabled and selected states.
     *
     * @param enabled Whether the chip is enabled or disabled.
     * @param selected Whether the chip is selected or not.
     */
    @Stable
    internal fun borderWidth(enabled: Boolean, selected: Boolean): Dp =
        if (enabled) {
            if (selected) selectedBorderWith else borderWidth
        } else
            if (selected) selectedDisabledBorderWith else disabledBorderWith

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is SelectableChipSizes) return false

        if (trailingIconSizes != other.trailingIconSizes) return false
        if (leadingIconSizes != other.leadingIconSizes) return false
        if (labelStyle != other.labelStyle) return false
        if (borderWidth != other.borderWidth) return false
        if (shape != other.shape) return false
        if (avatarSizes != other.avatarSizes) return false
        if (imageSizes != other.imageSizes) return false
        return disabledBorderWith == other.disabledBorderWith
    }

    override fun hashCode(): Int {
        var result = trailingIconSizes.hashCode()
        result = 31 * result + leadingIconSizes.hashCode()
        result = 31 * result + labelStyle.hashCode()
        result = 31 * result + borderWidth.hashCode()
        result = 31 * result + disabledBorderWith.hashCode()
        result = 31 * result + shape.hashCode()
        result = 31 * result + avatarSizes.hashCode()
        result = 31 * result + imageSizes.hashCode()

        return result
    }
}

/**
 * Represents the container and content sizes used in a selectable chip in different states.
 *
 * @param elevation The default elevation of the chip.
 * @param pressedElevation The elevation of the chip when it is pressed.
 * @param focusedElevation The elevation of the chip when it is focused.
 * @param hoveredElevation The elevation of the chip when it is hovered.
 * @param draggedElevation The elevation of the chip when it is dragged.
 * @param disabledElevation The elevation of the chip when it is disabled.
 */
@Immutable
class SelectableChipElevation internal constructor(
    internal val elevation: Dp,
    private val pressedElevation: Dp,
    private val focusedElevation: Dp,
    private val hoveredElevation: Dp,
    private val draggedElevation: Dp,
    private val disabledElevation: Dp
) {

    /**
     * Returns the tonal elevation of the chip based on its enabled state.
     *
     * @param enabled Whether the chip is enabled or disabled.
     */
    @Stable
    internal fun tonalElevation(enabled: Boolean): Dp {
        return if (enabled) elevation else disabledElevation
    }

    /**
     * Returns the shadow elevation of the chip based on its enabled state and interaction source.
     *
     * @param enabled Whether the chip is enabled or disabled.
     * @param interactionSource The interaction source to be used for the chip.
     */
    @Composable
    internal fun shadowElevation(
        enabled: Boolean,
        interactionSource: InteractionSource
    ): State<Dp> {
        return animateElevation(enabled = enabled, interactionSource = interactionSource)
    }

    /**
     * Animates the elevation of the chip based on its enabled state and interaction source.
     *
     * @param enabled Whether the chip is enabled or disabled.
     * @param interactionSource The interaction source to be used for the chip.
     */
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