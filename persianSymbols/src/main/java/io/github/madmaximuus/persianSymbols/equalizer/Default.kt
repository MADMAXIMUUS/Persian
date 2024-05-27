package io.github.madmaximuus.persianSymbols.equalizer

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Equalizer: ImageVector
    get() {
        if (equalizer != null) {
            return equalizer!!
        }
        equalizer = Builder(
            name = "equalizer-default",
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
                moveTo(16.0f, 3.0f)
                curveTo(16.5523f, 3.0f, 17.0f, 3.4477f, 17.0f, 4.0f)
                verticalLineTo(21.0f)
                curveTo(17.0f, 21.5523f, 16.5523f, 22.0f, 16.0f, 22.0f)
                curveTo(15.4477f, 22.0f, 15.0f, 21.5523f, 15.0f, 21.0f)
                verticalLineTo(4.0f)
                curveTo(15.0f, 3.4477f, 15.4477f, 3.0f, 16.0f, 3.0f)
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
                moveTo(8.0f, 8.0f)
                curveTo(8.5523f, 8.0f, 9.0f, 8.4477f, 9.0f, 9.0f)
                verticalLineTo(21.0f)
                curveTo(9.0f, 21.5523f, 8.5523f, 22.0f, 8.0f, 22.0f)
                curveTo(7.4477f, 22.0f, 7.0f, 21.5523f, 7.0f, 21.0f)
                verticalLineTo(9.0f)
                curveTo(7.0f, 8.4477f, 7.4477f, 8.0f, 8.0f, 8.0f)
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
                moveTo(4.0f, 14.0f)
                curveTo(4.5523f, 14.0f, 5.0f, 14.4477f, 5.0f, 15.0f)
                verticalLineTo(21.0f)
                curveTo(5.0f, 21.5523f, 4.5523f, 22.0f, 4.0f, 22.0f)
                curveTo(3.4477f, 22.0f, 3.0f, 21.5523f, 3.0f, 21.0f)
                verticalLineTo(15.0f)
                curveTo(3.0f, 14.4477f, 3.4477f, 14.0f, 4.0f, 14.0f)
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
                moveTo(13.0f, 12.0f)
                curveTo(13.0f, 11.4477f, 12.5523f, 11.0f, 12.0f, 11.0f)
                curveTo(11.4477f, 11.0f, 11.0f, 11.4477f, 11.0f, 12.0f)
                verticalLineTo(21.0f)
                curveTo(11.0f, 21.5523f, 11.4477f, 22.0f, 12.0f, 22.0f)
                curveTo(12.5523f, 22.0f, 13.0f, 21.5523f, 13.0f, 21.0f)
                verticalLineTo(12.0f)
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
                moveTo(21.0f, 18.0f)
                curveTo(21.0f, 17.4477f, 20.5523f, 17.0f, 20.0f, 17.0f)
                curveTo(19.4477f, 17.0f, 19.0f, 17.4477f, 19.0f, 18.0f)
                verticalLineTo(21.0f)
                curveTo(19.0f, 21.5523f, 19.4477f, 22.0f, 20.0f, 22.0f)
                curveTo(20.5523f, 22.0f, 21.0f, 21.5523f, 21.0f, 21.0f)
                verticalLineTo(18.0f)
                close()
            }
        }.build()
        return equalizer!!
    }

private var equalizer: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Equalizer,
                contentDescription = ""
            )
        }
    }
}