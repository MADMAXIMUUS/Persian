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
                moveTo(12f, 9.75f)
                curveTo(10.205f, 9.75f, 8.75f, 11.205f, 8.75f, 13f)
                curveTo(8.75f, 14.795f, 10.205f, 16.25f, 12f, 16.25f)
                curveTo(13.795f, 16.25f, 15.25f, 14.795f, 15.25f, 13f)
                curveTo(15.25f, 11.205f, 13.795f, 9.75f, 12f, 9.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 9.42f)
                curveTo(2f, 7.117f, 3.867f, 5.25f, 6.17f, 5.25f)
                curveTo(7.056f, 5.25f, 7.906f, 4.895f, 8.529f, 4.264f)
                lineTo(9.191f, 3.595f)
                curveTo(9.566f, 3.214f, 10.079f, 3f, 10.613f, 3f)
                horizontalLineTo(13.387f)
                curveTo(13.921f, 3f, 14.434f, 3.214f, 14.809f, 3.595f)
                lineTo(15.471f, 4.264f)
                curveTo(16.094f, 4.895f, 16.944f, 5.25f, 17.83f, 5.25f)
                curveTo(20.133f, 5.25f, 22f, 7.117f, 22f, 9.42f)
                verticalLineTo(16.6f)
                curveTo(22f, 19.03f, 20.03f, 21f, 17.6f, 21f)
                horizontalLineTo(6.4f)
                curveTo(3.97f, 21f, 2f, 19.03f, 2f, 16.6f)
                verticalLineTo(9.42f)
                close()
                moveTo(7.25f, 13f)
                curveTo(7.25f, 10.377f, 9.377f, 8.25f, 12f, 8.25f)
                curveTo(14.623f, 8.25f, 16.75f, 10.377f, 16.75f, 13f)
                curveTo(16.75f, 15.623f, 14.623f, 17.75f, 12f, 17.75f)
                curveTo(9.377f, 17.75f, 7.25f, 15.623f, 7.25f, 13f)
                close()
                moveTo(17.75f, 9.5f)
                curveTo(18.164f, 9.5f, 18.5f, 9.164f, 18.5f, 8.75f)
                curveTo(18.5f, 8.336f, 18.164f, 8f, 17.75f, 8f)
                curveTo(17.336f, 8f, 17f, 8.336f, 17f, 8.75f)
                curveTo(17f, 9.164f, 17.336f, 9.5f, 17.75f, 9.5f)
                close()
            }
        }.build()
        return camera!!
    }

private var camera: ImageVector? = null