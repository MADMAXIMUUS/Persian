package io.github.madmaximuus.persian.listItem

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.BaselineShift
import io.github.madmaximuus.persian.button.PrimaryButton
import io.github.madmaximuus.persian.checkboxes.toggle.CheckboxToggle
import io.github.madmaximuus.persian.counter.Counter
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.iconButton.PrimaryIconButton
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
interface ListItemRightScope : RowScope {
    val sizes: ListItemSizes
    val colors: ListItemColors
    val enabled: Boolean
    val checked: Boolean
}

/**
 * Internal class that wraps a [RowScope] and implements [ListItemRightScope].
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
internal class ListItemRightScopeWrapper(
    val scope: RowScope,
    override val sizes: ListItemSizes,
    override val colors: ListItemColors,
    override val checked: Boolean,
    override val enabled: Boolean
) : ListItemRightScope, RowScope by scope

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
fun ListItemRightScope.Icon(
    modifier: Modifier = Modifier,
    icon: Painter
) {
    Box(
        modifier = modifier
            .padding(start = PersianTheme.spacing.size12)
    ) {
        Icon(
            painter = icon,
            tint = this@Icon.colors.rightIconColor(this@Icon.enabled),
            sizes = this@Icon.sizes.rightIconSizes
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
fun ListItemRightScope.Switch(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .padding(start = PersianTheme.spacing.size12)
    ) {
        Switch(
            checked = this@Switch.checked,
            colors = this@Switch.colors.rightSwitchColors,
            sizes = this@Switch.sizes.rightSwitchSizes,
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
fun ListItemRightScope.Counter(
    modifier: Modifier = Modifier,
    count: Int,
) {
    Box(
        modifier = modifier
            .padding(start = PersianTheme.spacing.size12)
    ) {
        Counter(
            count = count,
            colors = this@Counter.colors.rightCounterColors,
            sizes = this@Counter.sizes.rightCounterSizes,
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
 * @param value The string value to be displayed as the suffix text.
 */
@Composable
fun ListItemRightScope.Suffix(
    modifier: Modifier = Modifier,
    value: String,
) {
    Box(
        modifier = modifier
            .padding(start = PersianTheme.spacing.size12)
    ) {
        Text(
            text = value,
            style = this@Suffix.sizes.rightSuffixTextStyle.copy(baselineShift = BaselineShift.None),
            color = this@Suffix.colors.suffixColor(this@Suffix.enabled)
        )
    }
}

/**
 * Composable function to display a button within the right scope of a list item.
 *
 * This function creates a [Box] with padding and contains a [PrimaryButton] that displays the given
 * value and handles click events. The button's appearance and behavior are customized based on the
 * enabled state and the provided sizes and colors.
 *
 * @param modifier The modifier to be applied to the [Box].
 * @param value The string value to be displayed on the button.
 * @param onClick The callback to be invoked when the button is clicked.
 */
@Composable
fun ListItemRightScope.Button(
    modifier: Modifier = Modifier,
    value: String,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .padding(start = PersianTheme.spacing.size12)
    ) {
        PrimaryButton(
            text = value,
            onClick = onClick,
            sizes = this@Button.sizes.rightButtonSizes,
            colors = this@Button.colors.rightButtonColors,
            enabled = this@Button.enabled
        )
    }
}

/**
 * Composable function to display an icon button within the right scope of a list item.
 *
 * This function creates a [Box] with padding and contains a [PrimaryIconButton] that displays the
 * given icon and handles click events. The button's appearance and behavior are customized based on
 * the enabled state and the provided sizes and colors.
 *
 * @param modifier The modifier to be applied to the [Box].
 * @param icon The painter for the icon to be displayed on the button.
 * @param onClick The callback to be invoked when the button is clicked.
 */
@Composable
fun ListItemRightScope.IconButton(
    modifier: Modifier = Modifier,
    icon: Painter,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .padding(start = PersianTheme.spacing.size12)
    ) {
        PrimaryIconButton(
            icon = icon,
            onClick = onClick,
            colors = this@IconButton.colors.rightIconButtonColors,
            sizes = this@IconButton.sizes.rightIconButtonSizes,
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
fun ListItemRightScope.Checkbox(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .padding(start = PersianTheme.spacing.size12)
    ) {
        CheckboxToggle(
            modifier = modifier
                .size(this@Checkbox.sizes.rightCheckboxSizes.toggleSize),
            checked = this@Checkbox.checked,
            onCheckedChange = null,
            colors = this@Checkbox.colors.rightCheckboxToggleColors,
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
fun ListItemRightScope.Radio(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .padding(start = PersianTheme.spacing.size12)
    ) {
        RadioButtonToggle(
            modifier = Modifier
                .size(this@Radio.sizes.rightRadioButtonSizes.toggleSize),
            selected = this@Radio.checked,
            colors = this@Radio.colors.rightRadioButtonColors,
            onClick = null
        )
    }
}