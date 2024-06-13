package io.github.madmaximuus.persian.pagination

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state12
import io.github.madmaximuus.persian.foundation.state38

object PersianPaginationDefaults {

    @Composable
    fun colors(
        defaultNumberColor: Color = PersianTheme.colorScheme.onSurface,
        disabledNumberColor: Color = PersianTheme.colorScheme.onSurface.state38,
        selectedNumberColor: Color = PersianTheme.colorScheme.onPrimaryContainer,

        defaultMoreColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        disabledMoreColor: Color = PersianTheme.colorScheme.onSurface.state38,

        defaultContainerColor: Color = Color.Transparent,
        disabledContainerColor: Color = PersianTheme.colorScheme.onSurface.state12,
        selectedContainerColor: Color = PersianTheme.colorScheme.primaryContainer
    ): PaginationColors = PaginationColors(
        defaultNumberColor = defaultNumberColor,
        disabledNumberColor = disabledNumberColor,
        selectedNumberColor = selectedNumberColor,
        defaultMoreColor = defaultMoreColor,
        disabledMoreColor = disabledMoreColor,
        defaultContainerColor = defaultContainerColor,
        disabledContainerColor = disabledContainerColor,
        selectedContainerColor = selectedContainerColor
    )
}

@Immutable
class PaginationColors internal constructor(
    private val defaultNumberColor: Color,
    private val disabledNumberColor: Color,
    private val selectedNumberColor: Color,

    private val defaultMoreColor: Color,
    private val disabledMoreColor: Color,

    private val defaultContainerColor: Color,
    private val disabledContainerColor: Color,
    private val selectedContainerColor: Color
) {
    @Composable
    fun numberColor(
        selected: Boolean,
        enabled: Boolean
    ): State<Color> {
        val target = when {
            !enabled -> disabledNumberColor
            selected -> selectedNumberColor
            else -> defaultNumberColor
        }

        return rememberUpdatedState(newValue = target)
    }

    @Composable
    fun moreColor(
        enabled: Boolean
    ): State<Color> {
        val target = when {
            !enabled -> disabledMoreColor
            else -> defaultMoreColor
        }

        return rememberUpdatedState(newValue = target)
    }

    @Composable
    fun containerColor(
        selected: Boolean,
        enabled: Boolean
    ): State<Color> {
        val target = when {
            !enabled && !selected -> defaultContainerColor
            !enabled -> disabledContainerColor
            selected -> selectedContainerColor
            else -> defaultContainerColor
        }

        return rememberUpdatedState(newValue = target)
    }

}