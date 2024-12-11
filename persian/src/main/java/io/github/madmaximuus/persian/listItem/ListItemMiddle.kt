package io.github.madmaximuus.persian.listItem

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text

/**
 * Interface representing the scope for the middle section of a list item.
 *
 * This interface extends [RowScope] and provides properties for managing the appearance and state
 * of the middle section of a list item within a row.
 *
 * @property sizes The sizes of the list item, encapsulated in a [ListItemSizes] object.
 * @property colors The colors of the list item, encapsulated in a [ListItemColors] object.
 */
interface ListItemMiddleScope : RowScope {
    val sizes: ListItemSizes
    val colors: ListItemColors
}

/**
 * Internal class that wraps a [RowScope] and implements [ListItemMiddleScope].
 *
 * This class provides a way to encapsulate a [RowScope] and add additional properties related to
 * the middle section of a list item, such as sizes, colors, and enabled state.
 *
 * @param scope The underlying [RowScope] being wrapped.
 * @param sizes The sizes of the list item, encapsulated in a [ListItemSizes] object.
 * @param colors The colors of the list item, encapsulated in a [ListItemColors] object.
 */
internal class ListItemMiddleScopeWrapper(
    scope: RowScope,
    override val sizes: ListItemSizes,
    override val colors: ListItemColors,
) : ListItemMiddleScope, RowScope by scope

/**
 * Composable function to display the middle section of a list item.
 *
 * This function creates a [Column] with vertical padding and contains various text elements
 * such as title, subhead, and body. The appearance of these text elements is customized based on
 * the enabled state and the provided sizes, colors, and other properties.
 *
 * @param modifier The modifier to be applied to the [Column].
 * @param title The main title text to be displayed.
 * @param subhead The optional subhead text to be displayed above the title.
 * @param body The optional body text to be displayed below the title.
 * @param multiline A boolean indicating whether the text elements should support multiple lines.
 * @param newLabel A boolean indicating whether to display a "New" label next to the title.
 */
@Composable
fun ListItemMiddleScope.Middle(
    modifier: Modifier = Modifier,
    title: String,
    subhead: String? = null,
    body: String? = null,
    multiline: Boolean = false,
    newLabel: Boolean = false,
) {
    Column(
        modifier = modifier
            .weight(1f)
            .padding(vertical = PersianTheme.spacing.size8),
        verticalArrangement = Arrangement.spacedBy(
            space = PersianTheme.spacing.size2,
            alignment = Alignment.CenterVertically
        )
    ) {
        subhead?.let {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = it,
                style = this@Middle.sizes.subheadTextStyle,
                color = this@Middle.colors.subheadColor,
                maxLines = if (multiline) 2 else 1,
                overflow = TextOverflow.Ellipsis
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size4)
        ) {
            Text(
                text = title,
                style = this@Middle.sizes.titleTextStyle,
                color = this@Middle.colors.titleColor,
                overflow = TextOverflow.Ellipsis
            )
            if (newLabel) {
                Text(
                    modifier = Modifier
                        .background(
                            color = this@Middle.colors.newLabelContainerColor,
                            shape = this@Middle.sizes.newLabelShape
                        )
                        .padding(
                            horizontal = PersianTheme.spacing.size4,
                            vertical = PersianTheme.spacing.size2
                        ),
                    text = "New",
                    style = this@Middle.sizes.newLabelTextStyle,
                    color = this@Middle.colors.newLabelColor
                )
            }
        }
        body?.let {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = it,
                style = this@Middle.sizes.bodyTextStyle,
                color = this@Middle.colors.bodyColor,
                maxLines = if (multiline) 2 else 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}