package io.github.madmaximuus.persian.banners

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.foundation.spacing

@Composable
fun PersianBanner(
    title: String,
    modifier: Modifier = Modifier,
    subtitle: String? = null,
    left: PersianBannerLeft? = null,
    right: PersianBannerRight? = null,
    sizes: NewBannerSizes = PersianBannerDefaults.sizes(),
    colors: NewBannerColors = PersianBannerDefaults.colors(),
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
                .padding(MaterialTheme.spacing.medium),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.small)
        ) {
            when (left) {
                is PersianBannerLeft.Avatar -> {
                    PersianBannerLeftAvatar(
                        image = left.avatarUrl
                    )
                }

                is PersianBannerLeft.Icon -> {
                    PersianBannerLeftIcon(
                        icon = left.icon,
                        contentDescription = "",
                        iconColor = colors.leftIconColor
                    )
                }

                is PersianBannerLeft.Image -> {
                    PersianBannerLeftImage(image = left.imageUrl)
                }

                null -> {}
            }
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = title,
                    style = sizes.titleStyle,
                    color = colors.titleColor,
                )
                subtitle?.let {
                    Spacer(modifier = Modifier.height(MaterialTheme.spacing.extraSmall))
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = it,
                        style = sizes.subtitleStyle,
                        color = colors.subtitleColor
                    )
                }
            }
            when (right) {
                is PersianBannerRight.Close -> {
                    PersianBannerRightClose(
                        icon = right.customIcon,
                        contentDescription = "",
                        iconColor = colors.rightIconColor,
                        onClick = right.onClick
                    )
                }

                is PersianBannerRight.Open -> {
                    PersianBannerRightOpen(
                        icon = right.customIcon,
                        contentDescription = "",
                        iconColor = colors.rightIconColor,
                        onClick = right.onClick
                    )
                }

                null -> {}
            }
        }
    }
}

@Preview
@Composable
fun BannerPreview() {
    PersianTheme {
        Surface {
            PersianBanner(
                title = "Test Text",
                subtitle = "Test subtitle very very very very very very big",
                modifier = Modifier.padding(MaterialTheme.spacing.extraLarge),
                left = PersianBannerLeft.Icon(icon = MaterialTheme.icons.globeUk),
                right = PersianBannerRight.Close {

                }
            )
        }
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun BannerDarkPreview() {
    PersianTheme {
        Surface {
            PersianBanner(
                title = "Test Text",
                subtitle = "Test subtitle very very very very very very big",
                modifier = Modifier.padding(MaterialTheme.spacing.extraLarge),
                left = PersianBannerLeft.Icon(icon = MaterialTheme.icons.globeUk),
                right = PersianBannerRight.Open {

                }
            )
        }
    }
}