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

val PersianSymbols.Filled.Flashlight: ImageVector
    get() {
        if (flashlight != null) {
            return flashlight!!
        }
        flashlight = Builder(
            name = "flashlight-filled",
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
                moveTo(17.0f, 2.0f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 2.0f, 6.0f, 2.4477f, 6.0f, 3.0f)
                verticalLineTo(4.0f)
                lineTo(18.0f, 4.0f)
                verticalLineTo(3.0f)
                curveTo(18.0f, 2.4477f, 17.5523f, 2.0f, 17.0f, 2.0f)
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
                moveTo(6.0f, 6.6817f)
                verticalLineTo(6.0f)
                lineTo(18.0f, 6.0f)
                verticalLineTo(6.6817f)
                curveTo(18.0f, 7.2389f, 17.7676f, 7.7707f, 17.3588f, 8.1492f)
                lineTo(16.2412f, 9.1841f)
                curveTo(15.8324f, 9.5626f, 15.6f, 10.0945f, 15.6f, 10.6516f)
                verticalLineTo(20.0f)
                curveTo(15.6f, 21.1046f, 14.7046f, 22.0f, 13.6f, 22.0f)
                horizontalLineTo(10.4f)
                curveTo(9.2954f, 22.0f, 8.4f, 21.1046f, 8.4f, 20.0f)
                verticalLineTo(10.6516f)
                curveTo(8.4f, 10.0945f, 8.1676f, 9.5626f, 7.7588f, 9.1841f)
                lineTo(6.6412f, 8.1492f)
                curveTo(6.2324f, 7.7707f, 6.0f, 7.2389f, 6.0f, 6.6817f)
                close()
                moveTo(13.0f, 12.0f)
                curveTo(13.0f, 11.4478f, 12.5523f, 11.0f, 12.0f, 11.0f)
                curveTo(11.4477f, 11.0f, 11.0f, 11.4478f, 11.0f, 12.0f)
                verticalLineTo(14.0f)
                curveTo(11.0f, 14.5523f, 11.4477f, 15.0f, 12.0f, 15.0f)
                curveTo(12.5523f, 15.0f, 13.0f, 14.5523f, 13.0f, 14.0f)
                verticalLineTo(12.0f)
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
                imageVector = PersianSymbols.Filled.Flashlight,
                contentDescription = ""
            )
        }
    }
}