package io.github.madmaximuus.persian.checkboxes

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.spacing


@Deprecated("Replace with PersianCheckboxDefaults")
object PersianCheckboxSizes {

    @Composable
    fun small(
        toggleSize: Dp = 48.dp,
        textStyle: TextStyle = MaterialTheme.typography.bodyLarge,
        contentPadding: PaddingValues = PaddingValues(
            end = MaterialTheme.spacing.medium
        )
    ) = remember(toggleSize, textStyle, contentPadding)
    {
        CheckboxSizes(
            toggleSize = toggleSize,
            textStyle = textStyle,
            contentPadding = contentPadding
        )
    }
}