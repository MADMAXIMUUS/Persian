package io.github.madmaximuus.persianSymbols.cart.shopping

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
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
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.0f, 2.695f)
                curveTo(2.4477f, 2.695f, 2.0f, 3.1427f, 2.0f, 3.695f)
                curveTo(2.0f, 4.2472f, 2.4477f, 4.695f, 3.0f, 4.695f)
                horizontalLineTo(3.8159f)
                lineTo(6.9073f, 12.6442f)
                lineTo(5.4674f, 15.5241f)
                curveTo(4.9687f, 16.5215f, 5.6939f, 17.6949f, 6.809f, 17.6949f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 17.6949f, 20.0f, 17.2472f, 20.0f, 16.6949f)
                curveTo(20.0f, 16.1427f, 19.5523f, 15.6949f, 19.0f, 15.6949f)
                horizontalLineTo(7.618f)
                lineTo(8.618f, 13.6949f)
                horizontalLineTo(17.883f)
                curveTo(19.2977f, 13.6949f, 20.5202f, 12.7066f, 20.8165f, 11.3232f)
                lineTo(21.9778f, 5.9005f)
                curveTo(22.0411f, 5.6052f, 21.9675f, 5.2971f, 21.7776f, 5.0623f)
                curveTo(21.5878f, 4.8275f, 21.302f, 4.691f, 21.0f, 4.691f)
                horizontalLineTo(5.9603f)
                lineTo(5.6799f, 3.9701f)
                curveTo(5.381f, 3.2013f, 4.6408f, 2.695f, 3.8159f, 2.695f)
                horizontalLineTo(3.0f)
                close()
                moveTo(8.6845f, 11.6949f)
                lineTo(6.7422f, 6.691f)
                horizontalLineTo(19.7632f)
                lineTo(18.8608f, 10.9044f)
                curveTo(18.762f, 11.3655f, 18.3546f, 11.6949f, 17.883f, 11.6949f)
                horizontalLineTo(8.6845f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.5186f, 19.8049f)
                curveTo(9.5186f, 20.6334f, 8.847f, 21.3049f, 8.0186f, 21.3049f)
                curveTo(7.1902f, 21.3049f, 6.5186f, 20.6334f, 6.5186f, 19.8049f)
                curveTo(6.5186f, 18.9765f, 7.1902f, 18.3049f, 8.0186f, 18.3049f)
                curveTo(8.847f, 18.3049f, 9.5186f, 18.9765f, 9.5186f, 19.8049f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.7166f, 21.3051f)
                curveTo(18.545f, 21.3051f, 19.2166f, 20.6335f, 19.2166f, 19.8051f)
                curveTo(19.2166f, 18.9767f, 18.545f, 18.3051f, 17.7166f, 18.3051f)
                curveTo(16.8881f, 18.3051f, 16.2166f, 18.9767f, 16.2166f, 19.8051f)
                curveTo(16.2166f, 20.6335f, 16.8881f, 21.3051f, 17.7166f, 21.3051f)
                close()
            }
        }.build()
        return cartShopping!!
    }

private var cartShopping: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.CartShopping,
                contentDescription = ""
            )
        }
    }
}