package io.github.madmaximuus.persian.foundation

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import io.github.madmaximuus.persian.foundation.PersianTheme.elevation
import io.github.madmaximuus.persian.foundation.PersianTheme.shapes
import io.github.madmaximuus.persian.foundation.PersianTheme.spacing
import io.github.madmaximuus.persian.foundation.ripple.ripple

@Composable
fun PersianTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    lightColors: ColorScheme = LightColorScheme,
    darkColors: ColorScheme = DarkColorScheme,
    content: @Composable () -> Unit
) {
    val view = LocalView.current
    if (!view.isInEditMode) {
        val currentWindow = (view.context as? Activity)?.window
            ?: throw Exception("Not in an activity - unable to get Window reference")
        SideEffect {
            currentWindow.statusBarColor = Color.Transparent.toArgb()
            currentWindow.navigationBarColor = Color.Transparent.toArgb()
            WindowCompat
                .getInsetsController(currentWindow, view)
                .isAppearanceLightStatusBars = !darkTheme
            WindowCompat
                .getInsetsController(currentWindow, view)
                .isAppearanceLightNavigationBars = !darkTheme
        }
    }

    val colorScheme = if (darkTheme) darkColors else lightColors

    PersianTheme(
        colorScheme = colorScheme,
        typography = LocalTypography.current,
        spacing = spacing,
        shapes = shapes,
        elevation = elevation,
        content = content,
    )
}

@Composable
fun PersianTheme(
    colorScheme: ColorScheme,
    typography: Typography,
    spacing: Spacing,
    shapes: Shapes,
    elevation: Elevation,
    content: @Composable () -> Unit
) {
    val rippleIndication = ripple()
    val selectionColors = rememberTextSelectionColors(colorScheme)
    CompositionLocalProvider(
        LocalColorScheme provides colorScheme,
        LocalIndication provides rippleIndication,
        LocalShapes provides shapes,
        LocalSpacing provides spacing,
        LocalTextSelectionColors provides selectionColors,
        LocalTypography provides typography,
        LocalElevation provides elevation
    ) {
        ProvideTextStyle(value = typography.bodyLarge, content = content)
    }
}

@Composable
fun resolveDynamicColor(
    dynamicColor: Boolean,
    darkTheme: Boolean,
    lightColors: ColorScheme,
    darkColors: ColorScheme
): ColorScheme {
    return when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) {
                val tempColorScheme = dynamicDarkColorScheme(context)
                darkColors.copy(
                    primary = tempColorScheme.primary,
                    onPrimary = tempColorScheme.onPrimary,
                    primaryContainer = tempColorScheme.primaryContainer,
                    onPrimaryContainer = tempColorScheme.onPrimaryContainer,
                    secondary = tempColorScheme.secondary,
                    onSecondary = tempColorScheme.onSecondary,
                    secondaryContainer = tempColorScheme.secondaryContainer,
                    onSecondaryContainer = tempColorScheme.onSecondaryContainer,
                    tertiary = tempColorScheme.tertiary,
                    onTertiary = tempColorScheme.onTertiary,
                    tertiaryContainer = tempColorScheme.tertiaryContainer,
                    onTertiaryContainer = tempColorScheme.onTertiaryContainer,
                    surface = tempColorScheme.surface,
                    onSurface = tempColorScheme.onSurface,
                    surfaceVariant = tempColorScheme.surfaceVariant,
                    onSurfaceVariant = tempColorScheme.onSurfaceVariant,
                    error = tempColorScheme.error,
                    onError = tempColorScheme.onError,
                    errorContainer = tempColorScheme.errorContainer,
                    onErrorContainer = tempColorScheme.onErrorContainer,
                    outline = tempColorScheme.outline,
                    outlineVariant = tempColorScheme.outlineVariant,
                    scrim = tempColorScheme.scrim
                )
            } else {
                val tempColorScheme = dynamicLightColorScheme(context)
                lightColors.copy(
                    primary = tempColorScheme.primary,
                    onPrimary = tempColorScheme.onPrimary,
                    primaryContainer = tempColorScheme.primaryContainer,
                    onPrimaryContainer = tempColorScheme.onPrimaryContainer,
                    secondary = tempColorScheme.secondary,
                    onSecondary = tempColorScheme.onSecondary,
                    secondaryContainer = tempColorScheme.secondaryContainer,
                    onSecondaryContainer = tempColorScheme.onSecondaryContainer,
                    tertiary = tempColorScheme.tertiary,
                    onTertiary = tempColorScheme.onTertiary,
                    tertiaryContainer = tempColorScheme.tertiaryContainer,
                    onTertiaryContainer = tempColorScheme.onTertiaryContainer,
                    surface = tempColorScheme.surface,
                    onSurface = tempColorScheme.onSurface,
                    surfaceVariant = tempColorScheme.surfaceVariant,
                    onSurfaceVariant = tempColorScheme.onSurfaceVariant,
                    surfaceTint = tempColorScheme.surfaceTint,
                    error = tempColorScheme.error,
                    onError = tempColorScheme.onError,
                    errorContainer = tempColorScheme.errorContainer,
                    onErrorContainer = tempColorScheme.onErrorContainer,
                    outline = tempColorScheme.outline,
                    outlineVariant = tempColorScheme.outlineVariant,
                    scrim = tempColorScheme.scrim
                )
            }
        }

        darkTheme -> darkColors
        else -> lightColors
    }
}

object PersianTheme {
    /**
     * Retrieves the current [ColorScheme] at the call site's position in the hierarchy.
     */
    val colorScheme: ColorScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalColorScheme.current

    /**
     * Retrieves the current [Typography] at the call site's position in the hierarchy.
     */
    val typography: Typography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current

    /**
     * Retrieves the current [Shapes] at the call site's position in the hierarchy.
     */
    val shapes: Shapes
        @Composable
        @ReadOnlyComposable
        get() = LocalShapes.current

    /**
     * Retrieves the current [Spacing] at the call site's position in the hierarchy.
     */
    val spacing: Spacing
        @Composable
        @ReadOnlyComposable
        get() = LocalSpacing.current

    /**
     * Retrieves the current [Elevation] at the call site's position in the hierarchy.
     */
    val elevation: Elevation
        @Composable
        @ReadOnlyComposable
        get() = LocalElevation.current

}