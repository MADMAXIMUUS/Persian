package io.github.madmaximuus.persian.banners

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.iconBox.PersianIconBox
import io.github.madmaximuus.persian.iconBox.PersianIconBoxColors

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
                    .wrapContentHeight(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.small)
            ) {
                icon?.let {
                    PersianIconBox.Primary(
                        icon = it,
                        size = sizes.iconSize,
                        colors = PersianIconBoxColors.primary(
                            defaultColor = colors.iconColor
                        )
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
    PersianTheme {
        Surface {
            PersianBanner.Tertiary(
                text = "Test Text",
                modifier = Modifier.padding(MaterialTheme.spacing.extraLarge),
                icon = MaterialTheme.icons.globeUk
            )
        }
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun BannerDarkPreview() {
    PersianTheme {
        Surface {
            PersianBanner.Tertiary(
                text = "Test Text",
                modifier = Modifier.padding(MaterialTheme.spacing.extraLarge),
                icon = MaterialTheme.icons.globeUk
            )
        }
    }
}