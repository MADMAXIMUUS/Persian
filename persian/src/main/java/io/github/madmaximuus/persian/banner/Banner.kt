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
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text

/**
 * The banner is a versatile and customizable element designed to display important
 * messages, alerts, or notifications. It can be used to provide feedback,
 * highlight critical information, or guide users through important steps.
 *
 * @param modifier the [Modifier] to be applied to this [Banner].
 * @param title the text displayed in this [Banner] as title.
 * @param message the text displayed in this [Banner] as message.
 * @param onClick called when this [Banner] is clicked.
 * @param left optional component in [BannerLeftScope] displayed in leading slot of this [Banner].
 * @param right optional component in [BannerRightScope] displayed in trailing slot of this [Banner].
 * @param button optional component in [BannerButtonScope] displayed in bottom slot of this [Banner].
 * @param sizes The [BannerSizes] sizes of the components of this [Banner].
 * @param colors The [BannerColors] colors of the components of this [Banner].
 */
@Composable
fun Banner(
    modifier: Modifier = Modifier,
    title: String? = null,
    message: String? = null,
    onClick: (() -> Unit)? = null,
    left: (@Composable BannerLeftScope.() -> Unit)? = null,
    right: (@Composable BannerRightScope.() -> Unit)? = null,
    button: (@Composable BannerButtonScope.() -> Unit)? = null,
    sizes: BannerSizes = BannerDefaults.sizes(),
    colors: BannerColors = BannerDefaults.colors(),
) {
    require(title != null || message != null) {
        throw IllegalArgumentException("Title or message required")
    }
    Box(
        modifier = modifier
            .clip(sizes.containerShape)
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
            val scope = remember(colors, sizes) {
                BannerLeftScopeWrapper(
                    scope = this,
                    bannerSizes = sizes,
                    bannerColors = colors,

                    )
            }
            left?.let { scope.it() }
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
                        style = sizes.messageTextStyle,
                        color = colors.messageColor,
                        textAlign = TextAlign.Justify
                    )
                }
                val buttonScope = remember(sizes) {
                    BannerButtonScopeWrapper(
                        scope = this,
                        bannerSizes = sizes
                    )
                }
                button?.let { buttonScope.it() }
            }
            val rightScope = remember(colors, sizes) {
                BannerRightScopeWrapper(
                    scope = this,
                    bannerColors = colors,
                    bannerSizes = sizes
                )
            }
            right?.let { rightScope.it() }
        }
    }
}