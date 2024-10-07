package io.github.madmaximuus.persian.banner

import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.iconButton.IconButtonDefaults
import io.github.madmaximuus.persian.iconButton.TertiaryIconButton
import io.github.madmaximuus.persianSymbols.chevronRight.base.ChevronRight
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.xmark.base.XMark

/**
 * The banner right scope for trailing content slot in banner.
 *
 * @property bannerSizes The size of leading content of this banner.
 * @property bannerColors The colors of leading content of this banner.
 */
interface BannerRightScope : RowScope {
    val bannerSizes: BannerSizes
    val bannerColors: BannerColors
}

/**
 * The banner right scope wrapper for trailing content slot in banner.
 *
 * @param scope The row scope used in banner.
 * @param bannerSizes The size of trailing content of this banner.
 * @param bannerColors The colors of leading content of this banner.
 */
internal class BannerRightScopeWrapper(
    val scope: RowScope,
    override val bannerSizes: BannerSizes,
    override val bannerColors: BannerColors
) : BannerRightScope, RowScope by scope

/**
 * The extension function for [BannerRightScope] that represent closed button in trailing slot of this [Banner].
 *
 * @param modifier the [Modifier] to be applied to banner leading icon.
 * @param icon icon that will be displayed in the trailing icon button of this banner.
 * @param onClick called when this icon button is clicked.
 */
@Composable
fun BannerRightScope.Close(
    modifier: Modifier = Modifier,
    icon: Painter = rememberVectorPainter(image = PersianSymbols.Default.XMark),
    onClick: () -> Unit
) {
    TertiaryIconButton(
        modifier = modifier,
        icon = icon,
        sizes = IconButtonDefaults.smallSizes(),
        colors = IconButtonDefaults.tertiaryIconButtonColors(
            contentColor = this@Close.bannerColors.rightIconColor
        ),
        onClick = onClick
    )
}

/**
 * The extension function for [BannerRightScope] that represent icon in trailing slot of this [Banner].
 *
 * @param modifier the [Modifier] to be applied to banner leading icon.
 * @param icon icon that will be displayed in the trailing icon slot of this banner.
 */
@Composable
fun BannerRightScope.Open(
    modifier: Modifier = Modifier,
    icon: Painter = rememberVectorPainter(image = PersianSymbols.Default.ChevronRight),
) {
    Icon(
        modifier = modifier
            .clip(PersianTheme.shapes.shape4),
        painter = icon,
        sizes = IconDefaults.size24(),
        tint = this@Open.bannerColors.rightIconColor
    )
}