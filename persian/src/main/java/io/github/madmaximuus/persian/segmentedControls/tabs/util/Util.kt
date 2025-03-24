package io.github.madmaximuus.persian.segmentedControls.tabs.util

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.ui.unit.Dp

/**
 * Internal interface for holding tab positions.
 *
 * This interface defines a method for setting the positions of tabs.
 */
internal interface TabPositionsHolder {

    /**
     * Sets the positions of the tabs.
     *
     * @param positions The list of tab positions to be set.
     */
    fun setTabPositions(positions: List<TabPosition>)
}

/** [AnimationSpec] used when an indicator is updating width and/or offset. */
internal val TabRowIndicatorSpec: AnimationSpec<Dp> =
    tween(durationMillis = 250, easing = FastOutSlowInEasing)