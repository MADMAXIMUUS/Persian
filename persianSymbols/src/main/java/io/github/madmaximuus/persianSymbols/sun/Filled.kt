package io.github.madmaximuus.persianSymbols.sun

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Sun: ImageVector
    get() {
        if (sun != null) {
            return sun!!
        }
        sun = Builder(
            name = "sun-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 3f)
                curveTo(13f, 2.448f, 12.552f, 2f, 12f, 2f)
                curveTo(11.448f, 2f, 11f, 2.448f, 11f, 3f)
                verticalLineTo(5f)
                curveTo(11f, 5.552f, 11.448f, 6f, 12f, 6f)
                curveTo(12.552f, 6f, 13f, 5.552f, 13f, 5f)
                verticalLineTo(3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.293f, 4.293f)
                curveTo(4.683f, 3.902f, 5.317f, 3.902f, 5.707f, 4.293f)
                lineTo(7.707f, 6.293f)
                curveTo(8.098f, 6.683f, 8.098f, 7.317f, 7.707f, 7.707f)
                curveTo(7.317f, 8.098f, 6.683f, 8.098f, 6.293f, 7.707f)
                lineTo(4.293f, 5.707f)
                curveTo(3.902f, 5.317f, 3.902f, 4.683f, 4.293f, 4.293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 12f)
                curveTo(17f, 14.761f, 14.761f, 17f, 12f, 17f)
                curveTo(9.239f, 17f, 7f, 14.761f, 7f, 12f)
                curveTo(7f, 9.239f, 9.239f, 7f, 12f, 7f)
                curveTo(14.761f, 7f, 17f, 9.239f, 17f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.707f, 5.707f)
                lineTo(17.707f, 7.707f)
                curveTo(17.317f, 8.098f, 16.683f, 8.098f, 16.293f, 7.707f)
                curveTo(15.902f, 7.317f, 15.902f, 6.683f, 16.293f, 6.293f)
                lineTo(18.293f, 4.293f)
                curveTo(18.683f, 3.902f, 19.317f, 3.902f, 19.707f, 4.293f)
                curveTo(20.098f, 4.683f, 20.098f, 5.317f, 19.707f, 5.707f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 11f)
                horizontalLineTo(19f)
                curveTo(18.448f, 11f, 18f, 11.448f, 18f, 12f)
                curveTo(18f, 12.552f, 18.448f, 13f, 19f, 13f)
                horizontalLineTo(21f)
                curveTo(21.552f, 13f, 22f, 12.552f, 22f, 12f)
                curveTo(22f, 11.448f, 21.552f, 11f, 21f, 11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.707f, 16.293f)
                lineTo(19.707f, 18.293f)
                curveTo(20.098f, 18.683f, 20.098f, 19.317f, 19.707f, 19.707f)
                curveTo(19.317f, 20.098f, 18.683f, 20.098f, 18.293f, 19.707f)
                lineTo(16.293f, 17.707f)
                curveTo(15.902f, 17.317f, 15.902f, 16.683f, 16.293f, 16.293f)
                curveTo(16.683f, 15.902f, 17.317f, 15.902f, 17.707f, 16.293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11f, 19f)
                verticalLineTo(21f)
                curveTo(11f, 21.552f, 11.448f, 22f, 12f, 22f)
                curveTo(12.552f, 22f, 13f, 21.552f, 13f, 21f)
                verticalLineTo(19f)
                curveTo(13f, 18.448f, 12.552f, 18f, 12f, 18f)
                curveTo(11.448f, 18f, 11f, 18.448f, 11f, 19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.707f, 16.293f)
                curveTo(8.098f, 16.683f, 8.098f, 17.317f, 7.707f, 17.707f)
                lineTo(5.707f, 19.707f)
                curveTo(5.317f, 20.098f, 4.683f, 20.098f, 4.293f, 19.707f)
                curveTo(3.902f, 19.317f, 3.902f, 18.683f, 4.293f, 18.293f)
                lineTo(6.293f, 16.293f)
                curveTo(6.683f, 15.902f, 7.317f, 15.902f, 7.707f, 16.293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3f, 11f)
                curveTo(2.448f, 11f, 2f, 11.448f, 2f, 12f)
                curveTo(2f, 12.552f, 2.448f, 13f, 3f, 13f)
                horizontalLineTo(5f)
                curveTo(5.552f, 13f, 6f, 12.552f, 6f, 12f)
                curveTo(6f, 11.448f, 5.552f, 11f, 5f, 11f)
                horizontalLineTo(3f)
                close()
            }
        }.build()
        return sun!!
    }

private var sun: ImageVector? = null