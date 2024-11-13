package io.github.madmaximuus.persian.banner

import android.net.Uri
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.avatarsAndImages.Avatar
import io.github.madmaximuus.persian.avatarsAndImages.AvatarDefaults
import io.github.madmaximuus.persian.avatarsAndImages.Image
import io.github.madmaximuus.persian.avatarsAndImages.ImageDefaults
import io.github.madmaximuus.persian.avatarsAndImages.ImageShape
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.icon.IconDefaults

/**
 * The banner left scope for leading content slot in banner.
 *
 * @property bannerSizes The size of leading content of this banner.
 * @property bannerColors The colors of leading content of this banner.
 */
interface BannerLeftScope : RowScope {
    val bannerSizes: BannerSizes
    val bannerColors: BannerColors
}

/**
 * The banner left scope wrapper for leading content slot in banner.
 *
 * @param scope The column scope used in banner.
 * @param bannerSizes The size of leading content of this banner.
 * @param bannerColors The colors of leading content of this banner.
 */
internal class BannerLeftScopeWrapper(
    val scope: RowScope,
    override val bannerSizes: BannerSizes,
    override val bannerColors: BannerColors
) : BannerLeftScope, RowScope by scope

/**
 * The extension function for [BannerLeftScope] that represent icon in leading slot of this [Banner].
 *
 * @param modifier the [Modifier] to be applied to banner leading icon.
 * @param icon icon that will be displayed in the leading slot of this banner.
 */
@Composable
fun BannerLeftScope.Icon(
    modifier: Modifier = Modifier,
    icon: Painter,
) {
    Icon(
        modifier = modifier
            .padding(0.dp),
        painter = icon,
        contentDescription = "",
        sizes = IconDefaults.size28(),
        tint = bannerColors.leftIconColor
    )
}

/**
 * The extension function for [BannerLeftScope] that represent image in leading slot of this [Banner].
 *
 * @param modifier The [Modifier] to be applied to banner leading icon.
 * @param image Image that will be displayed in the leading slot of this banner.
 * @param shape The [ImageShape] shape used in leading image of this banner.
 */
@Composable
fun BannerLeftScope.Image(
    modifier: Modifier = Modifier,
    image: Uri,
    shape: ImageShape = ImageShape.MEDIUM
) {
    Image(
        modifier = modifier,
        imageUrl = image,
        sizes = ImageDefaults.size72(),
        shape = shape
    )
}

/**
 * The extension function for [BannerLeftScope] that represent avatar in leading slot of this [Banner].
 *
 * @param modifier The [Modifier] to be applied to banner leading icon.
 * @param image Image that will be displayed in the leading slot of this ban
 */
@Composable
fun BannerLeftScope.Avatar(
    modifier: Modifier = Modifier,
    image: Uri,
) {
    Avatar(
        modifier = modifier,
        imageUrl = image,
        sizes = AvatarDefaults.size48(),
    )
}