package io.github.madmaximuus.persianSymbols.battery.percent.seventyFive

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Battery75Percent: ImageVector
    get() {
        if (batterySeventyFivePercent != null) {
            return batterySeventyFivePercent!!
        }
        batterySeventyFivePercent = ImageVector.Builder(
            name = "battery-seventy-five-percent-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 3f)
                curveTo(10f, 2.448f, 10.448f, 2f, 11f, 2f)
                horizontalLineTo(13f)
                curveTo(13.552f, 2f, 14f, 2.448f, 14f, 3f)
                verticalLineTo(3.5f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 8f)
                curveTo(6f, 5.791f, 7.791f, 4f, 10f, 4f)
                horizontalLineTo(14f)
                curveTo(16.209f, 4f, 18f, 5.791f, 18f, 8f)
                lineTo(18f, 18f)
                curveTo(18f, 20.14f, 16.319f, 21.888f, 14.206f, 21.995f)
                curveTo(14.138f, 21.998f, 14.069f, 22f, 14f, 22f)
                curveTo(14f, 22f, 14f, 22f, 14f, 22f)
                horizontalLineTo(10f)
                curveTo(7.791f, 22f, 6f, 20.209f, 6f, 18f)
                verticalLineTo(8f)
                close()
                moveTo(16f, 8f)
                horizontalLineTo(8f)
                curveTo(8f, 6.895f, 8.895f, 6f, 10f, 6f)
                horizontalLineTo(14f)
                curveTo(15.104f, 6f, 16f, 6.895f, 16f, 8f)
                close()
            }
        }.build()

        return batterySeventyFivePercent!!
    }

private var batterySeventyFivePercent: ImageVector? = null
