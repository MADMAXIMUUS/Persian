package io.github.madmaximuus.persianSymbols.warning

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

val PersianSymbols.Default.Warning: ImageVector
    get() {
        if (warning != null) {
            return warning!!
        }
        warning = Builder(
            name = "warning-default",
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
                moveTo(12.0f, 10.0f)
                curveTo(12.5523f, 10.0f, 13.0f, 10.4477f, 13.0f, 11.0f)
                verticalLineTo(15.0f)
                curveTo(13.0f, 15.5523f, 12.5523f, 16.0f, 12.0f, 16.0f)
                curveTo(11.4477f, 16.0f, 11.0f, 15.5523f, 11.0f, 15.0f)
                verticalLineTo(11.0f)
                curveTo(11.0f, 10.4477f, 11.4477f, 10.0f, 12.0f, 10.0f)
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
                moveTo(11.0f, 18.0f)
                curveTo(11.0f, 18.5523f, 11.4477f, 19.0f, 12.0f, 19.0f)
                curveTo(12.5523f, 19.0f, 13.0f, 18.5523f, 13.0f, 18.0f)
                curveTo(13.0f, 17.4477f, 12.5523f, 17.0f, 12.0f, 17.0f)
                curveTo(11.4477f, 17.0f, 11.0f, 17.4477f, 11.0f, 18.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.7889f, 4.3417f)
                curveTo(13.0518f, 2.8675f, 10.9482f, 2.8676f, 10.2112f, 4.3417f)
                lineTo(2.8292f, 19.1056f)
                curveTo(2.1643f, 20.4354f, 3.1313f, 22.0f, 4.6181f, 22.0f)
                horizontalLineTo(19.382f)
                curveTo(20.8688f, 22.0f, 21.8357f, 20.4354f, 21.1708f, 19.1056f)
                lineTo(13.7889f, 4.3417f)
                close()
                moveTo(12.0f, 5.2361f)
                lineTo(19.382f, 20.0f)
                horizontalLineTo(4.6181f)
                lineTo(12.0f, 5.2361f)
                close()
            }
        }.build()
        return warning!!
    }

private var warning: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Warning,
                contentDescription = ""
            )
        }
    }
}