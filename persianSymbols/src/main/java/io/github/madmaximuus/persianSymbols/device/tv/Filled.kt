package io.github.madmaximuus.persianSymbols.device.tv

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

val PersianSymbols.Filled.DeviceTv: ImageVector
    get() {
        if (deviceTv != null) {
            return deviceTv!!
        }
        deviceTv = Builder(
            name = "device-tv-filled",
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
                moveTo(6.4f, 3.0f)
                curveTo(3.9699f, 3.0f, 2.0f, 4.97f, 2.0f, 7.4f)
                verticalLineTo(14.6f)
                curveTo(2.0f, 16.489f, 3.1904f, 18.1f, 4.8621f, 18.7237f)
                lineTo(4.2929f, 19.2929f)
                curveTo(3.9024f, 19.6834f, 3.9024f, 20.3166f, 4.2929f, 20.7071f)
                curveTo(4.6834f, 21.0976f, 5.3166f, 21.0976f, 5.7071f, 20.7071f)
                lineTo(7.4142f, 19.0f)
                horizontalLineTo(16.5858f)
                lineTo(18.2929f, 20.7071f)
                curveTo(18.6834f, 21.0976f, 19.3166f, 21.0976f, 19.7071f, 20.7071f)
                curveTo(20.0976f, 20.3166f, 20.0976f, 19.6834f, 19.7071f, 19.2929f)
                lineTo(19.138f, 18.7237f)
                curveTo(20.8096f, 18.1f, 22.0f, 16.489f, 22.0f, 14.6f)
                verticalLineTo(7.4f)
                curveTo(22.0f, 4.97f, 20.0301f, 3.0f, 17.6f, 3.0f)
                horizontalLineTo(6.4f)
                close()
            }
        }.build()
        return deviceTv!!
    }

private var deviceTv: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.DeviceTv,
                contentDescription = ""
            )
        }
    }
}