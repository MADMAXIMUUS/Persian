package io.github.madmaximuus.persian.foundation

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * An immutable data class representing predefined spacing values in Density-independent Pixels (dp).
 *
 * This class provides a set of commonly used spacing values that can be used throughout the application
 * to maintain consistent spacing and padding.
 *
 * @property size2 A spacing value of 2 dp.
 * @property size4 A spacing value of 4 dp.
 * @property size6 A spacing value of 6 dp.
 * @property size8 A spacing value of 8 dp.
 * @property size10 A spacing value of 10 dp.
 * @property size12 A spacing value of 12 dp.
 * @property size14 A spacing value of 14 dp.
 * @property size16 A spacing value of 16 dp.
 * @property size18 A spacing value of 18 dp.
 * @property size20 A spacing value of 20 dp.
 * @property size22 A spacing value of 22 dp.
 * @property size24 A spacing value of 24 dp.
 */
@Immutable
data class Spacing(
    val size2: Dp = 2.dp,
    val size4: Dp = 4.dp,
    val size6: Dp = 6.dp,
    val size8: Dp = 8.dp,
    val size10: Dp = 10.dp,
    val size12: Dp = 12.dp,
    val size14: Dp = 14.dp,
    val size16: Dp = 16.dp,
    val size18: Dp = 18.dp,
    val size20: Dp = 20.dp,
    val size22: Dp = 22.dp,
    val size24: Dp = 24.dp
)

/**
 * A static composition local that provides a default [Spacing] instance.
 *
 * This can be used to access the predefined spacing values throughout the composition hierarchy.
 */
val LocalSpacing = staticCompositionLocalOf { Spacing() }