package io.github.madmaximuus.persian.iconBox

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.PersianContentStateDisabled
import io.github.madmaximuus.persian.foundation.extendedColorScheme

@Deprecated("Replace with PersianIconBoxDefaults")
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