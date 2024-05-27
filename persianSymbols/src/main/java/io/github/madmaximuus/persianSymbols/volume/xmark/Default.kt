package io.github.madmaximuus.persianSymbols.volume.xmark

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

val PersianSymbols.Default.VolumeXMark: ImageVector
    get() {
        if (volumeXMark != null) {
            return volumeXMark!!
        }
        volumeXMark = Builder(
            name = "volume-xmark-default",
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
                moveTo(15.0f, 6.4142f)
                curveTo(15.0f, 4.6324f, 12.8457f, 3.74f, 11.5858f, 4.9999f)
                lineTo(8.5858f, 7.9999f)
                horizontalLineTo(4.5f)
                curveTo(3.1193f, 7.9999f, 2.0f, 9.1192f, 2.0f, 10.5f)
                verticalLineTo(13.5f)
                curveTo(2.0f, 14.8807f, 3.1193f, 16.0f, 4.5f, 16.0f)
                horizontalLineTo(8.5858f)
                lineTo(11.5858f, 19.0f)
                curveTo(12.8457f, 20.2599f, 15.0f, 19.3676f, 15.0f, 17.5857f)
                verticalLineTo(6.4142f)
                close()
                moveTo(10.0f, 9.4142f)
                lineTo(13.0f, 6.4142f)
                lineTo(13.0f, 17.5857f)
                lineTo(10.0f, 14.5857f)
                curveTo(9.6249f, 14.2107f, 9.1162f, 14.0f, 8.5858f, 14.0f)
                horizontalLineTo(4.5f)
                curveTo(4.2239f, 14.0f, 4.0f, 13.7761f, 4.0f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(4.0f, 10.2238f, 4.2239f, 10.0f, 4.5f, 10.0f)
                horizontalLineTo(8.5858f)
                curveTo(9.1162f, 10.0f, 9.6249f, 9.7892f, 10.0f, 9.4142f)
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
                moveTo(16.2362f, 14.4559f)
                curveTo(15.9224f, 14.1448f, 15.9211f, 13.6393f, 16.2334f, 13.3267f)
                lineTo(17.5645f, 11.9942f)
                lineTo(16.2334f, 10.6616f)
                curveTo(15.9211f, 10.349f, 15.9224f, 9.8435f, 16.2362f, 9.5325f)
                curveTo(16.55f, 9.2215f, 17.0575f, 9.2227f, 17.3698f, 9.5353f)
                lineTo(18.6953f, 10.8622f)
                lineTo(20.0209f, 9.5353f)
                curveTo(20.3331f, 9.2227f, 20.8407f, 9.2214f, 21.1545f, 9.5324f)
                curveTo(21.4683f, 9.8435f, 21.4696f, 10.349f, 21.1573f, 10.6616f)
                lineTo(19.8261f, 11.9942f)
                lineTo(21.1573f, 13.3268f)
                curveTo(21.4695f, 13.6394f, 21.4683f, 14.1449f, 21.1544f, 14.4559f)
                curveTo(20.8406f, 14.7669f, 20.3331f, 14.7657f, 20.0208f, 14.4531f)
                lineTo(18.6953f, 13.1261f)
                lineTo(17.3698f, 14.453f)
                curveTo(17.0576f, 14.7656f, 16.55f, 14.7669f, 16.2362f, 14.4559f)
                close()
            }
        }.build()
        return volumeXMark!!
    }

private var volumeXMark: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.VolumeXMark,
                contentDescription = ""
            )
        }
    }
}