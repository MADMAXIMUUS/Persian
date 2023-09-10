package ru.rabbit.persian.foundation

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlin.math.ln

const val PersianStatesDisabled = .12f
const val PersianContentStateDisabled = .38f

val lightColorScheme = lightColorScheme(
    primary = Primary40,
    primaryContainer = Primary90,
    onPrimary = Primary100,
    onPrimaryContainer = Primary10,
    inversePrimary = Primary80,
    secondary = Secondary40,
    secondaryContainer = Secondary90,
    onSecondary = Secondary100,
    onSecondaryContainer = Secondary10,
    tertiary = Tertiary40,
    tertiaryContainer = Tertiary90,
    onTertiary = Tertiary100,
    onTertiaryContainer = Tertiary10,
    surface = Neutral98,
    surfaceVariant = NeutralVariant90,
    onSurface = Neutral10,
    onSurfaceVariant = NeutralVariant30,
    inverseSurface = Neutral20,
    inverseOnSurface = Neutral95,
    background = Neutral98,
    onBackground = Neutral10,
    error = Error40,
    errorContainer = Error90,
    onError = Error100,
    onErrorContainer = Error10,
    outline = NeutralVariant50,
    outlineVariant = NeutralVariant80,
    scrim = Neutral0,
)

val darkColorScheme = darkColorScheme(
    primary = Primary80,
    primaryContainer = Primary30,
    onPrimary = Primary20,
    onPrimaryContainer = Primary90,
    inversePrimary = Primary40,
    secondary = Secondary80,
    secondaryContainer = Secondary30,
    onSecondary = Secondary20,
    onSecondaryContainer = Secondary90,
    tertiary = Tertiary80,
    tertiaryContainer = Tertiary30,
    onTertiary = Tertiary20,
    onTertiaryContainer = Tertiary90,
    surface = Neutral6,
    surfaceVariant = NeutralVariant30,
    onSurface = Neutral90,
    onSurfaceVariant = NeutralVariant80,
    inverseSurface = Neutral90,
    inverseOnSurface = Neutral20,
    background = Neutral6,
    onBackground = Neutral90,
    error = Error80,
    errorContainer = Error30,
    onError = Error20,
    onErrorContainer = Error90,
    outline = NeutralVariant60,
    outlineVariant = NeutralVariant30,
    scrim = Neutral0,
)

class ExtendedColorScheme(
    primary: Color,
    onPrimary: Color,
    primaryContainer: Color,
    onPrimaryContainer: Color,
    inversePrimary: Color,
    secondary: Color,
    onSecondary: Color,
    secondaryContainer: Color,
    onSecondaryContainer: Color,
    tertiary: Color,
    onTertiary: Color,
    tertiaryContainer: Color,
    onTertiaryContainer: Color,
    background: Color,
    onBackground: Color,
    surface: Color,
    onSurface: Color,
    surfaceVariant: Color,
    onSurfaceVariant: Color,
    surfaceTint: Color,
    inverseSurface: Color,
    inverseOnSurface: Color,
    error: Color,
    onError: Color,
    errorContainer: Color,
    onErrorContainer: Color,
    correct: Color,
    onCorrect: Color,
    correctContainer: Color,
    onCorrectContainer: Color,
    outline: Color,
    outlineVariant: Color,
    scrim: Color
) {
    var primary by mutableStateOf(primary, structuralEqualityPolicy())
        internal set
    var onPrimary by mutableStateOf(onPrimary, structuralEqualityPolicy())
        internal set
    var primaryContainer by mutableStateOf(primaryContainer, structuralEqualityPolicy())
        internal set
    var onPrimaryContainer by mutableStateOf(onPrimaryContainer, structuralEqualityPolicy())
        internal set
    var inversePrimary by mutableStateOf(inversePrimary, structuralEqualityPolicy())
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
    var background by mutableStateOf(background, structuralEqualityPolicy())
        internal set
    var onBackground by mutableStateOf(onBackground, structuralEqualityPolicy())
        internal set
    var surface by mutableStateOf(surface, structuralEqualityPolicy())
        internal set
    var onSurface by mutableStateOf(onSurface, structuralEqualityPolicy())
        internal set
    var surfaceVariant by mutableStateOf(surfaceVariant, structuralEqualityPolicy())
        internal set
    var onSurfaceVariant by mutableStateOf(onSurfaceVariant, structuralEqualityPolicy())
        internal set
    var surfaceTint by mutableStateOf(surfaceTint, structuralEqualityPolicy())
        internal set
    var inverseSurface by mutableStateOf(inverseSurface, structuralEqualityPolicy())
        internal set
    var inverseOnSurface by mutableStateOf(inverseOnSurface, structuralEqualityPolicy())
        internal set
    var error by mutableStateOf(error, structuralEqualityPolicy())
        internal set
    var onError by mutableStateOf(onError, structuralEqualityPolicy())
        internal set
    var errorContainer by mutableStateOf(errorContainer, structuralEqualityPolicy())
        internal set
    var onErrorContainer by mutableStateOf(onErrorContainer, structuralEqualityPolicy())
        internal set
    var correct by mutableStateOf(correct, structuralEqualityPolicy())
        internal set
    var onCorrect by mutableStateOf(onCorrect, structuralEqualityPolicy())
        internal set
    var correctContainer by mutableStateOf(correctContainer, structuralEqualityPolicy())
        internal set
    var onCorrectContainer by mutableStateOf(onCorrectContainer, structuralEqualityPolicy())
        internal set
    var outline by mutableStateOf(outline, structuralEqualityPolicy())
        internal set
    var outlineVariant by mutableStateOf(outlineVariant, structuralEqualityPolicy())
        internal set
    var scrim by mutableStateOf(scrim, structuralEqualityPolicy())
        internal set

    /** Returns a copy of this ColorScheme, optionally overriding some of the values. */
    fun copy(
        primary: Color = this.primary,
        onPrimary: Color = this.onPrimary,
        primaryContainer: Color = this.primaryContainer,
        onPrimaryContainer: Color = this.onPrimaryContainer,
        inversePrimary: Color = this.inversePrimary,
        secondary: Color = this.secondary,
        onSecondary: Color = this.onSecondary,
        secondaryContainer: Color = this.secondaryContainer,
        onSecondaryContainer: Color = this.onSecondaryContainer,
        tertiary: Color = this.tertiary,
        onTertiary: Color = this.onTertiary,
        tertiaryContainer: Color = this.tertiaryContainer,
        onTertiaryContainer: Color = this.onTertiaryContainer,
        background: Color = this.background,
        onBackground: Color = this.onBackground,
        surface: Color = this.surface,
        onSurface: Color = this.onSurface,
        surfaceVariant: Color = this.surfaceVariant,
        onSurfaceVariant: Color = this.onSurfaceVariant,
        surfaceTint: Color = this.surfaceTint,
        inverseSurface: Color = this.inverseSurface,
        inverseOnSurface: Color = this.inverseOnSurface,
        error: Color = this.error,
        onError: Color = this.onError,
        errorContainer: Color = this.errorContainer,
        onErrorContainer: Color = this.onErrorContainer,
        correct: Color = this.error,
        onCorrect: Color = this.onError,
        correctContainer: Color = this.errorContainer,
        onCorrectContainer: Color = this.onErrorContainer,
        outline: Color = this.outline,
        outlineVariant: Color = this.outlineVariant,
        scrim: Color = this.scrim,
    ): ExtendedColorScheme =
        ExtendedColorScheme(
            primary = primary,
            onPrimary = onPrimary,
            primaryContainer = primaryContainer,
            onPrimaryContainer = onPrimaryContainer,
            inversePrimary = inversePrimary,
            secondary = secondary,
            onSecondary = onSecondary,
            secondaryContainer = secondaryContainer,
            onSecondaryContainer = onSecondaryContainer,
            tertiary = tertiary,
            onTertiary = onTertiary,
            tertiaryContainer = tertiaryContainer,
            onTertiaryContainer = onTertiaryContainer,
            background = background,
            onBackground = onBackground,
            surface = surface,
            onSurface = onSurface,
            surfaceVariant = surfaceVariant,
            onSurfaceVariant = onSurfaceVariant,
            surfaceTint = surfaceTint,
            inverseSurface = inverseSurface,
            inverseOnSurface = inverseOnSurface,
            error = error,
            onError = onError,
            errorContainer = errorContainer,
            onErrorContainer = onErrorContainer,
            correct = correct,
            onCorrect = onCorrect,
            correctContainer = correctContainer,
            onCorrectContainer = onCorrectContainer,
            outline = outline,
            outlineVariant = outlineVariant,
            scrim = scrim,
        )

    override fun toString(): String {
        return "ColorScheme(" +
                "primary=$primary" +
                "onPrimary=$onPrimary" +
                "primaryContainer=$primaryContainer" +
                "onPrimaryContainer=$onPrimaryContainer" +
                "inversePrimary=$inversePrimary" +
                "secondary=$secondary" +
                "onSecondary=$onSecondary" +
                "secondaryContainer=$secondaryContainer" +
                "onSecondaryContainer=$onSecondaryContainer" +
                "tertiary=$tertiary" +
                "onTertiary=$onTertiary" +
                "tertiaryContainer=$tertiaryContainer" +
                "onTertiaryContainer=$onTertiaryContainer" +
                "background=$background" +
                "onBackground=$onBackground" +
                "surface=$surface" +
                "onSurface=$onSurface" +
                "surfaceVariant=$surfaceVariant" +
                "onSurfaceVariant=$onSurfaceVariant" +
                "surfaceTint=$surfaceTint" +
                "inverseSurface=$inverseSurface" +
                "inverseOnSurface=$inverseOnSurface" +
                "error=$error" +
                "onError=$onError" +
                "errorContainer=$errorContainer" +
                "onErrorContainer=$onErrorContainer" +
                "correct=$correct" +
                "onCorrect=$onCorrect" +
                "correctContainer=$correctContainer" +
                "onCorrectContainer=$onCorrectContainer" +
                "outline=$outline" +
                "outlineVariant=$outlineVariant" +
                "scrim=$scrim" +
                ")"
    }
}

/**
 * Returns a light Material color scheme.
 */
fun lightColorScheme(
    primary: Color = lightColorScheme.primary,
    onPrimary: Color = lightColorScheme.onPrimary,
    primaryContainer: Color = lightColorScheme.primaryContainer,
    onPrimaryContainer: Color = lightColorScheme.onPrimaryContainer,
    inversePrimary: Color = lightColorScheme.inversePrimary,
    secondary: Color = lightColorScheme.secondary,
    onSecondary: Color = lightColorScheme.onSecondary,
    secondaryContainer: Color = lightColorScheme.secondaryContainer,
    onSecondaryContainer: Color = lightColorScheme.onSecondaryContainer,
    tertiary: Color = lightColorScheme.tertiary,
    onTertiary: Color = lightColorScheme.onTertiary,
    tertiaryContainer: Color = lightColorScheme.tertiaryContainer,
    onTertiaryContainer: Color = lightColorScheme.onTertiaryContainer,
    background: Color = lightColorScheme.background,
    onBackground: Color = lightColorScheme.onBackground,
    surface: Color = lightColorScheme.surface,
    onSurface: Color = lightColorScheme.onSurface,
    surfaceVariant: Color = lightColorScheme.surfaceVariant,
    onSurfaceVariant: Color = lightColorScheme.onSurfaceVariant,
    surfaceTint: Color = primary,
    inverseSurface: Color = lightColorScheme.inverseSurface,
    inverseOnSurface: Color = lightColorScheme.inverseOnSurface,
    error: Color = lightColorScheme.error,
    onError: Color = lightColorScheme.onError,
    errorContainer: Color = lightColorScheme.errorContainer,
    onErrorContainer: Color = lightColorScheme.onErrorContainer,
    correct: Color = Correct40,
    onCorrect: Color = Correct100,
    correctContainer: Color = Correct90,
    onCorrectContainer: Color = Correct10,
    outline: Color = lightColorScheme.outline,
    outlineVariant: Color = lightColorScheme.outlineVariant,
    scrim: Color = lightColorScheme.scrim,
): ExtendedColorScheme =
    ExtendedColorScheme(
        primary = primary,
        onPrimary = onPrimary,
        primaryContainer = primaryContainer,
        onPrimaryContainer = onPrimaryContainer,
        inversePrimary = inversePrimary,
        secondary = secondary,
        onSecondary = onSecondary,
        secondaryContainer = secondaryContainer,
        onSecondaryContainer = onSecondaryContainer,
        tertiary = tertiary,
        onTertiary = onTertiary,
        tertiaryContainer = tertiaryContainer,
        onTertiaryContainer = onTertiaryContainer,
        background = background,
        onBackground = onBackground,
        surface = surface,
        onSurface = onSurface,
        surfaceVariant = surfaceVariant,
        onSurfaceVariant = onSurfaceVariant,
        surfaceTint = surfaceTint,
        inverseSurface = inverseSurface,
        inverseOnSurface = inverseOnSurface,
        error = error,
        onError = onError,
        errorContainer = errorContainer,
        onErrorContainer = onErrorContainer,
        correct = correct,
        onCorrect = onCorrect,
        correctContainer = correctContainer,
        onCorrectContainer = onCorrectContainer,
        outline = outline,
        outlineVariant = outlineVariant,
        scrim = scrim
    )

/**
 * Returns a dark Material color scheme.
 */
fun darkColorScheme(
    primary: Color = darkColorScheme.primary,
    onPrimary: Color = darkColorScheme.onPrimary,
    primaryContainer: Color = darkColorScheme.primaryContainer,
    onPrimaryContainer: Color = darkColorScheme.onPrimaryContainer,
    inversePrimary: Color = darkColorScheme.inversePrimary,
    secondary: Color = darkColorScheme.secondary,
    onSecondary: Color = darkColorScheme.onSecondary,
    secondaryContainer: Color = darkColorScheme.secondaryContainer,
    onSecondaryContainer: Color = darkColorScheme.onSecondaryContainer,
    tertiary: Color = darkColorScheme.tertiary,
    onTertiary: Color = darkColorScheme.onTertiary,
    tertiaryContainer: Color = darkColorScheme.tertiaryContainer,
    onTertiaryContainer: Color = darkColorScheme.onTertiaryContainer,
    background: Color = darkColorScheme.background,
    onBackground: Color = darkColorScheme.onBackground,
    surface: Color = darkColorScheme.surface,
    onSurface: Color = darkColorScheme.onSurface,
    surfaceVariant: Color = darkColorScheme.surface,
    onSurfaceVariant: Color = darkColorScheme.onSurfaceVariant,
    surfaceTint: Color = primary,
    inverseSurface: Color = darkColorScheme.inverseSurface,
    inverseOnSurface: Color = darkColorScheme.inverseOnSurface,
    error: Color = darkColorScheme.error,
    onError: Color = darkColorScheme.onError,
    errorContainer: Color = darkColorScheme.errorContainer,
    onErrorContainer: Color = darkColorScheme.onErrorContainer,
    correct: Color = Correct80,
    onCorrect: Color = Correct20,
    correctContainer: Color = Correct30,
    onCorrectContainer: Color = Correct90,
    outline: Color = darkColorScheme.outline,
    outlineVariant: Color = darkColorScheme.outlineVariant,
    scrim: Color = darkColorScheme.scrim,
): ExtendedColorScheme =
    ExtendedColorScheme(
        primary = primary,
        onPrimary = onPrimary,
        primaryContainer = primaryContainer,
        onPrimaryContainer = onPrimaryContainer,
        inversePrimary = inversePrimary,
        secondary = secondary,
        onSecondary = onSecondary,
        secondaryContainer = secondaryContainer,
        onSecondaryContainer = onSecondaryContainer,
        tertiary = tertiary,
        onTertiary = onTertiary,
        tertiaryContainer = tertiaryContainer,
        onTertiaryContainer = onTertiaryContainer,
        background = background,
        onBackground = onBackground,
        surface = surface,
        onSurface = onSurface,
        surfaceVariant = surfaceVariant,
        onSurfaceVariant = onSurfaceVariant,
        surfaceTint = surfaceTint,
        inverseSurface = inverseSurface,
        inverseOnSurface = inverseOnSurface,
        error = error,
        onError = onError,
        errorContainer = errorContainer,
        onErrorContainer = onErrorContainer,
        correct = correct,
        onCorrect = onCorrect,
        correctContainer = correctContainer,
        onCorrectContainer = onCorrectContainer,
        outline = outline,
        outlineVariant = outlineVariant,
        scrim = scrim,
    )

val LightColorScheme = lightColorScheme(
    primary = Primary40,
    primaryContainer = Primary90,
    onPrimary = Primary100,
    onPrimaryContainer = Primary10,
    inversePrimary = Primary80,
    secondary = Secondary40,
    secondaryContainer = Secondary90,
    onSecondary = Secondary100,
    onSecondaryContainer = Secondary10,
    tertiary = Tertiary40,
    tertiaryContainer = Tertiary90,
    onTertiary = Tertiary100,
    onTertiaryContainer = Tertiary10,
    surface = Neutral98,
    surfaceVariant = NeutralVariant90,
    onSurface = Neutral10,
    onSurfaceVariant = NeutralVariant30,
    inverseSurface = Neutral20,
    inverseOnSurface = Neutral95,
    background = Neutral98,
    onBackground = Neutral10,
    error = Error40,
    errorContainer = Error90,
    onError = Error100,
    onErrorContainer = Error10,
    correct = Correct40,
    correctContainer = Correct90,
    onCorrect = Correct100,
    onCorrectContainer = Correct10,
    outline = NeutralVariant50,
    outlineVariant = NeutralVariant80,
    scrim = Neutral0,
)

val DarkColorScheme = darkColorScheme(
    primary = Primary80,
    primaryContainer = Primary30,
    onPrimary = Primary20,
    onPrimaryContainer = Primary90,
    inversePrimary = Primary40,
    secondary = Secondary80,
    secondaryContainer = Secondary30,
    onSecondary = Secondary20,
    onSecondaryContainer = Secondary90,
    tertiary = Tertiary80,
    tertiaryContainer = Tertiary30,
    onTertiary = Tertiary20,
    onTertiaryContainer = Tertiary90,
    surface = Neutral6,
    surfaceVariant = NeutralVariant30,
    onSurface = Neutral90,
    onSurfaceVariant = NeutralVariant80,
    inverseSurface = Neutral90,
    inverseOnSurface = Neutral20,
    background = Neutral6,
    onBackground = Neutral90,
    error = Error80,
    errorContainer = Error30,
    onError = Error20,
    onErrorContainer = Error90,
    correct = Correct80,
    correctContainer = Correct30,
    onCorrect = Correct20,
    onCorrectContainer = Correct90,
    outline = NeutralVariant60,
    outlineVariant = NeutralVariant30,
    scrim = Neutral0,
)

val LocalColorScheme = staticCompositionLocalOf { LightColorScheme }

val MaterialTheme.extendedColorScheme: ExtendedColorScheme
    @Composable
    @ReadOnlyComposable
    get() = LocalColorScheme.current

fun ExtendedColorScheme.surfaceColorAtElevation(
    elevation: Dp,
): Color {
    if (elevation == 0.dp) return surface
    val alpha = ((4.5f * ln(elevation.value + 1)) + 2f) / 100f
    return surfaceTint.copy(alpha = alpha).compositeOver(surface)
}