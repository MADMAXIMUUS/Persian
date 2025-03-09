package io.github.madmaximuus.persian.icon

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.toolingGraphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics

/**
 * Display an icon with different sizes.
 *
 * @param imageVector [ImageVector] to draw inside this icon
 * @param modifier The [Modifier] to be applied to the icon.
 * @param contentDescription An optional string describing the content of the icon for accessibility purposes.
 * @param sizes The [IconSizes] defining the width and padding of the icon.
 * @param tint The [Color] to tint the icon.
 */
@Composable
fun Icon(
    imageVector: ImageVector,
    modifier: Modifier = Modifier,
    contentDescription: String? = null,
    sizes: IconSizes = IconDefaults.size24(),
    tint: Color = Color.Unspecified
) {
    Icon(
        modifier = modifier,
        painter = rememberVectorPainter(imageVector),
        contentDescription = contentDescription,
        sizes = sizes,
        tint = tint
    )
}

/**
 * Display an icon with different sizes.
 *
 * @param bitmap [ImageBitmap] to draw inside this icon.
 * @param modifier The [Modifier] to be applied to the icon.
 * @param contentDescription An optional string describing the content of the icon for accessibility purposes.
 * @param sizes The [IconSizes] defining the width and padding of the icon.
 * @param tint The [Color] to tint the icon.
 */
@Composable
fun Icon(
    bitmap: ImageBitmap,
    modifier: Modifier = Modifier,
    contentDescription: String? = null,
    sizes: IconSizes = IconDefaults.size24(),
    tint: Color = Color.Unspecified
) {
    val painter = remember(bitmap) { BitmapPainter(bitmap) }
    Icon(
        modifier = modifier,
        painter = painter,
        contentDescription = contentDescription,
        sizes = sizes,
        tint = tint
    )
}

/**
 * Display an icon with different sizes.
 *
 * @param painter The [Painter] used to draw the icon.
 * @param modifier The [Modifier] to be applied to the icon.
 * @param contentDescription An optional string describing the content of the icon for accessibility purposes.
 * @param sizes The [IconSizes] defining the width and padding of the icon.
 * @param tint The [Color] to tint the icon.
 */
@Composable
fun Icon(
    painter: Painter,
    modifier: Modifier = Modifier,
    contentDescription: String? = null,
    sizes: IconSizes = IconDefaults.size24(),
    tint: Color = Color.Unspecified
) {
    val colorFilter = remember(tint) {
        if (tint == Color.Unspecified) null else ColorFilter.tint(tint)
    }
    val semantics =
        if (contentDescription != null) {
            Modifier.semantics {
                this.contentDescription = contentDescription
                this.role = Role.Image
            }
        } else {
            Modifier
        }
    Box(
        modifier
            .size(sizes.width)
            .padding(sizes.padding)
            .toolingGraphicsLayer()
            .paint(painter, colorFilter = colorFilter, contentScale = ContentScale.Fit)
            .then(semantics)
    )
}