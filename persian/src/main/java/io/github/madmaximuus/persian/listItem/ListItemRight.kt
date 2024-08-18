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

interface ListItemRight : RowScope {
    val sizes: ListItemSizes
    val colors: ListItemColors
    val enabled: Boolean
    val checked: Boolean
}

internal class ListItemRightWrapper(
    val scope: RowScope,
    override val sizes: ListItemSizes,
    override val colors: ListItemColors,
    override val checked: Boolean,
    override val enabled: Boolean
) : ListItemRight, RowScope by scope

@Composable
fun ListItemRight.Icon(
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

@Composable
fun ListItemRight.Switch(
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

@Composable
fun ListItemRight.Counter(
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

@Composable
fun ListItemRight.Suffix(
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

@Composable
fun ListItemRight.Button(
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

@Composable
fun ListItemRight.IconButton(
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

@Composable
fun ListItemRight.Checkbox(
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

@Composable
fun ListItemRight.Radio(
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