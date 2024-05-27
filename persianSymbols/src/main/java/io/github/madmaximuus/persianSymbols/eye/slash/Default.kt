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

val PersianSymbols.Default.EyeSlash: ImageVector
    get() {
        if (eyeSlash != null) {
            return eyeSlash!!
        }
        eyeSlash = Builder(
            name = "eye-slash-default",
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
                moveTo(3.6733f, 8.6355f)
                curveTo(4.0233f, 8.2087f, 4.4299f, 7.7898f, 4.8968f, 7.3968f)
                lineTo(6.3174f, 8.8174f)
                curveTo(5.8875f, 9.1628f, 5.5241f, 9.5327f, 5.2197f, 9.9038f)
                curveTo(4.2752f, 11.0554f, 4.342f, 12.7753f, 5.3795f, 13.9954f)
                curveTo(6.6361f, 15.4732f, 8.7259f, 17.0f, 12.0f, 17.0f)
                curveTo(12.8183f, 17.0f, 13.5626f, 16.9046f, 14.2385f, 16.7385f)
                lineTo(15.8374f, 18.3374f)
                curveTo(14.7325f, 18.747f, 13.4585f, 19.0f, 12.0f, 19.0f)
                curveTo(8.0082f, 19.0f, 5.3985f, 17.1051f, 3.8559f, 15.291f)
                curveTo(2.266f, 13.4214f, 2.0458f, 10.6199f, 3.6733f, 8.6355f)
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
                moveTo(8.1049f, 5.6049f)
                lineTo(9.7299f, 7.2299f)
                curveTo(10.4126f, 7.0832f, 11.1673f, 7.0f, 12.0f, 7.0f)
                curveTo(15.4673f, 7.0f, 17.5823f, 8.4431f, 18.7802f, 9.9038f)
                curveTo(19.7247f, 11.0554f, 19.658f, 12.7753f, 18.6205f, 13.9954f)
                curveTo(18.3161f, 14.3534f, 17.9628f, 14.7143f, 17.5556f, 15.0556f)
                lineTo(18.9737f, 16.4737f)
                curveTo(19.4172f, 16.0895f, 19.8062f, 15.6883f, 20.1441f, 15.291f)
                curveTo(21.734f, 13.4214f, 21.9542f, 10.6199f, 20.3267f, 8.6355f)
                curveTo(18.7729f, 6.7411f, 16.1034f, 5.0f, 12.0f, 5.0f)
                curveTo(10.5201f, 5.0f, 9.2267f, 5.2265f, 8.1049f, 5.6049f)
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
                moveTo(8.0f, 12.0f)
                curveTo(8.0f, 11.5493f, 8.0745f, 11.1161f, 8.2119f, 10.7119f)
                lineTo(10.0877f, 12.5877f)
                curveTo(10.2817f, 13.2196f, 10.7803f, 13.7183f, 11.4123f, 13.9123f)
                lineTo(13.2881f, 15.7881f)
                curveTo(12.8839f, 15.9255f, 12.4506f, 16.0f, 12.0f, 16.0f)
                curveTo(9.7908f, 16.0f, 8.0f, 14.2091f, 8.0f, 12.0f)
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
                moveTo(10.7119f, 8.2119f)
                lineTo(12.5878f, 10.0878f)
                curveTo(13.2196f, 10.2818f, 13.7182f, 10.7803f, 13.9122f, 11.4122f)
                lineTo(15.7881f, 13.2881f)
                curveTo(15.9255f, 12.8839f, 16.0f, 12.4506f, 16.0f, 12.0f)
                curveTo(16.0f, 9.7909f, 14.2091f, 8.0f, 12.0f, 8.0f)
                curveTo(11.5493f, 8.0f, 11.1161f, 8.0745f, 10.7119f, 8.2119f)
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
                imageVector = PersianSymbols.Default.EyeSlash,
                contentDescription = ""
            )
        }
    }
}