package io.github.madmaximuus.persian.menus

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state38

object PersianMenuDefaults {

    @Composable
    fun itemColors(
        titleColor: Color = PersianTheme.colorScheme.onSurface,
        negativeTitleColor: Color = PersianTheme.colorScheme.error,
        disabledTitleColor: Color = PersianTheme.colorScheme.onSurface.state38,
        leadingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        negativeLeadingIconColor: Color = PersianTheme.colorScheme.error,
        disabledLeadingIconColor: Color = PersianTheme.colorScheme.onSurface.state38,
        expendIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        negativeExpandIconColor: Color = PersianTheme.colorScheme.error,
        disabledExpandIconColor: Color = PersianTheme.colorScheme.onSurface.state38,
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

    @Composable
    fun colors(
        backgroundColor: Color = PersianTheme.colorScheme.surface2,
        itemColors: MenuItemColors = itemColors()
    ) = remember(backgroundColor, itemColors) {
        MenuColors(
            backgroundColor = backgroundColor,
            itemColors = itemColors
        )
    }
}

@Immutable
data class MenuColors(
    val backgroundColor: Color,
    val itemColors: MenuItemColors
)

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