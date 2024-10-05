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

interface ListItemEdit : RowScope {
    val sizes: ListItemSizes
    val colors: ListItemColors
    val enabled: Boolean
    val checked: Boolean
}

internal class ListItemEditWrapper(
    val scope: RowScope,
    override val sizes: ListItemSizes,
    override val colors: ListItemColors,
    override val enabled: Boolean,
    override val checked: Boolean,
) : ListItemEdit, RowScope by scope

@Composable
fun ListItemEdit.Check(
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

@Composable
fun ListItemEdit.Radio(
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

@Composable
fun ListItemEdit.Drag(
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

@Composable
fun ListItemEdit.Add(
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

@Composable
fun ListItemEdit.Remove(
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