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

interface BannerLeftScope : RowScope {
    val bannerSizes: BannerSizes
    val bannerColors: BannerColors
}

class BannerLeftScopeWrapper(
    val scope: RowScope,
    override val bannerSizes: BannerSizes,
    override val bannerColors: BannerColors
) : BannerLeftScope, RowScope by scope

@Composable
fun BannerLeftScope.Icon(
    modifier: Modifier = Modifier,
    icon: Painter,
    contentDescription: String? = null,
) {
    Icon(
        modifier = modifier
            .padding(0.dp),
        painter = icon,
        contentDescription = contentDescription,
        sizes = IconDefaults.size28(),
        tint = bannerColors.leftIconColor
    )
}

@Composable
fun BannerLeftScope.Image(
    modifier: Modifier = Modifier,
    image: String,
    shape: ImageShape = ImageShape.MEDIUM
) {
    Image(
        modifier = modifier,
        imageUrl = Uri.parse(image),
        sizes = ImageDefaults.size72(),
        shape = shape
    )
}

@Composable
fun BannerLeftScope.Avatar(
    modifier: Modifier = Modifier,
    image: String,
) {
    Avatar(
        modifier = modifier,
        imageUrl = Uri.parse(image),
        sizes = AvatarDefaults.size48(),
    )
}