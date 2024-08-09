package io.github.madmaximuus.persian.foundation

import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.Button
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse

class ColorScheme(
    primary: Color,
    onPrimary: Color,
    primaryContainer: Color,
    onPrimaryContainer: Color,
    secondary: Color,
    onSecondary: Color,
    secondaryContainer: Color,
    onSecondaryContainer: Color,
    tertiary: Color,
    onTertiary: Color,
    tertiaryContainer: Color,
    onTertiaryContainer: Color,
    surface: Color,
    onSurface: Color,
    onSurfaceVariant: Color,
    error: Color,
    onError: Color,
    errorContainer: Color,
    onErrorContainer: Color,
    valid: Color,
    onValid: Color,
    validContainer: Color,
    onValidContainer: Color,
    outline: Color,
    outlineVariant: Color,
    scrim: Color,
    surfaceDim: Color,
    surfaceBright: Color,
    surfaceContainerLowest: Color,
    surfaceContainerLow: Color,
    surfaceContainer: Color,
    surfaceContainerHigh: Color,
    surfaceContainerHighest: Color
) {
    var primary by mutableStateOf(primary, structuralEqualityPolicy())
        internal set
    var onPrimary by mutableStateOf(onPrimary, structuralEqualityPolicy())
        internal set
    var primaryContainer by mutableStateOf(primaryContainer, structuralEqualityPolicy())
        internal set
    var onPrimaryContainer by mutableStateOf(onPrimaryContainer, structuralEqualityPolicy())
        internal set
    var secondary by mutableStateOf(secondary, structuralEqualityPolicy())
        internal set
    var onSecondary by mutableStateOf(onSecondary, structuralEqualityPolicy())
        internal set
    var secondaryContainer by mutableStateOf(secondaryContainer, structuralEqualityPolicy())
        internal set
    var onSecondaryContainer by mutableStateOf(onSecondaryContainer, structuralEqualityPolicy())
        internal set
    var tertiary by mutableStateOf(tertiary, structuralEqualityPolicy())
        internal set
    var onTertiary by mutableStateOf(onTertiary, structuralEqualityPolicy())
        internal set
    var tertiaryContainer by mutableStateOf(tertiaryContainer, structuralEqualityPolicy())
        internal set
    var onTertiaryContainer by mutableStateOf(onTertiaryContainer, structuralEqualityPolicy())
        internal set
    var surface by mutableStateOf(surface, structuralEqualityPolicy())
        internal set
    var onSurface by mutableStateOf(onSurface, structuralEqualityPolicy())
        internal set
    var onSurfaceVariant by mutableStateOf(onSurfaceVariant, structuralEqualityPolicy())
        internal set
    var error by mutableStateOf(error, structuralEqualityPolicy())
        internal set
    var onError by mutableStateOf(onError, structuralEqualityPolicy())
        internal set
    var errorContainer by mutableStateOf(errorContainer, structuralEqualityPolicy())
        internal set
    var onErrorContainer by mutableStateOf(onErrorContainer, structuralEqualityPolicy())
        internal set
    var valid by mutableStateOf(valid, structuralEqualityPolicy())
        internal set
    var onValid by mutableStateOf(onValid, structuralEqualityPolicy())
        internal set
    var validContainer by mutableStateOf(validContainer, structuralEqualityPolicy())
        internal set
    var onValidContainer by mutableStateOf(onValidContainer, structuralEqualityPolicy())
        internal set
    var outline by mutableStateOf(outline, structuralEqualityPolicy())
        internal set
    var outlineVariant by mutableStateOf(outlineVariant, structuralEqualityPolicy())
        internal set
    var scrim by mutableStateOf(scrim, structuralEqualityPolicy())
        internal set
    var surfaceDim by mutableStateOf(surfaceDim, structuralEqualityPolicy())
        internal set
    var surfaceBright by mutableStateOf(surfaceBright, structuralEqualityPolicy())
        internal set
    var surfaceContainerLowest by mutableStateOf(surfaceContainerLowest, structuralEqualityPolicy())
        internal set
    var surfaceContainerLow by mutableStateOf(surfaceContainerLow, structuralEqualityPolicy())
        internal set
    var surfaceContainer by mutableStateOf(surfaceContainer, structuralEqualityPolicy())
        internal set
    var surfaceContainerHigh by mutableStateOf(surfaceContainerHigh, structuralEqualityPolicy())
        internal set
    var surfaceContainerHighest by mutableStateOf(surfaceContainerHighest, structuralEqualityPolicy())
        internal set

    /** Returns a copy of this ColorScheme, optionally overriding some of the values. */
    fun copy(
        primary: Color = this.primary,
        onPrimary: Color = this.onPrimary,
        primaryContainer: Color = this.primaryContainer,
        onPrimaryContainer: Color = this.onPrimaryContainer,
        secondary: Color = this.secondary,
        onSecondary: Color = this.onSecondary,
        secondaryContainer: Color = this.secondaryContainer,
        onSecondaryContainer: Color = this.onSecondaryContainer,
        tertiary: Color = this.tertiary,
        onTertiary: Color = this.onTertiary,
        tertiaryContainer: Color = this.tertiaryContainer,
        onTertiaryContainer: Color = this.onTertiaryContainer,
        surface: Color = this.surface,
        onSurface: Color = this.onSurface,
        onSurfaceVariant: Color = this.onSurfaceVariant,
        error: Color = this.error,
        onError: Color = this.onError,
        errorContainer: Color = this.errorContainer,
        onErrorContainer: Color = this.onErrorContainer,
        valid: Color = this.valid,
        onValid: Color = this.onValid,
        validContainer: Color = this.validContainer,
        onValidContainer: Color = this.onValidContainer,
        outline: Color = this.outline,
        outlineVariant: Color = this.outlineVariant,
        scrim: Color = this.scrim,
        surfaceDim: Color = this.surfaceDim,
        surfaceBright: Color = this.surfaceBright,
        surfaceContainerLowest: Color = this.surfaceContainerLowest,
        surfaceContainerLow: Color = this.surfaceContainerLow,
        surfaceContainer: Color = this.surfaceContainer,
        surfaceContainerHigh: Color = this.surfaceContainerHigh,
        surfaceContainerHighest: Color = this.surfaceContainerHighest
    ): ColorScheme =
        ColorScheme(
            primary = primary.takeOrElse { this.primary },
            onPrimary = onPrimary.takeOrElse { this.onPrimary },
            primaryContainer = primaryContainer.takeOrElse { this.primaryContainer },
            onPrimaryContainer = onPrimaryContainer.takeOrElse { this.onPrimaryContainer },
            secondary = secondary.takeOrElse { this.secondary },
            onSecondary = onSecondary.takeOrElse { this.onSecondary },
            secondaryContainer = secondaryContainer.takeOrElse { this.secondaryContainer },
            onSecondaryContainer = onSecondaryContainer.takeOrElse { this.onSecondaryContainer },
            tertiary = tertiary.takeOrElse { this.tertiary },
            onTertiary = onTertiary.takeOrElse { this.onTertiary },
            tertiaryContainer = tertiaryContainer.takeOrElse { this.tertiaryContainer },
            onTertiaryContainer = onTertiaryContainer.takeOrElse { this.onTertiaryContainer },
            surface = surface.takeOrElse { this.surface },
            onSurface = onSurface.takeOrElse { this.onSurface },
            onSurfaceVariant = onSurfaceVariant.takeOrElse { this.onSurfaceVariant },
            error = error.takeOrElse { this.error },
            onError = onError.takeOrElse { this.onError },
            errorContainer = errorContainer.takeOrElse { this.errorContainer },
            onErrorContainer = onErrorContainer.takeOrElse { this.onErrorContainer },
            valid = valid.takeOrElse { this.valid },
            onValid = onValid.takeOrElse { this.onValid },
            validContainer = validContainer.takeOrElse { this.validContainer },
            onValidContainer = onValidContainer.takeOrElse { this.onValidContainer },
            outline = outline.takeOrElse { this.outline },
            outlineVariant = outlineVariant.takeOrElse { this.outlineVariant },
            scrim = scrim.takeOrElse { this.scrim },
            surfaceDim = surfaceDim.takeOrElse { this.surfaceDim },
            surfaceBright = surfaceBright.takeOrElse { this.surfaceBright },
            surfaceContainerLowest = surfaceContainerLowest.takeOrElse { this.surfaceContainerLowest },
            surfaceContainerLow = surfaceContainerLow.takeOrElse { this.surfaceContainerLow },
            surfaceContainer = surfaceContainer.takeOrElse { this.surfaceContainer },
            surfaceContainerHigh = surfaceContainerHigh.takeOrElse { this.surfaceContainerHigh },
            surfaceContainerHighest = surfaceContainerHighest.takeOrElse { this.surfaceContainerHighest },
        )

    override fun toString(): String {
        return "ColorScheme(" +
                "\tprimary = $primary\n" +
                "\tonPrimary = $onPrimary\n" +
                "\tprimaryContainer = $primaryContainer\n" +
                "\tonPrimaryContainer = $onPrimaryContainer\n" +
                "\tsecondary = $secondary\n" +
                "\tonSecondary = $onSecondary\n" +
                "\tsecondaryContainer = $secondaryContainer\n" +
                "\tonSecondaryContainer = $onSecondaryContainer\n" +
                "\ttertiary = $tertiary\n" +
                "\tonTertiary = $onTertiary\n" +
                "\ttertiaryContainer = $tertiaryContainer\n" +
                "\tonTertiaryContainer = $onTertiaryContainer\n" +
                "\tsurface = $surface\n" +
                "\tonSurface = $onSurface\n" +
                "\tsurfaceVariant = $onSurfaceVariant\n" +
                "\terror = $error\n" +
                "\tonError = $onError\n" +
                "\terrorContainer = $errorContainer\n" +
                "\tonErrorContainer = $onErrorContainer\n" +
                "\tcorrect = $valid\n" +
                "\tonCorrect = $onValid\n" +
                "\tcorrectContainer = $validContainer\n" +
                "\tonCorrectContainer = $onValidContainer\n" +
                "\toutline = $outline\n" +
                "\toutlineVariant = $outlineVariant\n" +
                "\tscrim=$scrim\n" +
                "\tscrim=$surfaceDim\n" +
                "\tscrim=$surfaceBright\n" +
                "\tscrim=$surfaceContainerLowest\n" +
                "\tscrim=$surfaceContainerLow\n" +
                "\tscrim=$surfaceContainer\n" +
                "\tscrim=$surfaceContainerHigh\n" +
                "\tscrim=$surfaceContainerHighest\n" +
                ")"
    }
}

/**
 * Returns a light Material color scheme.
 */
fun lightColorScheme(
    primary: Color = Color(0xFF6F528A),
    onPrimary: Color = Color(0xFFFFFFFF),
    primaryContainer: Color = Color(0xFFF0DBFF),
    onPrimaryContainer: Color =  Color(0xFF280D42),
    secondary: Color =  Color(0xFF665A6F),
    onSecondary: Color =  Color(0xFFFFFFFF),
    secondaryContainer: Color =  Color(0xFFEDDDF6),
    onSecondaryContainer: Color =  Color(0xFF211829),
    tertiary: Color =  Color(0xFF805157),
    onTertiary: Color =  Color(0xFFFFFFFF),
    tertiaryContainer: Color =  Color(0xFFFFD9DD),
    onTertiaryContainer: Color =  Color(0xFF321016),
    surface: Color =  Color(0xFFFFF7FE),
    onSurface: Color =  Color(0xFF1E1A20),
    onSurfaceVariant: Color =  Color(0xFF4A454E),
    error: Color =  Color(0xFFBA1A1A),
    onError: Color =  Color(0xFFFFFFFF),
    errorContainer: Color =  Color(0xFFFFDAD6),
    onErrorContainer: Color =  Color(0xFF410002),
    valid: Color =  Color(0xFF36693E),
    onValid: Color =  Color(0xFFFFFFFF),
    validContainer: Color =  Color(0xFFB7F1BA),
    onValidContainer: Color =  Color(0xFF002108),
    outline: Color =  Color(0xFF7C757E),
    outlineVariant: Color =  Color(0xFFCCC4CE),
    scrim: Color =  Color(0xFF000000),
    surfaceDim: Color = Color(0xFFDFD8DF),
    surfaceBright: Color = Color(0xFFFFF7FE),
    surfaceContainerLowest: Color = Color(0xFFFFFFFF),
    surfaceContainerLow: Color = Color(0xFFF9F1F9),
    surfaceContainer: Color = Color(0xFFF4EBF3),
    surfaceContainerHigh: Color = Color(0xFFEEE6EE),
    surfaceContainerHighest: Color = Color(0xFFE8E0E8),
): ColorScheme =
    ColorScheme(
        primary = primary,
        onPrimary = onPrimary,
        primaryContainer = primaryContainer,
        onPrimaryContainer = onPrimaryContainer,
        secondary = secondary,
        onSecondary = onSecondary,
        secondaryContainer = secondaryContainer,
        onSecondaryContainer = onSecondaryContainer,
        tertiary = tertiary,
        onTertiary = onTertiary,
        tertiaryContainer = tertiaryContainer,
        onTertiaryContainer = onTertiaryContainer,
        surface = surface,
        onSurface = onSurface,
        onSurfaceVariant = onSurfaceVariant,
        error = error,
        onError = onError,
        errorContainer = errorContainer,
        onErrorContainer = onErrorContainer,
        valid = valid,
        onValid = onValid,
        validContainer = validContainer,
        onValidContainer = onValidContainer,
        outline = outline,
        outlineVariant = outlineVariant,
        scrim = scrim,
        surfaceDim = surfaceDim,
        surfaceBright = surfaceBright,
        surfaceContainerLowest = surfaceContainerLowest,
        surfaceContainerLow = surfaceContainerLow,
        surfaceContainer = surfaceContainer,
        surfaceContainerHigh = surfaceContainerHigh,
        surfaceContainerHighest = surfaceContainerHighest
    )

/**
 * Returns a dark Material color scheme.
 */
fun darkColorScheme(
    primary: Color = Color(0xFFDBB9F9),
    onPrimary: Color = Color(0xFF3E2458),
    primaryContainer: Color = Color(0xFF563B71),
    onPrimaryContainer: Color = Color(0xFFF0DBFF),
    secondary: Color = Color(0xFFD0C1DA),
    onSecondary: Color = Color(0xFF362C3F),
    secondaryContainer: Color = Color(0xFF4D4356),
    onSecondaryContainer: Color = Color(0xFFEDDDF6),
    tertiary: Color = Color(0xFFF3B7BE),
    onTertiary: Color = Color(0xFF4B252B),
    tertiaryContainer: Color = Color(0xFF653A40),
    onTertiaryContainer: Color = Color(0xFFFFD9DD),
    surface: Color = Color(0xFF151218),
    onSurface: Color = Color(0xFFE8E0E8),
    onSurfaceVariant: Color = Color(0xFFCCC4CE),
    error: Color = Color(0xFFFFB4AB),
    onError: Color = Color(0xFF690005),
    errorContainer: Color = Color(0xFF93000A),
    onErrorContainer: Color = Color(0xFFFFDAD6),
    valid: Color = Color(0xFF9CD49F),
    onValid: Color = Color(0xFF003914),
    validContainer: Color = Color(0xFF1D5128),
    onValidContainer: Color = Color(0xFFB7F1BA),
    outline: Color = Color(0xFF968E98),
    outlineVariant: Color = Color(0xFF4A454E),
    scrim: Color = Color(0xFF000000),
    surfaceDim: Color = Color(0xFF151218),
    surfaceBright: Color = Color(0xFF3C383E),
    surfaceContainerLowest: Color = Color(0xFF100D12),
    surfaceContainerLow: Color = Color(0xFF1E1A20),
    surfaceContainer: Color = Color(0xFF221E24),
    surfaceContainerHigh: Color = Color(0xFF2C292E),
    surfaceContainerHighest: Color = Color(0xFF373339),
): ColorScheme =
    ColorScheme(
        primary = primary,
        onPrimary = onPrimary,
        primaryContainer = primaryContainer,
        onPrimaryContainer = onPrimaryContainer,
        secondary = secondary,
        onSecondary = onSecondary,
        secondaryContainer = secondaryContainer,
        onSecondaryContainer = onSecondaryContainer,
        tertiary = tertiary,
        onTertiary = onTertiary,
        tertiaryContainer = tertiaryContainer,
        onTertiaryContainer = onTertiaryContainer,
        surface = surface,
        onSurface = onSurface,
        onSurfaceVariant = onSurfaceVariant,
        error = error,
        onError = onError,
        errorContainer = errorContainer,
        onErrorContainer = onErrorContainer,
        valid = valid,
        onValid = onValid,
        validContainer = validContainer,
        onValidContainer = onValidContainer,
        outline = outline,
        outlineVariant = outlineVariant,
        scrim = scrim,
        surfaceDim = surfaceDim,
        surfaceBright = surfaceBright,
        surfaceContainerLowest = surfaceContainerLowest,
        surfaceContainerLow = surfaceContainerLow,
        surfaceContainer = surfaceContainer,
        surfaceContainerHigh = surfaceContainerHigh,
        surfaceContainerHighest = surfaceContainerHighest
    )

val LightColorScheme = lightColorScheme()

val DarkColorScheme = darkColorScheme()

val LocalColorScheme = staticCompositionLocalOf { LightColorScheme }

@Composable
internal fun rememberTextSelectionColors(colorScheme: ColorScheme): TextSelectionColors {
    val primaryColor = colorScheme.primary
    return remember(primaryColor) {
        TextSelectionColors(
            handleColor = primaryColor,
            backgroundColor = primaryColor.copy(alpha = 0.4f),
        )
    }
}

/**
 * The Material color system contains pairs of colors that are typically used for the background and
 * content color inside a component. For example, a [Button] typically uses `primary` for its
 * background, and `onPrimary` for the color of its content (usually text or iconography).
 *
 * This function tries to match the provided [backgroundColor] to a 'background' color in this
 * [ColorScheme], and then will return the corresponding color used for content. For example, when
 * [backgroundColor] is [ColorScheme.primary], this will return [ColorScheme.onPrimary].
 *
 * If [backgroundColor] does not match a background color in the theme, this will return
 * [Color.Unspecified].
 *
 * @return the matching content color for [backgroundColor]. If [backgroundColor] is not present in
 * the theme's [ColorScheme], then returns [Color.Unspecified].
 *
 * @see contentColorFor
 */
@Stable
fun ColorScheme.contentColorFor(backgroundColor: Color): Color =
    when (backgroundColor) {
        primary -> onPrimary
        secondary -> onSecondary
        tertiary -> onTertiary
        error -> onError
        valid -> onValid
        primaryContainer -> onPrimaryContainer
        secondaryContainer -> onSecondaryContainer
        tertiaryContainer -> onTertiaryContainer
        errorContainer -> onErrorContainer
        validContainer -> onValidContainer
        surface -> onSurface
        surfaceDim -> onSurface
        surfaceBright -> onSurface
        surfaceContainerLowest -> onSurface
        surfaceContainerLow -> onSurface
        surfaceContainer -> onSurface
        surfaceContainerHigh -> onSurface
        surfaceContainerHighest -> onSurface
        else -> Color.Unspecified
    }

/**
 * The Material color system contains pairs of colors that are typically used for the background and
 * content color inside a component. For example, a [Button] typically uses `primary` for its
 * background, and `onPrimary` for the color of its content (usually text or iconography).
 *
 * This function tries to match the provided [backgroundColor] to a 'background' color in this
 * [ColorScheme], and then will return the corresponding color used for content. For example, when
 * [backgroundColor] is [ColorScheme.primary], this will return [ColorScheme.onPrimary].
 *
 * If [backgroundColor] does not match a background color in the theme, this will return the current
 * value of [LocalContentColor] as a best-effort color.
 *
 * @return the matching content color for [backgroundColor]. If [backgroundColor] is not present in
 * the theme's [ColorScheme], then returns the current value of [LocalContentColor].
 *
 * @see ColorScheme.contentColorFor
 */
@Composable
@ReadOnlyComposable
fun contentColorFor(backgroundColor: Color) =
    PersianTheme.colorScheme.contentColorFor(backgroundColor)
        .takeOrElse { LocalContentColor.current }


/**
 * CompositionLocal containing the preferred content color for a given position in the hierarchy.
 * This typically represents the `on` color for a color in [ColorScheme]. For example, if the
 * background color is [ColorScheme.surface], this color is typically set to
 * [ColorScheme.onSurface].
 *
 * This color should be used for any typography / iconography, to ensure that the color of these
 * adjusts when the background color changes. For example, on a dark background, text should be
 * light, and on a light background, text should be dark.
 *
 * Defaults to [Color.Black] if no color has been explicitly set.
 */
val LocalContentColor = compositionLocalOf { Color.Black }