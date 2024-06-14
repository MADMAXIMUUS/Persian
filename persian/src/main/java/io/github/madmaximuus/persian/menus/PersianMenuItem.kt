package io.github.madmaximuus.persian.menus

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import io.github.madmaximuus.persian.foundation.LocalContentColor
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.text.Text

@Composable
internal fun PersianMenuItem(
    title: String,
    onItemClick: () -> Unit,
    modifier: Modifier = Modifier,
    colors: MenuItemColors = PersianMenuDefaults.itemColors(),
    textStyle: TextStyle = PersianTheme.typography.bodyLarge,
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
                    Icon(painter = it)
                }
            }
        },
        contentPadding = PaddingValues(horizontal = PersianTheme.spacing.size16),
        onClick = onItemClick,
        interactionSource = interactionSource
    )
}

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
internal fun PersianMenuItem(
    title: String,
    onItemClick: () -> Unit,
    modifier: Modifier = Modifier,
    colors: MenuItemColors = PersianMenuDefaults.itemColors(),
    textStyle: TextStyle = PersianTheme.typography.bodyLarge,
    enabled: Boolean = true,
    isNegative: Boolean = false,
    leadingIconUrl: String? = null,
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
        leadingIcon = leadingIconUrl?.let {
            {
                GlideImage(
                    modifier = Modifier
                        .size(24.dp),
                    model = it,
                    contentDescription = ""
                )
            }
        },
        contentPadding = PaddingValues(horizontal = PersianTheme.spacing.size16),
        onClick = onItemClick,
        interactionSource = interactionSource
    )
}