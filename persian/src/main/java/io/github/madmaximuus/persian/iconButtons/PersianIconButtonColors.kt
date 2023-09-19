package io.github.madmaximuus.persian.iconButtons

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.PersianComponentStyle
import io.github.madmaximuus.persian.foundation.PersianContentStateDisabled
import io.github.madmaximuus.persian.foundation.PersianStatesDisabled
import io.github.madmaximuus.persian.foundation.extendedColorScheme

data class IconButtonColors(
    val containerColor: Color,
    val tonalContainerColor: Color,
    val contentColor: Color,
    val tonalContentColor: Color,
    val disabledContainerColor: Color,
    val disabledContentColor: Color
)

object PersianIconButtonColors {

    @Composable
    fun primary(
        style: PersianComponentStyle,
        containerColor: Color = MaterialTheme.extendedColorScheme.primary,
        tonalContainerColor: Color = MaterialTheme.extendedColorScheme.primaryContainer,
        contentColor: Color = MaterialTheme.extendedColorScheme.onPrimary,
        tonalContentColor: Color = MaterialTheme.extendedColorScheme.onPrimaryContainer,
        disabledContainerColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(PersianStatesDisabled),
        disabledContentColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(PersianContentStateDisabled)
    ): IconButtonColors = remember(
        containerColor,
        tonalContainerColor,
        contentColor,
        tonalContentColor,
        disabledContainerColor,
        disabledContentColor
    ) {
        when (style) {
            PersianComponentStyle.FILL -> IconButtonColors(
                containerColor = containerColor,
                tonalContainerColor = tonalContainerColor,
                contentColor = contentColor,
                tonalContentColor = tonalContentColor,
                disabledContainerColor = disabledContainerColor,
                disabledContentColor = disabledContentColor
            )

            PersianComponentStyle.OUTLINED -> IconButtonColors(
                containerColor = Color.Transparent,
                tonalContainerColor = tonalContainerColor,
                contentColor = containerColor,
                tonalContentColor = tonalContentColor,
                disabledContainerColor = Color.Transparent,
                disabledContentColor = disabledContainerColor
            )

            PersianComponentStyle.STANDARD -> IconButtonColors(
                containerColor = Color.Transparent,
                tonalContainerColor = tonalContainerColor,
                contentColor = containerColor,
                tonalContentColor = tonalContentColor,
                disabledContainerColor = Color.Transparent,
                disabledContentColor = disabledContainerColor
            )

            PersianComponentStyle.TONAL -> IconButtonColors(
                containerColor = containerColor,
                tonalContainerColor = tonalContainerColor,
                contentColor = contentColor,
                tonalContentColor = tonalContentColor,
                disabledContainerColor = disabledContainerColor,
                disabledContentColor = disabledContentColor
            )
        }
    }
}