package io.github.madmaximuus.persian.snackbar

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.foundation.extendedColorScheme

object PersianSnackbarDefaults {

    @Composable
    fun colors(
        backgroundColor: Color = MaterialTheme.extendedColorScheme.surface5,
        textColor: Color = MaterialTheme.extendedColorScheme.onSurface
    ) = remember(backgroundColor, textColor) {
        SnackbarColors(
            backgroundColor = backgroundColor,
            textColor = textColor
        )
    }

    @Composable
    fun sizes(
        cornerRadius: Shape = MaterialTheme.shapes.large,
        textStyle: TextStyle = MaterialTheme.typography.bodyMedium
    ) = remember(cornerRadius, textStyle) {
        SnackbarSizes(
            cornerRadius = cornerRadius,
            textStyle = textStyle
        )
    }
}

@Immutable
data class SnackbarColors(
    val backgroundColor: Color,
    val textColor: Color
)

@Immutable
data class SnackbarSizes(
    val cornerRadius: Shape,
    val textStyle: TextStyle,
)
