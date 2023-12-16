package io.github.madmaximuus.persian.pageIndicator

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.PersianContentStateDisabled
import io.github.madmaximuus.persian.foundation.extendedColorScheme

object PersianPageIndicatorDefaults {

    @Composable
    fun indicatorColor(
        defaultIndicatorColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(PersianContentStateDisabled),
        selectedIndicatorColor: Color = MaterialTheme.extendedColorScheme.onSurface,
    ): PageIndicatorColors =
        PageIndicatorColors(
            defaultIndicatorColor = defaultIndicatorColor,
            selectedIndicatorColor = selectedIndicatorColor
        )
}

@Immutable
class PageIndicatorColors internal constructor(
    private val defaultIndicatorColor: Color,
    private val selectedIndicatorColor: Color,
) {

    @Composable
    fun indicatorColor(
        selected: Boolean
    ): State<Color> {
        val target = when {
            selected -> selectedIndicatorColor
            else -> defaultIndicatorColor
        }

        return rememberUpdatedState(newValue = target)
    }
}