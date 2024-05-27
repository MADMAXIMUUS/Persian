package io.github.madmaximuus.persianSymbols.clock.rotate.right

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

val PersianSymbols.Default.ClockRotateRight: ImageVector
    get() {
        if (clockRotateRight != null) {
            return clockRotateRight!!
        }
        clockRotateRight = Builder(
            name = "clock-rotate-right-default",
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
                moveTo(12.0f, 4.0f)
                curveTo(14.5254f, 4.0f, 16.7787f, 5.1701f, 18.2456f, 7.0f)
                horizontalLineTo(16.5f)
                curveTo(15.9477f, 7.0f, 15.5f, 7.4477f, 15.5f, 8.0f)
                curveTo(15.5f, 8.5523f, 15.9477f, 9.0f, 16.5f, 9.0f)
                horizontalLineTo(20.0443f)
                curveTo(20.0582f, 9.0003f, 20.0722f, 9.0003f, 20.0862f, 9.0f)
                horizontalLineTo(20.5f)
                curveTo(21.0523f, 9.0f, 21.5f, 8.5523f, 21.5f, 8.0f)
                verticalLineTo(4.0f)
                curveTo(21.5f, 3.4477f, 21.0523f, 3.0f, 20.5f, 3.0f)
                curveTo(19.9477f, 3.0f, 19.5f, 3.4477f, 19.5f, 4.0f)
                verticalLineTo(5.3857f)
                curveTo(17.6683f, 3.3103f, 14.9877f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 11.4477f, 21.5523f, 11.0f, 21.0f, 11.0f)
                curveTo(20.4477f, 11.0f, 20.0f, 11.4477f, 20.0f, 12.0f)
                curveTo(20.0f, 16.4183f, 16.4183f, 20.0f, 12.0f, 20.0f)
                curveTo(7.5817f, 20.0f, 4.0f, 16.4183f, 4.0f, 12.0f)
                curveTo(4.0f, 7.5817f, 7.5817f, 4.0f, 12.0f, 4.0f)
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
        }.build()
        return clockRotateRight!!
    }

private var clockRotateRight: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.ClockRotateRight,
                contentDescription = ""
            )
        }
    }
}