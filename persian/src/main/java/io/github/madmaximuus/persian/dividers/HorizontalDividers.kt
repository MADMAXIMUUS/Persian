package io.github.madmaximuus.persian.dividers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme

/**
 * A horizontal divider is useful for visually separating content, providing users with a clear
 * and organized layout. It offers a straightforward and effective method for improving readability
 * and structure, making it an essential tool for enhancing user experience and design clarity.
 *
 * @param modifier The [Modifier] to be applied to the divider.
 * @param sizes The [DividerSizes] that define the thickness of the divider.
 * @param insetSide The [HorizontalInsetSide] that specifies which side of the divider should have the inset.
 * @param strokeColor The [Color] of the divider.
 */
@Composable
fun HorizontalDivider(
    modifier: Modifier = Modifier,
    sizes: DividerSizes = DividerDefaults.sizes(),
    insetSide: HorizontalInsetSide = HorizontalInsetSide.NONE,
    strokeColor: Color = PersianTheme.colorScheme.outlineVariant
) {
    val padding = when (insetSide) {
        HorizontalInsetSide.LEFT -> PaddingValues(start = sizes.inset)
        HorizontalInsetSide.RIGHT -> PaddingValues(end = sizes.inset)
        HorizontalInsetSide.NONE -> PaddingValues(0.dp)
        HorizontalInsetSide.BOTH -> PaddingValues(horizontal = sizes.inset)
    }
    Box(
        modifier = modifier
            .padding(padding)
            .fillMaxWidth()
            .height(sizes.strokeThickness)
            .background(strokeColor)
    )
}

/**
 * An enumeration that specifies the side of the horizontal inset.
 */
enum class HorizontalInsetSide { NONE, LEFT, RIGHT, BOTH }