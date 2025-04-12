package io.github.madmaximuus.persianSymbols.bell.on

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.BellOn: ImageVector
    get() {
        if (bellOn != null) {
            return bellOn!!
        }
        bellOn = Builder(
            name = "bell-on-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.394f, 2.053f)
                curveTo(8.641f, 2.547f, 8.441f, 3.147f, 7.947f, 3.394f)
                curveTo(7.145f, 3.795f, 5.345f, 4.95f, 4.994f, 8.11f)
                curveTo(4.933f, 8.659f, 4.438f, 9.055f, 3.89f, 8.994f)
                curveTo(3.341f, 8.933f, 2.945f, 8.438f, 3.006f, 7.89f)
                curveTo(3.455f, 3.85f, 5.855f, 2.205f, 7.053f, 1.606f)
                curveTo(7.547f, 1.359f, 8.147f, 1.559f, 8.394f, 2.053f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.606f, 2.053f)
                curveTo(15.359f, 2.547f, 15.559f, 3.147f, 16.053f, 3.394f)
                curveTo(16.855f, 3.795f, 18.655f, 4.95f, 19.006f, 8.11f)
                curveTo(19.067f, 8.659f, 19.562f, 9.055f, 20.11f, 8.994f)
                curveTo(20.659f, 8.933f, 21.055f, 8.438f, 20.994f, 7.89f)
                curveTo(20.545f, 3.85f, 18.145f, 2.205f, 16.947f, 1.606f)
                curveTo(16.453f, 1.359f, 15.852f, 1.559f, 15.606f, 2.053f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 2f)
                curveTo(12.552f, 2f, 13f, 2.448f, 13f, 3f)
                verticalLineTo(3.02f)
                curveTo(15.838f, 3.497f, 18f, 5.964f, 18f, 8.938f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                curveTo(19.552f, 17f, 20f, 17.448f, 20f, 18f)
                curveTo(20f, 18.552f, 19.552f, 19f, 19f, 19f)
                lineTo(5f, 19f)
                curveTo(4.448f, 19f, 4f, 18.552f, 4f, 18f)
                curveTo(4f, 17.448f, 4.448f, 17f, 5f, 17f)
                horizontalLineTo(6f)
                verticalLineTo(8.938f)
                curveTo(6f, 5.964f, 8.162f, 3.497f, 11f, 3.02f)
                verticalLineTo(3f)
                curveTo(11f, 2.448f, 11.448f, 2f, 12f, 2f)
                close()
                moveTo(16f, 17f)
                verticalLineTo(8.938f)
                curveTo(16f, 6.97f, 14.58f, 5.334f, 12.708f, 5f)
                horizontalLineTo(11.292f)
                curveTo(9.42f, 5.334f, 8f, 6.97f, 8f, 8.938f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22f)
                curveTo(11.199f, 22f, 10.472f, 21.686f, 9.934f, 21.175f)
                curveTo(9.433f, 20.7f, 9.895f, 20f, 10.585f, 20f)
                horizontalLineTo(13.415f)
                curveTo(14.105f, 20f, 14.566f, 20.7f, 14.066f, 21.175f)
                curveTo(13.528f, 21.686f, 12.801f, 22f, 12f, 22f)
                close()
            }
        }.build()
        return bellOn!!
    }

private var bellOn: ImageVector? = null