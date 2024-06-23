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

enum class VerticalInsetSide { TOP, BOTTOM }