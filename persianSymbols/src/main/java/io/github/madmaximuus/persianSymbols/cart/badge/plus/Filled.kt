package io.github.madmaximuus.persianSymbols.cart.badge.plus

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.CartBadgePlus: ImageVector
    get() {
        if (cartBadgePlus != null) {
            return cartBadgePlus!!
        }
        cartBadgePlus = ImageVector.Builder(
            name = "cart-badge-plus-filled",
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
                moveTo(6.203f, 5.023f)
                horizontalLineTo(12.587f)
                curveTo(12.53f, 5.34f, 12.5f, 5.666f, 12.5f, 6f)
                curveTo(12.5f, 9.038f, 14.962f, 11.5f, 18f, 11.5f)
                curveTo(19.049f, 11.5f, 20.028f, 11.207f, 20.862f, 10.698f)
                lineTo(20.624f, 11.909f)
                curveTo(20.44f, 12.846f, 19.617f, 13.523f, 18.662f, 13.523f)
                horizontalLineTo(8.522f)
                lineTo(7.647f, 15.382f)
                horizontalLineTo(18.351f)
                curveTo(18.903f, 15.382f, 19.351f, 15.83f, 19.351f, 16.382f)
                curveTo(19.351f, 16.934f, 18.903f, 17.382f, 18.351f, 17.382f)
                horizontalLineTo(6.859f)
                curveTo(5.759f, 17.382f, 5.033f, 16.238f, 5.502f, 15.243f)
                lineTo(6.821f, 12.441f)
                lineTo(3.958f, 4.722f)
                horizontalLineTo(3.237f)
                curveTo(2.685f, 4.722f, 2.237f, 4.274f, 2.237f, 3.722f)
                curveTo(2.237f, 3.17f, 2.685f, 2.722f, 3.237f, 2.722f)
                horizontalLineTo(3.958f)
                curveTo(4.795f, 2.722f, 5.543f, 3.243f, 5.833f, 4.027f)
                lineTo(6.203f, 5.023f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.27f, 19.44f)
                curveTo(9.27f, 20.13f, 8.71f, 20.69f, 8.02f, 20.69f)
                curveTo(7.33f, 20.69f, 6.77f, 20.13f, 6.77f, 19.44f)
                curveTo(6.77f, 18.75f, 7.33f, 18.19f, 8.02f, 18.19f)
                curveTo(8.71f, 18.19f, 9.27f, 18.75f, 9.27f, 19.44f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.25f, 20.69f)
                curveTo(17.94f, 20.69f, 18.5f, 20.13f, 18.5f, 19.44f)
                curveTo(18.5f, 18.75f, 17.94f, 18.19f, 17.25f, 18.19f)
                curveTo(16.56f, 18.19f, 16f, 18.75f, 16f, 19.44f)
                curveTo(16f, 20.13f, 16.56f, 20.69f, 17.25f, 20.69f)
                close()
            }
        }.build()

        return cartBadgePlus!!
    }

private var cartBadgePlus: ImageVector? = null