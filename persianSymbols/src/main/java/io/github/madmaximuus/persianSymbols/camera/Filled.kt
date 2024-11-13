package io.github.madmaximuus.persianSymbols.camera

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Camera: ImageVector
    get() {
        if (camera != null) {
            return camera!!
        }
        camera = Builder(
            name = "camera-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 13f)
                curveTo(9f, 11.343f, 10.343f, 10f, 12f, 10f)
                curveTo(13.657f, 10f, 15f, 11.343f, 15f, 13f)
                curveTo(15f, 14.657f, 13.657f, 16f, 12f, 16f)
                curveTo(10.343f, 16f, 9f, 14.657f, 9f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.17f, 5.25f)
                curveTo(3.867f, 5.25f, 2f, 7.117f, 2f, 9.42f)
                verticalLineTo(16.6f)
                curveTo(2f, 19.03f, 3.97f, 21f, 6.4f, 21f)
                horizontalLineTo(17.6f)
                curveTo(20.03f, 21f, 22f, 19.03f, 22f, 16.6f)
                verticalLineTo(9.42f)
                curveTo(22f, 7.117f, 20.133f, 5.25f, 17.83f, 5.25f)
                curveTo(16.944f, 5.25f, 16.094f, 4.895f, 15.471f, 4.264f)
                lineTo(14.809f, 3.595f)
                curveTo(14.434f, 3.214f, 13.921f, 3f, 13.387f, 3f)
                horizontalLineTo(10.613f)
                curveTo(10.079f, 3f, 9.566f, 3.214f, 9.191f, 3.595f)
                lineTo(8.529f, 4.264f)
                curveTo(7.906f, 4.895f, 7.056f, 5.25f, 6.17f, 5.25f)
                close()
                moveTo(12f, 8f)
                curveTo(9.239f, 8f, 7f, 10.239f, 7f, 13f)
                curveTo(7f, 15.761f, 9.239f, 18f, 12f, 18f)
                curveTo(14.761f, 18f, 17f, 15.761f, 17f, 13f)
                curveTo(17f, 10.239f, 14.761f, 8f, 12f, 8f)
                close()
            }
        }.build()
        return camera!!
    }

private var camera: ImageVector? = null