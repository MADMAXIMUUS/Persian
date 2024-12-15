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
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.TextAlign
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
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
 * @param leadingIcon optional icon displayed in leading slot of this [Banner].
 * @param trailing optional component in [BannerTrailingScope] displayed in trailing slot of this [Banner].
 * @param actions optional component in [BannerActionScope] displayed in bottom slot of this [Banner].
 * @param sizes The [BannerSizes] sizes of the components of this [Banner].
 * @param colors The [BannerColors] colors of the components of this [Banner].
 */
@Composable
fun Banner(
    modifier: Modifier = Modifier,
    title: String? = null,
    message: String? = null,
    onClick: (() -> Unit)? = null,
    leadingIcon: Painter? = null,
    trailing: (@Composable BannerTrailingScope.() -> Unit)? = null,
    actions: (@Composable BannerActionScope.() -> Unit)? = null,
    sizes: BannerSizes = BannerDefaults.sizes(),
    colors: BannerColors = BannerDefaults.infoColors(),
) {
    require(title != null || message != null) {
        throw IllegalArgumentException("Title or message required")
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = PersianTheme.spacing.size16)
            .padding(vertical = PersianTheme.spacing.size6)
    ) {
        Box(
            modifier = modifier
                .clip(sizes.containerShape)
                .background(colors.containerColor, sizes.containerShape)
                .clickable(
                    enabled = onClick != null
                ) { onClick?.invoke() }
                .padding(PersianTheme.spacing.size12),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size4)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size12)
                ) {
                    leadingIcon?.let {
                        Icon(
                            painter = leadingIcon,
                            contentDescription = "",
                            sizes = sizes.leadingIconSize,
                            tint = colors.leadingIconColor
                        )
                    }
                    Column(
                        modifier = Modifier.weight(1f),
                        verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size2)
                    ) {
                        title?.let {
                            Text(
                                modifier = Modifier.fillMaxWidth(),
                                text = title,
                                style = sizes.titleTextStyle,
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

                    }
                    val trailingScope = remember(colors, sizes) {
                        BannerTrailingScopeWrapper(
                            scope = this,
                            colors = colors,
                            sizes = sizes
                        )
                    }
                    trailing?.let { trailingScope.it() }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
                ) {
                    val actionsScope = remember(colors, sizes) {
                        BannerActionScopeWrapper(
                            scope = this,
                            sizes = sizes,
                            colors = colors
                        )
                    }
                    actions?.let { actionsScope.it() }
                }
            }
        }
    }
}