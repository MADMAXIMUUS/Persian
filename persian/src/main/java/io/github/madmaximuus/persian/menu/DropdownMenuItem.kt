package io.github.madmaximuus.persian.menu

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.dividers.InsetHorizontalDivider
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.ripple.ripple
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persianSymbols.check.base.Check
import io.github.madmaximuus.persianSymbols.chevronRight.base.ChevronRight
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

interface DropdownMenuItemScope : ColumnScope {
    val colors: MenuItemColors
    val sizes: MenuItemSizes
}

internal class DropdownMenuItemScopeWrapper(
    val scope: ColumnScope,
    override val colors: MenuItemColors,
    override val sizes: MenuItemSizes
) : DropdownMenuItemScope, ColumnScope by scope


@Composable
fun DropdownMenuItemScope.DropdownMenuItem(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    leadingIcon: Painter? = null,
    expandIcon: Painter = rememberVectorPainter(image = PersianSymbols.Default.ChevronRight),
    enabled: Boolean = true,
    selected: Boolean = false,
    negative: Boolean = false,
    showNewLabel: Boolean = false,
    showExpandIcon: Boolean = false,
    interactionSource: MutableInteractionSource? = null,
) {
    DropdownMenuItemContent(
        modifier = modifier,
        text = text,
        onClick = onClick,
        leadingIcon = leadingIcon,
        expandIcon = expandIcon,
        selected = selected,
        enabled = enabled,
        negative = negative,
        showNewLabel = showNewLabel,
        showExpandIcon = showExpandIcon,
        colors = this@DropdownMenuItem.colors,
        sizes = this@DropdownMenuItem.sizes,
        interactionSource = interactionSource,
    )
}

@Composable
internal fun DropdownMenuItemContent(
    text: String,
    onClick: () -> Unit,
    leadingIcon: Painter?,
    modifier: Modifier,
    expandIcon: Painter,
    enabled: Boolean,
    selected: Boolean,
    negative: Boolean,
    showNewLabel: Boolean,
    showExpandIcon: Boolean,
    colors: MenuItemColors,
    sizes: MenuItemSizes,
    interactionSource: MutableInteractionSource?
) {
    val paddingValues = PaddingValues(
        start = PersianTheme.spacing.size16,
        end = if (showExpandIcon) PersianTheme.spacing.size8
        else PersianTheme.spacing.size16
    )
    Row(
        modifier = modifier
            .clickable(
                enabled = enabled,
                onClick = onClick,
                interactionSource = interactionSource,
                indication = ripple(
                    bounded = true,
                    color = PersianTheme.colorScheme.onSurface
                )
            )
            .fillMaxWidth()
            .height(48.dp)
            .width(220.dp)
            .padding(paddingValues),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (leadingIcon != null) {
            Box {
                Icon(
                    painter = if (selected && !negative) rememberVectorPainter(image = PersianSymbols.Default.Check)
                    else leadingIcon,
                    tint = colors.leadingIconColor(enabled, negative, selected),
                    sizes = sizes.leadingIconSizes
                )
            }
        }
        Row(
            modifier = Modifier
                .weight(1f)
                .padding(
                    start = if (leadingIcon != null) {
                        DropdownMenuItemHorizontalPadding
                    } else {
                        0.dp
                    },
                    end = if (showExpandIcon) {
                        DropdownMenuItemHorizontalPadding
                    } else {
                        0.dp
                    }
                )
        ) {
            Text(
                text = text,
                style = sizes.titleTextStyle,
                color = colors.titleColor(enabled, negative)
            )
            if (showNewLabel && !negative) {
                Text(
                    modifier = Modifier
                        .background(
                            color = colors.newLabelContainerColor(enabled),
                            shape = sizes.newLabelContainerShape
                        )
                        .padding(
                            horizontal = PersianTheme.spacing.size4,
                            vertical = PersianTheme.spacing.size2
                        ),
                    text = "New",
                    style = sizes.newLabelTextStyle,
                    color = colors.newLabelColor(enabled)
                )
            }
        }
        if (showExpandIcon && !negative) {
            Icon(
                painter = expandIcon,
                tint = colors.expandIconColor(enabled),
                sizes = sizes.expendIconSizes
            )
        }
    }
}

@Composable
fun DropdownMenuItemScope.Divider(
    modifier: Modifier = Modifier
) {
    InsetHorizontalDivider(
        modifier = modifier,
        strokeColor = this@Divider.colors.dividerColor,
        sizes = this@Divider.sizes.dividerSizes
    )
}

@Composable
fun DropdownMenuItemScope.GroupDivider(
    modifier: Modifier = Modifier
) {
    InsetHorizontalDivider(
        modifier = modifier,
        strokeColor = this@GroupDivider.colors.dividerColor,
        sizes = this@GroupDivider.sizes.groupDividerSizes
    )
}