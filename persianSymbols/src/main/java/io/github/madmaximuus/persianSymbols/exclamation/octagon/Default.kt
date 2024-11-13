package io.github.madmaximuus.persianSymbols.exclamation.octagon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ExclamationOctagon: ImageVector
    get() {
        if (exclamationOctagon != null) {
            return exclamationOctagon!!
        }
        exclamationOctagon = Builder(
            name = "exclamation-octagon-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 7.205f)
                curveTo(12.414f, 7.205f, 12.75f, 7.541f, 12.75f, 7.955f)
                lineTo(12.75f, 13.429f)
                curveTo(12.75f, 13.843f, 12.414f, 14.179f, 12f, 14.179f)
                curveTo(11.586f, 14.179f, 11.25f, 13.843f, 11.25f, 13.429f)
                lineTo(11.25f, 7.955f)
                curveTo(11.25f, 7.541f, 11.586f, 7.205f, 12f, 7.205f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.002f, 15.795f)
                curveTo(13.002f, 16.347f, 12.554f, 16.795f, 12.002f, 16.795f)
                curveTo(11.45f, 16.795f, 11.002f, 16.347f, 11.002f, 15.795f)
                curveTo(11.002f, 15.243f, 11.45f, 14.795f, 12.002f, 14.795f)
                curveTo(12.554f, 14.795f, 13.002f, 15.243f, 13.002f, 15.795f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.414f, 2f)
                curveTo(7.884f, 2f, 7.375f, 2.211f, 7f, 2.586f)
                lineTo(2.586f, 7f)
                curveTo(2.211f, 7.375f, 2f, 7.884f, 2f, 8.414f)
                verticalLineTo(15.586f)
                curveTo(2f, 16.116f, 2.211f, 16.625f, 2.586f, 17f)
                lineTo(7f, 21.414f)
                curveTo(7.375f, 21.789f, 7.884f, 22f, 8.414f, 22f)
                horizontalLineTo(15.586f)
                curveTo(16.116f, 22f, 16.625f, 21.789f, 17f, 21.414f)
                lineTo(21.414f, 17f)
                curveTo(21.789f, 16.625f, 22f, 16.116f, 22f, 15.586f)
                verticalLineTo(8.414f)
                curveTo(22f, 7.884f, 21.789f, 7.375f, 21.414f, 7f)
                lineTo(17f, 2.586f)
                curveTo(16.625f, 2.211f, 16.116f, 2f, 15.586f, 2f)
                horizontalLineTo(8.414f)
                close()
                moveTo(8.414f, 4f)
                horizontalLineTo(15.586f)
                lineTo(20f, 8.414f)
                verticalLineTo(15.586f)
                lineTo(15.586f, 20f)
                horizontalLineTo(8.414f)
                lineTo(4f, 15.586f)
                lineTo(4f, 8.414f)
                lineTo(8.414f, 4f)
                close()
            }
        }.build()
        return exclamationOctagon!!
    }

private var exclamationOctagon: ImageVector? = null