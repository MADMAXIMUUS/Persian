package io.github.madmaximuus.persian.pageIndicator

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state38

/**
 * Contains all default values used by page indicator
 */
object PageIndicatorDefaults {

    /**
     * Creates a [PageIndicatorColors] instance with the specified colors for the default and selected states.
     *
     * This function allows you to customize the colors used for the page indicators. If no colors are provided,
     * it uses default colors from the [PersianTheme].
     *
     * @param defaultIndicatorColor The color used for the default (unselected) state of the indicator.
     * @param selectedIndicatorColor The color used for the selected state of the indicator.
     */
    @Composable
    fun indicatorColor(
        defaultIndicatorColor: Color = PersianTheme.colorScheme.onSurface.state38,
        selectedIndicatorColor: Color = PersianTheme.colorScheme.onSurface,
    ) = PageIndicatorColors(
        defaultIndicatorColor = defaultIndicatorColor,
        selectedIndicatorColor = selectedIndicatorColor
    )
}

/**
 * An immutable class representing the colors used for page indicators.
 *
 * This class provides the colors for the default and selected states of the page indicators.
 *
 * @property defaultIndicatorColor The color used for the default (unselected) state of the indicator.
 * @property selectedIndicatorColor The color used for the selected state of the indicator.
 */
@Immutable
class PageIndicatorColors internal constructor(
    private val defaultIndicatorColor: Color,
    private val selectedIndicatorColor: Color,
) {

    /**
     * Returns the color for the indicator based on whether it is selected or not.
     *
     * @param selected A boolean indicating whether the indicator is selected.
     */
    @Stable
    fun indicatorColor(
        selected: Boolean
    ): Color {
        val target = when {
            selected -> selectedIndicatorColor
            else -> defaultIndicatorColor
        }

        return target
    }
}