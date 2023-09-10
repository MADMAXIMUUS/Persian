package ru.rabbit.persian.iconButtons.toggle

import androidx.compose.foundation.BorderStroke
import androidx.compose.material3.FilledIconToggleButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedIconToggleButton
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.rabbit.persian.foundation.PersianComponentStyle
import ru.rabbit.persian.foundation.PersianTheme
import ru.rabbit.persian.foundation.icons
import ru.rabbit.persian.iconButtons.IconButtonSizes
import ru.rabbit.persian.iconButtons.PersianIconButtonSizes

object PersianIconButton {

    @Composable
    fun Primary(
        modifier: Modifier = Modifier,
        icon: Painter,
        checkedIcon: Painter,
        style: PersianComponentStyle = PersianComponentStyle.TONAL,
        enabled: Boolean = true,
        sizes: IconButtonSizes = PersianIconButtonSizes.medium(),
        colors: IconButtonColors = PersianToggleIconButtonColors.primary(style = style),
        checked: Boolean,
        onCheckedChange: (Boolean) -> Unit
    ) {
        when (style) {
            PersianComponentStyle.FILL -> PersianFilledToggleIconButtonImpl(
                modifier = modifier,
                icon = icon,
                checkedIcon = checkedIcon,
                enabled = enabled,
                sizes = sizes,
                colors = colors,
                checked = checked,
                onCheckedChange = onCheckedChange
            )

            PersianComponentStyle.OUTLINED -> PersianOutlinedToggleIconButtonImpl(
                modifier = modifier,
                icon = icon,
                checkedIcon = checkedIcon,
                enabled = enabled,
                sizes = sizes,
                colors = colors,
                checked = checked,
                onCheckedChange = onCheckedChange
            )

            PersianComponentStyle.STANDARD -> PersianToggleIconButtonImpl(
                modifier = modifier,
                icon = icon,
                checkedIcon = checkedIcon,
                enabled = enabled,
                sizes = sizes,
                colors = colors,
                checked = checked,
                onCheckedChange = onCheckedChange
            )

            PersianComponentStyle.TONAL -> PersianFilledToggleIconButtonImpl(
                modifier = modifier,
                icon = icon,
                checkedIcon = checkedIcon,
                enabled = enabled,
                sizes = sizes,
                colors = colors,
                checked = checked,
                onCheckedChange = onCheckedChange
            )
        }
    }
}

@Composable
private fun PersianFilledToggleIconButtonImpl(
    modifier: Modifier = Modifier,
    icon: Painter,
    checkedIcon: Painter,
    enabled: Boolean,
    sizes: IconButtonSizes,
    colors: IconButtonColors,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    FilledIconToggleButton(
        modifier = modifier,
        colors = IconButtonDefaults.filledIconToggleButtonColors(
            containerColor = colors.containerColor,
            contentColor = colors.contentColor,
            disabledContentColor = colors.disabledContentColor,
            disabledContainerColor = colors.disabledContainerColor
        ),
        shape = sizes.cornerRadius,
        enabled = enabled,
        checked = checked,
        onCheckedChange = onCheckedChange
    ) {
        if (checked) {
            Icon(
                painter = checkedIcon,
                contentDescription = ""
            )
        } else {
            Icon(
                painter = icon,
                contentDescription = ""
            )
        }
    }
}

@Composable
private fun PersianOutlinedToggleIconButtonImpl(
    modifier: Modifier = Modifier,
    icon: Painter,
    checkedIcon: Painter,
    enabled: Boolean,
    sizes: IconButtonSizes,
    colors: IconButtonColors,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    OutlinedIconToggleButton(
        modifier = modifier,
        colors = IconButtonDefaults.outlinedIconToggleButtonColors(
            containerColor = colors.containerColor,
            contentColor = colors.contentColor,
            disabledContentColor = colors.disabledContentColor,
            disabledContainerColor = colors.disabledContainerColor,
            checkedContainerColor = colors.checkedContainerColor,
            checkedContentColor = colors.checkedContentColor
        ),
        shape = sizes.cornerRadius,
        border = BorderStroke(1.dp, colors.contentColor),
        enabled = enabled,
        checked = checked,
        onCheckedChange = onCheckedChange
    ) {
        if (checked) {
            Icon(
                painter = checkedIcon,
                contentDescription = ""
            )
        } else {
            Icon(
                painter = icon,
                contentDescription = ""
            )
        }
    }
}

@Composable
private fun PersianToggleIconButtonImpl(
    modifier: Modifier = Modifier,
    icon: Painter,
    checkedIcon: Painter,
    enabled: Boolean,
    sizes: IconButtonSizes,
    colors: IconButtonColors,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    IconToggleButton(
        modifier = modifier
            .clip(sizes.cornerRadius),
        colors = IconButtonDefaults.iconToggleButtonColors(
            containerColor = colors.containerColor,
            contentColor = colors.contentColor,
            disabledContentColor = colors.disabledContentColor,
            disabledContainerColor = colors.disabledContainerColor
        ),
        enabled = enabled,
        checked = checked,
        onCheckedChange = onCheckedChange
    ) {
        if (checked) {
            Icon(
                painter = checkedIcon,
                contentDescription = ""
            )
        } else {
            Icon(
                painter = icon,
                contentDescription = ""
            )
        }
    }
}

@Preview
@Composable
fun FiledIconButtonPreview() {
    PersianTheme {
        Surface {
            PersianIconButton.Primary(
                icon = MaterialTheme.icons.favoriteOutlined,
                checkedIcon = MaterialTheme.icons.favoriteFilled,
                style = PersianComponentStyle.FILL,
                checked = false,
                onCheckedChange = {}
            )
        }
    }
}

@Preview
@Composable
fun OutlinedIconButtonPreview() {
    PersianTheme {
        Surface {
            PersianIconButton.Primary(
                icon = MaterialTheme.icons.favoriteOutlined,
                checkedIcon = MaterialTheme.icons.favoriteFilled,
                style = PersianComponentStyle.OUTLINED,
                checked = false,
                onCheckedChange = {}
            )
        }
    }
}

@Preview
@Composable
fun IconButtonPreview() {
    PersianTheme {
        Surface {
            PersianIconButton.Primary(
                icon = MaterialTheme.icons.favoriteOutlined,
                checkedIcon = MaterialTheme.icons.favoriteFilled,
                style = PersianComponentStyle.STANDARD,
                checked = false,
                onCheckedChange = {}
            )
        }
    }
}