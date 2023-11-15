package io.github.madmaximuus.persian.iconBox

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Deprecated("Replaced with PersianIconBoxDefaults")
object PersianIconBoxSize {
    @Composable
    fun extraExtraLarge(
        width: Dp = 48.dp
    ) = remember(width) {
        IconBoxSize(width)
    }

    @Composable
    fun extraLarge(
        width: Dp = 32.dp
    ) = remember(width) {
        IconBoxSize(width)
    }

    @Composable
    fun large(
        width: Dp = 24.dp
    ) = remember(width) {
        IconBoxSize(width)
    }

    @Composable
    fun medium(
        width: Dp = 20.dp
    ) = remember(width) {
        IconBoxSize(width)
    }

    @Composable
    fun small(
        width: Dp = 18.dp
    ) = remember(width) {
        IconBoxSize(width)
    }
}