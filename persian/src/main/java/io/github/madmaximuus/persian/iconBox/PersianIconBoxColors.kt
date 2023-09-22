package io.github.madmaximuus.persian.iconBox

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.PersianContentStateDisabled
import io.github.madmaximuus.persian.foundation.extendedColorScheme

@Immutable
class IconBoxColors internal constructor(
    private val defaultColor: Color,
    private val disabledColor: Color,
    private val errorColor: Color
) {
    @Composable
    internal fun iconColor(
        enabled: Boolean,
        isError: Boolean
    ): State<Color> {
        val targetValue = when {
            !enabled -> disabledColor
            isError -> errorColor
            else -> defaultColor
        }
        return rememberUpdatedState(targetValue)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is IconBoxColors) return false

        if (defaultColor != other.defaultColor) return false
        if (errorColor != other.errorColor) return false
        if (disabledColor != other.disabledColor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = defaultColor.hashCode()
        result = 31 * result + errorColor.hashCode()
        result = 31 * result + disabledColor.hashCode()
        return result
    }
}

object PersianIconBoxColors {

    @Composable
    fun primary(
        defaultColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        errorColor: Color = MaterialTheme.extendedColorScheme.error,
        disabledColor: Color = MaterialTheme.extendedColorScheme.onSurface.copy(
            alpha = PersianContentStateDisabled
        )
    ): IconBoxColors =
        IconBoxColors(
            defaultColor = defaultColor,
            errorColor = errorColor,
            disabledColor = disabledColor
        )

}