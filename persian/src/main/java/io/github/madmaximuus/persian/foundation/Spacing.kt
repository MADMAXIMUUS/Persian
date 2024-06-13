package io.github.madmaximuus.persian.foundation

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

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

val LocalSpacing = staticCompositionLocalOf { Spacing() }