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

interface ListItemMiddle : RowScope {
    val sizes: ListItemSizes
    val colors: ListItemColors
    val enabled: Boolean
}

internal class ListItemMiddleWrapper(
    scope: RowScope,
    override val sizes: ListItemSizes,
    override val colors: ListItemColors,
    override val enabled: Boolean,
) : ListItemMiddle, RowScope by scope

@Composable
fun ListItemMiddle.Middle(
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
                color = this@Middle.colors.subheadColor(this@Middle.enabled),
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
                color = this@Middle.colors.titleColor(this@Middle.enabled),
                overflow = TextOverflow.Ellipsis
            )
            if (newLabel) {
                Text(
                    modifier = Modifier
                        .background(
                            color = this@Middle.colors.newLabelContainerColor(this@Middle.enabled),
                            shape = this@Middle.sizes.newLabelShape
                        )
                        .padding(
                            horizontal = PersianTheme.spacing.size4,
                            vertical = PersianTheme.spacing.size2
                        ),
                    text = "New",
                    style = this@Middle.sizes.newLabelTextStyle,
                    color = this@Middle.colors.newLabelColor(this@Middle.enabled)
                )
            }
        }
        body?.let {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = it,
                style = this@Middle.sizes.bodyTextStyle,
                color = this@Middle.colors.bodyColor(this@Middle.enabled),
                maxLines = if (multiline) 2 else 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }

}