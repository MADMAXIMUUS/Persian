package io.github.madmaximuus.persian.radioButtons

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state12

object PersianRadioButtonDefaults {

    @Composable
    fun toggleColors(
        selectedColor: Color = PersianTheme.colorScheme.primary,
        unselectedColor: Color = PersianTheme.colorScheme.outline,
        disabledSelectedColor: Color = PersianTheme.colorScheme.onSurface.state12,
        disabledUnselectedColor: Color = PersianTheme.colorScheme.onSurface.state12
    ) = RadioButtonDefaults
        .colors(
            selectedColor = selectedColor,
            unselectedColor = unselectedColor,
            disabledSelectedColor = disabledSelectedColor,
            disabledUnselectedColor = disabledUnselectedColor,
        )

    @Composable
    fun colors(
        toggleColor: androidx.compose.material3.RadioButtonColors = toggleColors(),
        textColor: Color = PersianTheme.colorScheme.onSurface
    ) = remember(
        toggleColor,
        textColor
    ) {
        RadioButtonColors(
            toggleColor = toggleColor,
            textColor = textColor
        )
    }

    @Composable
    fun sizes(
        toggleSize: Dp = 48.dp,
        textStyle: TextStyle = PersianTheme.typography.bodyLarge,
        contentPadding: PaddingValues = PaddingValues(
            end = PersianTheme.spacing.size12
        )
    ) = remember(
        toggleSize,
        textStyle,
        contentPadding
    ) {
        RadioButtonSizes(
            toggleSize = toggleSize,
            textStyle = textStyle,
            contentPadding = contentPadding
        )
    }

}

@Immutable
data class RadioButtonColors(
    val toggleColor: androidx.compose.material3.RadioButtonColors,
    val textColor: Color
)

@Immutable
data class RadioButtonSizes(
    val toggleSize: Dp,
    val textStyle: TextStyle,
    val contentPadding: PaddingValues
)