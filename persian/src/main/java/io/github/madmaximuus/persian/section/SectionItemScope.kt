package io.github.madmaximuus.persian.section

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.listItem.ListItem
import io.github.madmaximuus.persian.listItem.ListItemColors
import io.github.madmaximuus.persian.listItem.ListItemEditScope
import io.github.madmaximuus.persian.listItem.ListItemLeftScope
import io.github.madmaximuus.persian.listItem.ListItemMiddleScope
import io.github.madmaximuus.persian.listItem.ListItemRightScope
import io.github.madmaximuus.persian.listItem.ListItemSizes

interface SectionItemScope : ColumnScope {
    val sizes: ListItemSizes
    val colors: ListItemColors
}

class SectionItemScopeWrapper(
    scope: ColumnScope,
    override val sizes: ListItemSizes,
    override val colors: ListItemColors,
) : SectionItemScope, ColumnScope by scope

@Composable
fun SectionItemScope.Item(
    modifier: Modifier = Modifier,
    edit: (@Composable ListItemEditScope.() -> Unit)? = null,
    left: (@Composable ListItemLeftScope.() -> Unit)? = null,
    middle: @Composable ListItemMiddleScope.() -> Unit,
    right: (@Composable ListItemRightScope.() -> Unit)? = null,
    divider: Boolean = false,
    enabled: Boolean = true,
    checked: Boolean = false,
    selected: Boolean = false,
    onClick: (() -> Unit)? = null
) = ListItem(
    modifier = modifier,
    edit = edit,
    left = left,
    middle = middle,
    right = right,
    divider = divider,
    enabled = enabled,
    checked = checked,
    selected = selected,
    colors = colors,
    sizes = sizes,
    onClick = onClick
)