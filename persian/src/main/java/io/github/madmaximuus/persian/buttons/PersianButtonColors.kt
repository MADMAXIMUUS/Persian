package io.github.madmaximuus.persian.buttons

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.PersianStatesDisabled
import io.github.madmaximuus.persian.foundation.extendedColorScheme

@Immutable
class ButtonColors(
    val contentColor: Color,
    val containerColor: Color,
    val disabledContentColor: Color,
    val disabledContainerColor: Color
) {
    @Composable
    fun contentColor(enabled: Boolean): State<Color> {
        val targetValue = when {
            !enabled -> disabledContentColor
            else -> contentColor
        }

        return rememberUpdatedState(targetValue)
    }

    @Composable
    fun containerColor(enabled: Boolean): State<Color> {
        val targetValue = when {
            !enabled -> disabledContainerColor
            else -> containerColor
        }

        return rememberUpdatedState(targetValue)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ButtonColors) return false

        if (contentColor != other.contentColor) return false
        if (containerColor != other.containerColor) return false
        if (disabledContentColor != other.disabledContentColor) return false
        if (disabledContainerColor != other.disabledContainerColor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = contentColor.hashCode()
        result = 31 * result + containerColor.hashCode()
        result = 31 * result + disabledContentColor.hashCode()
        result = 31 * result + disabledContainerColor.hashCode()
        return result
    }
}

object PersianButtonColors {

    @Composable
    fun primary(
        containerColor: Color = MaterialTheme.extendedColorScheme.primary,
        contentColor: Color = MaterialTheme.extendedColorScheme.onPrimary,
        disabledContainerColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianStatesDisabled),
        disabledContentColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianStatesDisabled),
    ): ButtonColors = ButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    fun secondary(
        containerColor: Color = MaterialTheme.extendedColorScheme.primaryContainer,
        contentColor: Color = MaterialTheme.extendedColorScheme.onPrimaryContainer,
        disabledContainerColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianStatesDisabled),
        disabledContentColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianStatesDisabled),
    ): ButtonColors = ButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    fun tertiary(
        containerColor: Color = Color.Transparent,
        contentColor: Color = MaterialTheme.extendedColorScheme.primary,
        disabledContainerColor: Color = Color.Transparent,
        disabledContentColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianStatesDisabled),
    ): ButtonColors = ButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    fun outline(
        containerColor: Color = Color.Transparent,
        contentColor: Color = MaterialTheme.extendedColorScheme.primary,
        disabledContainerColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianStatesDisabled),
        disabledContentColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianStatesDisabled),
    ): ButtonColors = ButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )
}