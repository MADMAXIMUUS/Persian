package io.github.madmaximuus.persianSymbols.clock.base

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

val PersianSymbols.Default.Clock: ImageVector
    get() {
        if (clock != null) {
            return clock!!
        }
        clock = Builder(
            name = "clock-default",
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
                moveTo(13.0f, 8.0f)
                curveTo(13.0f, 7.4477f, 12.5523f, 7.0f, 12.0f, 7.0f)
                curveTo(11.4477f, 7.0f, 11.0f, 7.4477f, 11.0f, 8.0f)
                verticalLineTo(11.5858f)
                curveTo(11.0f, 12.1162f, 11.2107f, 12.6249f, 11.5858f, 13.0f)
                lineTo(15.2929f, 16.7071f)
                curveTo(15.6834f, 17.0976f, 16.3166f, 17.0976f, 16.7071f, 16.7071f)
                curveTo(17.0976f, 16.3166f, 17.0976f, 15.6834f, 16.7071f, 15.2929f)
                lineTo(13.0f, 11.5858f)
                verticalLineTo(8.0f)
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
                moveTo(12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 7.5817f, 7.5817f, 4.0f, 12.0f, 4.0f)
                curveTo(16.4183f, 4.0f, 20.0f, 7.5817f, 20.0f, 12.0f)
                curveTo(20.0f, 16.4183f, 16.4183f, 20.0f, 12.0f, 20.0f)
                curveTo(7.5817f, 20.0f, 4.0f, 16.4183f, 4.0f, 12.0f)
                close()
            }
        }.build()
        return clock!!
    }

private var clock: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Clock,
                contentDescription = ""
            )
        }
    }
}