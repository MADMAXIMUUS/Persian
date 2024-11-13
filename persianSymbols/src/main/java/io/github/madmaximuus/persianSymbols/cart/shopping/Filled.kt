package io.github.madmaximuus.persianSymbols.cart.shopping

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.CartShopping: ImageVector
    get() {
        if (cartShopping != null) {
            return cartShopping!!
        }
        cartShopping = Builder(
            name = "cart-shopping-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.237f, 2.722f)
                curveTo(2.685f, 2.722f, 2.237f, 3.17f, 2.237f, 3.722f)
                curveTo(2.237f, 4.274f, 2.685f, 4.722f, 3.237f, 4.722f)
                horizontalLineTo(3.958f)
                lineTo(6.821f, 12.441f)
                lineTo(5.502f, 15.243f)
                curveTo(5.033f, 16.238f, 5.759f, 17.382f, 6.859f, 17.382f)
                horizontalLineTo(18.351f)
                curveTo(18.903f, 17.382f, 19.351f, 16.934f, 19.351f, 16.382f)
                curveTo(19.351f, 15.83f, 18.903f, 15.382f, 18.351f, 15.382f)
                horizontalLineTo(7.647f)
                lineTo(8.522f, 13.523f)
                horizontalLineTo(18.662f)
                curveTo(19.617f, 13.523f, 20.44f, 12.846f, 20.624f, 11.909f)
                lineTo(21.744f, 6.216f)
                curveTo(21.865f, 5.598f, 21.392f, 5.023f, 20.763f, 5.023f)
                horizontalLineTo(6.203f)
                lineTo(5.833f, 4.027f)
                curveTo(5.543f, 3.243f, 4.795f, 2.722f, 3.958f, 2.722f)
                horizontalLineTo(3.237f)
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
        return cartShopping!!
    }

private var cartShopping: ImageVector? = null