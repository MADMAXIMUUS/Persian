package io.github.madmaximuus.persian.colorPicker.view.root

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.foundation.PersianTheme

@Composable
fun VerticalColorView(
    topRow: @Composable ColumnScope.() -> Unit,
    bottomRow: @Composable ColumnScope.() -> Unit
) {
    Column(
        Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size12)
    ) {
        topRow()
        bottomRow()
    }
}