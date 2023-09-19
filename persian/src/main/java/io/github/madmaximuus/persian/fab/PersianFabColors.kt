package io.github.madmaximuus.persian.fab

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.elevation
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.surfaceColorAtElevation

@Immutable
data class FabColors(
    val backgroundColor: Color,
    val content: Color,
)

object PersianFabColors {

    @Composable
    fun primary(
        backgroundColor: Color = MaterialTheme.extendedColorScheme.primaryContainer,
        content: Color = MaterialTheme.extendedColorScheme.onPrimaryContainer,
    ) = remember(
        backgroundColor,
        content
    ) {
        FabColors(
            backgroundColor = backgroundColor,
            content = content,
        )
    }

    @Composable
    fun secondary(
        backgroundColor: Color = MaterialTheme.extendedColorScheme.secondaryContainer,
        content: Color = MaterialTheme.extendedColorScheme.onSecondaryContainer,
    ) = remember(
        backgroundColor,
        content
    ) {
        FabColors(
            backgroundColor = backgroundColor,
            content = content
        )
    }

    @Composable
    fun tertiary(
        backgroundColor: Color = MaterialTheme.extendedColorScheme.tertiaryContainer,
        content: Color = MaterialTheme.extendedColorScheme.onTertiaryContainer
    ) = remember(
        backgroundColor,
        content
    ) {
        FabColors(
            backgroundColor = backgroundColor,
            content = content
        )
    }

    @Composable
    fun neutral(
        backgroundColor: Color = MaterialTheme.extendedColorScheme
            .surfaceColorAtElevation(MaterialTheme.elevation.medium),
        content: Color = MaterialTheme.extendedColorScheme.primary
    ) = remember(
        backgroundColor,
        content
    ) {
        FabColors(
            backgroundColor = backgroundColor,
            content = content
        )
    }
}