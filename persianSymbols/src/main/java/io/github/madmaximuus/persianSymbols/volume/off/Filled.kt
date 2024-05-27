package io.github.madmaximuus.persianSymbols.volume.off

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

val PersianSymbols.Filled.VolumeOff: ImageVector
    get() {
        if (volumeOff != null) {
            return volumeOff!!
        }
        volumeOff = Builder(
            name = "volume-off-filled",
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
                moveTo(8.2034f, 8.0f)
                horizontalLineTo(4.0f)
                curveTo(2.8954f, 8.0f, 2.0f, 8.8954f, 2.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(2.0f, 15.1046f, 2.8954f, 16.0f, 4.0f, 16.0f)
                horizontalLineTo(8.2034f)
                curveTo(8.4251f, 16.0f, 8.6406f, 16.0737f, 8.8158f, 16.2094f)
                lineTo(13.3876f, 19.751f)
                curveTo(14.0447f, 20.26f, 15.0f, 19.7917f, 15.0f, 18.9604f)
                verticalLineTo(5.0396f)
                curveTo(15.0f, 4.2084f, 14.0447f, 3.74f, 13.3876f, 4.249f)
                lineTo(8.8158f, 7.7906f)
                curveTo(8.6406f, 7.9263f, 8.4251f, 8.0f, 8.2034f, 8.0f)
                close()
            }
        }.build()
        return volumeOff!!
    }

private var volumeOff: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.VolumeOff,
                contentDescription = ""
            )
        }
    }
}