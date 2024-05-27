package io.github.madmaximuus.persianSymbols.flashlight.base

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

val PersianSymbols.Default.Flashlight: ImageVector
    get() {
        if (flashlight != null) {
            return flashlight!!
        }
        flashlight = Builder(
            name = "flashlight-default",
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
                moveTo(13.0f, 12.0f)
                curveTo(13.0f, 11.4477f, 12.5523f, 11.0f, 12.0f, 11.0f)
                curveTo(11.4477f, 11.0f, 11.0f, 11.4477f, 11.0f, 12.0f)
                verticalLineTo(14.0f)
                curveTo(11.0f, 14.5523f, 11.4477f, 15.0f, 12.0f, 15.0f)
                curveTo(12.5523f, 15.0f, 13.0f, 14.5523f, 13.0f, 14.0f)
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
                pathFillType = EvenOdd
            ) {
                moveTo(6.0f, 4.0f)
                curveTo(6.0f, 2.8954f, 6.8954f, 2.0f, 8.0f, 2.0f)
                horizontalLineTo(16.0f)
                curveTo(17.1046f, 2.0f, 18.0f, 2.8954f, 18.0f, 4.0f)
                verticalLineTo(7.1716f)
                curveTo(18.0f, 7.9672f, 17.6839f, 8.7303f, 17.1213f, 9.2929f)
                lineTo(16.2929f, 10.1213f)
                curveTo(16.1054f, 10.3089f, 16.0f, 10.5632f, 16.0f, 10.8284f)
                verticalLineTo(19.0f)
                curveTo(16.0f, 20.6569f, 14.6569f, 22.0f, 13.0f, 22.0f)
                horizontalLineTo(11.0f)
                curveTo(9.3432f, 22.0f, 8.0f, 20.6569f, 8.0f, 19.0f)
                verticalLineTo(10.8284f)
                curveTo(8.0f, 10.5632f, 7.8946f, 10.3089f, 7.7071f, 10.1213f)
                lineTo(6.8787f, 9.2929f)
                curveTo(6.3161f, 8.7303f, 6.0f, 7.9672f, 6.0f, 7.1716f)
                verticalLineTo(4.0f)
                close()
                moveTo(16.0f, 4.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(8.0f, 7.1716f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.1716f)
                curveTo(16.0f, 7.4368f, 15.8946f, 7.6911f, 15.7071f, 7.8787f)
                lineTo(14.8787f, 8.7071f)
                curveTo(14.3161f, 9.2697f, 14.0f, 10.0328f, 14.0f, 10.8284f)
                verticalLineTo(19.0f)
                curveTo(14.0f, 19.5523f, 13.5523f, 20.0f, 13.0f, 20.0f)
                horizontalLineTo(11.0f)
                curveTo(10.4477f, 20.0f, 10.0f, 19.5523f, 10.0f, 19.0f)
                verticalLineTo(10.8284f)
                curveTo(10.0f, 10.0328f, 9.6839f, 9.2697f, 9.1213f, 8.7071f)
                lineTo(8.2929f, 7.8787f)
                curveTo(8.1054f, 7.6911f, 8.0f, 7.4368f, 8.0f, 7.1716f)
                close()
            }
        }.build()
        return flashlight!!
    }

private var flashlight: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Flashlight,
                contentDescription = ""
            )
        }
    }
}