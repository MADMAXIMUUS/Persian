package io.github.madmaximuus.persian.chips.founfation

import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.avatarsAndImages.ImageShape
import io.github.madmaximuus.persian.avatarsAndImages.PersianAvatar
import io.github.madmaximuus.persian.avatarsAndImages.PersianAvatarsDefaults
import io.github.madmaximuus.persian.avatarsAndImages.PersianImage
import io.github.madmaximuus.persian.avatarsAndImages.PersianImagesDefaults
import io.github.madmaximuus.persian.foundation.LocalContentColor
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.icon.IconSize
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persianSymbols.check.base.Check
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

@Composable
internal fun ChipContent(
    label: String,
    selected: Boolean,
    labelTextStyle: TextStyle,
    avatar: String?,
    image: String?,
    leadingIcon: Painter?,
    trailingIcon: Painter?,
    onTrailingClick: (() -> Unit)?,
    labelColor: Color,
    leadingIconColor: Color,
    trailingIconColor: Color,
    leadingIconSize: IconSize,
    trailingIconSize: IconSize,
    paddingValues: PaddingValues,
    enabled: Boolean
) {
    Row(
        modifier = Modifier
            .height(32.dp)
            .padding(paddingValues),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (avatar != null || leadingIcon != null || image != null) {
            if (avatar != null) {
                PersianAvatar(
                    imageUrl = Uri.parse(avatar),
                    enabled = enabled,
                    sizes = PersianAvatarsDefaults.size24(),
                    overlay = selected,
                    overlayIcon = rememberVectorPainter(image = PersianSymbols.Default.Check)
                )
            } else if (leadingIcon != null) {
                CompositionLocalProvider(
                    LocalContentColor provides leadingIconColor,
                ) {
                    Spacer(modifier = Modifier.width(PersianTheme.spacing.size4))
                    Icon(
                        painter = leadingIcon,
                        size = leadingIconSize
                    )
                }
            } else if (image != null) {
                PersianImage(
                    imageUrl = Uri.parse(image),
                    enabled = enabled,
                    sizes = PersianImagesDefaults.size24(),
                    shape = ImageShape.MEDIUM,
                    overlay = selected,
                    overlayIcon = rememberVectorPainter(image = PersianSymbols.Default.Check)
                )
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
                Icon(
                    modifier = Modifier
                        .clickable(
                            enabled = onTrailingClick != null && enabled,
                            role = Role.Button,
                            onClick = {
                                onTrailingClick?.invoke()
                            }
                        ),
                    painter = trailingIcon,
                    size = trailingIconSize,
                )
            }
            Spacer(modifier = Modifier.width(PersianTheme.spacing.size4))
        }
    }
}