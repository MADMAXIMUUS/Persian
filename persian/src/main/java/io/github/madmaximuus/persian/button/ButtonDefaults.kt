package io.github.madmaximuus.persian.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state12
import io.github.madmaximuus.persian.foundation.state38
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes
import io.github.madmaximuus.persian.progressIndicator.CircularProgressBarSizes
import io.github.madmaximuus.persian.progressIndicator.ProgressIndicatorDefaults

object PersianButtonDefaults {

    @Composable
    fun primaryColors(
        containerColor: Color = PersianTheme.colorScheme.primary,
        contentColor: Color = PersianTheme.colorScheme.onPrimary,
        disabledContainerColor: Color = PersianTheme.colorScheme.onSurface.state12,
        disabledContentColor: Color = PersianTheme.colorScheme.onSurface.state38,
    ): ButtonColors = ButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    fun secondaryColors(
        containerColor: Color = PersianTheme.colorScheme.primaryContainer,
        contentColor: Color = PersianTheme.colorScheme.onPrimaryContainer,
        disabledContainerColor: Color = PersianTheme.colorScheme.onSurface.state12,
        disabledContentColor: Color = PersianTheme.colorScheme.onSurface.state38,
    ): ButtonColors = ButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    fun tertiaryColors(
        containerColor: Color = Color.Transparent,
        contentColor: Color = PersianTheme.colorScheme.primary,
        disabledContainerColor: Color = Color.Transparent,
        disabledContentColor: Color = PersianTheme.colorScheme.onSurface.state38,
    ): ButtonColors = ButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    fun outlinedColors(
        containerColor: Color = Color.Transparent,
        contentColor: Color = PersianTheme.colorScheme.primary,
        disabledContainerColor: Color = PersianTheme.colorScheme.onSurface.state12,
        disabledContentColor: Color = PersianTheme.colorScheme.onSurface.state38,
    ): ButtonColors = ButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    fun smallSizes(
        fontSize: TextStyle = PersianTheme.typography.labelMedium,
        height: Dp = 36.dp,
        loaderSize: CircularProgressBarSizes = ProgressIndicatorDefaults.circularSmall(),
        iconSizes: IconSizes = IconDefaults.size18(),
        shape: Shape = PersianTheme.shapes.shape12,
        contentPadding: PaddingValues = PaddingValues(
            horizontal = PersianTheme.spacing.size16,
            vertical = 0.dp
        )
    ): ButtonSizes = ButtonSizes(
        textStyle = fontSize,
        height = height,
        loaderSize = loaderSize,
        iconSizes = iconSizes,
        shape = shape,
        contentPadding = contentPadding
    )

    @Composable
    fun mediumSizes(
        fontSize: TextStyle = PersianTheme.typography.labelLarge,
        additionInfoTextStyle: TextStyle = PersianTheme.typography.labelSmall,
        height: Dp = 44.dp,
        loaderSize: CircularProgressBarSizes = ProgressIndicatorDefaults.circularMedium(),
        iconSizes: IconSizes = IconDefaults.size20(),
        shape: Shape = PersianTheme.shapes.shape14,
        contentPadding: PaddingValues = PaddingValues(
            horizontal = PersianTheme.spacing.size20,
            vertical = 0.dp
        )
    ): ButtonSizes = ButtonSizes(
        textStyle = fontSize,
        additionInfoTextStyle = additionInfoTextStyle,
        height = height,
        loaderSize = loaderSize,
        iconSizes = iconSizes,
        shape = shape,
        contentPadding = contentPadding
    )

    @Composable
    fun largeSizes(
        fontSize: TextStyle = PersianTheme.typography.titleMedium,
        additionInfoTextStyle: TextStyle = PersianTheme.typography.labelMedium,
        height: Dp = 52.dp,
        loaderSize: CircularProgressBarSizes = ProgressIndicatorDefaults.circularLarge(),
        iconSizes: IconSizes = IconDefaults.size28(),
        shape: Shape = PersianTheme.shapes.shape16,
        contentPadding: PaddingValues = PaddingValues(
            horizontal = PersianTheme.spacing.size24,
            vertical = 0.dp
        )
    ): ButtonSizes = ButtonSizes(
        textStyle = fontSize,
        additionInfoTextStyle = additionInfoTextStyle,
        height = height,
        loaderSize = loaderSize,
        iconSizes = iconSizes,
        shape = shape,
        contentPadding = contentPadding
    )

}

@Immutable
class ButtonSizes internal constructor(
    internal val textStyle: TextStyle,
    internal val additionInfoTextStyle: TextStyle? = null,
    internal val height: Dp,
    internal val iconSizes: IconSizes,
    internal val loaderSize: CircularProgressBarSizes,
    internal val shape: Shape,
    internal val contentPadding: PaddingValues,
) {
    fun copy(
        textStyle: TextStyle = this.textStyle,
        additionInfoTextStyle: TextStyle? = this.additionInfoTextStyle,
        height: Dp = this.height,
        iconSizes: IconSizes = this.iconSizes,
        loaderSize: CircularProgressBarSizes = this.loaderSize,
        shape: Shape = this.shape,
        contentPadding: PaddingValues
    ) = ButtonSizes(
        textStyle,
        additionInfoTextStyle,
        height,
        iconSizes,
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
        if (iconSizes != other.iconSizes) return false
        if (loaderSize != other.loaderSize) return false
        if (shape != other.shape) return false
        return contentPadding == other.contentPadding
    }

    override fun hashCode(): Int {
        var result = textStyle.hashCode()
        result = 31 * result + additionInfoTextStyle.hashCode()
        result = 31 * result + height.hashCode()
        result = 31 * result + iconSizes.hashCode()
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