package io.github.madmaximuus.persian.counter

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme

object PersianCounterDefaults {
    @Composable
    fun colors(
        backgroundColor: Color = PersianTheme.colorScheme.error,
        textColor: Color = PersianTheme.colorScheme.onError
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
    fun sizes(
        outerOneDigitPadding: PaddingValues = PaddingValues(horizontal = 5.dp, vertical = 0.dp),
        outerTwoDigitPadding: PaddingValues = PaddingValues(horizontal = 5.dp, vertical = 0.dp),
        outerOverDigitPadding: PaddingValues = PaddingValues(0.dp),
        innerOneDigitPadding: PaddingValues = PaddingValues(horizontal = 8.dp, vertical = 4.dp),
        innerTwoDigitPadding: PaddingValues = PaddingValues(horizontal = 4.dp, vertical = 4.dp),
        innerOverDigitPadding: PaddingValues = PaddingValues(horizontal = 4.dp, vertical = 4.dp),
        oneDigitCornerRadius: Shape = PersianTheme.shapes.shape12,
        twoDigitCornerRadius: Shape = PersianTheme.shapes.shape12,
        overDigitCornerRadius: Shape = PersianTheme.shapes.shape12,
        badgeHorizontalOffset: Dp = (-18).dp,
        badgeVerticalOffset: Dp = 20.dp,
        oneDigitBadgeHorizontalOffset: Dp = (-32).dp,
        oneDigitBadgeVerticalOffset: Dp = 20.dp,
        twoDigitBadgeHorizontalOffset: Dp = (-32).dp,
        twoDigitBadgeVerticalOffset: Dp = 20.dp,
        overDigitBadgeHorizontalOffset: Dp = (-22).dp,
        overDigitBadgeVerticalOffset: Dp = 20.dp,
        textStyle: TextStyle = PersianTheme.typography.bodyMedium
    ): CounterSizes =
        CounterSizes(
            outerOneDigitPadding = outerOneDigitPadding,
            outerTwoDigitPadding = outerTwoDigitPadding,
            outerOverDigitPadding = outerOverDigitPadding,
            innerOneDigitPadding = innerOneDigitPadding,
            innerTwoDigitPadding = innerTwoDigitPadding,
            innerOverDigitPadding = innerOverDigitPadding,
            badgeHorizontalOffset = badgeHorizontalOffset,
            badgeVerticalOffset = badgeVerticalOffset,
            oneDigitBadgeHorizontalOffset = oneDigitBadgeHorizontalOffset,
            oneDigitBadgeVerticalOffset = oneDigitBadgeVerticalOffset,
            twoDigitBadgeHorizontalOffset = twoDigitBadgeHorizontalOffset,
            twoDigitBadgeVerticalOffset = twoDigitBadgeVerticalOffset,
            overDigitBadgeHorizontalOffset = overDigitBadgeHorizontalOffset,
            overDigitBadgeVerticalOffset = overDigitBadgeVerticalOffset,
            oneDigitCornerRadius = oneDigitCornerRadius,
            twoDigitCornerRadius = twoDigitCornerRadius,
            overDigitCornerRadius = overDigitCornerRadius,
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
    private val outerOneDigitPadding: PaddingValues,
    private val outerTwoDigitPadding: PaddingValues,
    private val outerOverDigitPadding: PaddingValues,
    private val innerOneDigitPadding: PaddingValues,
    private val innerTwoDigitPadding: PaddingValues,
    private val innerOverDigitPadding: PaddingValues,
    private val oneDigitCornerRadius: Shape,
    private val twoDigitCornerRadius: Shape,
    private val overDigitCornerRadius: Shape,
    private val oneDigitBadgeHorizontalOffset: Dp,
    private val oneDigitBadgeVerticalOffset: Dp,
    private val twoDigitBadgeHorizontalOffset: Dp,
    private val twoDigitBadgeVerticalOffset: Dp,
    private val overDigitBadgeHorizontalOffset: Dp,
    private val overDigitBadgeVerticalOffset: Dp,
    val badgeHorizontalOffset: Dp,
    val badgeVerticalOffset: Dp,
    val textStyle: TextStyle
) {
    @Stable
    internal fun outerPadding(count: Int): PaddingValues =
        when (count) {
            in 0..9 -> outerOneDigitPadding
            in 10..99 -> outerTwoDigitPadding
            else -> outerOverDigitPadding
        }

    @Stable
    internal fun innerPadding(count: Int): PaddingValues =
        when (count) {
            in 0..9 -> innerOneDigitPadding
            in 10..99 -> innerTwoDigitPadding
            else -> innerOverDigitPadding
        }

    @Stable
    internal fun cornerRadius(count: Int): Shape =
        when (count) {
            in 0..9 -> oneDigitCornerRadius
            in 10..99 -> twoDigitCornerRadius
            else -> overDigitCornerRadius
        }

    @Stable
    internal fun horizontalOffset(count: Int): Dp =
        when (count) {
            in 0..9 -> oneDigitBadgeHorizontalOffset
            in 10..99 -> twoDigitBadgeHorizontalOffset
            else -> overDigitBadgeHorizontalOffset
        }

    @Stable
    internal fun verticalOffset(count: Int): Dp =
        when (count) {
            in 0..9 -> oneDigitBadgeVerticalOffset
            in 10..99 -> twoDigitBadgeVerticalOffset
            else -> overDigitBadgeVerticalOffset
        }

    fun copy(
        outerOneDigitPadding: PaddingValues = this.outerOneDigitPadding,
        outerTwoDigitPadding: PaddingValues = this.outerTwoDigitPadding,
        outerOverDigitPadding: PaddingValues = this.outerOverDigitPadding,

        innerOneDigitPadding: PaddingValues = this.innerOneDigitPadding,
        innerTwoDigitPadding: PaddingValues = this.innerTwoDigitPadding,
        innerOverDigitPadding: PaddingValues = this.innerOverDigitPadding,

        oneDigitCornerRadius: Shape = this.oneDigitCornerRadius,
        twoDigitCornerRadius: Shape = this.twoDigitCornerRadius,
        overDigitCornerRadius: Shape = this.overDigitCornerRadius,

        badgeHorizontalOffset: Dp = this.badgeHorizontalOffset,
        badgeVerticalOffset: Dp = this.badgeVerticalOffset,

        oneDigitBadgeHorizontalOffset: Dp = this.oneDigitBadgeHorizontalOffset,
        oneDigitBadgeVerticalOffset: Dp = this.oneDigitBadgeVerticalOffset,

        twoDigitBadgeHorizontalOffset: Dp = this.twoDigitBadgeHorizontalOffset,
        twoDigitBadgeVerticalOffset: Dp = this.twoDigitBadgeVerticalOffset,

        overDigitBadgeHorizontalOffset: Dp = this.overDigitBadgeHorizontalOffset,
        overDigitBadgeVerticalOffset: Dp = this.overDigitBadgeVerticalOffset,

        textStyle: TextStyle = this.textStyle
    ) = CounterSizes(
        outerOneDigitPadding = outerOneDigitPadding,
        outerTwoDigitPadding = outerTwoDigitPadding,
        outerOverDigitPadding = outerOverDigitPadding,

        innerOneDigitPadding = innerOneDigitPadding,
        innerTwoDigitPadding = innerTwoDigitPadding,
        innerOverDigitPadding = innerOverDigitPadding,

        badgeHorizontalOffset = badgeHorizontalOffset,
        badgeVerticalOffset = badgeVerticalOffset,

        oneDigitBadgeHorizontalOffset = oneDigitBadgeHorizontalOffset,
        oneDigitBadgeVerticalOffset = oneDigitBadgeVerticalOffset,

        twoDigitBadgeHorizontalOffset = twoDigitBadgeHorizontalOffset,
        twoDigitBadgeVerticalOffset = twoDigitBadgeVerticalOffset,

        overDigitBadgeHorizontalOffset = overDigitBadgeHorizontalOffset,
        overDigitBadgeVerticalOffset = overDigitBadgeVerticalOffset,

        oneDigitCornerRadius = oneDigitCornerRadius,
        twoDigitCornerRadius = twoDigitCornerRadius,
        overDigitCornerRadius = overDigitCornerRadius,

        textStyle = textStyle
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is CounterSizes) return false

        if (outerOneDigitPadding != other.outerOneDigitPadding) return false
        if (outerTwoDigitPadding != other.outerTwoDigitPadding) return false
        if (outerOverDigitPadding != other.outerOverDigitPadding) return false

        if (innerOneDigitPadding != other.innerOneDigitPadding) return false
        if (innerTwoDigitPadding != other.innerTwoDigitPadding) return false
        if (innerOverDigitPadding != other.innerOverDigitPadding) return false

        if (badgeHorizontalOffset != other.badgeHorizontalOffset) return false
        if (badgeVerticalOffset != other.badgeVerticalOffset) return false

        if (oneDigitBadgeHorizontalOffset != other.oneDigitBadgeHorizontalOffset) return false
        if (oneDigitBadgeVerticalOffset != other.oneDigitBadgeVerticalOffset) return false

        if (twoDigitBadgeHorizontalOffset != other.twoDigitBadgeHorizontalOffset) return false
        if (twoDigitBadgeVerticalOffset != other.twoDigitBadgeVerticalOffset) return false

        if (overDigitBadgeHorizontalOffset != other.overDigitBadgeHorizontalOffset) return false
        if (overDigitBadgeVerticalOffset != other.overDigitBadgeVerticalOffset) return false

        if (oneDigitCornerRadius != other.oneDigitCornerRadius) return false
        if (twoDigitCornerRadius != other.twoDigitCornerRadius) return false
        if (overDigitCornerRadius != other.overDigitCornerRadius) return false

        return textStyle == other.textStyle
    }

    override fun hashCode(): Int {
        var result = outerOneDigitPadding.hashCode()
        result = 31 * result + outerTwoDigitPadding.hashCode()
        result = 31 * result + outerOverDigitPadding.hashCode()

        result = 31 * result + innerOneDigitPadding.hashCode()
        result = 31 * result + innerTwoDigitPadding.hashCode()
        result = 31 * result + innerOverDigitPadding.hashCode()

        result = 31 * result + badgeHorizontalOffset.hashCode()
        result = 31 * result + badgeVerticalOffset.hashCode()

        result = 31 * result + oneDigitBadgeHorizontalOffset.hashCode()
        result = 31 * result + oneDigitBadgeVerticalOffset.hashCode()

        result = 31 * result + twoDigitBadgeHorizontalOffset.hashCode()
        result = 31 * result + twoDigitBadgeVerticalOffset.hashCode()

        result = 31 * result + overDigitBadgeHorizontalOffset.hashCode()
        result = 31 * result + overDigitBadgeVerticalOffset.hashCode()

        result = 31 * result + oneDigitCornerRadius.hashCode()
        result = 31 * result + twoDigitCornerRadius.hashCode()
        result = 31 * result + overDigitCornerRadius.hashCode()

        result = 31 * result + textStyle.hashCode()
        return result
    }
}