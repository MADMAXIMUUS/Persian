package io.github.madmaximuus.persian.buttons

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.takeOrElse
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
        fontSize: TextStyle = MaterialTheme.typography.labelMedium,
        height: Dp = 36.dp,
        loaderSize: CircularProgressBarSizes = PersianProgressBarDefaults.circularSmall(),
        iconSize: IconBoxSize = PersianIconBoxDefaults.small(),
        shape: Shape = MaterialTheme.shapes.medium,
        contentPadding: PaddingValues = PaddingValues(
            horizontal = MaterialTheme.spacing.large,
            vertical = 0.dp
        )
    ): ButtonSizes = ButtonSizes(
        textStyle = fontSize,
        height = height,
        loaderSize = loaderSize,
        iconSize = iconSize,
        shape = shape,
        contentPadding = contentPadding
    )

    @Composable
    fun mediumSizes(
        fontSize: TextStyle = MaterialTheme.typography.labelLarge,
        additionInfoTextStyle: TextStyle = MaterialTheme.typography.labelSmall,
        height: Dp = 44.dp,
        loaderSize: CircularProgressBarSizes = PersianProgressBarDefaults.circularMedium(),
        iconSize: IconBoxSize = PersianIconBoxDefaults.medium(),
        shape: Shape = MaterialTheme.shapes.large,
        contentPadding: PaddingValues = PaddingValues(
            horizontal = MaterialTheme.spacing.extraLarge,
            vertical = 0.dp
        )
    ): ButtonSizes = ButtonSizes(
        textStyle = fontSize,
        additionInfoTextStyle = additionInfoTextStyle,
        height = height,
        loaderSize = loaderSize,
        iconSize = iconSize,
        shape = shape,
        contentPadding = contentPadding
    )

    @Composable
    fun largeSizes(
        fontSize: TextStyle = MaterialTheme.typography.titleMedium,
        additionInfoTextStyle: TextStyle = MaterialTheme.typography.labelMedium,
        height: Dp = 52.dp,
        loaderSize: CircularProgressBarSizes = PersianProgressBarDefaults.circularLarge(),
        iconSize: IconBoxSize = PersianIconBoxDefaults.large(),
        shape: Shape = MaterialTheme.shapes.large,
        contentPadding: PaddingValues = PaddingValues(
            horizontal = MaterialTheme.spacing.extraExtraLarge,
            vertical = 0.dp
        )
    ): ButtonSizes = ButtonSizes(
        textStyle = fontSize,
        additionInfoTextStyle = additionInfoTextStyle,
        height = height,
        loaderSize = loaderSize,
        iconSize = iconSize,
        shape = shape,
        contentPadding = contentPadding
    )

}

@Immutable
class ButtonSizes internal constructor(
    internal val textStyle: TextStyle,
    internal val additionInfoTextStyle: TextStyle? = null,
    internal val height: Dp,
    internal val iconSize: IconBoxSize,
    internal val loaderSize: CircularProgressBarSizes,
    internal val shape: Shape,
    internal val contentPadding: PaddingValues,
) {
    fun copy(
        textStyle: TextStyle = this.textStyle,
        additionInfoTextStyle: TextStyle? = this.additionInfoTextStyle,
        height: Dp = this.height,
        iconSize: IconBoxSize = this.iconSize,
        loaderSize: CircularProgressBarSizes = this.loaderSize,
        shape: Shape = this.shape,
        contentPadding: PaddingValues
    ) = ButtonSizes(
        textStyle,
        additionInfoTextStyle,
        height,
        iconSize,
        loaderSize,
        shape,
        contentPadding
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ButtonSizes) return false

        if (textStyle != other.textStyle) return false
        if (additionInfoTextStyle != other.additionInfoTextStyle) return false
        if (height != other.height) return false
        if (iconSize != other.iconSize) return false
        if (loaderSize != other.loaderSize) return false
        if (shape != other.shape) return false
        return contentPadding == other.contentPadding
    }

    override fun hashCode(): Int {
        var result = textStyle.hashCode()
        result = 31 * result + additionInfoTextStyle.hashCode()
        result = 31 * result + height.hashCode()
        result = 31 * result + iconSize.hashCode()
        result = 31 * result + loaderSize.hashCode()
        result = 31 * result + shape.hashCode()
        result = 31 * result + contentPadding.hashCode()
        return result
    }
}

@Immutable
class ButtonColors internal constructor(
    private val contentColor: Color,
    private val containerColor: Color,
    private val disabledContentColor: Color,
    private val disabledContainerColor: Color
) {
    @Stable
    internal fun contentColor(enabled: Boolean): Color =
        if (enabled) contentColor else disabledContentColor

    @Stable
    internal fun containerColor(enabled: Boolean): Color =
        if (enabled) containerColor else disabledContainerColor

    fun copy(
        contentColor: Color = this.contentColor,
        containerColor: Color = this.containerColor,
        disabledContentColor: Color = this.disabledContentColor,
        disabledContainerColor: Color = this.disabledContainerColor
    ) = ButtonColors(
        contentColor.takeOrElse { this.contentColor },
        containerColor.takeOrElse { this.containerColor },
        disabledContentColor.takeOrElse { this.disabledContentColor },
        disabledContainerColor.takeOrElse { this.disabledContainerColor }
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ButtonColors) return false

        if (contentColor != other.contentColor) return false
        if (containerColor != other.containerColor) return false
        if (disabledContentColor != other.disabledContentColor) return false
        return disabledContainerColor == other.disabledContainerColor
    }

    override fun hashCode(): Int {
        var result = contentColor.hashCode()
        result = 31 * result + containerColor.hashCode()
        result = 31 * result + disabledContentColor.hashCode()
        result = 31 * result + disabledContainerColor.hashCode()
        return result
    }
}