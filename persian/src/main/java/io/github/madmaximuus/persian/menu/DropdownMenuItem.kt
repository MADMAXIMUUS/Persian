package io.github.madmaximuus.persian.menu

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
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
import io.github.madmaximuus.persian.dividers.HorizontalDivider
import io.github.madmaximuus.persian.dividers.HorizontalInsetSide
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.ripple.ripple
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persianSymbols.check.base.Check
import io.github.madmaximuus.persianSymbols.chevronRight.base.ChevronRight
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

/**
 * Interface representing the scope for a dropdown menu item.
 *
 * This interface extends [ColumnScope] and provides additional properties specific to dropdown menu items.
 *
 * @property colors The colors used in the dropdown menu item.
 * @property sizes The sizes used in the dropdown menu item.
 */
interface DropdownMenuItemScope : ColumnScope {
    val colors: MenuItemColors
    val sizes: MenuItemSizes
}

/**
 * Internal wrapper class for [DropdownMenuItemScope].
 *
 * This class encapsulates a [ColumnScope] and provides implementations for the properties defined in [DropdownMenuItemScope].
 *
 * @param scope The underlying [ColumnScope] instance.
 * @param colors The colors used in the dropdown menu item.
 * @param sizes The sizes used in the dropdown menu item.
 */
internal class DropdownMenuItemScopeWrapper(
    val scope: ColumnScope,
    override val colors: MenuItemColors,
    override val sizes: MenuItemSizes
) : DropdownMenuItemScope, ColumnScope by scope

/**
 * Composable function to create a dropdown menu item.
 *
 * This function provides a flexible way to define a dropdown menu item with various customization options.
 *
 * @param text The text to be displayed in the dropdown menu item.
 * @param onClick The callback to be invoked when the dropdown menu item is clicked.
 * @param modifier The modifier to be applied to the dropdown menu item.
 * @param leadingIcon The optional leading icon to be displayed in the dropdown menu item.
 * @param expandIcon The expand icon to be displayed in the dropdown menu item.
 * @param enabled Whether the dropdown menu item is enabled.
 * @param selected Whether the dropdown menu item is selected.
 * @param negative Whether the dropdown menu item is in a negative state.
 * @param showNewLabel Whether to show a new label in the dropdown menu item.
 * @param showExpandIcon Whether to show the expand icon in the dropdown menu item.
 * @param interactionSource The interaction source to be used for the dropdown menu item.
 */
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

/**
 * Internal composable function to create the content of a dropdown menu item.
 *
 * This function is responsible for rendering the visual elements of a dropdown menu item, including text, icons,
 * and various customization options.
 *
 * @param text The text to be displayed in the dropdown menu item.
 * @param onClick The callback to be invoked when the dropdown menu item is clicked.
 * @param leadingIcon The optional leading icon to be displayed in the dropdown menu item.
 * @param modifier The modifier to be applied to the dropdown menu item.
 * @param expandIcon The expand icon to be displayed in the dropdown menu item.
 * @param enabled Whether the dropdown menu item is enabled.
 * @param selected Whether the dropdown menu item is selected.
 * @param negative Whether the dropdown menu item is in a negative state.
 * @param showNewLabel Whether to show a new label in the dropdown menu item.
 * @param showExpandIcon Whether to show the expand icon in the dropdown menu item.
 * @param colors The colors used in the dropdown menu item.
 * @param sizes The sizes used in the dropdown menu item.
 * @param interactionSource The interaction source to be used for the dropdown menu item.
 */
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
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size12)
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

/**
 * Composable function to create a horizontal divider within the dropdown menu item scope.
 *
 * This function provides a simple way to add a divider line to separate items within a dropdown menu.
 *
 * @param modifier The modifier to be applied to the divider.
 */
@Composable
fun DropdownMenuItemScope.Divider(
    modifier: Modifier = Modifier
) {
    HorizontalDivider(
        modifier = modifier,
        insetSide = HorizontalInsetSide.BOTH,
        strokeColor = this@Divider.colors.dividerColor,
        sizes = this@Divider.sizes.dividerSizes
    )
}

/**
 * Composable function to create a horizontal group divider within the dropdown menu item scope.
 *
 * This function provides a way to add a divider line to separate groups of items within a dropdown menu.
 *
 * @param modifier The modifier to be applied to the group divider.
 */
@Composable
fun DropdownMenuItemScope.GroupDivider(
    modifier: Modifier = Modifier
) {
    HorizontalDivider(
        modifier = modifier,
        insetSide = HorizontalInsetSide.BOTH,
        strokeColor = this@GroupDivider.colors.dividerColor,
        sizes = this@GroupDivider.sizes.groupDividerSizes
    )
}