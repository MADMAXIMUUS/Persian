package io.github.madmaximuus.persian.forms

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.extendedColorScheme

data class CaptionColors(
    val textColor: Color,
    val errorColor: Color,
    val counterColor: Color
)

object PersianCaptionColors {

    @Composable
    fun primary(
        textColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        errorColor: Color = MaterialTheme.extendedColorScheme.error,
        counterColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
    ) = remember(
        textColor,
        errorColor,
        counterColor
    ) {
        CaptionColors(
            textColor = textColor,
            errorColor = errorColor,
            counterColor = counterColor
        )
    }

}