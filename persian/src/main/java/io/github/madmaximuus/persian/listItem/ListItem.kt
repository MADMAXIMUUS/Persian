package io.github.madmaximuus.persian.listItem

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.divider.Divider
import io.github.madmaximuus.persian.divider.InsetSide
import io.github.madmaximuus.persian.foundation.PersianState38
import io.github.madmaximuus.persian.foundation.PersianTheme

/**
 * A list item is useful for organizing and displaying individual elements within a list, providing
 * a structured and easily navigable format for presenting information. It offers a straightforward
 * and effective method for grouping related data, making it an essential tool for enhancing
 * user experience and data organization.
 *
 * @param modifier The modifier to be applied to the [Column].
 * @param edit A composable function that defines the content for the edit section.
 * @param left A composable function that defines the content for the left section.
 * @param middle A composable function that defines the content for the middle section.
 * @param right A composable function that defines the content for the right section.
 * @param divider A boolean indicating whether to display a divider below the list item.
 * @param enabled A boolean indicating whether the list item is enabled.
 * @param checked A boolean indicating whether the list item is checked.
 * @param sizes The sizes of the list item, encapsulated in a [ListItemSizes] object.
 * @param colors The colors of the list item, encapsulated in a [ListItemColors] object.
 * @param onClick The callback to be invoked when the list item is clicked.
 */
@Composable
fun ListItem(
    modifier: Modifier = Modifier,
    edit: (@Composable ListItemEditScope.() -> Unit)? = null,
    left: (@Composable ListItemLeftScope.() -> Unit)? = null,
    middle: @Composable ListItemMiddleScope.() -> Unit,
    right: (@Composable ListItemRightScope.() -> Unit)? = null,
    divider: Boolean = false,
    enabled: Boolean = true,
    checked: Boolean = false,
    selected: Boolean = false,
    sizes: ListItemSizes = ListItemDefaults.sizes(),
    colors: ListItemColors = ListItemDefaults.colors(),
    onClick: (() -> Unit)? = null
) {
    Column(
        modifier = modifier
            .heightIn(min = 52.dp)
            .clickable(
                enabled = enabled && onClick != null,
                role = Role.Button,
                onClick = {
                    onClick?.let { it() }
                }
            ),
        verticalArrangement = Arrangement.Center
    ) {
        val padding = if (edit != null) PaddingValues(end = PersianTheme.spacing.size16)
        else PaddingValues(horizontal = PersianTheme.spacing.size16)
        Row(
            Modifier
                .fillMaxWidth()
                .padding(padding)
                .graphicsLayer {
                    alpha = if (enabled) 1f
                    else PersianState38
                },
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (edit != null) {
                val scope =
                    remember(sizes, colors, enabled, selected) {
                        ListItemEditScopeWrapper(
                            scope = this,
                            sizes = sizes,
                            colors = colors,
                            enabled = enabled,
                            checked = selected
                        )
                    }
                scope.edit()
            }
            if (left != null) {
                val scope =
                    remember(sizes, colors, enabled) {
                        ListItemLeftScopeWrapper(
                            scope = this,
                            sizes = sizes,
                            colors = colors,
                            enabled = enabled,
                        )
                    }
                scope.left()
            }
            val middleScope =
                remember(sizes, colors, enabled) {
                    ListItemMiddleScopeWrapper(
                        scope = this,
                        sizes = sizes,
                        colors = colors
                    )
                }
            middleScope.middle()
            if (right != null) {
                val scope =
                    remember(sizes, colors, enabled, checked) {
                        ListItemRightScopeWrapper(
                            scope = this,
                            sizes = sizes,
                            colors = colors,
                            enabled = enabled,
                            checked = checked
                        )
                    }
                scope.right()
            }
        }
        if (divider)
            Divider(
                modifier = Modifier.fillMaxWidth(),
                insetSide = InsetSide.BOTH,
                sizes = sizes.dividerSizes,
                strokeColor = colors.dividerColor
            )
    }
}