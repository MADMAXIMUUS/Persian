package io.github.madmaximuus.persianSymbols.speech

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Speech: ImageVector
    get() {
        if (speech != null) {
            return speech!!
        }
        speech = Builder(
            name = "speech-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.0f, 19.0f)
                curveTo(13.0f, 19.5523f, 12.5523f, 20.0f, 12.0f, 20.0f)
                curveTo(11.4477f, 20.0f, 11.0f, 19.5523f, 11.0f, 19.0f)
                lineTo(11.0f, 5.0f)
                curveTo(11.0f, 4.4477f, 11.4477f, 4.0f, 12.0f, 4.0f)
                curveTo(12.5523f, 4.0f, 13.0f, 4.4477f, 13.0f, 5.0f)
                lineTo(13.0f, 19.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.0f, 7.0f)
                curveTo(15.4477f, 7.0f, 15.0f, 7.4477f, 15.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(15.0f, 16.5523f, 15.4477f, 17.0f, 16.0f, 17.0f)
                curveTo(16.5523f, 17.0f, 17.0f, 16.5523f, 17.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(17.0f, 7.4477f, 16.5523f, 7.0f, 16.0f, 7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.0f, 10.0f)
                curveTo(19.4477f, 10.0f, 19.0f, 10.4477f, 19.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(19.0f, 13.5523f, 19.4477f, 14.0f, 20.0f, 14.0f)
                curveTo(20.5523f, 14.0f, 21.0f, 13.5523f, 21.0f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(21.0f, 10.4477f, 20.5523f, 10.0f, 20.0f, 10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.0f, 17.0f)
                curveTo(8.5523f, 17.0f, 9.0f, 16.5523f, 9.0f, 16.0f)
                lineTo(9.0f, 8.0f)
                curveTo(9.0f, 7.4477f, 8.5523f, 7.0f, 8.0f, 7.0f)
                curveTo(7.4477f, 7.0f, 7.0f, 7.4477f, 7.0f, 8.0f)
                lineTo(7.0f, 16.0f)
                curveTo(7.0f, 16.5523f, 7.4477f, 17.0f, 8.0f, 17.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.0f, 13.0f)
                curveTo(5.0f, 13.5523f, 4.5523f, 14.0f, 4.0f, 14.0f)
                curveTo(3.4477f, 14.0f, 3.0f, 13.5523f, 3.0f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 10.4477f, 3.4477f, 10.0f, 4.0f, 10.0f)
                curveTo(4.5523f, 10.0f, 5.0f, 10.4477f, 5.0f, 11.0f)
                lineTo(5.0f, 13.0f)
                close()
            }
        }.build()
        return speech!!
    }

private var speech: ImageVector? = null