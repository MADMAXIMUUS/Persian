package io.github.madmaximuus.persian.banner

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text

@Composable
fun Banner(
    modifier: Modifier = Modifier,
    title: String? = null,
    message: String? = null,
    onClick: (() -> Unit)? = null,
    left: (@Composable BannerLeftScope.() -> Unit)? = null,
    right: (@Composable BannerRightScope.() -> Unit)? = null,
    button: (@Composable BannerButtonScope.() -> Unit)? = null,
    sizes: BannerSizes = PersianBannerDefaults.sizes(),
    colors: BannerColors = PersianBannerDefaults.colors(),
) {
    require(title != null || message != null) {
        throw IllegalArgumentException("Title or message required")
    }
    Box(
        modifier = modifier
            .clip(sizes.cornerRadius)
            .background(colors.background)
            .clickable(
                enabled = onClick != null
            ) { onClick?.invoke() },
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(PersianTheme.spacing.size12),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
        ) {
            with(BannerLeftScope(colors.leftIconColor)) {
                left?.let { it() }
            }
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size4)
            ) {
                title?.let {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = title,
                        style = sizes.titleStyle,
                        color = colors.titleColor,
                    )
                }
                message?.let {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = it,
                        style = sizes.descriptionStyle,
                        color = colors.body,
                        textAlign = TextAlign.Justify
                    )
                }
                with(BannerButtonScope) {
                    button?.let { it() }
                }
            }
            with(BannerRightScope(colors.rightIconColor)) {
                right?.let { it() }
            }
        }
    }
}