package io.github.madmaximuus.persianSymbols.battery.percent.zero

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Battery0Percent: ImageVector
    get() {
        if (battery0Percent != null) {
            return battery0Percent!!
        }
        battery0Percent = ImageVector.Builder(
            name = "battery-zero-percent-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11f, 2f)
                curveTo(10.448f, 2f, 10f, 2.448f, 10f, 3f)
                verticalLineTo(3.5f)
                horizontalLineTo(14f)
                verticalLineTo(3f)
                curveTo(14f, 2.448f, 13.552f, 2f, 13f, 2f)
                horizontalLineTo(11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 4f)
                curveTo(7.791f, 4f, 6f, 5.791f, 6f, 8f)
                verticalLineTo(18f)
                curveTo(6f, 20.209f, 7.791f, 22f, 10f, 22f)
                horizontalLineTo(14f)
                curveTo(16.209f, 22f, 18f, 20.209f, 18f, 18f)
                verticalLineTo(8f)
                curveTo(18f, 5.791f, 16.209f, 4f, 14f, 4f)
                horizontalLineTo(10f)
                close()
                moveTo(8f, 8f)
                curveTo(8f, 6.895f, 8.895f, 6f, 10f, 6f)
                horizontalLineTo(14f)
                curveTo(15.104f, 6f, 16f, 6.895f, 16f, 8f)
                verticalLineTo(18f)
                curveTo(16f, 19.105f, 15.104f, 20f, 14f, 20f)
                horizontalLineTo(10f)
                curveTo(8.895f, 20f, 8f, 19.105f, 8f, 18f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return battery0Percent!!
    }

private var battery0Percent: ImageVector? = null
