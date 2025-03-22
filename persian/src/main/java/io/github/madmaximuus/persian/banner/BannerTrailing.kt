package io.github.madmaximuus.persian.banner

import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import io.github.madmaximuus.persian.button.Button
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.iconButton.IconButton
import io.github.madmaximuus.persianSymbols.chevronRight.ChevronRight
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.xmark.XMark

/**
 * The banner right scope for trailing content slot in banner.
 *
 * @property sizes The size of leading content of this banner.
 * @property colors The colors of leading content of this banner.
 */
interface BannerTrailingScope : RowScope {
    val sizes: BannerSizes
    val colors: BannerColors
}

/**
 * The banner right scope wrapper for trailing content slot in banner.
 *
 * @param scope The row scope used in banner.
 * @param sizes The size of trailing content of this banner.
 * @param colors The colors of leading content of this banner.
 */
internal class BannerTrailingScopeWrapper(
    val scope: RowScope,
    override val sizes: BannerSizes,
    override val colors: BannerColors
) : BannerTrailingScope, RowScope by scope

/**
 * The extension function for [BannerTrailingScope] that represent icon in trailing slot of this [Banner].
 *
 * @param modifier the [Modifier] to be applied to banner leading icon.
 * @param icon icon that will be displayed in the trailing icon slot of this banner.
 */
@Composable
fun BannerTrailingScope.Icon(
    modifier: Modifier = Modifier,
    icon: Painter = rememberVectorPainter(image = PersianSymbols.Default.ChevronRight),
) {
    Icon(
        modifier = modifier,
        painter = icon,
        sizes = sizes.trailingIconSize,
        tint = colors.trailingIconColor
    )
}

/**
 * The extension function for [BannerTrailingScope] that represent closed button in trailing slot of this [Banner].
 *
 * @param modifier the [Modifier] to be applied to banner leading icon.
 * @param icon icon that will be displayed in the trailing icon button of this banner.
 * @param onClick called when this icon button is clicked.
 */
@Composable
fun BannerTrailingScope.IconButton(
    modifier: Modifier = Modifier,
    icon: Painter = rememberVectorPainter(image = PersianSymbols.Default.XMark),
    onClick: () -> Unit
) {
    IconButton(
        modifier = modifier,
        icon = icon,
        sizes = sizes.trailingIconButtonSizes,
        colors = colors.trailingIconButtonColors,
        onClick = onClick
    )
}

/**
 * The extension function for [BannerTrailingScope] that represent closed button in trailing slot of this [Banner].
 *
 * @param modifier the [Modifier] to be applied to [Banner] trailing icon.
 * @param action text that will be displayed in the trailing button of this [Banner].
 * @param onClick called when this icon button is clicked.
 */
@Composable
fun BannerTrailingScope.Button(
    modifier: Modifier = Modifier,
    action: String,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier,
        sizes = sizes.trailingButtonSizes,
        colors = colors.trailingButtonColors,
        text = action,
        onClick = onClick
    )
}