package io.github.madmaximuus.persianSymbols.bell.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.BellSlash: ImageVector
    get() {
        if (bellSlash != null) {
            return bellSlash!!
        }
        bellSlash = ImageVector.Builder(
            name = "bell-slash-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 8.938f)
                curveTo(6f, 8.787f, 6.006f, 8.638f, 6.016f, 8.491f)
                lineTo(8f, 10.475f)
                verticalLineTo(17f)
                horizontalLineTo(14.525f)
                lineTo(16.525f, 19f)
                horizontalLineTo(5f)
                curveTo(4.448f, 19f, 4f, 18.552f, 4f, 18f)
                curveTo(4f, 17.448f, 4.448f, 17f, 5f, 17f)
                horizontalLineTo(6f)
                verticalLineTo(8.938f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 8.938f)
                verticalLineTo(13.525f)
                lineTo(18f, 15.525f)
                verticalLineTo(8.938f)
                curveTo(18f, 5.964f, 15.838f, 3.497f, 13f, 3.02f)
                verticalLineTo(3f)
                curveTo(13f, 2.448f, 12.552f, 2f, 12f, 2f)
                curveTo(11.448f, 2f, 11f, 2.448f, 11f, 3f)
                verticalLineTo(3.02f)
                curveTo(9.601f, 3.255f, 8.366f, 3.974f, 7.474f, 4.999f)
                lineTo(8.893f, 6.418f)
                curveTo(9.485f, 5.689f, 10.329f, 5.172f, 11.292f, 5f)
                horizontalLineTo(12.708f)
                curveTo(14.58f, 5.334f, 16f, 6.97f, 16f, 8.938f)
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
