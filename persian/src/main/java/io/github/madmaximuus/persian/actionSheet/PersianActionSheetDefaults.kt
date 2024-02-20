package io.github.madmaximuus.persian.actionSheet

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import io.github.madmaximuus.persian.foundation.PersianContentStateDisabled
import io.github.madmaximuus.persian.foundation.elevation
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.iconBox.IconBoxColors
import io.github.madmaximuus.persian.iconBox.PersianIconBoxDefaults

@Immutable
class ActionSheetItemColors(
    private val defaultTextColor: Color,
    private val disabledTextColor: Color,
    private val errorTextColor: Color,
    internal val iconColors: IconBoxColors
) {
    @Stable
    internal fun textColor(
        enabled: Boolean,
        isError: Boolean
    ): Color = when {
        !enabled -> disabledTextColor
        isError -> errorTextColor
        else -> defaultTextColor
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ActionSheetItemColors) return false

        if (defaultTextColor != other.defaultTextColor) return false
        if (errorTextColor != other.errorTextColor) return false
        if (disabledTextColor != other.disabledTextColor) return false
        return iconColors == other.iconColors
    }

    override fun hashCode(): Int {
        var result = defaultTextColor.hashCode()
        result = 31 * result + errorTextColor.hashCode()
        result = 31 * result + disabledTextColor.hashCode()
        result = 31 * result + iconColors.hashCode()
        return result
    }
}

object PersianActionSheetDefaults {

    val shape: Shape @Composable get() = MaterialTheme.shapes.large

    val tonalElevation: Dp @Composable get() = MaterialTheme.elevation.extraSmall

    @Composable
    fun itemColors(
        defaultColor: Color = MaterialTheme.extendedColorScheme.onSurface,
        errorColor: Color = MaterialTheme.extendedColorScheme.error,
        disabledColor: Color = MaterialTheme.extendedColorScheme.onSurface.copy(
            alpha = PersianContentStateDisabled
        ),
        iconColors: IconBoxColors = PersianIconBoxDefaults.colors()
    ): ActionSheetItemColors =
        ActionSheetItemColors(
            defaultTextColor = defaultColor,
            errorTextColor = errorColor,
            disabledTextColor = disabledColor,
            iconColors = iconColors
        )
}