package io.github.madmaximuus.persian.datePicker.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.foundation.PersianTheme

@Composable
internal fun DatePickerViewRoot(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size4)
    ) {
        content()
    }
    /*if (windowHeightSizeClass != WindowHeightSizeClass.COMPACT) {
        Row(
            modifier = modifier,
            horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size4),
        ) {
            content()
        }
    } else {
        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size4)
        ) {
            content()
        }
    }*/
}