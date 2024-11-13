package io.github.madmaximuus.persianSymbols.rotate

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Rotate: ImageVector
    get() {
        if (rotate != null) {
            return rotate!!
        }
        rotate = Builder(
            name = "rotate-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 6f)
                curveTo(8.686f, 6f, 6f, 8.686f, 6f, 12f)
                curveTo(6f, 13.246f, 6.379f, 14.403f, 7.03f, 15.362f)
                verticalLineTo(14.047f)
                curveTo(7.03f, 13.494f, 7.477f, 13.047f, 8.03f, 13.047f)
                curveTo(8.582f, 13.047f, 9.03f, 13.494f, 9.03f, 14.047f)
                verticalLineTo(17.785f)
                curveTo(9.03f, 18.337f, 8.582f, 18.785f, 8.03f, 18.785f)
                horizontalLineTo(4.045f)
                curveTo(3.492f, 18.785f, 3.045f, 18.337f, 3.045f, 17.785f)
                curveTo(3.045f, 17.232f, 3.492f, 16.785f, 4.045f, 16.785f)
                horizontalLineTo(5.588f)
                curveTo(4.591f, 15.451f, 4f, 13.794f, 4f, 12f)
                curveTo(4f, 7.582f, 7.582f, 4f, 12f, 4f)
                curveTo(12.552f, 4f, 13f, 4.448f, 13f, 5f)
                curveTo(13f, 5.552f, 12.552f, 6f, 12f, 6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.447f, 7.262f)
                horizontalLineTo(19.969f)
                curveTo(20.521f, 7.262f, 20.969f, 6.814f, 20.969f, 6.262f)
                curveTo(20.969f, 5.71f, 20.521f, 5.262f, 19.969f, 5.262f)
                horizontalLineTo(16.002f)
                curveTo(15.45f, 5.262f, 15.002f, 5.71f, 15.002f, 6.262f)
                verticalLineTo(9.975f)
                curveTo(15.002f, 10.528f, 15.45f, 10.975f, 16.002f, 10.975f)
                curveTo(16.554f, 10.975f, 17.002f, 10.528f, 17.002f, 9.975f)
                verticalLineTo(8.685f)
                curveTo(17.633f, 9.635f, 18f, 10.775f, 18f, 12f)
                curveTo(18f, 15.314f, 15.314f, 18f, 12f, 18f)
                curveTo(11.448f, 18f, 11f, 18.448f, 11f, 19f)
                curveTo(11f, 19.552f, 11.448f, 20f, 12f, 20f)
                curveTo(16.418f, 20f, 20f, 16.418f, 20f, 12f)
                curveTo(20f, 10.226f, 19.423f, 8.588f, 18.447f, 7.262f)
                close()
            }
        }.build()
        return rotate!!
    }

private var rotate: ImageVector? = null