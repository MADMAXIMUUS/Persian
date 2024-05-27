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

val PersianSymbols.Default.VolumeOff: ImageVector
    get() {
        if (volumeOff != null) {
            return volumeOff!!
        }
        volumeOff = Builder(
            name = "volume-off-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.5858f, 9.0f)
                horizontalLineTo(4.5f)
                curveTo(3.6716f, 9.0f, 3.0f, 9.6716f, 3.0f, 10.5f)
                verticalLineTo(13.5f)
                curveTo(3.0f, 14.3284f, 3.6716f, 15.0f, 4.5f, 15.0f)
                horizontalLineTo(8.5858f)
                curveTo(8.851f, 15.0f, 9.1054f, 15.1054f, 9.2929f, 15.2929f)
                lineTo(12.2929f, 18.2929f)
                curveTo(12.9229f, 18.9229f, 14.0f, 18.4767f, 14.0f, 17.5858f)
                verticalLineTo(6.4142f)
                curveTo(14.0f, 5.5233f, 12.9229f, 5.0771f, 12.2929f, 5.7071f)
                lineTo(9.2929f, 8.7071f)
                curveTo(9.1054f, 8.8946f, 8.851f, 9.0f, 8.5858f, 9.0f)
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
                imageVector = PersianSymbols.Default.VolumeOff,
                contentDescription = ""
            )
        }
    }
}