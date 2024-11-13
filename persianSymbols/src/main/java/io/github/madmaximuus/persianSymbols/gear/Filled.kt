package io.github.madmaximuus.persianSymbols.gear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Gear: ImageVector
    get() {
        if (gear != null) {
            return gear!!
        }
        gear = ImageVector.Builder(
            name = "gear-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.4f, 4f)
                curveTo(8.4f, 2.895f, 9.295f, 2f, 10.4f, 2f)
                horizontalLineTo(13.6f)
                curveTo(14.705f, 2f, 15.6f, 2.895f, 15.6f, 4f)
                verticalLineTo(4.854f)
                curveTo(15.872f, 4.991f, 16.135f, 5.143f, 16.388f, 5.31f)
                lineTo(17.128f, 4.882f)
                curveTo(18.085f, 4.33f, 19.308f, 4.658f, 19.86f, 5.614f)
                lineTo(21.46f, 8.386f)
                curveTo(22.013f, 9.342f, 21.685f, 10.565f, 20.728f, 11.118f)
                lineTo(19.987f, 11.545f)
                curveTo(19.996f, 11.696f, 20f, 11.847f, 20f, 12f)
                curveTo(20f, 12.153f, 19.996f, 12.304f, 19.987f, 12.455f)
                lineTo(20.728f, 12.882f)
                curveTo(21.685f, 13.435f, 22.013f, 14.658f, 21.46f, 15.614f)
                lineTo(19.86f, 18.386f)
                curveTo(19.308f, 19.342f, 18.085f, 19.67f, 17.128f, 19.118f)
                lineTo(16.388f, 18.69f)
                curveTo(16.135f, 18.857f, 15.872f, 19.009f, 15.6f, 19.146f)
                verticalLineTo(20f)
                curveTo(15.6f, 21.105f, 14.705f, 22f, 13.6f, 22f)
                horizontalLineTo(10.4f)
                curveTo(9.295f, 22f, 8.4f, 21.105f, 8.4f, 20f)
                verticalLineTo(19.146f)
                curveTo(8.128f, 19.009f, 7.865f, 18.857f, 7.612f, 18.69f)
                lineTo(6.872f, 19.118f)
                curveTo(5.915f, 19.67f, 4.692f, 19.342f, 4.14f, 18.386f)
                lineTo(2.54f, 15.614f)
                curveTo(1.987f, 14.658f, 2.315f, 13.435f, 3.272f, 12.882f)
                lineTo(4.013f, 12.455f)
                curveTo(4.004f, 12.304f, 4f, 12.153f, 4f, 12f)
                curveTo(4f, 11.847f, 4.004f, 11.696f, 4.013f, 11.545f)
                lineTo(3.272f, 11.118f)
                curveTo(2.315f, 10.565f, 1.987f, 9.342f, 2.54f, 8.386f)
                lineTo(4.14f, 5.614f)
                curveTo(4.692f, 4.658f, 5.915f, 4.33f, 6.872f, 4.882f)
                lineTo(7.612f, 5.31f)
                curveTo(7.865f, 5.143f, 8.128f, 4.991f, 8.4f, 4.854f)
                verticalLineTo(4f)
                close()
                moveTo(12f, 15.5f)
                curveTo(13.933f, 15.5f, 15.5f, 13.933f, 15.5f, 12f)
                curveTo(15.5f, 10.067f, 13.933f, 8.5f, 12f, 8.5f)
                curveTo(10.067f, 8.5f, 8.5f, 10.067f, 8.5f, 12f)
                curveTo(8.5f, 13.933f, 10.067f, 15.5f, 12f, 15.5f)
                close()
            }
        }.build()
        return gear!!
    }

private var gear: ImageVector? = null