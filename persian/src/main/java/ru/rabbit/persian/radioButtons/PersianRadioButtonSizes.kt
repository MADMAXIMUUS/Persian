package ru.rabbit.persian.radioButtons

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ru.rabbit.persian.foundation.spacing

@Immutable
data class RadioButtonSizes(
    val toggleSize: Dp,
    val textStyle: TextStyle,
    val contentPadding: PaddingValues
)

object PersianRadioButtonSizes {

    @Composable
    fun small(
        toggleSize: Dp = 48.dp,
        textStyle: TextStyle = MaterialTheme.typography.bodyLarge,
        contentPadding: PaddingValues = PaddingValues(
            end = MaterialTheme.spacing.medium
        )
    ) = remember(toggleSize, textStyle, contentPadding)
    {
        RadioButtonSizes(
            toggleSize = toggleSize,
            textStyle = textStyle,
            contentPadding = contentPadding
        )
    }
}