package io.github.madmaximuus.persianSymbols.flashlight.slash

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

val PersianSymbols.Default.FlashlightSlash: ImageVector
    get() {
        if (flashlightSlash != null) {
            return flashlightSlash!!
        }
        flashlightSlash = Builder(
            name = "flashlight-slash-default",
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
                moveTo(3.7071f, 2.2929f)
                curveTo(3.3166f, 1.9024f, 2.6834f, 1.9024f, 2.2929f, 2.2929f)
                curveTo(1.9024f, 2.6834f, 1.9024f, 3.3166f, 2.2929f, 3.7071f)
                lineTo(20.2929f, 21.7071f)
                curveTo(20.6834f, 22.0976f, 21.3166f, 22.0976f, 21.7071f, 21.7071f)
                curveTo(22.0976f, 21.3166f, 22.0976f, 20.6834f, 21.7071f, 20.2929f)
                lineTo(3.7071f, 2.2929f)
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
                moveTo(8.0f, 10.8284f)
                curveTo(8.0f, 10.6813f, 7.9676f, 10.5376f, 7.9067f, 10.4067f)
                lineTo(10.0f, 12.5f)
                verticalLineTo(19.0f)
                curveTo(10.0f, 19.5523f, 10.4477f, 20.0f, 11.0f, 20.0f)
                horizontalLineTo(13.0f)
                curveTo(13.5523f, 20.0f, 14.0f, 19.5523f, 14.0f, 19.0f)
                verticalLineTo(16.5f)
                lineTo(16.0f, 18.5f)
                verticalLineTo(19.0f)
                curveTo(16.0f, 20.6569f, 14.6568f, 22.0f, 13.0f, 22.0f)
                horizontalLineTo(11.0f)
                curveTo(9.3431f, 22.0f, 8.0f, 20.6569f, 8.0f, 19.0f)
                verticalLineTo(10.8284f)
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
                moveTo(6.0507f, 3.5507f)
                lineTo(9.5f, 7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.1716f)
                curveTo(16.0f, 7.4368f, 15.8946f, 7.6911f, 15.7071f, 7.8787f)
                lineTo(14.8787f, 8.7071f)
                curveTo(14.3161f, 9.2697f, 14.0f, 10.0328f, 14.0f, 10.8284f)
                verticalLineTo(11.5f)
                lineTo(16.0f, 13.5f)
                verticalLineTo(10.8284f)
                curveTo(16.0f, 10.5632f, 16.1053f, 10.3089f, 16.2929f, 10.1213f)
                lineTo(17.1213f, 9.2929f)
                curveTo(17.6839f, 8.7303f, 18.0f, 7.9672f, 18.0f, 7.1716f)
                verticalLineTo(4.0f)
                curveTo(18.0f, 2.8954f, 17.1046f, 2.0f, 16.0f, 2.0f)
                horizontalLineTo(8.0f)
                curveTo(7.0499f, 2.0f, 6.2546f, 2.6625f, 6.0507f, 3.5507f)
                close()
                moveTo(8.0f, 4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                close()
            }
        }.build()
        return flashlightSlash!!
    }

private var flashlightSlash: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.FlashlightSlash,
                contentDescription = ""
            )
        }
    }
}