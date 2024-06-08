package io.github.madmaximuus.persian.foundation

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

@Composable
fun PersianTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    lightColors: ExtendedColorScheme = LightColorScheme,
    darkColors: ExtendedColorScheme = DarkColorScheme,
    content: @Composable () -> Unit
) {
    val view = LocalView.current
    if (!view.isInEditMode) {
        val currentWindow = (view.context as? Activity)?.window
            ?: throw Exception("Not in an activity - unable to get Window reference")
        SideEffect {
            currentWindow.statusBarColor = Color.Transparent.toArgb()
            currentWindow.navigationBarColor = Color.Transparent.toArgb()
            WindowCompat.getInsetsController(currentWindow, view).isAppearanceLightStatusBars =
                !darkTheme
            WindowCompat.getInsetsController(currentWindow, view).isAppearanceLightNavigationBars =
                !darkTheme
        }
    }

    val colorScheme = resolveDynamicColor(
        dynamicColor = dynamicColor,
        darkTheme = darkTheme,
        lightColors = lightColors,
        darkColors = darkColors
    )
    val defaultColorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context)
            else dynamicLightColorScheme(context)
        }

        darkTheme -> darkColorScheme
        else -> lightColorScheme
    }

    CompositionLocalProvider(
        LocalPersianSpacing provides MaterialTheme.spacing,
        LocalPersianElevation provides MaterialTheme.elevation,
        LocalColorScheme provides colorScheme,
        LocalPersianShapes provides MaterialTheme.shape
    ) {
        MaterialTheme(
            colorScheme = defaultColorScheme,
            typography = PersianTypography,
            content = content,
        )
    }

}

@Composable
private fun resolveDynamicColor(
    dynamicColor: Boolean,
    darkTheme: Boolean,
    lightColors: ExtendedColorScheme,
    darkColors: ExtendedColorScheme
): ExtendedColorScheme {
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