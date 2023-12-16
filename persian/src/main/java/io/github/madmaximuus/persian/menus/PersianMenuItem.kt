package io.github.madmaximuus.persian.menus

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.iconBox.PersianIconBox

@Composable
internal fun PersianMenuItem(
    title: String,
    modifier: Modifier = Modifier,
    onItemClick: () -> Unit,
    colors: MenuItemColors = PersianMenuDefaults.itemColors(),
    textStyle: TextStyle = MaterialTheme.typography.bodyLarge,
    enabled: Boolean = true,
    isNegative: Boolean = false,
    leadingIcon: Painter? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    DropdownMenuItem(
        enabled = enabled,
        modifier = modifier,
        text = {
            Text(
                modifier = Modifier.widthIn(112.dp),
                text = title,
                style = textStyle,
                color = colors.titleColor(enabled = enabled, isNegative = isNegative).value
            )
        },
        leadingIcon = leadingIcon?.let {
            {
                CompositionLocalProvider(
                    LocalContentColor provides colors.leadingIconColor(
                        enabled = enabled,
                        isNegative = isNegative
                    ).value
                ) {
                    PersianIconBox(icon = it)
                }
            }
        },
        contentPadding = PaddingValues(horizontal = MaterialTheme.spacing.large),
        onClick = onItemClick,
        interactionSource = interactionSource
    )
}