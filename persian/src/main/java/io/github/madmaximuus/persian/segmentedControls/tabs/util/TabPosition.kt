package io.github.madmaximuus.persian.segmentedControls.tabs.util

import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import io.github.madmaximuus.persian.tabBar.TabBar

/**
 * Data class that contains information about a tab's position on screen, used for calculating where
 * to place the indicator that shows which tab is selected.
 *
 * @property left the left edge's x position from the start of the [TabBar]
 * @property right the right edge's x position from the start of the [TabBar]
 * @property width the width of this tab
 * @property contentWidth the content width of this tab. Should be a minimum of 24.dp
 */
@Immutable
class TabPosition internal constructor(val left: Dp, val width: Dp, val contentWidth: Dp) {

    val right: Dp
        get() = left + width

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TabPosition) return false

        if (left != other.left) return false
        if (width != other.width) return false
        if (contentWidth != other.contentWidth) return false

        return true
    }

    override fun hashCode(): Int {
        var result = left.hashCode()
        result = 31 * result + width.hashCode()
        result = 31 * result + contentWidth.hashCode()
        return result
    }

    override fun toString(): String {
        return "TabPosition(left=$left, right=$right, width=$width, contentWidth=$contentWidth)"
    }
}