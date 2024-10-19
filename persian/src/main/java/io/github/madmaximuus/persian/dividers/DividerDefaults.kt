package io.github.madmaximuus.persian.dividers

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme

/**
 * Contains all default values used by divider.
 */
object DividerDefaults {

    /**
     * A composable function that provides default sizes for a divider.
     *
     * @param inset The inset value for the divider, specified in Dp.
     * @param strokeThickness The thickness of the divider stroke, specified in Dp.
     */
    @Composable
    fun sizes(
        inset: Dp = PersianTheme.spacing.size16,
        strokeThickness: Dp = 1.dp
    ): DividerSizes =
        DividerSizes(
            inset = inset,
            strokeThickness = strokeThickness
        )

}

/**
 * A data class that holds the sizes for a divider.
 *
 * @property inset The inset value for the divider, specified in Dp.
 * @property strokeThickness The thickness of the divider stroke, specified in Dp.
 */
@Immutable
data class DividerSizes(
    val inset: Dp,
    val strokeThickness: Dp
)