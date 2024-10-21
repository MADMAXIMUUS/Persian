package io.github.madmaximuus.persian.menu.util

import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.unit.IntRect
import kotlin.math.max
import kotlin.math.min

/**
 * Calculates the transform origin for a menu based on the anchor and menu bounds.
 *
 * This function determines the pivot points (pivotX and pivotY) for transforming a menu relative to
 * an anchor. The pivot points are calculated based on the intersection of the anchor and menu bounds.
 *
 * @param anchorBounds The bounds of the anchor element.
 * @param menuBounds The bounds of the menu element.
 */
internal fun calculateTransformOrigin(anchorBounds: IntRect, menuBounds: IntRect): TransformOrigin {
    val pivotX =
        when {
            menuBounds.left >= anchorBounds.right -> 0f
            menuBounds.right <= anchorBounds.left -> 1f
            menuBounds.width == 0 -> 0f
            else -> {
                val intersectionCenter =
                    (max(anchorBounds.left, menuBounds.left) +
                            min(anchorBounds.right, menuBounds.right)) / 2
                (intersectionCenter - menuBounds.left).toFloat() / menuBounds.width
            }
        }
    val pivotY =
        when {
            menuBounds.top >= anchorBounds.bottom -> 0f
            menuBounds.bottom <= anchorBounds.top -> 1f
            menuBounds.height == 0 -> 0f
            else -> {
                val intersectionCenter =
                    (max(anchorBounds.top, menuBounds.top) +
                            min(anchorBounds.bottom, menuBounds.bottom)) / 2
                (intersectionCenter - menuBounds.top).toFloat() / menuBounds.height
            }
        }
    return TransformOrigin(pivotX, pivotY)
}