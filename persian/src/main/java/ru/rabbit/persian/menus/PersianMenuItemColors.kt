package ru.rabbit.persian.menus

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import ru.rabbit.persian.foundation.PersianContentStateDisabled
import ru.rabbit.persian.foundation.extendedColorScheme

@Immutable
class MenuItemColors internal constructor(
    //Title Color
    private val titleColor: Color,
    private val negativeTitleColor: Color,
    private val disabledTitleColor: Color,

    //Leading Icon Color
    private val leadingIconColor: Color,
    private val negativeLeadingIconColor: Color,
    private val disabledLeadingIconColor: Color,

    //Expend Icon Color
    private val expendIconColor: Color,
    private val negativeExpandIconColor: Color,
    private val disabledExpandIconColor: Color
) {

    @Composable
    internal fun titleColor(
        enabled: Boolean,
        isNegative: Boolean
    ): State<Color> {

        val targetValue = when {
            !enabled -> disabledTitleColor
            isNegative -> negativeTitleColor

            else -> titleColor
        }
        return rememberUpdatedState(targetValue)
    }

    @Composable
    internal fun leadingIconColor(
        enabled: Boolean,
        isNegative: Boolean
    ): State<Color> {

        val targetValue = when {
            !enabled -> disabledLeadingIconColor
            isNegative -> negativeLeadingIconColor

            else -> leadingIconColor
        }
        return rememberUpdatedState(targetValue)
    }

    @Composable
    internal fun expandIconColor(
        enabled: Boolean,
        isNegative: Boolean
    ): State<Color> {

        val targetValue = when {
            !enabled -> disabledExpandIconColor
            isNegative -> negativeExpandIconColor

            else -> expendIconColor
        }
        return rememberUpdatedState(targetValue)
    }
}

object PersianMenuItemColors {

    @Composable
    fun primary(
        titleColor: Color = MaterialTheme.extendedColorScheme.onSurface,
        negativeTitleColor: Color = MaterialTheme.extendedColorScheme.error,
        disabledTitleColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianContentStateDisabled),
        leadingIconColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        negativeLeadingIconColor: Color = MaterialTheme.extendedColorScheme.error,
        disabledLeadingIconColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianContentStateDisabled),
        expendIconColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        negativeExpandIconColor: Color = MaterialTheme.extendedColorScheme.error,
        disabledExpandIconColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianContentStateDisabled)
    ): MenuItemColors =
        MenuItemColors(
            titleColor = titleColor,
            negativeTitleColor = negativeTitleColor,
            disabledTitleColor = disabledTitleColor,
            leadingIconColor = leadingIconColor,
            negativeLeadingIconColor = negativeLeadingIconColor,
            disabledLeadingIconColor = disabledLeadingIconColor,
            expendIconColor = expendIconColor,
            negativeExpandIconColor = negativeExpandIconColor,
            disabledExpandIconColor = disabledExpandIconColor
        )
}