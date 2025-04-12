package io.github.madmaximuus.persianSymbols.key.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.KeySlash: ImageVector
    get() {
        if (keySlash != null) {
            return keySlash!!
        }
        keySlash = ImageVector.Builder(
            name = "key-slash-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.707f, 2.293f)
                curveTo(3.317f, 1.902f, 2.683f, 1.902f, 2.293f, 2.293f)
                curveTo(1.902f, 2.683f, 1.902f, 3.317f, 2.293f, 3.707f)
                lineTo(20.293f, 21.707f)
                curveTo(20.684f, 22.098f, 21.317f, 22.098f, 21.707f, 21.707f)
                curveTo(22.098f, 21.317f, 22.098f, 20.683f, 21.707f, 20.293f)
                lineTo(3.707f, 2.293f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 12f)
                curveTo(2f, 9.965f, 3.215f, 8.214f, 4.959f, 7.434f)
                lineTo(12.03f, 14.504f)
                horizontalLineTo(11.328f)
                curveTo(10.463f, 15.996f, 8.848f, 17f, 7f, 17f)
                curveTo(4.238f, 17f, 2f, 14.761f, 2f, 12f)
                close()
                moveTo(7.004f, 13.75f)
                curveTo(7.97f, 13.75f, 8.754f, 12.966f, 8.754f, 12f)
                curveTo(8.754f, 11.033f, 7.97f, 10.25f, 7.004f, 10.25f)
                curveTo(6.037f, 10.25f, 5.254f, 11.033f, 5.254f, 12f)
                curveTo(5.254f, 12.966f, 6.037f, 13.75f, 7.004f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.569f, 14.504f)
                lineTo(17.292f, 14.817f)
                lineTo(11.971f, 9.496f)
                horizontalLineTo(22.001f)
                verticalLineTo(12f)
                lineTo(20.4f, 15.579f)
                curveTo(20.103f, 16.244f, 19.218f, 16.378f, 18.737f, 15.831f)
                lineTo(17.569f, 14.504f)
                close()
            }
        }.build()

        return keySlash!!
    }

private var keySlash: ImageVector? = null