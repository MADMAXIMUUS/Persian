package io.github.madmaximuus.persian.forms

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.extendedColorScheme

object PersianFormDefaults {

    @Composable
    fun captionColors(
        textColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        errorColor: Color = MaterialTheme.extendedColorScheme.error,
        disabledColor: Color = MaterialTheme.extendedColorScheme.onSurface,
            //.copy(PersianState38),
        counterColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        errorCounterColor: Color = MaterialTheme.extendedColorScheme.error,
        disabledCounterColor: Color = MaterialTheme.extendedColorScheme.onSurface,
            //.copy(PersianState38),
    ): CaptionColors = CaptionColors(
        textColor = textColor,
        errorColor = errorColor,
        disabledColor = disabledColor,
        counterColor = counterColor,
        errorCounterColor = errorCounterColor,
        disabledCounterColor = disabledCounterColor
    )

    @Composable
    fun subheadColors(
        textColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        disabledColor: Color = MaterialTheme.extendedColorScheme.onSurface,
            //.copy(PersianState38),

        requiredColor: Color = MaterialTheme.extendedColorScheme.error,
        requiredDisabledColor: Color = MaterialTheme.extendedColorScheme.error,
            //.copy(PersianState38),
    ): SubheadColors = SubheadColors(
        textColor = textColor,
        disabledColor = disabledColor,
        requiredColor = requiredColor,
        requiredDisabledColor = requiredDisabledColor,
    )
}

@Immutable
class CaptionColors internal constructor(
    private val textColor: Color,
    private val errorColor: Color,
    private val disabledColor: Color,

    private val counterColor: Color,
    private val errorCounterColor: Color,
    private val disabledCounterColor: Color
) {
    @Composable
    internal fun textColor(
        enabled: Boolean,
        isError: Boolean
    ): State<Color> {
        val target = when {
            !enabled -> disabledColor
            isError -> errorColor
            else -> textColor
        }
        return rememberUpdatedState(newValue = target)
    }

    @Composable
    internal fun counterColor(
        enabled: Boolean,
        isError: Boolean
    ): State<Color> {
        val target = when {
            !enabled -> disabledCounterColor
            isError -> errorCounterColor
            else -> counterColor
        }
        return rememberUpdatedState(newValue = target)
    }
}

@Immutable
class SubheadColors internal constructor(
    private val textColor: Color,
    private val disabledColor: Color,

    private val requiredColor: Color,
    private val requiredDisabledColor: Color
) {
    @Composable
    internal fun textColor(
        enabled: Boolean
    ): State<Color> {
        val target = when {
            !enabled -> disabledColor
            else -> textColor
        }
        return rememberUpdatedState(newValue = target)
    }

    @Composable
    internal fun requiredColor(
        enabled: Boolean
    ): State<Color> {
        val target = when {
            !enabled -> requiredDisabledColor
            else -> requiredColor
        }
        return rememberUpdatedState(newValue = target)
    }
}