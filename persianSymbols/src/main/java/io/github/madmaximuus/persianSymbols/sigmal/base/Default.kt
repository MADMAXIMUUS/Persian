package io.github.madmaximuus.persianSymbols.sigmal.base

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

public val PersianSymbols.Default.Signal: ImageVector
    get() {
        if (signal != null) {
            return signal!!
        }
        signal = ImageVector.Builder(
            name = "signal-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(21f, 3f)
                curveTo(21f, 2.4477f, 20.5523f, 2f, 20f, 2f)
                curveTo(19.4477f, 2f, 19f, 2.4477f, 19f, 3f)
                verticalLineTo(21f)
                curveTo(19f, 21.5523f, 19.4477f, 22f, 20f, 22f)
                curveTo(20.5523f, 22f, 21f, 21.5523f, 21f, 21f)
                verticalLineTo(3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(16f, 6f)
                curveTo(16.5523f, 6f, 17f, 6.4477f, 17f, 7f)
                verticalLineTo(21f)
                curveTo(17f, 21.5523f, 16.5523f, 22f, 16f, 22f)
                curveTo(15.4477f, 22f, 15f, 21.5523f, 15f, 21f)
                verticalLineTo(7f)
                curveTo(15f, 6.4477f, 15.4477f, 6f, 16f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(13f, 11f)
                curveTo(13f, 10.4477f, 12.5523f, 10f, 12f, 10f)
                curveTo(11.4477f, 10f, 11f, 10.4477f, 11f, 11f)
                verticalLineTo(21f)
                curveTo(11f, 21.5523f, 11.4477f, 22f, 12f, 22f)
                curveTo(12.5523f, 22f, 13f, 21.5523f, 13f, 21f)
                verticalLineTo(11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(8f, 14f)
                curveTo(8.5523f, 14f, 9f, 14.4477f, 9f, 15f)
                verticalLineTo(21f)
                curveTo(9f, 21.5523f, 8.5523f, 22f, 8f, 22f)
                curveTo(7.4477f, 22f, 7f, 21.5523f, 7f, 21f)
                verticalLineTo(15f)
                curveTo(7f, 14.4477f, 7.4477f, 14f, 8f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(4f, 18f)
                curveTo(4.5523f, 18f, 5f, 18.4477f, 5f, 19f)
                verticalLineTo(21f)
                curveTo(5f, 21.5523f, 4.5523f, 22f, 4f, 22f)
                curveTo(3.4477f, 22f, 3f, 21.5523f, 3f, 21f)
                verticalLineTo(19f)
                curveTo(3f, 18.4477f, 3.4477f, 18f, 4f, 18f)
                close()
            }
        }.build()
        return signal!!
    }

private var signal: ImageVector? = null


@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Signal,
                contentDescription = ""
            )
        }
    }
}