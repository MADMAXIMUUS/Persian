package io.github.madmaximuus.persian.banners

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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import io.github.madmaximuus.persian.buttons.PersianButtonDefaults
import io.github.madmaximuus.persian.buttons.PersianPrimaryButton
import io.github.madmaximuus.persian.foundation.spacing

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
                title?.let {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = title,
                        style = sizes.titleStyle,
                        color = colors.titleColor,
                    )
                }
                description?.let {
                    Spacer(modifier = Modifier.height(MaterialTheme.spacing.extraSmall))
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = it,
                        style = sizes.descriptionStyle,
                        color = colors.subtitleColor,
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