package io.github.madmaximuus.persian.counter

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.extendedColorScheme

@Immutable
data class CounterColors(
    val backgroundColor: Color,
    val textColor: Color
)

object PersianCounterColors {

    @Composable
    fun default(
        backgroundColor: Color = MaterialTheme.extendedColorScheme.error,
        textColor: Color = MaterialTheme.extendedColorScheme.onError
    ) = remember(backgroundColor, textColor) {
        CounterColors(
            backgroundColor = backgroundColor,
            textColor = textColor
        )
    }

    @Composable
    fun tonal(
        backgroundColor: Color = MaterialTheme.extendedColorScheme.primaryContainer,
        textColor: Color = MaterialTheme.extendedColorScheme.onPrimaryContainer
    ) = remember(backgroundColor, textColor) {
        CounterColors(
            backgroundColor = backgroundColor,
            textColor = textColor
        )
    }

    @Composable
    fun transparent(
        backgroundColor: Color = Color.Transparent,
        textColor: Color = MaterialTheme.extendedColorScheme.onSurface
    ) = remember(backgroundColor, textColor) {
        CounterColors(
            backgroundColor = backgroundColor,
            textColor = textColor
        )
    }

}