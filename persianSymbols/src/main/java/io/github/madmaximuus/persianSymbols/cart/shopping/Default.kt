package io.github.madmaximuus.persianSymbols.cart.shopping

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.CartShopping: ImageVector
    get() {
        if (cartShopping != null) {
            return cartShopping!!
        }
        cartShopping = Builder(
            name = "cart-shopping-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 2.695f)
                curveTo(2.448f, 2.695f, 2f, 3.143f, 2f, 3.695f)
                curveTo(2f, 4.247f, 2.448f, 4.695f, 3f, 4.695f)
                horizontalLineTo(3.816f)
                lineTo(6.907f, 12.644f)
                lineTo(5.467f, 15.524f)
                curveTo(4.969f, 16.521f, 5.694f, 17.695f, 6.809f, 17.695f)
                horizontalLineTo(19f)
                curveTo(19.552f, 17.695f, 20f, 17.247f, 20f, 16.695f)
                curveTo(20f, 16.143f, 19.552f, 15.695f, 19f, 15.695f)
                horizontalLineTo(7.618f)
                lineTo(8.618f, 13.695f)
                horizontalLineTo(17.883f)
                curveTo(19.298f, 13.695f, 20.52f, 12.707f, 20.816f, 11.323f)
                lineTo(21.978f, 5.9f)
                curveTo(22.041f, 5.605f, 21.968f, 5.297f, 21.778f, 5.062f)
                curveTo(21.588f, 4.827f, 21.302f, 4.691f, 21f, 4.691f)
                horizontalLineTo(5.96f)
                lineTo(5.68f, 3.97f)
                curveTo(5.381f, 3.201f, 4.641f, 2.695f, 3.816f, 2.695f)
                horizontalLineTo(3f)
                close()
                moveTo(8.685f, 11.695f)
                lineTo(6.742f, 6.691f)
                horizontalLineTo(19.763f)
                lineTo(18.861f, 10.904f)
                curveTo(18.762f, 11.366f, 18.355f, 11.695f, 17.883f, 11.695f)
                horizontalLineTo(8.685f)
                close()
                moveTo(9f, 19.75f)
                curveTo(9f, 20.44f, 8.44f, 21f, 7.75f, 21f)
                curveTo(7.06f, 21f, 6.5f, 20.44f, 6.5f, 19.75f)
                curveTo(6.5f, 19.06f, 7.06f, 18.5f, 7.75f, 18.5f)
                curveTo(8.44f, 18.5f, 9f, 19.06f, 9f, 19.75f)
                close()
                moveTo(18.05f, 21f)
                curveTo(18.74f, 21f, 19.3f, 20.44f, 19.3f, 19.75f)
                curveTo(19.3f, 19.06f, 18.74f, 18.5f, 18.05f, 18.5f)
                curveTo(17.36f, 18.5f, 16.8f, 19.06f, 16.8f, 19.75f)
                curveTo(16.8f, 20.44f, 17.36f, 21f, 18.05f, 21f)
                close()
            }
        }.build()
        return cartShopping!!
    }

private var cartShopping: ImageVector? = null