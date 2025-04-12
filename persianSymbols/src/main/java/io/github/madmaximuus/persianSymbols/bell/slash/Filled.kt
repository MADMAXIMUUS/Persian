package io.github.madmaximuus.persianSymbols.bell.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.BellSlash: ImageVector
    get() {
        if (bellSlash != null) {
            return bellSlash!!
        }
        bellSlash = ImageVector.Builder(
            name = "bell-slash-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 9f)
                curveTo(6f, 8.83f, 6.007f, 8.662f, 6.021f, 8.496f)
                lineTo(16.525f, 19f)
                lineTo(5f, 19f)
                curveTo(4.448f, 19f, 4f, 18.552f, 4f, 18f)
                curveTo(4f, 17.448f, 4.448f, 17f, 5f, 17f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 9f)
                verticalLineTo(15.525f)
                lineTo(7.503f, 5.028f)
                curveTo(8.393f, 4.021f, 9.616f, 3.315f, 11f, 3.083f)
                verticalLineTo(3f)
                curveTo(11f, 2.448f, 11.448f, 2f, 12f, 2f)
                curveTo(12.552f, 2f, 13f, 2.448f, 13f, 3f)
                verticalLineTo(3.083f)
                curveTo(15.838f, 3.559f, 18f, 6.027f, 18f, 9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.934f, 21.175f)
                curveTo(10.472f, 21.686f, 11.199f, 22f, 12f, 22f)
                curveTo(12.801f, 22f, 13.528f, 21.686f, 14.066f, 21.175f)
                curveTo(14.566f, 20.7f, 14.105f, 20f, 13.415f, 20f)
                horizontalLineTo(10.585f)
                curveTo(9.895f, 20f, 9.434f, 20.7f, 9.934f, 21.175f)
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

        return bellSlash!!
    }

private var bellSlash: ImageVector? = null
