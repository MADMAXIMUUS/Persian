package ru.rabbit.persian.banners

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ru.rabbit.persian.foundation.spacing

@Immutable
data class BannerSizes(
    val cornerRadius: Shape,
    val textStyle: TextStyle,
    val iconSize: Dp,
    val contentPadding: PaddingValues
)

object PersianBannerSizes {

    @Composable
    fun large(
        cornerRadius: Shape = MaterialTheme.shapes.large,
        textStyle: TextStyle = MaterialTheme.typography.bodySmall,
        iconSize: Dp = 24.dp,
        contentPadding: PaddingValues = PaddingValues(
            all = MaterialTheme.spacing.medium
        )
    ) = remember(
        cornerRadius,
        textStyle,
        iconSize,
        contentPadding
    ) {
        BannerSizes(
            cornerRadius = cornerRadius,
            textStyle = textStyle,
            iconSize = iconSize,
            contentPadding = contentPadding
        )
    }
}