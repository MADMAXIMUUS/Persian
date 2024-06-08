package io.github.madmaximuus.persian.chips.founfation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.avatarsAndImages.PersianAvatar
import io.github.madmaximuus.persian.avatarsAndImages.PersianAvatarsDefaults
import io.github.madmaximuus.persian.iconBox.IconBoxSize
import io.github.madmaximuus.persian.iconBox.PersianIconBox
import io.github.madmaximuus.persianSymbols.check.base.Check
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

@Composable
internal fun ChipContent(
    label: String,
    selected: Boolean,
    labelTextStyle: TextStyle,
    avatar: String?,
    leadingIcon: Painter?,
    trailingIcon: Painter?,
    onTrailingClick: (() -> Unit)?,
    labelColor: Color,
    leadingIconColor: Color,
    trailingIconColor: Color,
    leadingIconSize: IconBoxSize,
    trailingIconSize: IconBoxSize,
    minHeight: Dp,
    paddingValues: PaddingValues,
    enabled: Boolean
) {
    Row(
        modifier = Modifier
            .defaultMinSize(minHeight = minHeight)
            .padding(paddingValues),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (avatar != null || leadingIcon != null) {
            if (avatar != null) {
                PersianAvatar(
                    imageUrl = avatar,
                    enabled = enabled,
                    sizes = PersianAvatarsDefaults.size24(),
                    overlay = selected,
                    overlayIcon = rememberVectorPainter(image = PersianSymbols.Default.Check)
                )
            } else if (leadingIcon != null) {
                CompositionLocalProvider(
                    LocalContentColor provides leadingIconColor,
                ) {
                    PersianIconBox(
                        icon = leadingIcon,
                        size = leadingIconSize
                    )
                }
            }
        }
        Text(
            modifier = Modifier
                .height(leadingIconSize.width)
                .padding(8.dp, 0.dp),
            text = label,
            color = labelColor,
            style = labelTextStyle.copy(platformStyle = PlatformTextStyle(includeFontPadding = false)),
        )
        if (trailingIcon != null) {
            CompositionLocalProvider(
                LocalContentColor provides trailingIconColor,
            ) {
                PersianIconBox(
                    modifier = Modifier
                        .clickable(
                            enabled = onTrailingClick != null && enabled,
                            role = Role.Button,
                            onClick = {
                                onTrailingClick?.invoke()
                            }
                        ),
                    icon = trailingIcon,
                    size = trailingIconSize,
                )
            }
        }
    }
}