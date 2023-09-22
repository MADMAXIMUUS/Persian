package io.github.madmaximuus.persian.actionSheet

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.PersianContentStateDisabled
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.iconBox.IconBoxColors
import io.github.madmaximuus.persian.iconBox.PersianIconBoxColors

@Immutable
class ActionItemColors(
    private val defaultTextColor: Color,
    private val disabledTextColor: Color,
    private val errorTextColor: Color,
    val iconColors: IconBoxColors
) {
    @Composable
    internal fun textColor(
        enabled: Boolean,
        isError: Boolean
    ): State<Color> {
        val targetValue = when {
            !enabled -> disabledTextColor
            isError -> errorTextColor
            else -> defaultTextColor
        }
        return rememberUpdatedState(targetValue)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ActionItemColors) return false

        if (defaultTextColor != other.defaultTextColor) return false
        if (errorTextColor != other.errorTextColor) return false
        if (disabledTextColor != other.disabledTextColor) return false
        if (iconColors != other.iconColors) return false
        return true
    }

    override fun hashCode(): Int {
        var result = defaultTextColor.hashCode()
        result = 31 * result + errorTextColor.hashCode()
        result = 31 * result + disabledTextColor.hashCode()
        result = 31 * result + iconColors.hashCode()
        return result
    }
}

object PersianActionItemColors {

    @Composable
    fun primary(
        defaultColor: Color = MaterialTheme.extendedColorScheme.onSurface,
        errorColor: Color = MaterialTheme.extendedColorScheme.error,
        disabledColor: Color = MaterialTheme.extendedColorScheme.onSurface.copy(
            alpha = PersianContentStateDisabled
        ),
        iconColors: IconBoxColors = PersianIconBoxColors.primary()
    ): ActionItemColors =
        ActionItemColors(
            defaultTextColor = defaultColor,
            errorTextColor = errorColor,
            disabledTextColor = disabledColor,
            iconColors = iconColors
        )
}