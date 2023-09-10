package ru.rabbit.persian.banners

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import ru.rabbit.persian.foundation.icons
import ru.rabbit.persian.foundation.spacing

object PersianBanner {

    @Composable
    fun Tertiary(
        text: String,
        modifier: Modifier = Modifier,
        icon: Painter? = null,
        sizes: BannerSizes = PersianBannerSizes.large(),
        colors: BannerColors = PersianBannerColors.tertiary()
    ) {
        Box(
            modifier = modifier
                .clip(sizes.cornerRadius)
                .background(colors.background),
            contentAlignment = Alignment.Center
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(sizes.contentPadding)
                    .height(sizes.iconSize),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.small)
            ) {
                icon?.let {
                    Icon(
                        modifier = Modifier
                            .size(sizes.iconSize),
                        painter = it,
                        contentDescription = "",
                        tint = colors.iconColor
                    )
                }
                Text(
                    modifier = Modifier
                        .fillMaxWidth(),
                    text = text,
                    style = sizes.textStyle,
                    color = colors.textColor,
                )
            }
        }
    }
}

@Preview
@Composable
fun BannerPreview() {
    MaterialTheme {
        Surface {
            PersianBanner.Tertiary(
                text = "Test Text",
                modifier = Modifier.padding(MaterialTheme.spacing.extraLarge),
                icon = MaterialTheme.icons.globeUk
            )
        }
    }
}