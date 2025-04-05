package io.github.madmaximuus.persian.listItem

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.BaselineShift
import io.github.madmaximuus.persian.checkbox.toggle.CheckboxToggle
import io.github.madmaximuus.persian.counter.Counter
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.iconButton.IconButton
import io.github.madmaximuus.persian.radioButton.RadioButtonToggle
import io.github.madmaximuus.persian.switch.Switch
import io.github.madmaximuus.persian.text.Text

/**
 * Interface representing the scope for the right section of a list item.
 *
 * This interface extends [RowScope] and provides properties for managing the appearance and state
 * of the right section of a list item within a row.
 *
 * @property sizes The sizes of the list item, encapsulated in a [ListItemSizes] object.
 * @property colors The colors of the list item, encapsulated in a [ListItemColors] object.
 * @property enabled A boolean indicating whether the list item is enabled.
 * @property checked A boolean indicating whether the list item is checked.
 */
interface ListItemTrailingScope : RowScope {
    val sizes: ListItemSizes
    val colors: ListItemColors
    val enabled: Boolean
    val checked: Boolean
}

/**
 * Internal class that wraps a [RowScope] and implements [ListItemTrailingScope].
 *
 * This class provides a way to encapsulate a [RowScope] and add additional properties related to
 * the right section of a list item, such as sizes, colors, enabled state, and checked state.
 *
 * @param scope The underlying [RowScope] being wrapped.
 * @param sizes The sizes of the list item, encapsulated in a [ListItemSizes] object.
 * @param colors The colors of the list item, encapsulated in a [ListItemColors] object.
 * @param checked A boolean indicating whether the list item is checked.
 * @param enabled A boolean indicating whether the list item is enabled.
 */
internal class ListItemTrailingScopeWrapper(
    val scope: RowScope,
    override val sizes: ListItemSizes,
    override val colors: ListItemColors,
    override val checked: Boolean,
    override val enabled: Boolean
) : ListItemTrailingScope, RowScope by scope

/**
 * Composable function to display an icon within the right scope of a list item.
 *
 * This function creates a [Box] with padding and contains an [Icon] that represents the trailing
 * icon of the list item. The icon's appearance is customized based on the enabled state and the
 * provided sizes and colors.
 *
 * @param modifier The modifier to be applied to the [Box].
 * @param icon The painter for the icon.
 */
@Composable
fun ListItemTrailingScope.Icon(
    modifier: Modifier = Modifier,
    icon: Painter
) {
    Box(
        modifier = modifier
            .padding(start = PersianTheme.spacing.size12)
    ) {
        Icon(
            painter = icon,
            tint = this@Icon.colors.trailingIconColor,
            sizes = this@Icon.sizes.trailingIconSizes
        )
    }
}

/**
 * Composable function to display a switch within the right scope of a list item.
 *
 * This function creates a [Box] with padding and contains a [Switch] that reflects the checked
 * state of the list item. The switch's appearance and behavior are customized based on the enabled
 * state and the provided sizes and colors.
 *
 * @param modifier The modifier to be applied to the [Box].
 */
@Composable
fun ListItemTrailingScope.Switch(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .padding(start = PersianTheme.spacing.size12)
    ) {
        Switch(
            checked = this@Switch.checked,
            colors = this@Switch.colors.trailingSwitchColors,
            sizes = this@Switch.sizes.trailingSwitchSizes,
            enabled = this@Switch.enabled,
            onCheckedChange = null
        )
    }
}

/**
 * Composable function to display a counter within the right scope of a list item.
 *
 * This function creates a [Box] with padding and contains a [Counter] that displays the given count.
 * The counter's appearance is customized based on the provided sizes and colors.
 *
 * @param modifier The modifier to be applied to the [Box].
 * @param count The integer value to be displayed by the counter.
 */
@Composable
fun ListItemTrailingScope.Counter(
    modifier: Modifier = Modifier,
    count: Int,
) {
    Box(
        modifier = modifier
            .padding(start = PersianTheme.spacing.size12)
    ) {
        Counter(
            count = count,
            colors = this@Counter.colors.trailingCounterColors,
            sizes = this@Counter.sizes.trailingCounterSizes,
        )
    }
}

/**
 * Composable function to display a suffix text within the right scope of a list item.
 *
 * This function creates a [Box] with padding and contains a [Text] that displays the given value.
 * The text's appearance is customized based on the enabled state and the provided sizes and colors.
 *
 * @param modifier The modifier to be applied to the [Box].
 * @param title The string value to be displayed as the suffix text.
 */
@Composable
fun ListItemTrailingScope.Suffix(
    modifier: Modifier = Modifier,
    title: String,
    body: String? = null,
    icon: Painter? = null
) {
    require(body==null || icon == null){
        throw IllegalArgumentException("Must have only body or icon")
    }
    Box(
        modifier = modifier
            .padding(start = PersianTheme.spacing.size12)
    ) {
        Column(
            horizontalAlignment = Alignment.End
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size4),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = title,
                    style = this@Suffix.sizes.trailingSuffixTextStyle.copy(baselineShift = BaselineShift.None),
                    color = this@Suffix.colors.trailingSuffixColor,
                    maxLines = 1
                )
                icon?.let {
                    Icon(
                        painter = it,
                        sizes = this@Suffix.sizes.trailingIconSizes,
                        tint = this@Suffix.colors.trailingIconColor
                    )
                }
            }
            body?.let {
                Text(
                    text = it,
                    style = this@Suffix.sizes.trailingSuffixBodyTextStyle.copy(baselineShift = BaselineShift.None),
                    color = this@Suffix.colors.trailingSuffixBodyColor,
                    maxLines = 1
                )
            }
        }
    }
}

/**
 * Composable function to display a button within the right scope of a list item.
 *
 * This function creates a [Box] with padding and contains a primary [Button] that displays the given
 * value and handles click events. The button's appearance and behavior are customized based on the
 * enabled state and the provided sizes and colors.
 *
 * @param modifier The modifier to be applied to the [Box].
 * @param value The string value to be displayed on the button.
 * @param onClick The callback to be invoked when the button is clicked.
 */
@Composable
fun ListItemTrailingScope.Button(
    modifier: Modifier = Modifier,
    value: String,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .padding(start = PersianTheme.spacing.size12)
    ) {
        io.github.madmaximuus.persian.button.Button(
            text = value,
            onClick = onClick,
            sizes = this@Button.sizes.trailingButtonSizes,
            colors = this@Button.colors.trailingButtonColors,
            enabled = this@Button.enabled
        )
    }
}

/**
 * Composable function to display an icon button within the right scope of a list item.
 *
 * This function creates a [Box] with padding and contains a [IconButton] that displays the
 * given icon and handles click events. The button's appearance and behavior are customized based on
 * the enabled state and the provided sizes and colors.
 *
 * @param modifier The modifier to be applied to the [Box].
 * @param icon The painter for the icon to be displayed on the button.
 * @param onClick The callback to be invoked when the button is clicked.
 */
@Composable
fun ListItemTrailingScope.IconButton(
    modifier: Modifier = Modifier,
    icon: Painter,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .padding(start = PersianTheme.spacing.size12)
    ) {
        IconButton(
            icon = icon,
            onClick = onClick,
            colors = this@IconButton.colors.trailingIconButtonColors,
            sizes = this@IconButton.sizes.trailingIconButtonSizes,
            enabled = this@IconButton.enabled
        )
    }
}

/**
 * Composable function to display a checkbox within the right scope of a list item.
 *
 * This function creates a [Box] with padding and contains a [CheckboxToggle] that reflects the
 * checked state of the list item. The checkbox's appearance is customized based on the provided
 * sizes and colors.
 *
 * @param modifier The modifier to be applied to the [Box].
 */
@Composable
fun ListItemTrailingScope.Checkbox(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .padding(start = PersianTheme.spacing.size12)
    ) {
        CheckboxToggle(
            modifier = modifier
                .size(this@Checkbox.sizes.trailingCheckboxSizes.toggleSize),
            checked = this@Checkbox.checked,
            onCheckedChange = null,
            colors = this@Checkbox.colors.trailingCheckboxToggleColors,
        )
    }
}

/**
 * Composable function to display a radio button within the right scope of a list item.
 *
 * This function creates a [Box] with padding and contains a [RadioButtonToggle] that reflects the
 * checked state of the list item. The radio button's appearance is customized based on the provided
 * sizes and colors.
 *
 * @param modifier The modifier to be applied to the [Box].
 */
@Composable
fun ListItemTrailingScope.Radio(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .padding(start = PersianTheme.spacing.size12)
    ) {
        RadioButtonToggle(
            modifier = Modifier
                .size(this@Radio.sizes.trailingRadioButtonSizes.toggleSize),
            selected = this@Radio.checked,
            colors = this@Radio.colors.trailingRadioButtonColors,
            onClick = null
        )
    }
}