package io.github.madmaximuus.persian.iconButtons

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.iconBox.PersianIconBox
import io.github.madmaximuus.persian.iconBox.PersianIconBoxDefaults

@Composable
fun PersianPrimaryToggleIconButton(
    modifier: Modifier = Modifier,
    icon: Painter,
    checkedIcon: Painter,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    enabled: Boolean = true,
    shape: Shape = PersianIconButtonDefaults.shape,
    colors: ToggleIconButtonColors = PersianIconButtonDefaults.primaryToggleIconButtonColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) = Surface(
    checked = checked,
    onCheckedChange = onCheckedChange,
    modifier = modifier.semantics { role = Role.Checkbox },
    enabled = enabled,
    shape = shape,
    color = colors.containerColor(enabled, checked).value,
    contentColor = colors.contentColor(enabled, checked).value,
    interactionSource = interactionSource
) {
    Box(
        modifier = Modifier.size(40.dp),
        contentAlignment = Alignment.Center
    ) {
        if (checked) {
            PersianIconBox(
                icon = checkedIcon,
                colors = PersianIconBoxDefaults.colors(
                    defaultColor = colors.contentColor(enabled, checked).value
                )
            )
        } else {
            PersianIconBox(
                icon = icon,
                colors = PersianIconBoxDefaults.colors(
                    defaultColor = colors.contentColor(enabled, checked).value
                )
            )
        }
    }
}

@Composable
fun PersianSecondaryToggleIconButton(
    modifier: Modifier = Modifier,
    icon: Painter,
    checkedIcon: Painter,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    enabled: Boolean = true,
    shape: Shape = PersianIconButtonDefaults.shape,
    colors: ToggleIconButtonColors = PersianIconButtonDefaults.secondaryToggleIconButtonColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) = Surface(
    checked = checked,
    onCheckedChange = onCheckedChange,
    modifier = modifier.semantics { role = Role.Checkbox },
    enabled = enabled,
    shape = shape,
    color = colors.containerColor(enabled, checked).value,
    contentColor = colors.contentColor(enabled, checked).value,
    interactionSource = interactionSource
) {
    Box(
        modifier = Modifier.size(40.dp),
        contentAlignment = Alignment.Center
    ) {
        if (checked) {
            PersianIconBox(icon = checkedIcon)
        } else {
            PersianIconBox(icon = icon)
        }
    }
}

@Composable
fun PersianTertiaryToggleIconButton(
    modifier: Modifier = Modifier,
    icon: Painter,
    checkedIcon: Painter,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    enabled: Boolean = true,
    shape: Shape = PersianIconButtonDefaults.shape,
    colors: ToggleIconButtonColors = PersianIconButtonDefaults.tertiaryToggleIconButtonColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) = Surface(
    checked = checked,
    onCheckedChange = onCheckedChange,
    modifier = modifier.semantics { role = Role.Checkbox },
    enabled = enabled,
    shape = shape,
    color = colors.containerColor(enabled, checked).value,
    contentColor = colors.contentColor(enabled, checked).value,
    interactionSource = interactionSource
) {
    Box(
        modifier = Modifier.size(40.dp),
        contentAlignment = Alignment.Center
    ) {
        if (checked) {
            PersianIconBox(icon = checkedIcon)
        } else {
            PersianIconBox(icon = icon)
        }
    }
}

@Composable
fun PersianOutlinedToggleIconButton(
    modifier: Modifier = Modifier,
    icon: Painter,
    checkedIcon: Painter,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    enabled: Boolean = true,
    shape: Shape = PersianIconButtonDefaults.shape,
    colors: ToggleIconButtonColors = PersianIconButtonDefaults.outlinedToggleIconButtonColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) = Surface(
    checked = checked,
    onCheckedChange = onCheckedChange,
    modifier = modifier.semantics { role = Role.Checkbox },
    enabled = enabled,
    shape = shape,
    color = colors.containerColor(enabled, checked).value,
    contentColor = colors.contentColor(enabled, checked).value,
    border = if (checked) null else BorderStroke(
        1.dp,
        colors.contentColor(enabled, checked).value
    ),
    interactionSource = interactionSource
) {
    Box(
        modifier = Modifier.size(40.dp),
        contentAlignment = Alignment.Center
    ) {
        if (checked) {
            PersianIconBox(icon = checkedIcon)
        } else {
            PersianIconBox(icon = icon)
        }
    }
}

@Preview
@Composable
fun PrimaryToggleIconButtonPreview() {
    PersianTheme {
        Surface {
            PersianPrimaryToggleIconButton(
                icon = MaterialTheme.icons.favoriteOutlined,
                checkedIcon = MaterialTheme.icons.favoriteFilled,
                checked = false,
                onCheckedChange = {}
            )
        }
    }
}

@Preview
@Composable
fun SecondaryToggleIconButtonPreview() {
    PersianTheme {
        Surface {
            PersianSecondaryToggleIconButton(
                icon = MaterialTheme.icons.favoriteOutlined,
                checkedIcon = MaterialTheme.icons.favoriteFilled,
                checked = false,
                onCheckedChange = {}
            )
        }
    }
}

@Preview
@Composable
fun TertiaryToggleIconButtonPreview() {
    PersianTheme {
        Surface {
            PersianTertiaryToggleIconButton(
                icon = MaterialTheme.icons.favoriteOutlined,
                checkedIcon = MaterialTheme.icons.favoriteFilled,
                checked = false,
                onCheckedChange = {}
            )
        }
    }
}

@Preview
@Composable
fun OutlinedToggleIconButtonPreview() {
    PersianTheme {
        Surface {
            PersianOutlinedToggleIconButton(
                icon = MaterialTheme.icons.favoriteOutlined,
                checkedIcon = MaterialTheme.icons.favoriteFilled,
                checked = false,
                onCheckedChange = {}
            )
        }
    }
}