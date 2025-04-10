package io.github.madmaximuus.persian.listItem

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.divider.Divider
import io.github.madmaximuus.persian.divider.InsetSide
import io.github.madmaximuus.persian.foundation.PersianState38
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text

/**
 * A list item is useful for organizing and displaying individual elements within a list, providing
 * a structured and easily navigable format for presenting information. It offers a straightforward
 * and effective method for grouping related data, making it an essential tool for enhancing
 * user experience and data organization.
 *
 * @param modifier The modifier to be applied to the [Column].
 * @param title The title of this list item.
 * @param subhead The subhead of this list item.
 * @param body The body of this list item.
 * @param isNew A boolean indicating whether to display a "new" label next to [title].
 * @param leading A composable function that defines the content for the leading section.
 * @param trailing A composable function that defines the content for the trailing section.
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
    title: String,
    subhead: String? = null,
    body: String? = null,
    isNew: Boolean = false,
    leading: (@Composable ListItemLeadingScope.() -> Unit)? = null,
    trailing: (@Composable ListItemTrailingScope.() -> Unit)? = null,
    divider: Boolean = false,
    enabled: Boolean = true,
    checked: Boolean = false,
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
        val alignment = if (body != null && subhead == null) Alignment.Top
        else Alignment.CenterVertically
        Row(
            Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = PersianTheme.spacing.size16,
                    vertical = PersianTheme.spacing.size8
                )
                .graphicsLayer {
                    alpha = if (enabled) 1f
                    else PersianState38
                },
            verticalAlignment = alignment
        ) {
            if (leading != null) {
                val scope =
                    remember(sizes, colors, enabled) {
                        ListItemLeadingScopeWrapper(
                            scope = this,
                            sizes = sizes,
                            colors = colors,
                            enabled = enabled,
                            checked = checked
                        )
                    }
                scope.leading()
            }
            Column(
                modifier = modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(
                    space = PersianTheme.spacing.size2,
                    alignment = Alignment.CenterVertically
                )
            ) {
                subhead?.let {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = it,
                        style = sizes.subheadTextStyle,
                        color = colors.subheadColor,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size4)
                ) {
                    Text(
                        text = title,
                        style = sizes.titleTextStyle,
                        color = colors.titleColor,
                        overflow = TextOverflow.Ellipsis
                    )
                    if (isNew) {
                        Text(
                            modifier = Modifier
                                .background(
                                    color = colors.newLabelContainerColor,
                                    shape = sizes.newLabelShape
                                )
                                .padding(
                                    horizontal = PersianTheme.spacing.size4,
                                    vertical = PersianTheme.spacing.size2
                                ),
                            text = "New",
                            style = sizes.newLabelTextStyle,
                            color = colors.newLabelColor
                        )
                    }
                }
                body?.let {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = it,
                        style = sizes.bodyTextStyle,
                        color = colors.bodyColor,
                        maxLines = if (subhead != null) 1 else 2,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
            if (trailing != null) {
                val scope =
                    remember(sizes, colors, enabled, checked) {
                        ListItemTrailingScopeWrapper(
                            scope = this,
                            sizes = sizes,
                            colors = colors,
                            enabled = enabled,
                            checked = checked
                        )
                    }
                scope.trailing()
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