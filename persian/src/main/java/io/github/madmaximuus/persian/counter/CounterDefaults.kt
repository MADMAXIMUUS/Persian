package io.github.madmaximuus.persian.counter

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme

object CounterDefaults {

    @Composable
    fun badgeColors(
        backgroundColor: Color = PersianTheme.colorScheme.error,
        textColor: Color = PersianTheme.colorScheme.onError
    ) = remember(backgroundColor, textColor) {
        CounterColors(
            backgroundColor = backgroundColor,
            textColor = textColor
        )
    }

    @Composable
    fun primaryColors(
        backgroundColor: Color = PersianTheme.colorScheme.primary,
        textColor: Color = PersianTheme.colorScheme.onPrimary
    ) = remember(backgroundColor, textColor) {
        CounterColors(
            backgroundColor = backgroundColor,
            textColor = textColor
        )
    }

    @Composable
    fun tonalColors(
        backgroundColor: Color = PersianTheme.colorScheme.primaryContainer,
        textColor: Color = PersianTheme.colorScheme.onPrimaryContainer
    ) = remember(backgroundColor, textColor) {
        CounterColors(
            backgroundColor = backgroundColor,
            textColor = textColor
        )
    }

    @Composable
    fun transparentColors(
        backgroundColor: Color = Color.Transparent,
        textColor: Color = PersianTheme.colorScheme.onSurface
    ) = remember(backgroundColor, textColor) {
        CounterColors(
            backgroundColor = backgroundColor,
            textColor = textColor
        )
    }

    @Composable
    fun badgeSizes(
        badgeHorizontalOffset: Dp = (-16).dp,
        badgeVerticalOffset: Dp = 18.dp,
    ): CounterSizes =
        CounterSizes(
            digitPadding = PaddingValues(0.dp, 0.dp),
            digitCornerRadius = PersianTheme.shapes.full,
            badgeHorizontalOffset = badgeHorizontalOffset,
            badgeVerticalOffset = badgeVerticalOffset,
            textStyle = PersianTheme.typography.bodyLarge
        )

    @Composable
    fun digitSizes(
        digitPadding: PaddingValues = PaddingValues(horizontal = 6.dp, vertical = 2.dp),
        digitCornerRadius: Shape = PersianTheme.shapes.shape12,
        badgeHorizontalOffset: Dp = (-22).dp,
        badgeVerticalOffset: Dp = 20.dp,
        textStyle: TextStyle = PersianTheme.typography.bodyMedium
    ): CounterSizes =
        CounterSizes(
            digitPadding = digitPadding,
            digitCornerRadius = digitCornerRadius,
            badgeHorizontalOffset = badgeHorizontalOffset,
            badgeVerticalOffset = badgeVerticalOffset,
            textStyle = textStyle
        )
}

@Immutable
data class CounterColors(
    val backgroundColor: Color,
    val textColor: Color
)

@Immutable
class CounterSizes(
    internal val digitPadding: PaddingValues,
    internal val digitCornerRadius: Shape,
    internal val badgeHorizontalOffset: Dp,
    internal val badgeVerticalOffset: Dp,
    internal val textStyle: TextStyle
) {

    fun copy(
        digitPadding: PaddingValues = this.digitPadding,
        digitCornerRadius: Shape = this.digitCornerRadius,

        badgeHorizontalOffset: Dp = this.badgeHorizontalOffset,
        badgeVerticalOffset: Dp = this.badgeVerticalOffset,

        textStyle: TextStyle = this.textStyle
    ) = CounterSizes(
        digitPadding = digitPadding,
        digitCornerRadius = digitCornerRadius,

        badgeHorizontalOffset = badgeHorizontalOffset,
        badgeVerticalOffset = badgeVerticalOffset,

        textStyle = textStyle
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is CounterSizes) return false

        if (digitPadding != other.digitPadding) return false
        if (digitCornerRadius != other.digitCornerRadius) return false

        if (badgeHorizontalOffset != other.badgeHorizontalOffset) return false
        if (badgeVerticalOffset != other.badgeVerticalOffset) return false

        return textStyle == other.textStyle
    }

    override fun hashCode(): Int {
        var result = digitPadding.hashCode()
        result = 31 * result + digitCornerRadius.hashCode()

        result = 31 * result + badgeHorizontalOffset.hashCode()
        result = 31 * result + badgeVerticalOffset.hashCode()

        result = 31 * result + textStyle.hashCode()
        return result
    }
}