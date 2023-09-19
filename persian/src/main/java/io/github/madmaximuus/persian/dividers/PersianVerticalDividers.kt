package io.github.madmaximuus.persian.dividers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.extendedColorScheme

object PersianVerticalDividers {

    @Composable
    fun FullHeight(
        modifier: Modifier = Modifier,
        sizes: DividerSizes = PersianDividerSizes.small(),
        strokeColor: Color = MaterialTheme.extendedColorScheme.outlineVariant
    ) {
        Box(
            modifier = modifier
                .fillMaxHeight()
                .width(sizes.strokeThickness)
                .background(strokeColor)
        )
    }

    @Composable
    fun MiddleInsets(
        modifier: Modifier = Modifier,
        sizes: DividerSizes = PersianDividerSizes.small(),
        insetSide: InsetSide = InsetSide.TOP,
        strokeColor: Color = MaterialTheme.extendedColorScheme.outlineVariant
    ) {
        val padding = when (insetSide) {
            InsetSide.TOP -> PaddingValues(top = sizes.inset)
            InsetSide.BOTTOM -> PaddingValues(bottom = sizes.inset)
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
    fun Inset(
        modifier: Modifier = Modifier,
        sizes: DividerSizes = PersianDividerSizes.small(),
        strokeColor: Color = MaterialTheme.extendedColorScheme.outlineVariant
    ) {
        Box(
            modifier = modifier
                .padding(PaddingValues(vertical = sizes.inset))
                .fillMaxHeight()
                .width(sizes.strokeThickness)
                .background(strokeColor)
        )
    }

    enum class InsetSide { TOP, BOTTOM }
}