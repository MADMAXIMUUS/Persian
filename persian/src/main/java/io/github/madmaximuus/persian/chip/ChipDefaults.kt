package io.github.madmaximuus.persian.chip

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.VectorConverter
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.interaction.FocusInteraction
import androidx.compose.foundation.interaction.HoverInteraction
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.avatarAndImage.ImageColors
import io.github.madmaximuus.persian.avatarAndImage.ImageDefaults
import io.github.madmaximuus.persian.avatarAndImage.ImageSizes
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.animateElevation
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes

/**
 * Contains the default values used by [Chip].
 */
object ChipDefaults {

    /**
     * Creates a [ChipColors] that represents the default container and content colors used in an
     * [Chip].
     *
     * @param containerColor The color of the chip's container.
     * @param labelColor The color of the chip's label text.
     * @param leadingIconContentColor The color of the leading icon content.
     * @param borderColor The color of the chip's border.
     * @param leadingImageColors The colors to be used for images within the chip.
     */
    @Composable
    fun colors(
        containerColor: Color = PersianTheme.colorScheme.surface,
        borderColor: Color = PersianTheme.colorScheme.primary,
        labelColor: Color = PersianTheme.colorScheme.onSurface,
        leadingIconContentColor: Color = PersianTheme.colorScheme.primary,
        leadingImageColors: ImageColors = ImageDefaults.colors()
    ) = ChipColors(
        containerColor = containerColor,
        labelColor = labelColor,
        leadingIconColor = leadingIconContentColor,
        borderColor = borderColor,
        leadingImageColors = leadingImageColors
    )

    /**
     * Creates a [ChipSizes] that represents the default container and content sizes used in an
     * [Chip].
     *
     * @param leadingIconSizes the leading icon sizes.
     * @param labelStyle The text style to be used for the chip's label.
     * @param borderWidth The width of the chip's border.
     * @param shape The shape to be used for the chip.
     * @param leadingImageSizes The sizes to be used for the leading image.
     */
    @Composable
    fun smallSizes(
        height: Dp = 26.dp,
        borderWidth: Dp = 1.dp,
        shape: Shape = PersianTheme.shapes.shape10,
        labelStyle: TextStyle = PersianTheme.typography.labelSmall,
        leadingIconSizes: IconSizes = IconDefaults.size18(),
        leadingImageSizes: ImageSizes = ImageDefaults.size18(),
        contentSpacing: Dp = PersianTheme.spacing.size4,
        contentPadding: PaddingValues = PaddingValues(
            horizontal = PersianTheme.spacing.size12
        )
    )  = ChipSizes(
        height = height,
        borderWidth = borderWidth,
        shape = shape,
        labelStyle = labelStyle,
        leadingIconSizes = leadingIconSizes,
        leadingImageSizes = leadingImageSizes,
        contentPadding = contentPadding,
        contentSpacing = contentSpacing
    )

    /**
     * Creates a [ChipSizes] that represents the default container and content sizes used in an
     * [Chip].
     *
     * @param labelStyle The text style to be used for the chip's label.
     * @param borderWidth The width of the chip's border.
     * @param shape The shape to be used for the chip.
     * @param leadingImageSizes The sizes to be used for the leading image.
     */
    @Composable
    fun mediumSizes(
        height: Dp = 32.dp,
        borderWidth: Dp = 1.dp,
        shape: Shape = PersianTheme.shapes.shape12,
        labelStyle: TextStyle = PersianTheme.typography.labelMedium,
        leadingIconSizes: IconSizes = IconDefaults.size24(),
        leadingImageSizes: ImageSizes = ImageDefaults.size24(),
        contentSpacing: Dp = PersianTheme.spacing.size6,
        contentPadding: PaddingValues = PaddingValues(
            horizontal = PersianTheme.spacing.size14
        )
    ) = ChipSizes(
        height = height,
        borderWidth = borderWidth,
        shape = shape,
        labelStyle = labelStyle,
        leadingIconSizes = leadingIconSizes,
        leadingImageSizes = leadingImageSizes,
        contentPadding = contentPadding,
        contentSpacing = contentSpacing
    )

    /**
     * Creates a [ChipSizes] that represents the default container and content sizes used in an
     * [Chip].
     *
     * @param labelStyle The text style to be used for the chip's label.
     * @param borderWidth The width of the chip's border.
     * @param shape The shape to be used for the chip.
     * @param leadingImageSizes The sizes to be used for the leading image.
     */
    @Composable
    fun largeSizes(
        height: Dp = 40.dp,
        borderWidth: Dp = 1.dp,
        labelStyle: TextStyle = PersianTheme.typography.labelLarge,
        shape: Shape = PersianTheme.shapes.shape14,
        leadingIconSizes: IconSizes = IconDefaults.size32(),
        leadingImageSizes: ImageSizes = ImageDefaults.size32(),
        contentSpacing: Dp = PersianTheme.spacing.size8,
        contentPadding: PaddingValues = PaddingValues(
            horizontal = PersianTheme.spacing.size16
        )
    ) = ChipSizes(
        height = height,
        borderWidth = borderWidth,
        shape = shape,
        labelStyle = labelStyle,
        leadingIconSizes = leadingIconSizes,
        leadingImageSizes = leadingImageSizes,
        contentPadding = contentPadding,
        contentSpacing = contentSpacing
    )

    /**
     * Creates a [ChipElevation] that represents the default elevation used in an [Chip].
     *
     * @param elevation The default elevation of the chip.
     * @param pressedElevation The elevation of the chip when it is pressed.
     * @param focusedElevation The elevation of the chip when it is focused.
     * @param hoveredElevation The elevation of the chip when it is hovered.
     * @param draggedElevation The elevation of the chip when it is dragged.
     */
    @Composable
    fun chipElevation(
        elevation: Dp = PersianTheme.elevation.none,
        pressedElevation: Dp = elevation,
        focusedElevation: Dp = elevation,
        hoveredElevation: Dp = elevation,
        draggedElevation: Dp = PersianTheme.elevation.elevation4,
    ) = ChipElevation(
        elevation = elevation,
        pressedElevation = pressedElevation,
        focusedElevation = focusedElevation,
        hoveredElevation = hoveredElevation,
        draggedElevation = draggedElevation,
    )

}

/**
 * Represents the container and content colors used in a chip in different states.
 *
 * @property containerColor The color of the chip's container when it is enabled.
 * @property labelColor The color of the chip's label text when it is enabled.
 * @property leadingIconColor The color of the leading icon content when it is enabled.
 * @property borderColor The color of the chip's border when it is enabled.
 * @property leadingImageColors The colors to be used for images within the chip.
 * @constructor create an instance with arbitrary colors.
 * - See [ChipDefaults.colors] for the default colors used in a [Chip].
 */
@Immutable
class ChipColors internal constructor(
    internal val containerColor: Color,
    internal val labelColor: Color,
    internal val leadingIconColor: Color,
    internal val borderColor: Color,
    internal val leadingImageColors: ImageColors
) {
    /**
     * Returns a copy of this [ChipColors], optionally overriding some of the values.
     *
     * @param containerColor The color of the chip's container when it is enabled.
     * @param labelColor The color of the chip's label text when it is enabled.
     * @param leadingIconContentColor The color of the leading icon content when it is enabled.
     * @param borderColor The color of the chip's border when it is enabled.
     * @param leadingImageColors The colors to be used for images within the chip.
     */
    fun copy(
        containerColor: Color = this.containerColor,
        labelColor: Color = this.labelColor,
        leadingIconContentColor: Color = this.leadingIconColor,
        borderColor: Color = this.borderColor,
        leadingImageColors: ImageColors = this.leadingImageColors,
    ) = ChipColors(
        containerColor = containerColor,
        labelColor = labelColor,
        leadingIconColor = leadingIconContentColor,
        borderColor = borderColor,
        leadingImageColors = leadingImageColors,
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ChipColors) return false

        if (containerColor != other.containerColor) return false
        if (labelColor != other.labelColor) return false
        if (borderColor != other.borderColor) return false
        if (leadingIconColor != other.leadingIconColor) return false
        return leadingImageColors == other.leadingImageColors
    }

    override fun hashCode(): Int {
        var result = containerColor.hashCode()
        result = 31 * result + labelColor.hashCode()
        result = 31 * result + leadingIconColor.hashCode()
        result = 31 * result + leadingImageColors.hashCode()
        result = 31 * result + borderColor.hashCode()

        return result
    }
}

/**
 * Represents the container and content sizes used in a chip in different states.
 *
 * @param shape The shape of the chip's container.
 * @param height The height of the chip's container.
 * @param labelStyle The style of the chip's label text.
 * @param leadingIconSizes The color of the leading icon content.
 * @param borderWidth The width of the chip's border.
 * @param leadingImageSizes The sized to be used for images within the chip.
 * @param contentPadding The horizontal padding to be used in the chip.
 * @param contentSpacing The spacing between leading content and label within the chip.
 */
@Immutable
class ChipSizes internal constructor(
    internal val height: Dp,
    internal val borderWidth: Dp,
    internal val shape: Shape,
    internal val labelStyle: TextStyle,
    internal val leadingIconSizes: IconSizes,
    internal val leadingImageSizes: ImageSizes,
    internal val contentPadding: PaddingValues,
    internal val contentSpacing: Dp
) {

    /**
     * Returns a copy of this [ChipSizes], optionally overriding some of the values.
     *
     * @param shape The shape of the chip's container.
     * @param height The height of the chip's container.
     * @param labelStyle The style of the chip's label text.
     * @param leadingIconSizes The color of the leading icon content.
     * @param borderWidth The width of the chip's border.
     * @param leadingImageSizes The sized to be used for images within the chip.
     * @param contentPadding The horizontal padding to be used in the chip.
     * @param contentSpacing The spacing between leading content and label within the chip.
     */
    fun copy(
        shape: Shape = this.shape,
        height: Dp = this.height,
        leadingIconSizes: IconSizes = this.leadingIconSizes,
        leadingImageSizes: ImageSizes = this.leadingImageSizes,
        labelStyle: TextStyle = this.labelStyle,
        borderWidth: Dp = this.borderWidth,
        contentPadding: PaddingValues = this.contentPadding,
        contentSpacing: Dp = this.contentSpacing
    ) = ChipSizes(
        shape = shape,
        height = height,
        leadingIconSizes = leadingIconSizes,
        leadingImageSizes = leadingImageSizes,
        labelStyle = labelStyle,
        borderWidth = borderWidth,
        contentPadding = contentPadding,
        contentSpacing = contentSpacing
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ChipSizes) return false

        if (leadingIconSizes != other.leadingIconSizes) return false
        if (labelStyle != other.labelStyle) return false
        if (leadingImageSizes != other.leadingImageSizes) return false
        if (borderWidth != other.borderWidth) return false
        return shape == other.shape
    }

    override fun hashCode(): Int {
        var result = leadingImageSizes.hashCode()
        result = 31 * result + leadingIconSizes.hashCode()
        result = 31 * result + labelStyle.hashCode()
        result = 31 * result + borderWidth.hashCode()
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
 */
@Immutable
class ChipElevation internal constructor(
    internal val elevation: Dp,
    private val pressedElevation: Dp,
    private val focusedElevation: Dp,
    private val hoveredElevation: Dp,
    private val draggedElevation: Dp,
) {

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

        val target = when (interaction) {
            is PressInteraction.Press -> pressedElevation
            is HoverInteraction.Enter -> hoveredElevation
            is FocusInteraction.Focus -> focusedElevation
            is DragInteraction.Start -> draggedElevation
            else -> elevation
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
        return hoveredElevation == other.hoveredElevation
    }

    override fun hashCode(): Int {
        var result = elevation.hashCode()
        result = 31 * result + pressedElevation.hashCode()
        result = 31 * result + focusedElevation.hashCode()
        result = 31 * result + hoveredElevation.hashCode()
        return result
    }
}