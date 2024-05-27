package io.github.madmaximuus.persianSymbols.volume.slash

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

val PersianSymbols.Filled.VolumeSlash: ImageVector
    get() {
        if (volumeSlash != null) {
            return volumeSlash!!
        }
        volumeSlash = Builder(
            name = "volume-slash-filled",
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
                moveTo(4.0f, 8.0001f)
                horizontalLineTo(5.5001f)
                lineTo(15.0f, 17.5f)
                verticalLineTo(18.9605f)
                curveTo(15.0f, 19.7917f, 14.0447f, 20.2601f, 13.3876f, 19.751f)
                lineTo(8.8158f, 16.2095f)
                curveTo(8.6406f, 16.0737f, 8.4251f, 16.0001f, 8.2034f, 16.0001f)
                horizontalLineTo(4.0f)
                curveTo(2.8954f, 16.0001f, 2.0f, 15.1046f, 2.0f, 14.0001f)
                verticalLineTo(10.0001f)
                curveTo(2.0f, 8.8955f, 2.8954f, 8.0001f, 4.0f, 8.0001f)
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
                moveTo(9.6469f, 7.1469f)
                lineTo(15.0f, 12.5f)
                verticalLineTo(5.0396f)
                curveTo(15.0f, 4.2084f, 14.0447f, 3.7401f, 13.3876f, 4.2491f)
                lineTo(9.6469f, 7.1469f)
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
                moveTo(16.0f, 13.5f)
                lineTo(18.1506f, 15.6506f)
                curveTo(18.6869f, 14.6077f, 19.0f, 13.3518f, 19.0f, 12.0001f)
                curveTo(19.0f, 9.6899f, 18.0855f, 7.6592f, 16.7044f, 6.4945f)
                curveTo(16.4109f, 6.247f, 16.0f, 6.4781f, 16.0f, 6.862f)
                verticalLineTo(13.5f)
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
                moveTo(16.144f, 20.0537f)
                curveTo(15.8725f, 19.6453f, 15.9406f, 19.1101f, 16.2813f, 18.7813f)
                lineTo(17.7103f, 20.2103f)
                curveTo(17.6508f, 20.2518f, 17.5909f, 20.2926f, 17.5304f, 20.3328f)
                curveTo(17.0705f, 20.6385f, 16.4498f, 20.5136f, 16.144f, 20.0537f)
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
                moveTo(18.7679f, 16.2679f)
                lineTo(20.2102f, 17.7102f)
                curveTo(21.338f, 16.0916f, 22.0f, 14.1232f, 22.0f, 12.0001f)
                curveTo(22.0f, 8.532f, 20.2337f, 5.4768f, 17.5563f, 3.6846f)
                curveTo(17.0973f, 3.3774f, 16.4762f, 3.5004f, 16.169f, 3.9594f)
                curveTo(15.8618f, 4.4183f, 15.9848f, 5.0394f, 16.4438f, 5.3466f)
                curveTo(18.5902f, 6.7834f, 20.0f, 9.2273f, 20.0f, 12.0001f)
                curveTo(20.0f, 13.5689f, 19.5487f, 15.0325f, 18.7679f, 16.2679f)
                close()
            }
        }.build()
        return volumeSlash!!
    }

private var volumeSlash: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.VolumeSlash,
                contentDescription = ""
            )
        }
    }
}