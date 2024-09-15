package io.github.madmaximuus.persian.tabBar.util

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.ui.unit.Dp

internal interface TabPositionsHolder {

    fun setTabPositions(positions: List<TabPosition>)
}

/** [AnimationSpec] used when scrolling to a tab that is not fully visible. */
internal val ScrollableTabRowScrollSpec: AnimationSpec<Float> =
    tween(durationMillis = 250, easing = FastOutSlowInEasing)

/** [AnimationSpec] used when an indicator is updating width and/or offset. */
internal val TabRowIndicatorSpec: AnimationSpec<Dp> =
    tween(durationMillis = 250, easing = FastOutSlowInEasing)