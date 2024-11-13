package io.github.madmaximuus.persianSymbols.battery.six

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Battery6: ImageVector
    get() {
        if (battery6 != null) {
            return battery6!!
        }
        battery6 = Builder(
            name = "battery-6-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 3f)
                curveTo(10f, 2.448f, 10.448f, 2f, 11f, 2f)
                horizontalLineTo(13f)
                curveTo(13.552f, 2f, 14f, 2.448f, 14f, 3f)
                verticalLineTo(4f)
                horizontalLineTo(15.4f)
                curveTo(16.836f, 4f, 18f, 5.164f, 18f, 6.6f)
                lineTo(18f, 19.4f)
                curveTo(18f, 20.791f, 16.907f, 21.927f, 15.534f, 21.997f)
                curveTo(15.489f, 21.999f, 15.445f, 22f, 15.4f, 22f)
                curveTo(15.4f, 22f, 15.4f, 22f, 15.4f, 22f)
                horizontalLineTo(8.6f)
                curveTo(7.164f, 22f, 6f, 20.836f, 6f, 19.4f)
                verticalLineTo(6.6f)
                curveTo(6f, 5.164f, 7.164f, 4f, 8.6f, 4f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                close()
                moveTo(16f, 8f)
                horizontalLineTo(8f)
                verticalLineTo(6.6f)
                curveTo(8f, 6.269f, 8.269f, 6f, 8.6f, 6f)
                horizontalLineTo(15.4f)
                curveTo(15.731f, 6f, 16f, 6.269f, 16f, 6.6f)
                verticalLineTo(8f)
                close()
            }
        }.build()
        return battery6!!
    }

private var battery6: ImageVector? = null