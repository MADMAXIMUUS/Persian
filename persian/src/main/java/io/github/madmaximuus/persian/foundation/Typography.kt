package io.github.madmaximuus.persian.foundation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import io.github.madmaximuus.persian.R

/**
 * An immutable class representing a set of typographic styles.
 *
 * This class provides a comprehensive set of predefined text styles that can be used throughout an application to maintain
 * consistent typography. Each style includes properties such as font family, font weight, font size, line height, and letter spacing.
 *
 * @property displayLarge The largest display text style.
 * @property displayMedium The medium display text style.
 * @property displaySmall The smallest display text style.
 * @property headlineLarge The largest headline text style.
 * @property headlineMedium The medium headline text style.
 * @property headlineSmall The smallest headline text style.
 * @property titleLarge The largest title text style.
 * @property titleMedium The medium title text style.
 * @property titleSmall The smallest title text style.
 * @property bodyLarge The largest body text style.
 * @property bodyMedium The medium body text style.
 * @property bodySmall The smallest body text style.
 * @property labelLarge The largest label text style.
 * @property labelMedium The medium label text style.
 * @property labelSmall The smallest label text style.
 *
 * @constructor Creates a new Typography instance with the specified text styles.
 */
@Immutable
class Typography(
    val displayLarge: TextStyle = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.nunito_semi_bold, FontWeight.SemiBold),
        ),
        fontSize = 57.sp,
        lineHeight = 64.sp,
        letterSpacing = (-0.25).sp,

        ),
    val displayMedium: TextStyle = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.nunito_semi_bold, FontWeight.SemiBold)
        ),
        fontSize = 45.sp,
        lineHeight = 52.sp,
        letterSpacing = (-0.25).sp
    ),
    val displaySmall: TextStyle = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.nunito_semi_bold, FontWeight.SemiBold)
        ),
        fontSize = 36.sp,
        lineHeight = 44.sp,
        letterSpacing = (-0.25).sp
    ),
    val headlineLarge: TextStyle = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.nunito_medium, FontWeight.Medium)
        ),
        fontSize = 32.sp,
        lineHeight = 40.sp,
        letterSpacing = 0.sp
    ),
    val headlineMedium: TextStyle = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.nunito_medium, FontWeight.Medium)
        ),
        fontSize = 28.sp,
        lineHeight = 36.sp,
        letterSpacing = 0.sp
    ),
    val headlineSmall: TextStyle = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.nunito_medium, FontWeight.Medium)
        ),
        fontSize = 24.sp,
        lineHeight = 32.sp,
        letterSpacing = 0.sp
    ),
    val titleLarge: TextStyle = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.nunito_semi_bold, FontWeight.SemiBold)
        ),
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    val titleMedium: TextStyle = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.nunito_semi_bold, FontWeight.SemiBold)
        ),
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.15.sp
    ),
    val titleSmall: TextStyle = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.nunito_semi_bold, FontWeight.Medium)
        ),
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    ),
    val bodyLarge: TextStyle = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    val bodyMedium: TextStyle = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    ),
    val bodySmall: TextStyle = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.4.sp
    ),
    val labelLarge: TextStyle = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.nunito_bold, FontWeight.Bold)
        ),
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    val labelMedium: TextStyle = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.nunito_bold, FontWeight.Bold)
        ),
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.5.sp
    ),
    val labelSmall: TextStyle = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.nunito_bold, FontWeight.Bold)
        ),
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),
    val labelExtraSmall: TextStyle = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.nunito_bold, FontWeight.Bold)
        ),
        fontSize = 11.sp,
        lineHeight = 14.sp,
        letterSpacing = 0.5.sp
    )
) {

    /** Returns a copy of this Typography, optionally overriding some of the values. */
    fun copy(
        displayLarge: TextStyle = this.displayLarge,
        displayMedium: TextStyle = this.displayMedium,
        displaySmall: TextStyle = this.displaySmall,
        headlineLarge: TextStyle = this.headlineLarge,
        headlineMedium: TextStyle = this.headlineMedium,
        headlineSmall: TextStyle = this.headlineSmall,
        titleLarge: TextStyle = this.titleLarge,
        titleMedium: TextStyle = this.titleMedium,
        titleSmall: TextStyle = this.titleSmall,
        bodyLarge: TextStyle = this.bodyLarge,
        bodyMedium: TextStyle = this.bodyMedium,
        bodySmall: TextStyle = this.bodySmall,
        labelLarge: TextStyle = this.labelLarge,
        labelMedium: TextStyle = this.labelMedium,
        labelSmall: TextStyle = this.labelSmall,
        labelExtraSmall: TextStyle = this.labelExtraSmall
    ): Typography =
        Typography(
            displayLarge = displayLarge,
            displayMedium = displayMedium,
            displaySmall = displaySmall,
            headlineLarge = headlineLarge,
            headlineMedium = headlineMedium,
            headlineSmall = headlineSmall,
            titleLarge = titleLarge,
            titleMedium = titleMedium,
            titleSmall = titleSmall,
            bodyLarge = bodyLarge,
            bodyMedium = bodyMedium,
            bodySmall = bodySmall,
            labelLarge = labelLarge,
            labelMedium = labelMedium,
            labelSmall = labelSmall,
            labelExtraSmall = labelExtraSmall
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Typography) return false

        if (displayLarge != other.displayLarge) return false
        if (displayMedium != other.displayMedium) return false
        if (displaySmall != other.displaySmall) return false
        if (headlineLarge != other.headlineLarge) return false
        if (headlineMedium != other.headlineMedium) return false
        if (headlineSmall != other.headlineSmall) return false
        if (titleLarge != other.titleLarge) return false
        if (titleMedium != other.titleMedium) return false
        if (titleSmall != other.titleSmall) return false
        if (bodyLarge != other.bodyLarge) return false
        if (bodyMedium != other.bodyMedium) return false
        if (bodySmall != other.bodySmall) return false
        if (labelLarge != other.labelLarge) return false
        if (labelMedium != other.labelMedium) return false
        if (labelSmall != other.labelSmall) return false
        if (labelExtraSmall != other.labelExtraSmall) return false
        return true
    }

    override fun hashCode(): Int {
        var result = displayLarge.hashCode()
        result = 31 * result + displayMedium.hashCode()
        result = 31 * result + displaySmall.hashCode()
        result = 31 * result + headlineLarge.hashCode()
        result = 31 * result + headlineMedium.hashCode()
        result = 31 * result + headlineSmall.hashCode()
        result = 31 * result + titleLarge.hashCode()
        result = 31 * result + titleMedium.hashCode()
        result = 31 * result + titleSmall.hashCode()
        result = 31 * result + bodyLarge.hashCode()
        result = 31 * result + bodyMedium.hashCode()
        result = 31 * result + bodySmall.hashCode()
        result = 31 * result + labelLarge.hashCode()
        result = 31 * result + labelMedium.hashCode()
        result = 31 * result + labelSmall.hashCode()
        result = 31 * result + labelExtraSmall.hashCode()
        return result
    }

    override fun toString(): String {
        return "Typography(" +
                "displayLarge=$displayLarge, " +
                "displayMedium=$displayMedium," +
                "displaySmall=$displaySmall, " +
                "headlineLarge=$headlineLarge, " +
                "headlineMedium=$headlineMedium, " +
                "headlineSmall=$headlineSmall, " +
                "titleLarge=$titleLarge, " +
                "titleMedium=$titleMedium, " +
                "titleSmall=$titleSmall, " +
                "bodyLarge=$bodyLarge, " +
                "bodyMedium=$bodyMedium, " +
                "bodySmall=$bodySmall, " +
                "labelLarge=$labelLarge, " +
                "labelMedium=$labelMedium, " +
                "labelSmall=$labelSmall, " +
                "labelExtraSmall=$labelExtraSmall)"
    }
}

/**
 * A composition local for providing a Typography instance.
 *
 * This local can be used to provide a custom Typography instance to a composition hierarchy.
 */
internal val LocalTypography = staticCompositionLocalOf { Typography() }

/**
 * A composition local for providing a TextStyle instance.
 *
 * This local can be used to provide a custom TextStyle instance to a composition hierarchy.
 */
val LocalTextStyle = compositionLocalOf(structuralEqualityPolicy()) { TextStyle.Default }

/**
 * Provides a TextStyle to the composition hierarchy.
 *
 * This function merges the provided TextStyle with the current TextStyle in the composition hierarchy and provides the merged style.
 *
 * @param value The TextStyle to provide.
 * @param content The composable content that will use the provided TextStyle.
 */
@Composable
fun ProvideTextStyle(value: TextStyle, content: @Composable () -> Unit) {
    val mergedStyle = LocalTextStyle.current.merge(value)
    CompositionLocalProvider(LocalTextStyle provides mergedStyle, content = content)
}