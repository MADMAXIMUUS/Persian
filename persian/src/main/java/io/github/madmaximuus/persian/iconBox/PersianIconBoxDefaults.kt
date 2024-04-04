package io.github.madmaximuus.persian.iconBox

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

object PersianIconBoxDefaults {
    @Composable
    fun size48(
        width: Dp = 48.dp,
        padding: Dp = 0.dp
    ) = remember(width, padding) {
        IconBoxSize(width, padding)
    }

    @Composable
    fun size40(
        width: Dp = 40.dp,
        padding: Dp = 0.dp
    ) = remember(width, padding) {
        IconBoxSize(width, padding)
    }

    @Composable
    fun size32(
        width: Dp = 32.dp,
        padding: Dp = 0.dp
    ) = remember(width, padding) {
        IconBoxSize(width, padding)
    }

    @Composable
    fun size28(
        width: Dp = 28.dp,
        padding: Dp = 0.dp
    ) = remember(width, padding) {
        IconBoxSize(width, padding)
    }

    @Composable
    fun size24(
        width: Dp = 24.dp,
        padding: Dp = 0.dp
    ) = remember(width, padding) {
        IconBoxSize(width, padding)
    }

    @Composable
    fun size20(
        width: Dp = 20.dp,
        padding: Dp = 0.dp
    ) = remember(width, padding) {
        IconBoxSize(width, padding)
    }

    @Composable
    fun size18(
        width: Dp = 18.dp,
        padding: Dp = 0.dp
    ) = remember(width, padding) {
        IconBoxSize(width, padding)
    }

    @Composable
    fun size16(
        width: Dp = 16.dp,
        padding: Dp = 0.dp
    ) = remember(width, padding) {
        IconBoxSize(width, padding)
    }

    @Composable
    fun size12(
        width: Dp = 12.dp,
        padding: Dp = 0.dp
    ) = remember(width, padding) {
        IconBoxSize(width, padding)
    }
}

data class IconBoxSize(
    val width: Dp,
    val padding: Dp
)