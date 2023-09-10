package ru.rabbit.persian.progressBars

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import ru.rabbit.persian.foundation.extendedColorScheme

@Immutable
data class ProgressBarColors(
    val backgroundColor: Color,
    val progressColor: Color
)

object PersianProgressBarColors {

    @Composable
    fun primary(
        backgroundColor: Color = MaterialTheme.extendedColorScheme.surfaceVariant,
        progressColor: Color = MaterialTheme.extendedColorScheme.primary
    ) = remember(backgroundColor, progressColor) {
        ProgressBarColors(
            backgroundColor = backgroundColor,
            progressColor = progressColor
        )
    }

}