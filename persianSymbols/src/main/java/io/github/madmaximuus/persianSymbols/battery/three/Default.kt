package io.github.madmaximuus.persianSymbols.battery.three

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Battery3: ImageVector
    get() {
        if (battery3 != null) {
            return battery3!!
        }
        battery3 = Builder(
            name = "battery-3-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 4f)
                curveTo(10f, 3.448f, 10.448f, 3f, 11f, 3f)
                horizontalLineTo(13f)
                curveTo(13.552f, 3f, 14f, 3.448f, 14f, 4f)
                verticalLineTo(5f)
                horizontalLineTo(15.4f)
                curveTo(16.836f, 5f, 18f, 6.164f, 18f, 7.6f)
                verticalLineTo(20.4f)
                curveTo(18f, 21.836f, 16.836f, 23f, 15.4f, 23f)
                horizontalLineTo(8.6f)
                curveTo(7.164f, 23f, 6f, 21.836f, 6f, 20.4f)
                verticalLineTo(7.6f)
                curveTo(6f, 6.164f, 7.164f, 5f, 8.6f, 5f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                close()
                moveTo(16f, 14f)
                horizontalLineTo(8f)
                verticalLineTo(7.6f)
                curveTo(8f, 7.269f, 8.269f, 7f, 8.6f, 7f)
                horizontalLineTo(15.4f)
                curveTo(15.731f, 7f, 16f, 7.269f, 16f, 7.6f)
                verticalLineTo(14f)
                close()
            }
        }.build()
        return battery3!!
    }

private var battery3: ImageVector? = null