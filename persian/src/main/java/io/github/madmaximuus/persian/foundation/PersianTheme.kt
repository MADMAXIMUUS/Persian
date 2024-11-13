package io.github.madmaximuus.persian.foundation

import android.app.Activity
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import io.github.madmaximuus.persian.foundation.PersianTheme.elevation
import io.github.madmaximuus.persian.foundation.PersianTheme.shapes
import io.github.madmaximuus.persian.foundation.PersianTheme.spacing
import io.github.madmaximuus.persian.foundation.ripple.ripple

/**
 * Composable function to apply the PersianTheme to the UI.
 *
 * This function sets up the theme for the application, including handling dark and light modes,
 * and configuring the status bar and navigation bar colors.
 *
 * @param darkTheme Boolean flag indicating whether the dark theme should be applied.
 * @param lightColors The color scheme to be used for the light theme.
 * @param darkColors The color scheme to be used for the dark theme.
 * @param content The composable content to be themed.
 *
 * @throws Exception if the function is not called within an activity context,
 * as it requires a window reference.
 */
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

/**
 * Composable function to apply the PersianTheme to the UI.
 *
 * This function sets up the theme for the application, including color scheme, typography, spacing,
 * shapes, and elevation. It also provides ripple indication and text selection colors.
 *
 * @param colorScheme The color scheme to be used for the theme.
 * @param typography The typography settings to be used for the theme.
 * @param spacing The spacing settings to be used for the theme.
 * @param shapes The shape settings to be used for the theme.
 * @param elevation The elevation settings to be used for the theme.
 * @param content The composable content to be themed.
 */
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

/*
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
                    onSurfaceVariant = tempColorScheme.onSurfaceVariant,
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
}*/
