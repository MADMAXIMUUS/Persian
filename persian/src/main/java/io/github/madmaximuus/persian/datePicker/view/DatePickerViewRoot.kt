package io.github.madmaximuus.persian.datePicker.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.window.core.layout.WindowHeightSizeClass
import io.github.madmaximuus.persian.foundation.PersianTheme

/**
 * Composable function to render the root layout of the date picker view.
 *
 * The layout adapts based on the window height size class. If the window height size class is compact,
 * the content is arranged in a row. Otherwise, the content is arranged in a column.
 *
 * @param modifier The modifier to be applied to the root layout.
 * @param content The composable content to be displayed within the root layout.
 */
@Composable
internal fun DatePickerViewRoot(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    val windowHeightSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowHeightSizeClass
    if (windowHeightSizeClass == WindowHeightSizeClass.COMPACT) {
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
    }
}