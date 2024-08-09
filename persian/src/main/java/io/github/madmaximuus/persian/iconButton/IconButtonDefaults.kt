package io.github.madmaximuus.persian.iconButton

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state12
import io.github.madmaximuus.persian.foundation.state38
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes

object IconButtonDefaults {

    @Composable
    fun smallSizes(
        size: Dp = 36.dp,
        iconSizes: IconSizes = IconDefaults.size20(),
        shape: Shape = PersianTheme.shapes.shape12,
    ): IconButtonSizes =
        IconButtonSizes(
            size = size,
            iconSizes = iconSizes,
            shape = shape,
        )

    @Composable
    fun mediumSizes(
        size: Dp = 44.dp,
        iconSizes: IconSizes = IconDefaults.size24(),
        shape: Shape = PersianTheme.shapes.shape14,
    ): IconButtonSizes =
        IconButtonSizes(
            size = size,
            iconSizes = iconSizes,
            shape = shape,
        )

    @Composable
    fun largeSizes(
        size: Dp = 52.dp,
        iconSizes: IconSizes = IconDefaults.size28(),
        shape: Shape = PersianTheme.shapes.shape16
    ): IconButtonSizes =
        IconButtonSizes(
            size = size,
            iconSizes = iconSizes,
            shape = shape,
        )

    @Composable
    fun primaryIconButtonColors(
        containerColor: Color = PersianTheme.colorScheme.primary,
        contentColor: Color = PersianTheme.colorScheme.onPrimary,
        disabledContainerColor: Color = PersianTheme.colorScheme.onSurface.state12,
        disabledContentColor: Color = PersianTheme.colorScheme.onSurface.state38,
    ): IconButtonColors = IconButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    fun secondaryIconButtonColors(
        containerColor: Color = PersianTheme.colorScheme.primaryContainer,
        contentColor: Color = PersianTheme.colorScheme.onPrimaryContainer,
        disabledContainerColor: Color = PersianTheme.colorScheme.onSurface.state12,
        disabledContentColor: Color = PersianTheme.colorScheme.onSurface.state38,
    ): IconButtonColors = IconButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    fun tertiaryIconButtonColors(
        containerColor: Color = Color.Transparent,
        contentColor: Color = PersianTheme.colorScheme.primary,
        disabledContainerColor: Color = Color.Transparent,
        disabledContentColor: Color = PersianTheme.colorScheme.onSurface.state38,
    ): IconButtonColors = IconButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    fun outlinedIconButtonColors(
        containerColor: Color = Color.Transparent,
        contentColor: Color = PersianTheme.colorScheme.primary,
        disabledContainerColor: Color = Color.Transparent,
        disabledContentColor: Color = PersianTheme.colorScheme.onSurface.state38
    ): IconButtonColors = IconButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    fun primaryToggleIconButtonColors(
        containerColor: Color = PersianTheme.colorScheme.surfaceContainerHighest,
        contentColor: Color = PersianTheme.colorScheme.primary,
        disabledContainerColor: Color = PersianTheme.colorScheme.onSurface.state12,
        disabledContentColor: Color = PersianTheme.colorScheme.onSurface.state38,
        checkedContainerColor: Color = PersianTheme.colorScheme.primary,
        checkedContentColor: Color = PersianTheme.colorScheme.onPrimary,
    ): ToggleIconButtonColors = ToggleIconButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor,
        checkedContentColor = checkedContentColor,
        checkedContainerColor = checkedContainerColor
    )

    @Composable
    fun secondaryToggleIconButtonColors(
        containerColor: Color = PersianTheme.colorScheme.surfaceContainerHighest,
        contentColor: Color = PersianTheme.colorScheme.onSurface,
        disabledContainerColor: Color = PersianTheme.colorScheme.onSurface.state12,
        disabledContentColor: Color = PersianTheme.colorScheme.onSurface.state38,
        checkedContainerColor: Color = PersianTheme.colorScheme.primaryContainer,
        checkedContentColor: Color = PersianTheme.colorScheme.onPrimaryContainer,
    ): ToggleIconButtonColors = ToggleIconButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor,
        checkedContentColor = checkedContentColor,
        checkedContainerColor = checkedContainerColor
    )

    @Composable
    fun tertiaryToggleIconButtonColors(
        containerColor: Color = Color.Transparent,
        contentColor: Color = PersianTheme.colorScheme.primary,
        disabledContainerColor: Color = PersianTheme.colorScheme.onSurface.state12,
        disabledContentColor: Color = PersianTheme.colorScheme.onSurface.state38,
        checkedContainerColor: Color = Color.Transparent,
        checkedContentColor: Color = PersianTheme.colorScheme.primary,
    ): ToggleIconButtonColors = ToggleIconButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor,
        checkedContentColor = checkedContentColor,
        checkedContainerColor = checkedContainerColor
    )

    @Composable
    fun outlinedToggleIconButtonColors(
        containerColor: Color = Color.Transparent,
        contentColor: Color = PersianTheme.colorScheme.primary,
        disabledContainerColor: Color = PersianTheme.colorScheme.onSurface.state12,
        disabledContentColor: Color = PersianTheme.colorScheme.onSurface.state38,
        checkedContainerColor: Color = PersianTheme.colorScheme.primary,
        checkedContentColor: Color = PersianTheme.colorScheme.onPrimary,
    ): ToggleIconButtonColors = ToggleIconButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor,
        checkedContentColor = checkedContentColor,
        checkedContainerColor = checkedContainerColor
    )
}

@Immutable
class IconButtonSizes internal constructor(
    internal val size: Dp,
    internal val iconSizes: IconSizes,
    internal val shape: Shape,
)

@Immutable
class IconButtonColors internal constructor(
    private val containerColor: Color,
    private val contentColor: Color,
    private val disabledContainerColor: Color,
    private val disabledContentColor: Color,
) {
    @Stable
    internal fun containerColor(enabled: Boolean): Color {
        return if (enabled) containerColor else disabledContainerColor
    }

    @Stable
    internal fun contentColor(enabled: Boolean): Color {
        return if (enabled) contentColor else disabledContentColor
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is IconButtonColors) return false

        if (containerColor != other.containerColor) return false
        if (contentColor != other.contentColor) return false
        if (disabledContainerColor != other.disabledContainerColor) return false
        return disabledContentColor == other.disabledContentColor
    }

    override fun hashCode(): Int {
        var result = containerColor.hashCode()
        result = 31 * result + contentColor.hashCode()
        result = 31 * result + disabledContainerColor.hashCode()
        result = 31 * result + disabledContentColor.hashCode()

        return result
    }
}

@Immutable
class ToggleIconButtonColors internal constructor(
    private val containerColor: Color,
    private val contentColor: Color,
    private val disabledContainerColor: Color,
    private val disabledContentColor: Color,
    private val checkedContainerColor: Color,
    private val checkedContentColor: Color,
) {

    @Stable
    internal fun containerColor(enabled: Boolean, checked: Boolean): Color {

        return when {
            !enabled -> disabledContainerColor
            !checked -> containerColor
            else -> checkedContainerColor
        }
    }

    @Stable
    internal fun contentColor(enabled: Boolean, checked: Boolean): Color {
        return when {
            !enabled -> disabledContentColor
            !checked -> contentColor
            else -> checkedContentColor
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ToggleIconButtonColors) return false

        if (containerColor != other.containerColor) return false
        if (contentColor != other.contentColor) return false
        if (disabledContainerColor != other.disabledContainerColor) return false
        if (disabledContentColor != other.disabledContentColor) return false
        if (checkedContainerColor != other.checkedContainerColor) return false
        return checkedContentColor == other.checkedContentColor
    }

    override fun hashCode(): Int {
        var result = containerColor.hashCode()
        result = 31 * result + contentColor.hashCode()
        result = 31 * result + disabledContainerColor.hashCode()
        result = 31 * result + disabledContentColor.hashCode()
        result = 31 * result + checkedContainerColor.hashCode()
        result = 31 * result + checkedContentColor.hashCode()

        return result
    }
}

