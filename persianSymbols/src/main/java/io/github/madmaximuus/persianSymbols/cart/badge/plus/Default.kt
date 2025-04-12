package io.github.madmaximuus.persianSymbols.cart.badge.plus

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.CartBadgePlus: ImageVector
    get() {
        if (cartBadgePlus != null) {
            return cartBadgePlus!!
        }
        cartBadgePlus = ImageVector.Builder(
            name = "cart-badge-plus-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 3.5f)
                curveTo(18.414f, 3.5f, 18.75f, 3.836f, 18.75f, 4.25f)
                verticalLineTo(5.25f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 5.25f, 20.5f, 5.586f, 20.5f, 6f)
                curveTo(20.5f, 6.414f, 20.164f, 6.75f, 19.75f, 6.75f)
                horizontalLineTo(18.75f)
                verticalLineTo(7.75f)
                curveTo(18.75f, 8.164f, 18.414f, 8.5f, 18f, 8.5f)
                curveTo(17.586f, 8.5f, 17.25f, 8.164f, 17.25f, 7.75f)
                verticalLineTo(6.75f)
                horizontalLineTo(16.25f)
                curveTo(15.836f, 6.75f, 15.5f, 6.414f, 15.5f, 6f)
                curveTo(15.5f, 5.586f, 15.836f, 5.25f, 16.25f, 5.25f)
                horizontalLineTo(17.25f)
                verticalLineTo(4.25f)
                curveTo(17.25f, 3.836f, 17.586f, 3.5f, 18f, 3.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.25f, 6f)
                curveTo(13.25f, 3.377f, 15.377f, 1.25f, 18f, 1.25f)
                curveTo(20.623f, 1.25f, 22.75f, 3.377f, 22.75f, 6f)
                curveTo(22.75f, 8.623f, 20.623f, 10.75f, 18f, 10.75f)
                curveTo(15.377f, 10.75f, 13.25f, 8.623f, 13.25f, 6f)
                close()
                moveTo(18f, 2.75f)
                curveTo(16.205f, 2.75f, 14.75f, 4.205f, 14.75f, 6f)
                curveTo(14.75f, 7.795f, 16.205f, 9.25f, 18f, 9.25f)
                curveTo(19.795f, 9.25f, 21.25f, 7.795f, 21.25f, 6f)
                curveTo(21.25f, 4.205f, 19.795f, 2.75f, 18f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.96f, 4.691f)
                horizontalLineTo(12.657f)
                curveTo(12.554f, 5.11f, 12.5f, 5.549f, 12.5f, 6f)
                curveTo(12.5f, 6.234f, 12.515f, 6.465f, 12.543f, 6.691f)
                horizontalLineTo(6.742f)
                lineTo(8.685f, 11.695f)
                horizontalLineTo(17.883f)
                curveTo(18.116f, 11.695f, 18.334f, 11.614f, 18.506f, 11.477f)
                curveTo(19.406f, 11.395f, 20.242f, 11.096f, 20.964f, 10.634f)
                lineTo(20.816f, 11.323f)
                curveTo(20.52f, 12.707f, 19.298f, 13.695f, 17.883f, 13.695f)
                horizontalLineTo(8.618f)
                lineTo(7.618f, 15.695f)
                horizontalLineTo(19f)
                curveTo(19.552f, 15.695f, 20f, 16.142f, 20f, 16.695f)
                curveTo(20f, 17.247f, 19.552f, 17.695f, 19f, 17.695f)
                horizontalLineTo(6.809f)
                curveTo(5.694f, 17.695f, 4.969f, 16.521f, 5.467f, 15.524f)
                lineTo(6.907f, 12.644f)
                lineTo(3.816f, 4.695f)
                horizontalLineTo(3f)
                curveTo(2.448f, 4.695f, 2f, 4.247f, 2f, 3.695f)
                curveTo(2f, 3.143f, 2.448f, 2.695f, 3f, 2.695f)
                horizontalLineTo(3.816f)
                curveTo(4.641f, 2.695f, 5.381f, 3.201f, 5.68f, 3.97f)
                lineTo(5.96f, 4.691f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 19.75f)
                curveTo(9f, 20.44f, 8.44f, 21f, 7.75f, 21f)
                curveTo(7.06f, 21f, 6.5f, 20.44f, 6.5f, 19.75f)
                curveTo(6.5f, 19.059f, 7.06f, 18.5f, 7.75f, 18.5f)
                curveTo(8.44f, 18.5f, 9f, 19.059f, 9f, 19.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.05f, 21f)
                curveTo(18.74f, 21f, 19.3f, 20.44f, 19.3f, 19.75f)
                curveTo(19.3f, 19.059f, 18.74f, 18.5f, 18.05f, 18.5f)
                curveTo(17.36f, 18.5f, 16.8f, 19.059f, 16.8f, 19.75f)
                curveTo(16.8f, 20.44f, 17.36f, 21f, 18.05f, 21f)
                close()
            }
        }.build()

        return cartBadgePlus!!
    }

private var cartBadgePlus: ImageVector? = null