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
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.dividers.InsetHorizontalDivider
import io.github.madmaximuus.persian.foundation.PersianTheme

@Composable
fun ListItem(
    modifier: Modifier = Modifier,
    edit: (@Composable ListItemEdit.() -> Unit)? = null,
    left: (@Composable ListItemLeft.() -> Unit)? = null,
    middle: @Composable ListItemMiddle.() -> Unit,
    right: (@Composable ListItemRight.() -> Unit)? = null,
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
        val padding = if (edit != null) PaddingValues(end = PersianTheme.spacing.size16)
        else PaddingValues(horizontal = PersianTheme.spacing.size16)
        Row(
            Modifier
                .fillMaxWidth()
                .padding(padding),
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (edit != null) {
                val scope =
                    remember(sizes, colors, enabled, checked) {
                        ListItemEditWrapper(
                            scope = this,
                            sizes = sizes,
                            colors = colors,
                            enabled = enabled,
                            checked = checked
                        )
                    }
                scope.edit()
            }
            if (left != null) {
                val scope =
                    remember(sizes, colors, enabled) {
                        ListItemLeftWrapper(
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
                    ListItemMiddleWrapper(
                        scope = this,
                        sizes = sizes,
                        colors = colors,
                        enabled = enabled
                    )
                }
            middleScope.middle()
            if (right != null) {
                val scope =
                    remember(sizes, colors, enabled, checked) {
                        ListItemRightWrapper(
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
            InsetHorizontalDivider(
                modifier = Modifier.fillMaxWidth(),
                sizes = sizes.dividerSizes,
                strokeColor = colors.dividerColor
            )
    }
}