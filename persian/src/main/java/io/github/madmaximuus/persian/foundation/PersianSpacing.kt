package io.github.madmaximuus.persian.foundation

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class PersianSpacing(
    val extraExtraSmall: Dp = 2.dp,
    val extraSmall: Dp = 4.dp,
    val small: Dp = 8.dp,
    val medium: Dp = 12.dp,
    val large: Dp = 16.dp,
    val extraLarge: Dp = 20.dp,
    val extraExtraLarge: Dp = 24.dp
)

val LocalPersianSpacing = staticCompositionLocalOf { PersianSpacing() }

val MaterialTheme.spacing: PersianSpacing
    @Composable
    @ReadOnlyComposable
    get() = LocalPersianSpacing.current