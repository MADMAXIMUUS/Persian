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
import io.github.madmaximuus.persian.foundation.PersianTheme

/**
 * Creates a full-width vertical divider.
 *
 * @param modifier The [Modifier] to be applied to the divider.
 * @param sizes The [DividerSizes] that define the thickness of the divider.
 * @param strokeColor The [Color] of the divider.
 */
@Composable
fun FullHeightVerticalDivider(
    modifier: Modifier = Modifier,
    sizes: DividerSizes = DividerDefaults.sizes(),
    strokeColor: Color = PersianTheme.colorScheme.outlineVariant
) {
    Box(
        modifier = modifier
            .fillMaxHeight()
            .width(sizes.strokeThickness)
            .background(strokeColor)
    )
}

/**
 * Creates a vertical divider with insets on one side.
 *
 * @param modifier The [Modifier] to be applied to the divider.
 * @param sizes The [DividerSizes] that define the thickness and inset of the divider.
 * @param insetSide The [HorizontalInsetSide] that specifies which side of the divider should have the inset.
 * @param strokeColor The [Color] of the divider.
 */
@Composable
fun MiddleInsetsVerticalDivider(
    modifier: Modifier = Modifier,
    sizes: DividerSizes = DividerDefaults.sizes(),
    insetSide: VerticalInsetSide = VerticalInsetSide.TOP,
    strokeColor: Color = PersianTheme.colorScheme.outlineVariant
) {
    val padding = when (insetSide) {
        VerticalInsetSide.TOP -> PaddingValues(top = sizes.inset)
        VerticalInsetSide.BOTTOM -> PaddingValues(bottom = sizes.inset)
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
 * Creates a vertical divider with insets on both sides.
 *
 * @param modifier The [Modifier] to be applied to the divider.
 * @param sizes The [DividerSizes] that define the thickness and inset of the divider.
 * @param strokeColor The [Color] of the divider.
 */
@Composable
fun InsetVerticalDivider(
    modifier: Modifier = Modifier,
    sizes: DividerSizes = DividerDefaults.sizes(),
    strokeColor: Color = PersianTheme.colorScheme.outlineVariant
) {
    Box(
        modifier = modifier
            .padding(PaddingValues(vertical = sizes.inset))
            .fillMaxHeight()
            .width(sizes.strokeThickness)
            .background(strokeColor)
    )
}

/**
 * An enumeration that specifies the side of the vertical inset.
 */
enum class VerticalInsetSide { TOP, BOTTOM }