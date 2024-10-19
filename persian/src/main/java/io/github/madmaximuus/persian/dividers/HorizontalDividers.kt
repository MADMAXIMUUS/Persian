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
import io.github.madmaximuus.persian.foundation.PersianTheme

/**
 * Creates a full-width horizontal divider.
 *
 * @param modifier The [Modifier] to be applied to the divider.
 * @param sizes The [DividerSizes] that define the thickness of the divider.
 * @param strokeColor The [Color] of the divider.
 */
@Composable
fun FullWidthHorizontalDivider(
    modifier: Modifier = Modifier,
    sizes: DividerSizes = DividerDefaults.sizes(),
    strokeColor: Color = PersianTheme.colorScheme.outlineVariant
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(sizes.strokeThickness)
            .background(strokeColor)
    )
}

/**
 * Creates a horizontal divider with insets on one side.
 *
 * @param modifier The [Modifier] to be applied to the divider.
 * @param sizes The [DividerSizes] that define the thickness and inset of the divider.
 * @param insetSide The [HorizontalInsetSide] that specifies which side of the divider should have the inset.
 * @param strokeColor The [Color] of the divider.
 */
@Composable
fun MiddleInsetsHorizontalDivider(
    modifier: Modifier = Modifier,
    sizes: DividerSizes = DividerDefaults.sizes(),
    insetSide: HorizontalInsetSide = HorizontalInsetSide.LEFT,
    strokeColor: Color = PersianTheme.colorScheme.outlineVariant
) {
    val padding = when (insetSide) {
        HorizontalInsetSide.LEFT -> PaddingValues(start = sizes.inset)
        HorizontalInsetSide.RIGHT -> PaddingValues(end = sizes.inset)
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
 * Creates a horizontal divider with insets on both sides.
 *
 * @param modifier The [Modifier] to be applied to the divider.
 * @param sizes The [DividerSizes] that define the thickness and inset of the divider.
 * @param strokeColor The [Color] of the divider.
 */
@Composable
fun InsetHorizontalDivider(
    modifier: Modifier = Modifier,
    sizes: DividerSizes = DividerDefaults.sizes(),
    strokeColor: Color = PersianTheme.colorScheme.outlineVariant
) {
    Box(
        modifier = modifier
            .padding(PaddingValues(horizontal = sizes.inset))
            .fillMaxWidth()
            .height(sizes.strokeThickness)
            .background(strokeColor)
    )
}

/**
 * An enumeration that specifies the side of the horizontal inset.
 */
enum class HorizontalInsetSide { LEFT, RIGHT }