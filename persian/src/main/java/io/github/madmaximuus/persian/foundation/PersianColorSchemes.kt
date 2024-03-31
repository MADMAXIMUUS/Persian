package io.github.madmaximuus.persian.foundation

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color

val lightColorScheme = androidx.compose.material3.lightColorScheme(
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

val darkColorScheme = androidx.compose.material3.darkColorScheme(
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
    surfaceVariant: Color,
    onSurfaceVariant: Color,
    surfaceTint: Color,
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
    surface1: Color,
    surface2: Color,
    surface3: Color,
    surface4: Color,
    surface5: Color
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
    var surfaceVariant by mutableStateOf(surfaceVariant, structuralEqualityPolicy())
        internal set
    var onSurfaceVariant by mutableStateOf(onSurfaceVariant, structuralEqualityPolicy())
        internal set
    var surfaceTint by mutableStateOf(surfaceTint, structuralEqualityPolicy())
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
    var surface1 by mutableStateOf(surface1, structuralEqualityPolicy())
        internal set
    var surface2 by mutableStateOf(surface2, structuralEqualityPolicy())
        internal set
    var surface3 by mutableStateOf(surface3, structuralEqualityPolicy())
        internal set
    var surface4 by mutableStateOf(surface4, structuralEqualityPolicy())
        internal set
    var surface5 by mutableStateOf(surface5, structuralEqualityPolicy())
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
        surfaceVariant: Color = this.surfaceVariant,
        onSurfaceVariant: Color = this.onSurfaceVariant,
        surfaceTint: Color = this.surfaceTint,
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
        surface1: Color = this.surface1,
        surface2: Color = this.surface2,
        surface3: Color = this.surface3,
        surface4: Color = this.surface4,
        surface5: Color = this.surface5
    ): ExtendedColorScheme =
        ExtendedColorScheme(
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
            surfaceVariant = surfaceVariant,
            onSurfaceVariant = onSurfaceVariant,
            surfaceTint = surfaceTint,
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
            surface1 = surface1,
            surface2 = surface2,
            surface3 = surface3,
            surface4 = surface4,
            surface5 = surface5,
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
                "\tsurfaceVariant = $surfaceVariant\n" +
                "\tonSurfaceVariant = $onSurfaceVariant\n" +
                "\tsurfaceTint = $surfaceTint\n" +
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
                "\tscrim=$surface1\n" +
                "\tscrim=$surface2\n" +
                "\tscrim=$surface3\n" +
                "\tscrim=$surface4\n" +
                "\tscrim=$surface5\n" +
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
    secondary: Color = lightColorScheme.secondary,
    onSecondary: Color = lightColorScheme.onSecondary,
    secondaryContainer: Color = lightColorScheme.secondaryContainer,
    onSecondaryContainer: Color = lightColorScheme.onSecondaryContainer,
    tertiary: Color = lightColorScheme.tertiary,
    onTertiary: Color = lightColorScheme.onTertiary,
    tertiaryContainer: Color = lightColorScheme.tertiaryContainer,
    onTertiaryContainer: Color = lightColorScheme.onTertiaryContainer,
    surface: Color = lightColorScheme.surface,
    onSurface: Color = lightColorScheme.onSurface,
    surfaceVariant: Color = lightColorScheme.surfaceVariant,
    onSurfaceVariant: Color = lightColorScheme.onSurfaceVariant,
    surfaceTint: Color = primary,
    error: Color = lightColorScheme.error,
    onError: Color = lightColorScheme.onError,
    errorContainer: Color = lightColorScheme.errorContainer,
    onErrorContainer: Color = lightColorScheme.onErrorContainer,
    valid: Color = Valid40,
    onValid: Color = Valid100,
    validContainer: Color = Valid90,
    onValidContainer: Color = Valid10,
    outline: Color = lightColorScheme.outline,
    outlineVariant: Color = lightColorScheme.outlineVariant,
    scrim: Color = lightColorScheme.scrim,
    surface1: Color = LightSurface1,
    surface2: Color = LightSurface2,
    surface3: Color = LightSurface3,
    surface4: Color = LightSurface4,
    surface5: Color = LightSurface5,
): ExtendedColorScheme =
    ExtendedColorScheme(
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
        surfaceVariant = surfaceVariant,
        onSurfaceVariant = onSurfaceVariant,
        surfaceTint = surfaceTint,
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
        surface1 = surface1,
        surface2 = surface2,
        surface3 = surface3,
        surface4 = surface4,
        surface5 = surface5
    )

/**
 * Returns a dark Material color scheme.
 */
fun darkColorScheme(
    primary: Color = darkColorScheme.primary,
    onPrimary: Color = darkColorScheme.onPrimary,
    primaryContainer: Color = darkColorScheme.primaryContainer,
    onPrimaryContainer: Color = darkColorScheme.onPrimaryContainer,
    secondary: Color = darkColorScheme.secondary,
    onSecondary: Color = darkColorScheme.onSecondary,
    secondaryContainer: Color = darkColorScheme.secondaryContainer,
    onSecondaryContainer: Color = darkColorScheme.onSecondaryContainer,
    tertiary: Color = darkColorScheme.tertiary,
    onTertiary: Color = darkColorScheme.onTertiary,
    tertiaryContainer: Color = darkColorScheme.tertiaryContainer,
    onTertiaryContainer: Color = darkColorScheme.onTertiaryContainer,
    surface: Color = darkColorScheme.surface,
    onSurface: Color = darkColorScheme.onSurface,
    surfaceVariant: Color = darkColorScheme.surface,
    onSurfaceVariant: Color = darkColorScheme.onSurfaceVariant,
    surfaceTint: Color = primary,
    error: Color = darkColorScheme.error,
    onError: Color = darkColorScheme.onError,
    errorContainer: Color = darkColorScheme.errorContainer,
    onErrorContainer: Color = darkColorScheme.onErrorContainer,
    correct: Color = Valid80,
    onCorrect: Color = Valid20,
    correctContainer: Color = Valid30,
    onCorrectContainer: Color = Valid90,
    outline: Color = darkColorScheme.outline,
    outlineVariant: Color = darkColorScheme.outlineVariant,
    scrim: Color = darkColorScheme.scrim,
    surface1: Color = DarkSurface1,
    surface2: Color = DarkSurface2,
    surface3: Color = DarkSurface3,
    surface4: Color = DarkSurface4,
    surface5: Color = DarkSurface5,
): ExtendedColorScheme =
    ExtendedColorScheme(
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
        surfaceVariant = surfaceVariant,
        onSurfaceVariant = onSurfaceVariant,
        surfaceTint = surfaceTint,
        error = error,
        onError = onError,
        errorContainer = errorContainer,
        onErrorContainer = onErrorContainer,
        valid = correct,
        onValid = onCorrect,
        validContainer = correctContainer,
        onValidContainer = onCorrectContainer,
        outline = outline,
        outlineVariant = outlineVariant,
        scrim = scrim,
        surface1 = surface1,
        surface2 = surface2,
        surface3 = surface3,
        surface4 = surface4,
        surface5 = surface5
    )

val LightColorScheme = lightColorScheme(
    primary = Primary40,
    primaryContainer = Primary90,
    onPrimary = Primary100,
    onPrimaryContainer = Primary10,
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
    error = Error40,
    errorContainer = Error90,
    onError = Error100,
    onErrorContainer = Error10,
    valid = Valid40,
    validContainer = Valid90,
    onValid = Valid100,
    onValidContainer = Valid10,
    outline = NeutralVariant50,
    outlineVariant = NeutralVariant80,
    scrim = Neutral0,
)

val DarkColorScheme = darkColorScheme(
    primary = Primary80,
    primaryContainer = Primary30,
    onPrimary = Primary20,
    onPrimaryContainer = Primary90,
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
    error = Error80,
    errorContainer = Error30,
    onError = Error20,
    onErrorContainer = Error90,
    correct = Valid80,
    correctContainer = Valid30,
    onCorrect = Valid20,
    onCorrectContainer = Valid90,
    outline = NeutralVariant60,
    outlineVariant = NeutralVariant30,
    scrim = Neutral0,
)

val LocalColorScheme = staticCompositionLocalOf { LightColorScheme }

val MaterialTheme.extendedColorScheme: ExtendedColorScheme
    @Composable
    @ReadOnlyComposable
    get() = LocalColorScheme.current