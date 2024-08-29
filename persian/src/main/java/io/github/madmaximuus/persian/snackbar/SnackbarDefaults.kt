package io.github.madmaximuus.persian.snackbar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.foundation.PersianTheme

object SnackbarDefaults {

    @Composable
    fun colors(
        backgroundColor: Color = PersianTheme.colorScheme.surfaceContainerLow,
        textColor: Color = PersianTheme.colorScheme.onSurface
    ) = remember(backgroundColor, textColor) {
        SnackbarColors(
            backgroundColor = backgroundColor,
            textColor = textColor
        )
    }

    @Composable
    fun sizes(
        cornerRadius: Shape = PersianTheme.shapes.shape16,
        textStyle: TextStyle = PersianTheme.typography.bodyMedium
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
