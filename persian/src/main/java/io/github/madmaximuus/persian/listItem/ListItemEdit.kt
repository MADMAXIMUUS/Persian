package io.github.madmaximuus.persian.listItem

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import io.github.madmaximuus.persian.checkboxes.toggle.CheckboxToggle
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.iconButton.TertiaryIconButton
import io.github.madmaximuus.persian.radioButton.RadioButtonToggle
import io.github.madmaximuus.persianSymbols.bars.base.Bars
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.minus.base.Minus
import io.github.madmaximuus.persianSymbols.plus.base.Plus

/**
 * Interface representing the scope for editing a list item.
 *
 * This interface extends [RowScope] and provides properties for managing the appearance and state
 * of a list item within a row.
 *
 * @property sizes The sizes of the list item, encapsulated in a [ListItemSizes] object.
 * @property colors The colors of the list item, encapsulated in a [ListItemColors] object.
 * @property enabled A boolean indicating whether the list item is enabled.
 * @property checked A boolean indicating whether the list item is checked.
 */
interface ListItemEditScope : RowScope {
    val sizes: ListItemSizes
    val colors: ListItemColors
    val enabled: Boolean
    val checked: Boolean
}

/**
 * Internal class that wraps a [RowScope] and implements [ListItemEditScope].
 *
 * This class provides a way to encapsulate a [RowScope] and add additional properties related to
 * list item editing, such as sizes, colors, enabled state, and checked state.
 *
 * @param scope The underlying [RowScope] being wrapped.
 * @param sizes The sizes of the list item, encapsulated in a [ListItemSizes] object.
 * @param colors The colors of the list item, encapsulated in a [ListItemColors] object.
 * @param enabled A boolean indicating whether the list item is enabled.
 * @param checked A boolean indicating whether the list item is checked.
 */
internal class ListItemEditScopeWrapper(
    val scope: RowScope,
    override val sizes: ListItemSizes,
    override val colors: ListItemColors,
    override val enabled: Boolean,
    override val checked: Boolean,
) : ListItemEditScope, RowScope by scope

/**
 * Composable function to display a checkbox within a list item editing scope.
 *
 * This function creates a [Box] with padding and contains a [CheckboxToggle] that reflects the
 * checked and enabled states of the list item.
 *
 * @param modifier The modifier to be applied to the this check.
 */
@Composable
fun ListItemEditScope.Check(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .padding(
                start = PersianTheme.spacing.size12
            )
    ) {
        CheckboxToggle(
            modifier = Modifier
                .size(this@Check.sizes.editCheckboxSizes.toggleSize),
            checked = this@Check.checked,
            enabled = this@Check.enabled,
            colors = this@Check.colors.editCheckboxToggleColors,
            onCheckedChange = null
        )
    }
}

/**
 * Composable function to display a radio button within a list item editing scope.
 *
 * This function creates a [Box] with horizontal padding and contains a [RadioButtonToggle] that
 * reflects the checked and enabled states of the list item.
 *
 * @param modifier The modifier to be applied to the [Box].
 */
@Composable
fun ListItemEditScope.Radio(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .padding(
                horizontal = PersianTheme.spacing.size12
            )
    ) {
        RadioButtonToggle(
            modifier = Modifier
                .size(this@Radio.sizes.editRadioButtonSizes.toggleSize),
            selected = this@Radio.checked,
            enabled = this@Radio.enabled,
            colors = this@Radio.colors.editRadioButtonColors,
            onClick = null
        )
    }
}

/**
 * Composable function to display a drag handle within a list item editing scope.
 *
 * This function creates a [Box] with horizontal padding and contains an [Icon] that represents
 * the drag handle. The icon's appearance is customized based on the enabled state and the
 * provided sizes and colors.
 *
 * @param modifier The modifier to be applied to the [Box].
 * @param icon The painter for the drag handle icon.
 */
@Composable
fun ListItemEditScope.Drag(
    modifier: Modifier = Modifier,
    icon: Painter = rememberVectorPainter(image = PersianSymbols.Default.Bars)
) {
    Box(
        modifier = modifier
            .padding(
                horizontal = PersianTheme.spacing.size12
            )
    ) {
        Icon(
            painter = icon,
            tint = this@Drag.colors.dragColor(this@Drag.enabled),
            sizes = this@Drag.sizes.editDragIconSizes,
        )
    }
}

/**
 * Composable function to display an add button within a list item editing scope.
 *
 * This function creates a [Box] with horizontal padding and contains a [TertiaryIconButton] that
 * represents the add button. The button's appearance and behavior are customized based on the
 * enabled state and the provided sizes, colors, and click handler.
 *
 * @param modifier The modifier to be applied to the [Box].
 * @param icon The painter for the add button icon.
 * @param onClick The callback to be invoked when the add button is clicked.
 */
@Composable
fun ListItemEditScope.Add(
    modifier: Modifier = Modifier,
    icon: Painter = rememberVectorPainter(image = PersianSymbols.Default.Plus),
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .padding(
                horizontal = PersianTheme.spacing.size4
            )
    ) {
        TertiaryIconButton(
            onClick = onClick,
            icon = icon,
            enabled = this@Add.enabled,
            sizes = this@Add.sizes.editAddIconButtonSizes,
            colors = this@Add.colors.editAddColors
        )
    }
}

/**
 * Composable function to display a remove button within a list item editing scope.
 *
 * This function creates a [Box] with horizontal padding and contains a [TertiaryIconButton] that
 * represents the remove button. The button's appearance and behavior are customized based on the
 * enabled state and the provided sizes, colors, and click handler.
 *
 * @param modifier The modifier to be applied to the [Box].
 * @param icon The painter for the remove button icon.
 * @param onClick The callback to be invoked when the remove button is clicked.
 */
@Composable
fun ListItemEditScope.Remove(
    modifier: Modifier = Modifier,
    icon: Painter = rememberVectorPainter(image = PersianSymbols.Default.Minus),
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .padding(
                horizontal = PersianTheme.spacing.size4
            )
    ) {
        TertiaryIconButton(
            onClick = onClick,
            icon = icon,
            enabled = this@Remove.enabled,
            sizes = this@Remove.sizes.editRemoveIconButtonSizes,
            colors = this@Remove.colors.editRemoveColors
        )
    }
}