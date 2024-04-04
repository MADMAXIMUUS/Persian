package io.github.madmaximuus.persian.radioButtons

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.foundation.state12

object PersianRadioButtonDefaults {

    @Composable
    fun toggleColors(
        selectedColor: Color = MaterialTheme.extendedColorScheme.primary,
        unselectedColor: Color = MaterialTheme.extendedColorScheme.outline,
        disabledSelectedColor: Color = MaterialTheme.extendedColorScheme.onSurface.state12,
        disabledUnselectedColor: Color = MaterialTheme.extendedColorScheme.onSurface.state12
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
        textColor: Color = MaterialTheme.extendedColorScheme.onSurface
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
        textStyle: TextStyle = MaterialTheme.typography.bodyLarge,
        contentPadding: PaddingValues = PaddingValues(
            end = MaterialTheme.spacing.medium
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