package io.github.madmaximuus.persian.dividers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.extendedColorScheme

@Deprecated("Replace with Persian<*>HorizontalDivider()")
object PersianHorizontalDividers {

    @Composable
    fun FullWidth(
        modifier: Modifier = Modifier,
        sizes: DividerSizes = PersianDividerSizes.small(),
        strokeColor: Color = MaterialTheme.extendedColorScheme.outlineVariant
    ) {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(sizes.strokeThickness)
                .background(strokeColor)
        )
    }

    @Composable
    fun MiddleInsets(
        modifier: Modifier = Modifier,
        sizes: DividerSizes = PersianDividerSizes.small(),
        insetSide: InsetSide = InsetSide.LEFT,
        strokeColor: Color = MaterialTheme.extendedColorScheme.outlineVariant
    ) {
        val padding = when (insetSide) {
            InsetSide.LEFT -> PaddingValues(start = sizes.inset)
            InsetSide.RIGHT -> PaddingValues(end = sizes.inset)
        }
        Box(
            modifier = modifier
                .padding(padding)
                .fillMaxWidth()
                .height(sizes.strokeThickness)
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
                .padding(PaddingValues(horizontal = sizes.inset))
                .fillMaxWidth()
                .height(sizes.strokeThickness)
                .background(strokeColor)
        )
    }

    enum class InsetSide { LEFT, RIGHT }
}

@Composable
fun PersianFullWidthHorizontalDivider(
    modifier: Modifier = Modifier,
    sizes: DividerSizes = PersianDividerDefaults.sizes(),
    strokeColor: Color = MaterialTheme.extendedColorScheme.outlineVariant
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(sizes.strokeThickness)
            .background(strokeColor)
    )
}

@Composable
fun PersianMiddleInsetsHorizontalDivider(
    modifier: Modifier = Modifier,
    sizes: DividerSizes = PersianDividerDefaults.sizes(),
    insetSide: HorizontalInsetSide = HorizontalInsetSide.LEFT,
    strokeColor: Color = MaterialTheme.extendedColorScheme.outlineVariant
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

@Composable
fun PersianInsetHorizontalDivider(
    modifier: Modifier = Modifier,
    sizes: DividerSizes = PersianDividerDefaults.sizes(),
    strokeColor: Color = MaterialTheme.extendedColorScheme.outlineVariant
) {
    Box(
        modifier = modifier
            .padding(PaddingValues(horizontal = sizes.inset))
            .fillMaxWidth()
            .height(sizes.strokeThickness)
            .background(strokeColor)
    )
}

enum class HorizontalInsetSide { LEFT, RIGHT }