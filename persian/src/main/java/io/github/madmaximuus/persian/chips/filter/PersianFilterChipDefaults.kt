package io.github.madmaximuus.persian.chips.filter

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianContentStateDisabled
import io.github.madmaximuus.persian.foundation.PersianStatesDisabled
import io.github.madmaximuus.persian.foundation.extendedColorScheme

object PersianFilterChipDefaults {

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun chipColors(
        containerColor: Color = Color.Transparent,
        labelColor: Color = MaterialTheme.extendedColorScheme.onSurface,
        iconColor: Color = MaterialTheme.extendedColorScheme.primary,
        disabledContainerColor: Color = Color.Transparent,
        disabledLabelColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianContentStateDisabled),
        disabledLeadingIconColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianContentStateDisabled),
        disabledTrailingIconColor: Color = disabledLeadingIconColor,
        selectedContainerColor: Color = MaterialTheme.extendedColorScheme.secondaryContainer,
        disabledSelectedContainerColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianStatesDisabled),
        selectedLabelColor: Color = MaterialTheme.extendedColorScheme.onSecondaryContainer,
        selectedLeadingIconColor: Color = MaterialTheme.extendedColorScheme.onSecondaryContainer,
        selectedTrailingIconColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant
    ) = FilterChipDefaults.filterChipColors(
        containerColor = containerColor,
        labelColor = labelColor,
        iconColor = iconColor,
        disabledContainerColor = disabledContainerColor,
        disabledLabelColor = disabledLabelColor,
        disabledLeadingIconColor = disabledLeadingIconColor,
        disabledSelectedContainerColor = disabledTrailingIconColor,
        selectedContainerColor = selectedContainerColor,
        disabledTrailingIconColor = disabledSelectedContainerColor,
        selectedLabelColor = selectedLabelColor,
        selectedLeadingIconColor = selectedLeadingIconColor,
        selectedTrailingIconColor = selectedTrailingIconColor
    )

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun chipBorder(
        borderColor: Color = MaterialTheme.extendedColorScheme.primary,
        selectedBorderColor: Color = Color.Transparent,
        disabledBorderColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianStatesDisabled),
        disabledSelectedBorderColor: Color = Color.Transparent,
        borderWidth: Dp = 1.dp,
        selectedBorderWidth: Dp = 0.dp,
    ) = FilterChipDefaults.filterChipBorder(
        borderColor = borderColor,
        selectedBorderColor = selectedBorderColor,
        disabledBorderColor = disabledBorderColor,
        disabledSelectedBorderColor = disabledSelectedBorderColor,
        borderWidth = borderWidth,
        selectedBorderWidth = selectedBorderWidth
    )

}