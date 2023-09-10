package ru.rabbit.persian.foundation

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class PersianElevation(
    val none: Dp = 0.dp,
    val extraSmall: Dp = 1.dp,
    val small: Dp = 3.dp,
    val medium: Dp = 6.dp,
    val large: Dp = 8.dp,
    val extraLarge: Dp = 12.dp
)

val LocalPersianElevation = staticCompositionLocalOf { PersianElevation() }

val MaterialTheme.elevation: PersianElevation
    @Composable
    @ReadOnlyComposable
    get() = LocalPersianElevation.current