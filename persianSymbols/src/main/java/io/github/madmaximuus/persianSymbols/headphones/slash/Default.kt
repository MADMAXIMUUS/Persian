package io.github.madmaximuus.persianSymbols.headphones.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.HeadphonesSlash: ImageVector
    get() {
        if (headphonesSlash != null) {
            return headphonesSlash!!
        }
        headphonesSlash = ImageVector.Builder(
            name = "headphones-slash-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 4f)
                curveTo(10.424f, 4f, 8.955f, 4.455f, 7.717f, 5.242f)
                lineTo(6.275f, 3.8f)
                curveTo(7.897f, 2.666f, 9.871f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                verticalLineTo(14.732f)
                lineTo(22f, 14.755f)
                verticalLineTo(19.246f)
                curveTo(22f, 19.424f, 21.976f, 19.599f, 21.932f, 19.765f)
                curveTo(21.853f, 19.49f, 21.705f, 19.23f, 21.487f, 19.013f)
                lineTo(20f, 17.525f)
                verticalLineTo(14.755f)
                lineTo(18.5f, 14.326f)
                verticalLineTo(16.025f)
                lineTo(16.5f, 14.025f)
                verticalLineTo(13.663f)
                curveTo(16.5f, 12.667f, 17.454f, 11.947f, 18.412f, 12.221f)
                lineTo(20f, 12.675f)
                verticalLineTo(12f)
                curveTo(20f, 7.582f, 16.418f, 4f, 12f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.8f, 6.275f)
                lineTo(5.242f, 7.717f)
                curveTo(4.455f, 8.955f, 4f, 10.424f, 4f, 12f)
                verticalLineTo(12.675f)
                lineTo(5.588f, 12.221f)
                curveTo(6.546f, 11.947f, 7.5f, 12.667f, 7.5f, 13.663f)
                verticalLineTo(20.337f)
                curveTo(7.5f, 21.334f, 6.546f, 22.053f, 5.588f, 21.78f)
                lineTo(3.451f, 21.169f)
                curveTo(2.592f, 20.924f, 2f, 20.139f, 2f, 19.246f)
                verticalLineTo(19.016f)
                lineTo(2f, 19f)
                verticalLineTo(12f)
                curveTo(2f, 9.871f, 2.666f, 7.897f, 3.8f, 6.275f)
                close()
                moveTo(5.5f, 14.326f)
                lineTo(4f, 14.755f)
                verticalLineTo(19.246f)
                lineTo(5.5f, 19.674f)
                verticalLineTo(14.326f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.013f, 21.487f)
                curveTo(19.045f, 21.52f, 19.078f, 21.551f, 19.112f, 21.58f)
                lineTo(18.412f, 21.78f)
                curveTo(17.454f, 22.053f, 16.5f, 21.334f, 16.5f, 20.337f)
                verticalLineTo(18.975f)
                lineTo(19.013f, 21.487f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.707f, 2.293f)
                curveTo(3.317f, 1.902f, 2.683f, 1.902f, 2.293f, 2.293f)
                curveTo(1.902f, 2.683f, 1.902f, 3.317f, 2.293f, 3.707f)
                lineTo(20.293f, 21.707f)
                curveTo(20.683f, 22.098f, 21.317f, 22.098f, 21.707f, 21.707f)
                curveTo(22.098f, 21.317f, 22.098f, 20.683f, 21.707f, 20.293f)
                lineTo(3.707f, 2.293f)
                close()
            }
        }.build()

        return headphonesSlash!!
    }

private var headphonesSlash: ImageVector? = null