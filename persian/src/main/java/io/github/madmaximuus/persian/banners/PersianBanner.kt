package io.github.madmaximuus.persian.banners

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.buttons.PersianButtonDefaults
import io.github.madmaximuus.persian.buttons.PersianPrimaryButton
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text

@Composable
fun PersianBanner(
    modifier: Modifier = Modifier,
    title: String? = null,
    description: String? = null,
    left: PersianBannerLeft? = null,
    right: PersianBannerRight? = null,
    buttonText: String? = null,
    onButtonClick: (() -> Unit)? = null,
    sizes: BannerSizes = PersianBannerDefaults.sizes(),
    colors: BannerColors = PersianBannerDefaults.colors(),
) {
    require(title != null || description != null) {
        "Title or description required"
    }
    var size by remember { mutableStateOf(28.dp) }
    Box(
        modifier = modifier
            .clip(sizes.cornerRadius)
            .background(colors.background),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(PersianTheme.spacing.size12),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
        ) {
            when (left) {
                is PersianBannerLeft.Avatar -> {
                    size = 48.dp
                    PersianBannerLeftAvatar(
                        image = left.avatarUrl
                    )
                }

                is PersianBannerLeft.Icon -> {
                    size = 28.dp
                    PersianBannerLeftIcon(
                        icon = left.icon,
                        contentDescription = "",
                        iconColor = colors.leftIconColor
                    )
                }

                is PersianBannerLeft.Image -> {
                    size = 72.dp
                    PersianBannerLeftImage(image = left.imageUrl)
                }

                null -> {
                    size = 28.dp
                }
            }
            Column(
                modifier = Modifier.heightIn(min = size),
                verticalArrangement = Arrangement.Center
            ) {
                title?.let {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = title,
                        style = sizes.titleStyle,
                        color = colors.titleColor,
                    )
                }
                description?.let {
                    if (title != null)
                        Spacer(modifier = Modifier.height(PersianTheme.spacing.size4))
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = it,
                        style = sizes.descriptionStyle,
                        color = colors.body,
                        textAlign = TextAlign.Justify
                    )
                }
                buttonText?.let {
                    PersianPrimaryButton(
                        text = it,
                        sizes = PersianButtonDefaults.smallSizes(),
                        onClick = onButtonClick ?: {}
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