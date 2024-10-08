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
import io.github.madmaximuus.persian.avatarsAndImages.ImageColors
import io.github.madmaximuus.persian.avatarsAndImages.ImageSizes
import io.github.madmaximuus.persian.chips.assist.AssistChip
import io.github.madmaximuus.persian.chips.assist.AssistChipDefaults
import io.github.madmaximuus.persian.chips.suggestion.SuggestionChip
import io.github.madmaximuus.persian.chips.suggestion.SuggestionChipDefaults
import io.github.madmaximuus.persian.foundation.animateElevation
import io.github.madmaximuus.persian.icon.IconSizes
import io.github.madmaximuus.persian.surface.Surface

/**
 * Base composable function to implement chip
 *
 * @param modifier The modifier to be applied to the chip.
 * @param onClick The callback to be invoked when the chip is clicked.
 * @param enabled Whether the chip is enabled or disabled.
 * @param label The text to be displayed on the chip.
 * @param leading The optional leading content of the chip.
 * @param trailing The optional trailing content of the chip.
 * @param colors The colors to be used for the chip.
 * @param sizes The sizes to be used for the chip.
 * @param elevation The elevation to be used for the chip.
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this chip. You can use this to change the chip's appearance or
 *   preview the chip in different states. Note that if `null` is provided, interactions will still
 *   happen internally.
 */
@Composable
internal fun BaseChip(
    modifier: Modifier,
    onClick: () -> Unit,
    enabled: Boolean,
    label: String,
    leading: (@Composable () -> Unit)?,
    trailing: (@Composable () -> Unit)?,
    colors: ChipColors,
    sizes: ChipSizes,
    elevation: ChipElevation,
    interactionSource: MutableInteractionSource,
) {
    Surface(
        onClick = onClick,
        modifier = modifier.semantics { role = Role.Button },
        enabled = enabled,
        shape = sizes.shape,
        color = colors.containerColor(enabled),
        border = BorderStroke(
            sizes.borderWidth(enabled),
            colors.borderColor(enabled)
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
            leading = leading,
            trailing = trailing,
            labelColor = colors.labelColor(enabled),
        )
    }
}

/**
 * Represents the container and content colors used in a chip in different states.
 *
 * @property containerColor The color of the chip's container when it is enabled.
 * @property disabledContainerColor The color of the chip's container when it is disabled.
 * @property labelColor The color of the chip's label text when it is enabled.
 * @property disabledLabelColor The color of the chip's label text when it is disabled.
 * @property leadingIconContentColor The color of the leading icon content when it is enabled.
 * @property disabledLeadingIconContentColor The color of the leading icon content when it is disabled.
 * @property borderColor The color of the chip's border when it is enabled.
 * @property disabledBorderColor The color of the chip's border when it is disabled.
 * @property avatarColors The colors to be used for avatars within the chip.
 * @property imageColors The colors to be used for images within the chip.
 * @constructor create an instance with arbitrary colors.
 * - See [AssistChipDefaults.chipColors] for the default colors used in a [AssistChip].
 * - See [SuggestionChipDefaults.chipColors] for the default colors used in a [SuggestionChip].
 */
@Immutable
class ChipColors internal constructor(
    private val containerColor: Color,
    private val disabledContainerColor: Color,

    private val labelColor: Color,
    private val disabledLabelColor: Color,

    private val leadingIconContentColor: Color,
    private val disabledLeadingIconContentColor: Color,

    private val borderColor: Color,
    private val disabledBorderColor: Color,

    internal val avatarColors: AvatarColors,
    internal val imageColors: ImageColors
) {
    /**
     * Returns a copy of this [ChipColors], optionally overriding some of the values.
     *
     * @param containerColor The color of the chip's container when it is enabled.
     * @param labelColor The color of the chip's label text when it is enabled.
     * @param leadingIconContentColor The color of the leading icon content when it is enabled.
     * @param borderColor The color of the chip's border when it is enabled.
     * @param disabledContainerColor The color of the chip's container when it is disabled.
     * @param disabledLabelColor The color of the chip's label text when it is disabled.
     * @param disabledLeadingIconContentColor The color of the leading icon content when it is disabled.
     * @param disabledBorderColor The color of the chip's border when it is disabled.
     * @param imageColors The colors to be used for images within the chip.
     * @param avatarColors The colors to be used for avatars within the chip.
     */
    fun copy(
        containerColor: Color = this.containerColor,
        labelColor: Color = this.labelColor,
        leadingIconContentColor: Color = this.leadingIconContentColor,
        borderColor: Color = this.borderColor,
        disabledContainerColor: Color = this.disabledContainerColor,
        disabledLabelColor: Color = this.disabledLabelColor,
        disabledLeadingIconContentColor: Color = this.disabledLeadingIconContentColor,
        disabledBorderColor: Color = this.disabledBorderColor,
        imageColors: ImageColors,
        avatarColors: AvatarColors,
    ) = ChipColors(
        containerColor.takeOrElse { this.containerColor },
        labelColor.takeOrElse { this.labelColor },
        leadingIconContentColor.takeOrElse { this.leadingIconContentColor },
        borderColor.takeOrElse { this.borderColor },
        disabledContainerColor.takeOrElse { this.disabledContainerColor },
        disabledLabelColor.takeOrElse { this.disabledLabelColor },
        disabledLeadingIconContentColor.takeOrElse { this.disabledLeadingIconContentColor },
        disabledBorderColor.takeOrElse { this.disabledBorderColor },
        imageColors = imageColors,
        avatarColors = avatarColors
    )

    /**
     * Returns the color of the chip's container based on its enabled state.
     *
     * @param enabled Whether the chip is enabled or disabled.
     */
    @Stable
    internal fun containerColor(enabled: Boolean): Color =
        if (enabled) containerColor else disabledContainerColor

    /**
     * Returns the color of the chip's label text based on its enabled state.
     *
     * @param enabled Whether the chip is enabled or disabled.
     */
    @Stable
    internal fun labelColor(enabled: Boolean): Color =
        if (enabled) labelColor else disabledLabelColor

    /**
     * Returns the color of the leading icon content based on its enabled state.
     *
     * @param enabled Whether the chip is enabled or disabled.
     */
    @Stable
    internal fun leadingIconContentColor(enabled: Boolean): Color =
        if (enabled) leadingIconContentColor else disabledLeadingIconContentColor

    /**
     * Returns the color of the chip's border based on its enabled state.
     *
     * @param enabled Whether the chip is enabled or disabled.
     */
    @Stable
    internal fun borderColor(enabled: Boolean): Color =
        if (enabled) borderColor else disabledBorderColor

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ChipColors) return false

        if (containerColor != other.containerColor) return false
        if (labelColor != other.labelColor) return false
        if (leadingIconContentColor != other.leadingIconContentColor) return false
        if (disabledContainerColor != other.disabledContainerColor) return false
        if (disabledLabelColor != other.disabledLabelColor) return false
        if (disabledLeadingIconContentColor != other.disabledLeadingIconContentColor) return false
        if (imageColors != other.imageColors) return false
        return avatarColors == other.avatarColors
    }

    override fun hashCode(): Int {
        var result = containerColor.hashCode()
        result = 31 * result + labelColor.hashCode()
        result = 31 * result + leadingIconContentColor.hashCode()
        result = 31 * result + disabledContainerColor.hashCode()
        result = 31 * result + disabledLabelColor.hashCode()
        result = 31 * result + disabledLeadingIconContentColor.hashCode()
        result = 31 * result + imageColors.hashCode()
        result = 31 * result + avatarColors.hashCode()

        return result
    }
}

/**
 * Represents the container and content sizes used in a chip in different states.
 *
 * @property shape The shape to be used for the chip.
 * @property trailingIconSizes The sizes to be used for the trailing icon.
 * @property leadingIconSizes The sizes to be used for the leading icon.
 * @property leadingImageSizes The sizes to be used for the leading image.
 * @property labelStyle The text style to be used for the chip's label.
 * @property borderWidth The width of the chip's border when it is enabled.
 * @property disabledBorderWith The width of the chip's border when it is disabled.
 */
@Immutable
class ChipSizes internal constructor(
    internal val shape: Shape,
    internal val trailingIconSizes: IconSizes,
    internal val leadingIconSizes: IconSizes,
    internal val leadingImageSizes: ImageSizes,
    internal val labelStyle: TextStyle,
    internal val borderWidth: Dp,
    internal val disabledBorderWith: Dp,
) {

    /**
     * Returns the width of the chip's border based on its enabled state.
     *
     * @param enabled Whether the chip is enabled or disabled.
     * @return The width of the chip's border.
     */
    @Stable
    internal fun borderWidth(enabled: Boolean): Dp =
        if (enabled) borderWidth else disabledBorderWith

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ChipSizes) return false

        if (trailingIconSizes != other.trailingIconSizes) return false
        if (leadingIconSizes != other.leadingIconSizes) return false
        if (labelStyle != other.labelStyle) return false
        if (borderWidth != other.borderWidth) return false
        if (shape != other.shape) return false
        return disabledBorderWith == other.disabledBorderWith
    }

    override fun hashCode(): Int {
        var result = trailingIconSizes.hashCode()
        result = 31 * result + leadingIconSizes.hashCode()
        result = 31 * result + labelStyle.hashCode()
        result = 31 * result + borderWidth.hashCode()
        result = 31 * result + disabledBorderWith.hashCode()
        result = 31 * result + shape.hashCode()

        return result
    }
}

/**
 * Represents the container and content elevations used in a chip in different states.
 *
 * @property elevation The default elevation of the chip.
 * @property pressedElevation The elevation of the chip when it is pressed.
 * @property focusedElevation The elevation of the chip when it is focused.
 * @property hoveredElevation The elevation of the chip when it is hovered.
 * @property draggedElevation The elevation of the chip when it is dragged.
 * @property disabledElevation The elevation of the chip when it is disabled.
 */
@Immutable
class ChipElevation internal constructor(
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
     * @return A [State] object representing the current elevation of the chip.
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