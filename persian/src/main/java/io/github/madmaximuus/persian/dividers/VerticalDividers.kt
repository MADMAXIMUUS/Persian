package io.github.madmaximuus.persian.dividers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme

/**
 * A vertical divider is useful for visually separating content, providing users with a clear
 * and organized layout. It offers a straightforward and effective method for improving readability
 * and structure, making it an essential tool for enhancing user experience and design clarity.
 *
 * @param modifier The [Modifier] to be applied to the divider.
 * @param sizes The [DividerSizes] that define the thickness of the divider.
 * @param strokeColor The [Color] of the divider.
 */
@Composable
fun VerticalDivider(
    modifier: Modifier = Modifier,
    sizes: DividerSizes = DividerDefaults.sizes(),
    insetSide: VerticalInsetSide = VerticalInsetSide.NONE,
    strokeColor: Color = PersianTheme.colorScheme.outlineVariant
) {
    val padding = when (insetSide) {
        VerticalInsetSide.TOP -> PaddingValues(top = sizes.inset)
        VerticalInsetSide.BOTTOM -> PaddingValues(bottom = sizes.inset)
        VerticalInsetSide.NONE -> PaddingValues(0.dp)
        VerticalInsetSide.BOTH -> PaddingValues(vertical = sizes.inset)
    }
    Box(
        modifier = modifier
            .padding(padding)
            .fillMaxHeight()
            .width(sizes.strokeThickness)
            .background(strokeColor)
    )
}

/**
 * An enumeration that specifies the side of the vertical inset.
 */
enum class VerticalInsetSide { NONE, TOP, BOTTOM, BOTH }