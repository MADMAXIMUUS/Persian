package io.github.madmaximuus.persian.foundation.ripple

import androidx.compose.material.ripple.RippleAlpha
import io.github.madmaximuus.persian.foundation.PersianState08
import io.github.madmaximuus.persian.foundation.PersianState12
import io.github.madmaximuus.persian.foundation.PersianState16


/**
 * Default values used by [ripple].
 */
object RippleDefaults {
    /**
     * Represents the default [RippleAlpha] that will be used for a ripple to indicate different
     * states.
     */
    val RippleAlpha: RippleAlpha =
        RippleAlpha(
            hoveredAlpha = PersianState08,
            focusedAlpha = PersianState12,
            pressedAlpha = PersianState16,
            draggedAlpha = PersianState16,
        )
}