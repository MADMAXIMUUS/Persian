package ru.rabbit.persian.snackbar

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle

@Immutable
data class SnackbarSizes(
    val cornerRadius: Shape,
    val textStyle: TextStyle,
)

object PersianSnackbarSizes {

    @Composable
    fun large(
        cornerRadius: Shape = MaterialTheme.shapes.large,
        textStyle: TextStyle = MaterialTheme.typography.bodyMedium
    ) = remember(cornerRadius, textStyle) {
        SnackbarSizes(
            cornerRadius = cornerRadius,
            textStyle = textStyle
        )
    }
}