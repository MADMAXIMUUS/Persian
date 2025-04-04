package io.github.madmaximuus.persian.chip.toggleable


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
import androidx.compose.runtime.Stable
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
import io.github.madmaximuus.persian.avatarAndImage.AvatarColors
import io.github.madmaximuus.persian.avatarAndImage.AvatarDefaults
import io.github.madmaximuus.persian.avatarAndImage.AvatarSizes
import io.github.madmaximuus.persian.avatarAndImage.ImageColors
import io.github.madmaximuus.persian.avatarAndImage.ImageDefaults
import io.github.madmaximuus.persian.avatarAndImage.ImageSizes
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.animateElevation
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes

/**
 * Contains the default values used by [ToggleableChip].
 */
object ToggleableChipDefaults {

    /**
     * Creates a [ToggleableChipColors] that represents the default container and content colors used in an
     * [ToggleableChip].
     *
     * @param containerColor The color of the chip's container.
     * @param labelColor The color of the chip's label text.
     * @param leadingIconColor The color of the leading icon.
     * @param trailingIconColor The color of the trailing icon.
     * @param selectedContainerColor The color of the chip's container when it is selected.
     * @param selectedLabelColor The color of the chip's label text when it is selected.
     * @param selectedLeadingIconColor The color of the leading icon when the chip is selected.
     * @param selectedTrailingIconColor The color of the trailing icon when the chip is selected.
     * @param borderColor The color of the chip's border.
     * @param selectedBorderColor The color of the chip's border when it is selected.
     */
    @Composable
    fun chipColors(
        containerColor: Color = Color.Transparent,
        labelColor: Color = PersianTheme.colorScheme.onSurface,
        leadingIconColor: Color = PersianTheme.colorScheme.primary,
        trailingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        selectedContainerColor: Color = PersianTheme.colorScheme.secondaryContainer,
        selectedLabelColor: Color = PersianTheme.colorScheme.onSecondaryContainer,
        selectedLeadingIconColor: Color = PersianTheme.colorScheme.onSecondaryContainer,
        selectedTrailingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        borderColor: Color = PersianTheme.colorScheme.primary,
        selectedBorderColor: Color = Color.Transparent,
        avatarColors: AvatarColors = AvatarDefaults.colors(),
        imageColors: ImageColors = ImageDefaults.colors()
    ) = ToggleableChipColors(
        containerColor = containerColor,
        labelColor = labelColor,
        leadingIconColor = leadingIconColor,
        trailingIconColor = trailingIconColor,
        selectedContainerColor = selectedContainerColor,
        selectedLabelColor = selectedLabelColor,
        selectedLeadingIconColor = selectedLeadingIconColor,
        selectedTrailingIconColor = selectedTrailingIconColor,
        borderColor = borderColor,
        selectedBorderColor = selectedBorderColor,
        avatarColors = avatarColors,
        imageColors = imageColors
    )

    /**
     * Creates a [ToggleableChipSizes] that represents the default container and content sizes used in an
     * [InputShip].
     *
     * @param trailingIconSizes The sizes to be used for the trailing icon.
     * @param leadingIconSizes The sizes to be used for the leading icon.
     * @param labelStyle The text style to be used for the chip's label.
     * @param borderWidth The width of the chip's border.
     * @param selectedBorderWith The width of the chip's border when it is selected.
     * @param shape The shape to be used for the chip.
     */
    @Composable
    fun smallSizes(
        height: Dp = 26.dp,
        borderWidth: Dp = 1.dp,
        selectedBorderWith: Dp = 0.dp,
        shape: Shape = PersianTheme.shapes.shape10,
        labelStyle: TextStyle = PersianTheme.typography.labelSmall,
        leadingIconSizes: IconSizes = IconDefaults.size18(),
        trailingIconSizes: IconSizes = IconDefaults.size18(),
        avatarSizes: AvatarSizes = AvatarDefaults.size18(),
        imageSizes: ImageSizes = ImageDefaults.size18(),
        contentSpacing: Dp = PersianTheme.spacing.size4,
        contentPadding: PaddingValues = PaddingValues(
            horizontal = PersianTheme.spacing.size12
        )
    ) = ToggleableChipSizes(
        shape = shape,
        height = height,

        borderWidth = borderWidth,
        selectedBorderWith = selectedBorderWith,

        labelStyle = labelStyle,

        leadingIconSizes = leadingIconSizes,
        trailingIconSizes = trailingIconSizes,

        avatarSizes = avatarSizes,
        imageSizes = imageSizes,

        contentSpacing = contentSpacing,
        contentPadding = contentPadding
    )

    /**
     * Creates a [ToggleableChipSizes] that represents the default container and content sizes used in an
     * [InputShip].
     *
     * @param trailingIconSizes The sizes to be used for the trailing icon.
     * @param leadingIconSizes The sizes to be used for the leading icon.
     * @param labelStyle The text style to be used for the chip's label.
     * @param borderWidth The width of the chip's border.
     * @param selectedBorderWith The width of the chip's border when it is selected.
     * @param shape The shape to be used for the chip.
     */
    @Composable
    fun mediumSizes(
        height: Dp = 32.dp,
        borderWidth: Dp = 1.dp,
        selectedBorderWith: Dp = 0.dp,
        shape: Shape = PersianTheme.shapes.shape12,
        labelStyle: TextStyle = PersianTheme.typography.labelMedium,
        leadingIconSizes: IconSizes = IconDefaults.size24(),
        trailingIconSizes: IconSizes = IconDefaults.size22(),
        avatarSizes: AvatarSizes = AvatarDefaults.size24(),
        imageSizes: ImageSizes = ImageDefaults.size24(),
        contentSpacing: Dp = PersianTheme.spacing.size6,
        contentPadding: PaddingValues = PaddingValues(
            horizontal = PersianTheme.spacing.size14
        )
    ) = ToggleableChipSizes(
        height = height,
        shape = shape,

        borderWidth = borderWidth,
        selectedBorderWith = selectedBorderWith,

        labelStyle = labelStyle,

        leadingIconSizes = leadingIconSizes,
        trailingIconSizes = trailingIconSizes,

        avatarSizes = avatarSizes,
        imageSizes = imageSizes,

        contentSpacing = contentSpacing,
        contentPadding = contentPadding
    )

    /**
     * Creates a [ToggleableChipSizes] that represents the default container and content sizes used in an
     * [InputShip].
     *
     * @param trailingIconSizes The sizes to be used for the trailing icon.
     * @param leadingIconSizes The sizes to be used for the leading icon.
     * @param labelStyle The text style to be used for the chip's label.
     * @param borderWidth The width of the chip's border.
     * @param selectedBorderWith The width of the chip's border when it is selected.
     * @param shape The shape to be used for the chip.
     */
    @Composable
    fun largeSizes(
        height: Dp = 40.dp,
        borderWidth: Dp = 1.dp,
        selectedBorderWith: Dp = 0.dp,
        shape: Shape = PersianTheme.shapes.shape14,
        labelStyle: TextStyle = PersianTheme.typography.labelLarge,
        leadingIconSizes: IconSizes = IconDefaults.size32(),
        trailingIconSizes: IconSizes = IconDefaults.size24(),
        avatarSizes: AvatarSizes = AvatarDefaults.size32(),
        imageSizes: ImageSizes = ImageDefaults.size32(),
        contentSpacing: Dp = PersianTheme.spacing.size8,
        contentPadding: PaddingValues = PaddingValues(
            horizontal = PersianTheme.spacing.size16
        )
    ) = ToggleableChipSizes(
        height = height,
        shape = shape,

        borderWidth = borderWidth,
        selectedBorderWith = selectedBorderWith,

        labelStyle = labelStyle,

        leadingIconSizes = leadingIconSizes,
        trailingIconSizes = trailingIconSizes,

        avatarSizes = avatarSizes,
        imageSizes = imageSizes,

        contentSpacing = contentSpacing,

        contentPadding = contentPadding
    )

    /**
     * Creates a [ToggleableChipElevation] that represents the default chip elevation used in an
     * [InputShip].
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
    ) = ToggleableChipElevation(
        elevation = elevation,
        pressedElevation = pressedElevation,
        focusedElevation = focusedElevation,
        hoveredElevation = hoveredElevation,
        draggedElevation = draggedElevation,
    )
}

/**
 * Represents the container and content colors used in a selectable chip in different states.
 *
 * @param containerColor The color of the chip's container when it is enabled and not selected.
 * @param labelColor The color of the chip's label text when it is enabled and not selected.
 * @param leadingIconColor The color of the leading icon when it is enabled and not selected.
 * @param trailingIconColor The color of the trailing icon when it is enabled and not selected.
 * @param selectedContainerColor The color of the chip's container when it is selected.
 * @param selectedLabelColor The color of the chip's label text when it is selected.
 * @param selectedLeadingIconColor The color of the leading icon when it is selected.
 * @param selectedTrailingIconColor The color of the trailing icon when it is selected.
 * @param borderColor The color of the chip's border when it is enabled and not selected.
 * @param selectedBorderColor The color of the chip's border when it is selected.
 * @param avatarColors The colors to be used for avatars within the chip.
 * @param imageColors The colors to be used for images within the chip.
 */
@Immutable
class ToggleableChipColors internal constructor(
    private val containerColor: Color,
    private val selectedContainerColor: Color,

    private val borderColor: Color,
    private val selectedBorderColor: Color,

    private val labelColor: Color,
    private val selectedLabelColor: Color,

    private val leadingIconColor: Color,
    private val selectedLeadingIconColor: Color,

    private val trailingIconColor: Color,
    private val selectedTrailingIconColor: Color,

    internal val avatarColors: AvatarColors,
    internal val imageColors: ImageColors,
) {
    /**
     * Returns a copy of this [ToggleableChipColors], optionally overriding some of the values.
     *
     * @param containerColor The color of the chip's container when it is enabled and not selected.
     * @param labelColor The color of the chip's label text when it is enabled and not selected.
     * @param leadingIconColor The color of the leading icon when it is enabled and not selected.
     * @param trailingIconColor The color of the trailing icon when it is enabled and not selected.
     * @param selectedContainerColor The color of the chip's container when it is selected.
     * @param selectedLabelColor The color of the chip's label text when it is selected.
     * @param selectedLeadingIconColor The color of the leading icon when it is selected.
     * @param selectedTrailingIconColor The color of the trailing icon when it is selected.
     * @param borderColor The color of the chip's border when it is enabled and not selected.
     * @param selectedBorderColor The color of the chip's border when it is selected.
     * @param imageColors The colors to be used for images within the chip.
     * @param avatarColors The colors to be used for avatars within the chip.
     */
    fun copy(
        containerColor: Color = this.containerColor,
        selectedContainerColor: Color = this.selectedContainerColor,

        borderColor: Color = this.borderColor,
        selectedBorderColor: Color = this.selectedBorderColor,

        labelColor: Color = this.labelColor,
        selectedLabelColor: Color = this.selectedLabelColor,

        leadingIconColor: Color = this.leadingIconColor,
        selectedLeadingIconColor: Color = this.selectedLeadingIconColor,

        trailingIconColor: Color = this.trailingIconColor,
        selectedTrailingIconColor: Color = this.selectedTrailingIconColor,

        avatarColors: AvatarColors = this.avatarColors,
        imageColors: ImageColors = this.imageColors,
    ) = ToggleableChipColors(
        containerColor = containerColor,
        selectedContainerColor = selectedContainerColor,

        borderColor = borderColor,
        selectedBorderColor = selectedBorderColor,

        labelColor = labelColor,
        selectedLabelColor = selectedLabelColor,

        leadingIconColor = leadingIconColor,
        selectedLeadingIconColor = selectedLeadingIconColor,

        trailingIconColor = trailingIconColor,
        selectedTrailingIconColor = selectedTrailingIconColor,

        avatarColors = avatarColors,
        imageColors = imageColors
    )

    /**
     * Returns the color of the chip's container based on its enabled and selected states.
     *
     * @param selected Whether the chip is selected or not.
     */
    @Composable
    internal fun containerColor(selected: Boolean): Color =
        when {
            !selected -> containerColor
            else -> selectedContainerColor
        }

    /**
     * Returns the color of the chip's label text based on its enabled and selected states.
     *
     * @param selected Whether the chip is selected or not.
     */
    internal fun labelColor(selected: Boolean): Color =
        when {
            !selected -> labelColor
            else -> selectedLabelColor
        }

    /**
     * Returns the color of the leading icon based on its enabled and selected states.
     *
     * @param selected Whether the chip is selected or not.
     */
    internal fun leadingIconContentColor(selected: Boolean): Color =
        when {
            !selected -> leadingIconColor
            else -> selectedLeadingIconColor
        }

    /**
     * Returns the color of the trailing icon based on its enabled and selected states.
     *
     * @param selected Whether the chip is selected or not.
     */
    internal fun trailingIconContentColor(selected: Boolean): Color =
        when {
            !selected -> trailingIconColor
            else -> selectedTrailingIconColor
        }

    /**
     * Returns the color of the chip's border based on its enabled and selected states.
     *
     * @param selected Whether the chip is selected or not.
     */
    internal fun borderColor(selected: Boolean): Color =
        when {
            selected -> selectedBorderColor
            else -> borderColor
        }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ToggleableChipColors) return false

        if (containerColor != other.containerColor) return false
        if (selectedContainerColor != other.selectedContainerColor) return false

        if (borderColor != other.borderColor) return false
        if (selectedBorderColor != other.selectedBorderColor)

            if (labelColor != other.labelColor) return false
        if (selectedLabelColor != other.selectedLabelColor) return false

        if (leadingIconColor != other.leadingIconColor) return false
        if (selectedLeadingIconColor != other.selectedLeadingIconColor) return false

        if (trailingIconColor != other.trailingIconColor) return false
        if (selectedTrailingIconColor != other.selectedTrailingIconColor) return false

        if (avatarColors != other.avatarColors) return false
        return imageColors == other.imageColors
    }

    override fun hashCode(): Int {
        var result = containerColor.hashCode()
        result = 31 * result + selectedContainerColor.hashCode()

        result = 31 * result + borderColor.hashCode()
        result = 31 * result + selectedBorderColor.hashCode()

        result = 31 * result + labelColor.hashCode()
        result = 31 * result + selectedLabelColor.hashCode()

        result = 31 * result + leadingIconColor.hashCode()
        result = 31 * result + selectedLeadingIconColor.hashCode()

        result = 31 * result + trailingIconColor.hashCode()
        result = 31 * result + selectedTrailingIconColor.hashCode()

        result = 31 * result + avatarColors.hashCode()
        result = 31 * result + imageColors.hashCode()

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
 * @param avatarSizes The sizes to be used for avatars within the chip.
 * @param imageSizes The sizes to be used for images within the chip.
 */
@Immutable
class ToggleableChipSizes internal constructor(
    internal val height: Dp,
    internal val shape: Shape,

    private val borderWidth: Dp,
    private val selectedBorderWith: Dp,

    internal val labelStyle: TextStyle,

    internal val leadingIconSizes: IconSizes,
    internal val trailingIconSizes: IconSizes,

    internal val avatarSizes: AvatarSizes,
    internal val imageSizes: ImageSizes,

    internal val contentPadding: PaddingValues,
    internal val contentSpacing: Dp
) {
    /**
     * Returns the width of the chip's border based on selected states.
     *
     * @param selected Whether the chip is selected or not.
     */
    @Stable
    internal fun borderWidth(selected: Boolean): Dp =
        if (selected) selectedBorderWith else borderWidth

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ToggleableChipSizes) return false

        if (height != other.height) return false
        if (shape != other.shape) return false

        if (borderWidth != other.borderWidth) return false
        if (selectedBorderWith != other.selectedBorderWith) return false

        if (labelStyle != other.labelStyle) return false

        if (leadingIconSizes != other.leadingIconSizes) return false
        if (trailingIconSizes != other.trailingIconSizes) return false

        if (contentPadding != other.contentPadding) return false
        if (contentSpacing != other.contentSpacing) return false

        if (avatarSizes != other.avatarSizes) return false
        return imageSizes == other.imageSizes
    }

    override fun hashCode(): Int {
        var result = height.hashCode()
        result = 31 * result + shape.hashCode()

        result = 31 * result + borderWidth.hashCode()
        result = 31 * result + selectedBorderWith.hashCode()

        result = 31 * result + labelStyle.hashCode()

        result = 31 * result + leadingIconSizes.hashCode()
        result = 31 * result + trailingIconSizes.hashCode()

        result = 31 * result + contentPadding.hashCode()
        result = 31 * result + contentSpacing.hashCode()

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
 */
@Immutable
class ToggleableChipElevation internal constructor(
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
        if (other == null || other !is ToggleableChipElevation) return false

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