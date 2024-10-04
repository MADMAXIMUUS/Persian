package io.github.madmaximuus.persian.colorPicker.view.root

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.foundation.PersianTheme

@Composable
fun HorizontalColorView(
    leftColumn: @Composable RowScope.() -> Unit,
    rightColumn: @Composable RowScope.() -> Unit
) {
    Row(
        Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
    ) {
        leftColumn()
        rightColumn()
    }
}