package io.github.madmaximuus.persian.iconButtons

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianContentStateDisabled
import io.github.madmaximuus.persian.foundation.PersianStatesDisabled
import io.github.madmaximuus.persian.foundation.elevation
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.surfaceColorAtElevation
import io.github.madmaximuus.persian.iconBox.IconBoxSize
import io.github.madmaximuus.persian.iconBox.PersianIconBoxDefaults

object PersianIconButtonDefaults {

    @Composable
    fun smallSizes(
        size: Dp = 36.dp,
        iconSize: IconBoxSize = PersianIconBoxDefaults.size20(),
        shape: Shape = MaterialTheme.shapes.medium,
    ): IconButtonSizes = remember(
        size,
        iconSize,
        shape,
    ) {
        IconButtonSizes(
            size = size,
            iconSize = iconSize,
            shape = shape,
        )
    }

    @Composable
    fun mediumSizes(
        size: Dp = 44.dp,
        iconSize: IconBoxSize = PersianIconBoxDefaults.size24(),
        shape: Shape = MaterialTheme.shapes.large,
    ): IconButtonSizes = remember(
        size,
        iconSize,
        shape,
    ) {
        IconButtonSizes(
            size = size,
            iconSize = iconSize,
            shape = shape,
        )
    }

    @Composable
    fun largeSizes(
        size: Dp = 52.dp,
        iconSize: IconBoxSize = PersianIconBoxDefaults.size28(),
        shape: Shape = MaterialTheme.shapes.large
    ): IconButtonSizes = remember(
        size,
        iconSize,
        shape,
    ) {
        IconButtonSizes(
            size = size,
            iconSize = iconSize,
            shape = shape,
        )
    }

    @Composable
    fun primaryIconButtonColors(
        containerColor: Color = MaterialTheme.extendedColorScheme.primary,
        contentColor: Color = MaterialTheme.extendedColorScheme.onPrimary,
        disabledContainerColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(PersianStatesDisabled),
        disabledContentColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(PersianContentStateDisabled)
    ): IconButtonColors = IconButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    fun secondaryIconButtonColors(
        containerColor: Color = MaterialTheme.extendedColorScheme.primaryContainer,
        contentColor: Color = MaterialTheme.extendedColorScheme.onPrimaryContainer,
        disabledContainerColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(PersianStatesDisabled),
        disabledContentColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(PersianContentStateDisabled)
    ): IconButtonColors = IconButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    fun tertiaryIconButtonColors(
        containerColor: Color = Color.Transparent,
        contentColor: Color = MaterialTheme.extendedColorScheme.primary,
        disabledContainerColor: Color = Color.Transparent,
        disabledContentColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(PersianContentStateDisabled)
    ): IconButtonColors = IconButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    fun outlinedIconButtonColors(
        containerColor: Color = Color.Transparent,
        contentColor: Color = MaterialTheme.extendedColorScheme.primary,
        disabledContainerColor: Color = Color.Transparent,
        disabledContentColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(PersianContentStateDisabled)
    ): IconButtonColors = IconButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    fun primaryToggleIconButtonColors(
        containerColor: Color = MaterialTheme.extendedColorScheme.surfaceVariant,
        contentColor: Color = MaterialTheme.extendedColorScheme.primary,
        disabledContainerColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(PersianStatesDisabled),
        disabledContentColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(PersianContentStateDisabled),
        checkedContainerColor: Color = MaterialTheme.extendedColorScheme.primary,
        checkedContentColor: Color = MaterialTheme.extendedColorScheme.onPrimary,
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
        containerColor: Color = MaterialTheme.extendedColorScheme.surfaceColorAtElevation(
            MaterialTheme.elevation.extraLarge
        ),
        contentColor: Color = MaterialTheme.extendedColorScheme.onSurface,
        disabledContainerColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(PersianStatesDisabled),
        disabledContentColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(PersianContentStateDisabled),
        checkedContainerColor: Color = MaterialTheme.extendedColorScheme.primaryContainer,
        checkedContentColor: Color = MaterialTheme.extendedColorScheme.onPrimaryContainer,
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
        contentColor: Color = MaterialTheme.extendedColorScheme.primary,
        disabledContainerColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(PersianStatesDisabled),
        disabledContentColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(PersianContentStateDisabled),
        checkedContainerColor: Color = Color.Transparent,
        checkedContentColor: Color = MaterialTheme.extendedColorScheme.primary,
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
        contentColor: Color = MaterialTheme.extendedColorScheme.primary,
        disabledContainerColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(PersianStatesDisabled),
        disabledContentColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(PersianContentStateDisabled),
        checkedContainerColor: Color = MaterialTheme.extendedColorScheme.primary,
        checkedContentColor: Color = MaterialTheme.extendedColorScheme.onPrimary,
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
    internal val iconSize: IconBoxSize,
    internal val shape: Shape,
)

@Immutable
class IconButtonColors internal constructor(
    private val containerColor: Color,
    private val contentColor: Color,
    private val disabledContainerColor: Color,
    private val disabledContentColor: Color,
) {
    @Composable
    internal fun containerColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(if (enabled) containerColor else disabledContainerColor)
    }

    @Composable
    internal fun contentColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(if (enabled) contentColor else disabledContentColor)
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

    @Composable
    internal fun containerColor(enabled: Boolean, checked: Boolean): State<Color> {
        val target = when {
            !enabled -> disabledContainerColor
            !checked -> containerColor
            else -> checkedContainerColor
        }
        return rememberUpdatedState(target)
    }

    @Composable
    internal fun contentColor(enabled: Boolean, checked: Boolean): State<Color> {
        val target = when {
            !enabled -> disabledContentColor
            !checked -> contentColor
            else -> checkedContentColor
        }
        return rememberUpdatedState(target)
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

