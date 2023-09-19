package io.github.madmaximuus.persian.snackbar

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.elevation
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.surfaceColorAtElevation

@Immutable
data class SnackbarColors(
    val backgroundColor: Color,
    val textColor: Color
)

object PersianSnackbarColors {
    @Composable
    fun primary(
        backgroundColor: Color = MaterialTheme.extendedColorScheme
            .surfaceColorAtElevation(MaterialTheme.elevation.extraLarge),
        textColor: Color = MaterialTheme.extendedColorScheme.onSurface
    ) = remember(backgroundColor, textColor) {
        SnackbarColors(
            backgroundColor = backgroundColor,
            textColor = textColor
        )
    }
}