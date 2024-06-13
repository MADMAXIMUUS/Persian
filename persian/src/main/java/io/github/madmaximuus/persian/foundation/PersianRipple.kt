package io.github.madmaximuus.persian.foundation

import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable

@Immutable
internal object RippleTheme : androidx.compose.material.ripple.RippleTheme {
    @Composable
    override fun defaultColor() = LocalContentColor.current

    @Composable
    override fun rippleAlpha() = DefaultRippleAlpha
}

private val DefaultRippleAlpha = RippleAlpha(
    hoveredAlpha = PersianState08,
    focusedAlpha = PersianState12,
    pressedAlpha = PersianState16,
    draggedAlpha = PersianState16,
)