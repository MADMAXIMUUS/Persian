package io.github.madmaximuus.persian.colorPicker.view.root

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.foundation.PersianTheme

/**
 * A composable function that arranges two rows of content vertically within a column.
 *
 * @param topRow A composable lambda that defines the content for the top row.
 * @param bottomRow A composable lambda that defines the content for the bottom row.
 */
@Composable
fun VerticalColorView(
    topRow: @Composable ColumnScope.() -> Unit,
    bottomRow: @Composable ColumnScope.() -> Unit
) {
    Column(
        Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size16)
    ) {
        topRow()
        bottomRow()
    }
}