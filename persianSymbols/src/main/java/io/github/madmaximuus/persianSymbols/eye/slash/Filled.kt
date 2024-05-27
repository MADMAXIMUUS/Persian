package io.github.madmaximuus.persianSymbols.eye.slash

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

val PersianSymbols.Filled.EyeSlash: ImageVector
    get() {
        if (eyeSlash != null) {
            return eyeSlash!!
        }
        eyeSlash = Builder(
            name = "eye-slash-filled",
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
                moveTo(3.2374f, 9.321f)
                curveTo(3.6778f, 8.6751f, 4.2368f, 8.0237f, 4.9294f, 7.4294f)
                lineTo(8.2119f, 10.7119f)
                curveTo(8.0745f, 11.1161f, 8.0f, 11.5494f, 8.0f, 12.0f)
                curveTo(8.0f, 14.2091f, 9.7909f, 16.0f, 12.0f, 16.0f)
                curveTo(12.4507f, 16.0f, 12.8839f, 15.9255f, 13.2881f, 15.7881f)
                lineTo(15.8211f, 18.3211f)
                curveTo(14.7206f, 18.7415f, 13.4526f, 19.0f, 12.0f, 19.0f)
                curveTo(7.6178f, 19.0f, 4.916f, 16.6476f, 3.4211f, 14.5936f)
                curveTo(2.2818f, 13.0283f, 2.1467f, 10.9205f, 3.2374f, 9.321f)
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
                moveTo(8.1143f, 5.6143f)
                lineTo(10.7119f, 8.2119f)
                curveTo(11.1161f, 8.0745f, 11.5494f, 8.0f, 12.0f, 8.0f)
                curveTo(14.2092f, 8.0f, 16.0f, 9.7909f, 16.0f, 12.0f)
                curveTo(16.0f, 12.4507f, 15.9255f, 12.8839f, 15.7881f, 13.2881f)
                lineTo(18.9247f, 16.4247f)
                curveTo(19.5898f, 15.8339f, 20.1371f, 15.2007f, 20.579f, 14.5936f)
                curveTo(21.7182f, 13.0283f, 21.8534f, 10.9205f, 20.7627f, 9.321f)
                curveTo(19.3102f, 7.191f, 16.568f, 5.0f, 12.0f, 5.0f)
                curveTo(10.5189f, 5.0f, 9.2297f, 5.2303f, 8.1143f, 5.6143f)
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
                moveTo(10.0878f, 12.5878f)
                curveTo(10.2818f, 13.2197f, 10.7804f, 13.7182f, 11.4122f, 13.9122f)
                lineTo(10.0878f, 12.5878f)
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
                moveTo(13.9123f, 11.4123f)
                lineTo(12.5878f, 10.0878f)
                curveTo(13.2197f, 10.2817f, 13.7183f, 10.7804f, 13.9123f, 11.4123f)
                close()
            }
        }.build()
        return eyeSlash!!
    }

private var eyeSlash: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.EyeSlash,
                contentDescription = ""
            )
        }
    }
}