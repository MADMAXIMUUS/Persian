package io.github.madmaximuus.persianSymbols.volume.high

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

val PersianSymbols.Default.VolumeHigh: ImageVector
    get() {
        if (volumeHigh != null) {
            return volumeHigh!!
        }
        volumeHigh = Builder(
            name = "volume-high-default",
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
                moveTo(17.5563f, 3.6846f)
                curveTo(17.0973f, 3.3774f, 16.4762f, 3.5004f, 16.169f, 3.9594f)
                curveTo(15.8618f, 4.4183f, 15.9848f, 5.0394f, 16.4438f, 5.3466f)
                curveTo(18.5902f, 6.7834f, 20.0f, 9.2273f, 20.0f, 12.0001f)
                curveTo(20.0f, 14.7817f, 18.5812f, 17.2324f, 16.4231f, 18.6673f)
                curveTo(15.9632f, 18.9731f, 15.8382f, 19.5938f, 16.144f, 20.0537f)
                curveTo(16.4498f, 20.5136f, 17.0705f, 20.6385f, 17.5304f, 20.3328f)
                curveTo(20.2224f, 18.5429f, 22.0f, 15.4793f, 22.0f, 12.0001f)
                curveTo(22.0f, 8.532f, 20.2337f, 5.4768f, 17.5563f, 3.6846f)
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
                moveTo(11.5858f, 5.0001f)
                curveTo(12.8457f, 3.7401f, 15.0f, 4.6325f, 15.0f, 6.4143f)
                verticalLineTo(17.5858f)
                curveTo(15.0f, 19.3677f, 12.8457f, 20.26f, 11.5858f, 19.0001f)
                lineTo(8.5858f, 16.0001f)
                horizontalLineTo(4.5f)
                curveTo(3.1193f, 16.0001f, 2.0f, 14.8808f, 2.0f, 13.5001f)
                verticalLineTo(10.5001f)
                curveTo(2.0f, 9.1194f, 3.1193f, 8.0001f, 4.5f, 8.0001f)
                horizontalLineTo(8.5858f)
                lineTo(11.5858f, 5.0001f)
                close()
                moveTo(13.0f, 6.4143f)
                lineTo(10.0f, 9.4143f)
                curveTo(9.6249f, 9.7893f, 9.1162f, 10.0001f, 8.5858f, 10.0001f)
                horizontalLineTo(4.5f)
                curveTo(4.2239f, 10.0001f, 4.0f, 10.2239f, 4.0f, 10.5001f)
                verticalLineTo(13.5001f)
                curveTo(4.0f, 13.7762f, 4.2239f, 14.0001f, 4.5f, 14.0001f)
                horizontalLineTo(8.5858f)
                curveTo(9.1162f, 14.0001f, 9.6249f, 14.2108f, 10.0f, 14.5858f)
                lineTo(13.0f, 17.5858f)
                lineTo(13.0f, 6.4143f)
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
                moveTo(16.0f, 17.1382f)
                curveTo(16.0f, 17.5222f, 16.4109f, 17.7532f, 16.7044f, 17.5057f)
                curveTo(18.0855f, 16.341f, 19.0f, 14.3103f, 19.0f, 12.0001f)
                curveTo(19.0f, 9.6899f, 18.0855f, 7.6592f, 16.7044f, 6.4945f)
                curveTo(16.4109f, 6.247f, 16.0f, 6.4781f, 16.0f, 6.862f)
                verticalLineTo(17.1382f)
                close()
            }
        }.build()
        return volumeHigh!!
    }

private var volumeHigh: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.VolumeHigh,
                contentDescription = ""
            )
        }
    }
}