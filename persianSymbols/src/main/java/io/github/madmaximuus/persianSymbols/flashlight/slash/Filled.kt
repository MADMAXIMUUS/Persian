package io.github.madmaximuus.persianSymbols.flashlight.slash

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

val PersianSymbols.Filled.FlashlightSlash: ImageVector
    get() {
        if (flashlightSlash != null) {
            return flashlightSlash!!
        }
        flashlightSlash = Builder(
            name = "flashlight-slash-filled",
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
                moveTo(6.0f, 3.5f)
                lineTo(6.5f, 4.0f)
                lineTo(18.0f, 4.0f)
                verticalLineTo(3.0f)
                curveTo(18.0f, 2.4477f, 17.5523f, 2.0f, 17.0f, 2.0f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 2.0f, 6.0f, 2.4477f, 6.0f, 3.0f)
                verticalLineTo(3.5f)
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
                moveTo(8.4f, 20.0f)
                verticalLineTo(10.9f)
                lineTo(15.6f, 18.1f)
                verticalLineTo(20.0f)
                curveTo(15.6f, 21.1046f, 14.7046f, 22.0f, 13.6f, 22.0f)
                horizontalLineTo(10.4f)
                curveTo(9.2954f, 22.0f, 8.4f, 21.1046f, 8.4f, 20.0f)
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
                moveTo(8.5f, 6.0f)
                lineTo(15.6f, 13.1f)
                verticalLineTo(10.6516f)
                curveTo(15.6f, 10.0945f, 15.8324f, 9.5626f, 16.2412f, 9.1841f)
                lineTo(17.3588f, 8.1492f)
                curveTo(17.7676f, 7.7707f, 18.0f, 7.2389f, 18.0f, 6.6817f)
                verticalLineTo(6.0f)
                lineTo(8.5f, 6.0f)
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
                imageVector = PersianSymbols.Filled.FlashlightSlash,
                contentDescription = ""
            )
        }
    }
}