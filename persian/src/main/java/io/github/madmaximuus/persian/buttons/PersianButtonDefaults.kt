package io.github.madmaximuus.persian.buttons

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianStatesDisabled
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.iconBox.IconBoxSize
import io.github.madmaximuus.persian.iconBox.PersianIconBoxDefaults
import io.github.madmaximuus.persian.progressBars.CircularProgressBarSizes
import io.github.madmaximuus.persian.progressBars.PersianProgressBarDefaults

object PersianButtonDefaults {

    @Composable
    fun primaryColors(
        containerColor: Color = MaterialTheme.extendedColorScheme.primary,
        contentColor: Color = MaterialTheme.extendedColorScheme.onPrimary,
        disabledContainerColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianStatesDisabled),
        disabledContentColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianStatesDisabled),
    ): ButtonColors = ButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    fun secondaryColors(
        containerColor: Color = MaterialTheme.extendedColorScheme.primaryContainer,
        contentColor: Color = MaterialTheme.extendedColorScheme.onPrimaryContainer,
        disabledContainerColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianStatesDisabled),
        disabledContentColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianStatesDisabled),
    ): ButtonColors = ButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    fun tertiaryColors(
        containerColor: Color = Color.Transparent,
        contentColor: Color = MaterialTheme.extendedColorScheme.primary,
        disabledContainerColor: Color = Color.Transparent,
        disabledContentColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianStatesDisabled),
    ): ButtonColors = ButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    fun outlinedColors(
        containerColor: Color = Color.Transparent,
        contentColor: Color = MaterialTheme.extendedColorScheme.primary,
        disabledContainerColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianStatesDisabled),
        disabledContentColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianStatesDisabled),
    ): ButtonColors = ButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    fun smallSizes(
        loading: Boolean = false,
        fontSize: TextStyle = MaterialTheme.typography.titleSmall,
        height: Dp = 36.dp,
        loaderSize: CircularProgressBarSizes = PersianProgressBarDefaults.circularSmall(),
        iconSize: IconBoxSize = PersianIconBoxDefaults.small(),
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
    fun mediumSizes(
        loading: Boolean = false,
        fontSize: TextStyle = MaterialTheme.typography.labelLarge,
        height: Dp = 44.dp,
        loaderSize: CircularProgressBarSizes = PersianProgressBarDefaults.circularMedium(),
        iconSize: IconBoxSize = PersianIconBoxDefaults.medium(),
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
    fun largeSizes(
        loading: Boolean = false,
        fontSize: TextStyle = MaterialTheme.typography.titleMedium,
        height: Dp = 52.dp,
        loaderSize: CircularProgressBarSizes = PersianProgressBarDefaults.circularLarge(),
        iconSize: IconBoxSize = PersianIconBoxDefaults.large(),
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

@Immutable
data class ButtonSizes(
    val textStyle: TextStyle,
    val height: Dp,
    val iconSize: IconBoxSize,
    val loaderSize: CircularProgressBarSizes,
    val shape: Shape,
    val contentPadding: PaddingValues,
)

@Immutable
class ButtonColors internal constructor(
    val contentColor: Color,
    val containerColor: Color,
    val disabledContentColor: Color,
    val disabledContainerColor: Color
) {
    @Composable
    fun contentColor(enabled: Boolean): State<Color> {
        val targetValue = when {
            !enabled -> disabledContentColor
            else -> contentColor
        }

        return rememberUpdatedState(targetValue)
    }

    @Composable
    fun containerColor(enabled: Boolean): State<Color> {
        val targetValue = when {
            !enabled -> disabledContainerColor
            else -> containerColor
        }

        return rememberUpdatedState(targetValue)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ButtonColors) return false

        if (contentColor != other.contentColor) return false
        if (containerColor != other.containerColor) return false
        if (disabledContentColor != other.disabledContentColor) return false
        if (disabledContainerColor != other.disabledContainerColor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = contentColor.hashCode()
        result = 31 * result + containerColor.hashCode()
        result = 31 * result + disabledContentColor.hashCode()
        result = 31 * result + disabledContainerColor.hashCode()
        return result
    }
}