package io.github.madmaximuus.persian.buttons

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.iconBox.IconBoxSize
import io.github.madmaximuus.persian.iconBox.PersianIconBoxSize
import io.github.madmaximuus.persian.progressBars.CircularProgressBarSizes
import io.github.madmaximuus.persian.progressBars.PersianCircularProgressBarSize

@Immutable
data class ButtonSizes(
    val textStyle: TextStyle,
    val height: Dp,
    val iconSize: IconBoxSize,
    val loaderSize: CircularProgressBarSizes,
    val shape: Shape,
    val contentPadding: PaddingValues,
)

object PersianButtonSizes {

    @Composable
    fun small(
        loading: Boolean = false,
        fontSize: TextStyle = MaterialTheme.typography.titleSmall,
        height: Dp = 36.dp,
        loaderSize: CircularProgressBarSizes = PersianCircularProgressBarSize.small(),
        iconSize: IconBoxSize = PersianIconBoxSize.small(),
        shape: Shape = MaterialTheme.shapes.medium,
        contentPadding: PaddingValues = PaddingValues(
            horizontal = MaterialTheme.spacing.large,
            vertical = if (!loading) MaterialTheme.spacing.small
            else 0.dp
        )
    ): ButtonSizes = remember(
        fontSize,
        height,
        loaderSize,
        iconSize,
        shape,
        contentPadding
    ) {
        ButtonSizes(
            textStyle = fontSize,
            height = height,
            loaderSize = loaderSize,
            iconSize = iconSize,
            shape = shape,
            contentPadding = contentPadding
        )
    }

    @Composable
    fun medium(
        loading: Boolean = false,
        fontSize: TextStyle = MaterialTheme.typography.labelLarge,
        height: Dp = 44.dp,
        loaderSize: CircularProgressBarSizes = PersianCircularProgressBarSize.medium(),
        iconSize: IconBoxSize = PersianIconBoxSize.medium(),
        shape: Shape = MaterialTheme.shapes.large,
        contentPadding: PaddingValues = PaddingValues(
            horizontal = MaterialTheme.spacing.extraLarge,
            vertical = if (!loading) MaterialTheme.spacing.medium
            else 0.dp
        )
    ): ButtonSizes = remember(
        fontSize,
        height,
        loaderSize,
        iconSize,
        shape,
        contentPadding
    ) {
        ButtonSizes(
            textStyle = fontSize,
            height = height,
            loaderSize = loaderSize,
            iconSize = iconSize,
            shape = shape,
            contentPadding = contentPadding
        )
    }

    @Composable
    fun large(
        loading: Boolean = false,
        fontSize: TextStyle = MaterialTheme.typography.titleMedium,
        height: Dp = 52.dp,
        loaderSize: CircularProgressBarSizes = PersianCircularProgressBarSize.large(),
        iconSize: IconBoxSize = PersianIconBoxSize.large(),
        shape: Shape = MaterialTheme.shapes.large,
        contentPadding: PaddingValues = PaddingValues(
            horizontal = MaterialTheme.spacing.extraExtraLarge,
            vertical = if (!loading) MaterialTheme.spacing.large
            else 0.dp
        )
    ): ButtonSizes = remember(
        fontSize,
        height,
        loaderSize,
        iconSize,
        shape,
        contentPadding
    ) {
        ButtonSizes(
            textStyle = fontSize,
            height = height,
            loaderSize = loaderSize,
            iconSize = iconSize,
            shape = shape,
            contentPadding = contentPadding
        )
    }
}