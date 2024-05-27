package io.github.madmaximuus.persianSymbols.powerOnOff

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

val PersianSymbols.Default.PowerOnOff: ImageVector
    get() {
        if (powerOnOff != null) {
            return powerOnOff!!
        }
        powerOnOff = Builder(
            name = "power-on-off-default",
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
                pathFillType = EvenOdd
            ) {
                moveTo(13.0f, 3.0f)
                curveTo(13.0f, 2.4477f, 12.5523f, 2.0f, 12.0f, 2.0f)
                curveTo(11.4477f, 2.0f, 11.0f, 2.4477f, 11.0f, 3.0f)
                verticalLineTo(13.0f)
                curveTo(11.0f, 13.5523f, 11.4477f, 14.0f, 12.0f, 14.0f)
                curveTo(12.5523f, 14.0f, 13.0f, 13.5523f, 13.0f, 13.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(6.33f, 6.3563f)
                curveTo(6.7196f, 5.9649f, 6.7182f, 5.3318f, 6.3267f, 4.9421f)
                curveTo(5.9353f, 4.5525f, 5.3021f, 4.554f, 4.9125f, 4.9454f)
                curveTo(3.1136f, 6.7527f, 2.0f, 9.2473f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5229f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5229f, 22.0f, 12.0f)
                curveTo(22.0f, 9.2473f, 20.8864f, 6.7527f, 19.0875f, 4.9454f)
                curveTo(18.6979f, 4.554f, 18.0647f, 4.5525f, 17.6733f, 4.9421f)
                curveTo(17.2818f, 5.3318f, 17.2804f, 5.9649f, 17.67f, 6.3563f)
                curveTo(19.1111f, 7.8041f, 20.0f, 9.7973f, 20.0f, 12.0f)
                curveTo(20.0f, 16.4183f, 16.4183f, 20.0f, 12.0f, 20.0f)
                curveTo(7.5817f, 20.0f, 4.0f, 16.4183f, 4.0f, 12.0f)
                curveTo(4.0f, 9.7973f, 4.8889f, 7.8041f, 6.33f, 6.3563f)
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
                moveTo(13.0f, 3.0f)
                curveTo(13.0f, 2.4477f, 12.5523f, 2.0f, 12.0f, 2.0f)
                curveTo(11.4477f, 2.0f, 11.0f, 2.4477f, 11.0f, 3.0f)
                verticalLineTo(13.0f)
                curveTo(11.0f, 13.5523f, 11.4477f, 14.0f, 12.0f, 14.0f)
                curveTo(12.5523f, 14.0f, 13.0f, 13.5523f, 13.0f, 13.0f)
                verticalLineTo(3.0f)
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
                moveTo(6.33f, 6.3563f)
                curveTo(6.7196f, 5.9649f, 6.7182f, 5.3318f, 6.3267f, 4.9421f)
                curveTo(5.9353f, 4.5525f, 5.3021f, 4.554f, 4.9125f, 4.9454f)
                curveTo(3.1136f, 6.7527f, 2.0f, 9.2473f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5229f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5229f, 22.0f, 12.0f)
                curveTo(22.0f, 9.2473f, 20.8864f, 6.7527f, 19.0875f, 4.9454f)
                curveTo(18.6979f, 4.554f, 18.0647f, 4.5525f, 17.6733f, 4.9421f)
                curveTo(17.2818f, 5.3318f, 17.2804f, 5.9649f, 17.67f, 6.3563f)
                curveTo(19.1111f, 7.8041f, 20.0f, 9.7973f, 20.0f, 12.0f)
                curveTo(20.0f, 16.4183f, 16.4183f, 20.0f, 12.0f, 20.0f)
                curveTo(7.5817f, 20.0f, 4.0f, 16.4183f, 4.0f, 12.0f)
                curveTo(4.0f, 9.7973f, 4.8889f, 7.8041f, 6.33f, 6.3563f)
                close()
            }
        }.build()
        return powerOnOff!!
    }

private var powerOnOff: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.PowerOnOff,
                contentDescription = ""
            )
        }
    }
}