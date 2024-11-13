package io.github.madmaximuus.persianSymbols.arrow.up

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ArrowUp: ImageVector
    get() {
        if (arrowUp != null) {
            return arrowUp!!
        }
        arrowUp = ImageVector.Builder(
            name = "arrow-up-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 4.0f)
                curveTo(12.2652f, 4.0f, 12.5196f, 4.1054f, 12.7071f, 4.2929f)
                lineTo(18.7071f, 10.2929f)
                curveTo(19.0976f, 10.6834f, 19.0976f, 11.3166f, 18.7071f, 11.7071f)
                curveTo(18.3166f, 12.0976f, 17.6834f, 12.0976f, 17.2929f, 11.7071f)
                lineTo(13.0f, 7.4142f)
                lineTo(13.0f, 19.0f)
                curveTo(13.0f, 19.5523f, 12.5523f, 20.0f, 12.0f, 20.0f)
                curveTo(11.4477f, 20.0f, 11.0f, 19.5523f, 11.0f, 19.0f)
                lineTo(11.0f, 7.4142f)
                lineTo(6.7071f, 11.7071f)
                curveTo(6.3166f, 12.0976f, 5.6834f, 12.0976f, 5.2929f, 11.7071f)
                curveTo(4.9024f, 11.3166f, 4.9024f, 10.6834f, 5.2929f, 10.2929f)
                lineTo(11.2929f, 4.2929f)
                curveTo(11.4804f, 4.1054f, 11.7348f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }.build()
        return arrowUp!!
    }

private var arrowUp: ImageVector? = null