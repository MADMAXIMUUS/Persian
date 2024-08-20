package io.github.madmaximuus.persian.menu

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import io.github.madmaximuus.persian.iconButton.IconButtonDefaults
import io.github.madmaximuus.persian.iconButton.TertiaryIconButton

interface DropdownMenuHeaderItemScope : RowScope

class DropdownMenuHeaderItemScopeWrapper(
    val scope: RowScope
) : DropdownMenuHeaderItemScope, RowScope by scope

interface DropdownMenuHeaderScope : ColumnScope

class DropdownMenuHeaderScopeWrapper(
    val scope: ColumnScope
) : DropdownMenuHeaderScope, ColumnScope by scope

@Composable
fun DropdownMenuHeaderItemScope.Button(
    modifier: Modifier = Modifier,
    icon: Painter,
    onClick: () -> Unit
) {
    TertiaryIconButton(
        modifier = modifier,
        onClick = onClick,
        sizes = IconButtonDefaults.mediumSizes(),
        icon = icon
    )
}

@Composable
fun DropdownMenuHeaderScope.Header(
    modifier: Modifier = Modifier,
    items: @Composable DropdownMenuHeaderItemScope.() -> Unit
) {
    Column(
        modifier = modifier.fillMaxWidth(),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
        ) {
            val scope = remember { DropdownMenuHeaderItemScopeWrapper(this) }
            scope.items()
        }
    }
}

