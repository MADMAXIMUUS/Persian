package io.github.madmaximuus.persianSymbols.volume.xmark

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

val PersianSymbols.Filled.VolumeXMark: ImageVector
    get() {
        if (volumeXMark != null) {
            return volumeXMark!!
        }
        volumeXMark = Builder(
            name = "volume-xmark-filled",
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
                moveTo(4.0f, 8.0f)
                horizontalLineTo(8.2034f)
                curveTo(8.4251f, 8.0f, 8.6406f, 7.9263f, 8.8158f, 7.7905f)
                lineTo(13.3876f, 4.249f)
                curveTo(14.0447f, 3.74f, 15.0f, 4.2083f, 15.0f, 5.0396f)
                verticalLineTo(18.9604f)
                curveTo(15.0f, 19.7916f, 14.0447f, 20.26f, 13.3876f, 19.7509f)
                lineTo(8.8158f, 16.2094f)
                curveTo(8.6406f, 16.0737f, 8.4251f, 16.0f, 8.2034f, 16.0f)
                horizontalLineTo(4.0f)
                curveTo(2.8954f, 16.0f, 2.0f, 15.1045f, 2.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(2.0f, 8.8954f, 2.8954f, 8.0f, 4.0f, 8.0f)
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
                curveTo(15.9224f, 14.1449f, 15.9211f, 13.6393f, 16.2334f, 13.3267f)
                lineTo(17.5645f, 11.9942f)
                lineTo(16.2334f, 10.6616f)
                curveTo(15.9211f, 10.3491f, 15.9224f, 9.8435f, 16.2362f, 9.5325f)
                curveTo(16.55f, 9.2215f, 17.0575f, 9.2228f, 17.3698f, 9.5353f)
                lineTo(18.6953f, 10.8623f)
                lineTo(20.0209f, 9.5353f)
                curveTo(20.3331f, 9.2227f, 20.8407f, 9.2214f, 21.1545f, 9.5325f)
                curveTo(21.4683f, 9.8435f, 21.4696f, 10.349f, 21.1573f, 10.6616f)
                lineTo(19.8261f, 11.9942f)
                lineTo(21.1573f, 13.3268f)
                curveTo(21.4695f, 13.6394f, 21.4683f, 14.1449f, 21.1544f, 14.4559f)
                curveTo(20.8406f, 14.767f, 20.3331f, 14.7657f, 20.0208f, 14.4531f)
                lineTo(18.6953f, 13.1262f)
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
                imageVector = PersianSymbols.Filled.VolumeXMark,
                contentDescription = ""
            )
        }
    }
}