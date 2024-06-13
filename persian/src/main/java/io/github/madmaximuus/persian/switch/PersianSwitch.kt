package io.github.madmaximuus.persian.switch

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import io.github.madmaximuus.persian.iconBox.Icon
import io.github.madmaximuus.persian.iconBox.IconDefaults

@Composable
fun PersianSwitch(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    colors: SwitchColors = PersianSwitchDefaults.colors(),
    enabled: Boolean = true,
    checkedIcon: Painter? = null,
    uncheckedIcon: Painter? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {

    val icon: (@Composable () -> Unit)? = when {
        checkedIcon == null && uncheckedIcon == null -> null
        checkedIcon != null && checked -> {
            {
                Icon(
                    painter = checkedIcon,
                    size = IconDefaults.size18()
                )
            }
        }

        uncheckedIcon != null && !checked -> {
            {
                Icon(
                    painter = uncheckedIcon,
                    size = IconDefaults.size18()
                )
            }
        }

        else -> null
    }

    Switch(
        modifier = modifier,
        checked = checked,
        onCheckedChange = onCheckedChange,
        colors = colors,
        enabled = enabled,
        interactionSource = interactionSource,
        thumbContent = icon
    )
}